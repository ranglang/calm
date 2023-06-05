package com.lqiong.jep.option

import akka.actor.typed.ActorRef
import akka.actor.typed.scaladsl.AskPattern.Askable
import akka.actor.typed.scaladsl.adapter.ClassicActorSystemOps
import akka.actor.{typed, ActorSystem}
import akka.cluster.sharding.typed.ShardingEnvelope
import akka.cluster.sharding.typed.scaladsl.{ClusterSharding, Entity, EntityRef}
import akka.cluster.typed.ClusterSingleton
import akka.event.LoggingAdapter
import akka.pattern.StatusReply
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.typed.PersistenceId
import akka.stream.scaladsl.{Sink, Source}
import akka.stream.{Materializer, OverflowStrategy}
import akka.util.Timeout
import akka.{Done, NotUsed}
import carldata.series.{Sessions, TimeSeries}
import com.github.takezoe.retry.{retry, ExponentialBackOff, RetryPolicy}
import com.google.inject.{Inject, Injector}
import com.lqiong.claim.MovingAverage
import com.lqiong.claim.actor.ShardedJepQueryActor.JepShardedTypeKey
import com.lqiong.claim.actor.StockHistoryCacheActor.RetCacheHistory
import com.lqiong.claim.actor._
import com.lqiong.claim.actor.a.{
  ConfirmationContractObject,
  ConfirmationContractState,
  ContractStateActor1
}
import com.lqiong.claim.items.SchedulerCommand
import com.lqiong.claim.lighting.A.MyPersistentCounter
import com.lqiong.claim.spot.SpotActor
import com.lqiong.contact._
import com.lqiong.email.EmailServiceTrait
import com.lqiong.jep._
import com.lqiong.jep.checker.model.CheckResult
import com.lqiong.jep.claim.model._
import com.lqiong.jep.config.{LogicConfig, NoticeConfig}
import com.lqiong.jep.entry._
import com.lqiong.jep.entry.a.UUIDUtil
import com.lqiong.jep.entry.item.AState
import com.lqiong.jep.entry.util.LqSegment
import com.lqiong.jep.notice.checker.{PanmingChecker, PriceChecker, TimeChecker}
import com.lqiong.jep.notice.inter.ResultChecker
import com.lqiong.jep.option.OptionProductName.{HT300, HX50}
import com.lqiong.jep.option.cassandra.GetSparkTable
import com.lqiong.jep.selector.A.TimeSeriesSelect
import com.lqiong.jep.studys.YjygDataList
import com.lqiong.model.SymbolModel.UriContext
import com.lqiong.model._
import com.lqiong.model.order._
//import com.lqiong.option.{OptionContract, QContractItem}
//import com.lqiong.selenium.entry.ContractLogin
import com.lqiong.shared.Formatter
import com.typesafe.config.Config
import e.model.{AB, StockData}
import org.apache.spark.sql.functions.lit
import org.apache.spark.sql.types.{StringType, StructType}
import org.apache.spark.sql.{DataFrame, Dataset, Row, SparkSession}
import org.joda.time.DateTime
import org.ta4j.core.BaseBarSeries
import org.ta4j.core.indicators.FastDown1Indicator
import org.ta4j.core.indicators.helpers.ClosePriceIndicator
import tech.shangche.boat.query.BoatQuery
import tech.shangche.boat.service.BoatService

import java.io.File
import java.time.Duration
import java.util
import java.util.UUID
import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`
import scala.collection.immutable
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.Try
import scala.util.control.Breaks.{break, breakable}
import scala.util.control.NonFatal

//# https://www.xunlianying.vip/live/events?code=002739
class QuantEngine @Inject() (
  val injector: Injector,
  implicit val system: ActorSystem,
  implicit val mat: Materializer,
  implicit val spark: SparkSession,
  val handleChecker: HandleChecker,
  val dataSource: ClaimDataSource,
  implicit val dataFrameDao: DataFrameDao,
  val getSparkTable: GetSparkTable,
  val quantConfig: QuantConfig,
//  val bankService: BankService,
  implicit val queryTable: QueryTable,
  val enterReason: EnterReason,
  val config: Config,
  val tradeStrategy: TradeStrategy,
  val emailService: EmailServiceTrait,
  implicit val stockImpl: StockTrait,
  implicit val policy: RetryPolicy,
  implicit val queryTableInter: QueryTableInter,
  implicit val ex: ExecutionContext,
  val pig: PigDataList,
  val egg: EggDataList,
  val logger: LoggingAdapter,
  val timeSeries: TimeSeriesSelect,
//  val optionContract: OptionContract,
  polyty: PolytyPrinter,
//  skunkService: SkunkService,
  val panMingFactor: PanmingFactor,
  val dynamicAStockPrice: DynamicAStockPrice,
  val continuesDataList: ContinuesDataList,
  val volumeIndicator: VolumeIndicator,
  val sharding: ClusterSharding,
  val indexContinuesDataList: IndexContinuesDataList,
  val chaodieDataList: ChaodieDataList,
  val singletonManager: ClusterSingleton,
//  val contractLogin: ContractLogin,
  val boatService: BoatService
) {

  def testCaiwu() = {
    val l = quantConfig.getAllSymbol();
    l.foreach {
      case s: StockSymbol =>
        val i = ObjectConvert.getSimple(s.code).toUpperCase()
        try {
          val l = BoatQuery.stock.stock_financial_analysis_indicatorApi(s)
          val l222 = Await.result(l, 40.seconds)
          logger.info("l{}", l222.get.take(1))
        } catch {
          case NonFatal(x) =>
            logger.info("e {}", s)
            logger.info("e {}", x)
        }
      case _ =>
    }
  }

  import net.codingwell.scalaguice.InjectorExtensions._
  lazy val meadiumDataList = injector.instance[MeadiumDataList]
  lazy val factor_option_value_analysis_em = injector.instance[Factor_option_value_analysis_em]
  lazy val factor_option_risk_analysis_em = injector.instance[Factor_option_risk_analysis_em]

  implicit val actorSystemTyped: typed.ActorSystem[Nothing] = system.toTyped

  val persistenceId = PersistenceId.ofUniqueId("test_2022-01-081")
  val persistenceIdTest = PersistenceId.ofUniqueId("test_2022-01-08_11")
  lazy val accountEntityTest = actorSystemTyped.systemActorOf(
    MyPersistentCounter(persistenceIdTest),
    "persistence-1"
  )
  lazy val accountEntity = actorSystemTyped.systemActorOf(
    AccountEntity("1", persistenceId),
    "persistence"
  )
  lazy val test1 = actorSystemTyped.systemActorOf(
    AccountWithReplies("1"),
    "persistence"
  )
  def testM() = {
    val c = 0.2
    meadiumDataList.fetchDataByCout(i"000852", c)
    val l1 = Await.result(meadiumDataList.getList1(i"000852", c), 1.hours)
  }

//  def testPersistence7() = {
//    val test4 = actorSystemTyped.systemActorOf(
//      CreateAllSymbolCreateActor(dataSource, logger),
//      "persistence"
//    )
//    Thread.sleep(1000 * 60)
//    Thread.sleep(1000 * 60)
//    Thread.sleep(1000 * 60)
//    Thread.sleep(1000 * 60)
  //    testEarnForcast()

//    testSector()
//    testYjbg()

//    testYjyg()

//    testNorth()
//  }

  //  def testPersistence5() = {
  //    val stockCodeNameRef: ActorRef[CodeNameActor.CodenameCommand] = {
//      actorSystemTyped.systemActorOf(CodeNameActor(dataSource, logger), "ab")
//    }
//    Thread.sleep(1000 * 30)
//    val test3 = actorSystemTyped.systemActorOf(
//      StockSymbolPActor(StockSymbol("000006"), stockCodeNameRef),
//      "persistence"
//    )
//    val a1 =
//      test3.ask((replyTo: ActorRef[StockSymbolPActor.StockPState]) =>
//        StockSymbolPActor.GetPActorState(replyTo)
//      )(4.minutes, actorSystemTyped.scheduler)
//
//    logger.info(Await.result(a1, 40.seconds).toString)
//
//  }
//
//  def syncBackend() = {
//    val backendUrl = contractLogin.fetchTradeBackendUrl()
//    logger.info("backendUrl {}", backendUrl)
//    backendUrl match {
//      case Some(url) =>
//        quantConfig.updateBackendUrl(url)
//      case _ =>
//    }
//  }

  def testPersistence3() = {
    val a1: Future[AccountWithReplies.Accepted] =
      test1.ask((replyTo: ActorRef[AccountWithReplies.Accepted]) =>
        AccountWithReplies.Deposit(1, replyTo)
      )(4.minutes, actorSystemTyped.scheduler)

    logger.info(Await.result(a1, 40.seconds).toString)
  }

  def testPersistence2() = {

    val a1: Future[Done] = accountEntityTest.ask(replyTo =>
      MyPersistentCounter.IncrementBy(1, replyTo)
    )(4.minutes, actorSystemTyped.scheduler)

    Await.result(a1, 20.seconds)
    val a2: Future[MyPersistentCounter.State] = {
      accountEntityTest.ask(replyTo => MyPersistentCounter.GetValue(replyTo))(
        4.minutes,
        actorSystemTyped.scheduler
      )
    }
    logger.info(Await.result(a2, 5.seconds).toString)

  }
  def testPersistence1() = {
    val a1: Future[AccountEntity.CurrentBalance] =
      accountEntity.ask((replyTo: ActorRef[AccountEntity.CurrentBalance]) =>
        AccountEntity.GetBalance(replyTo)
      )(4.minutes, actorSystemTyped.scheduler)
    val f = Await.result(a1, 20.seconds)
    logger.info("fff {}", f)
  }

  def testPersistence() = {
    val a: Future[StatusReply[Done]] =
      accountEntity.ask((replyTo: ActorRef[StatusReply[Done]]) =>
        AccountEntity.CreateAccount(replyTo)
      )(4.minutes, actorSystemTyped.scheduler)

    Await.result(a, 20.seconds)

    val a2 = accountEntity.ask((replyTo: ActorRef[StatusReply[Done]]) =>
      AccountEntity.Deposit(100, replyTo)
    )(4.minutes, actorSystemTyped.scheduler)

    Await.result(a2, 20.seconds)

    val a1: Future[AccountEntity.CurrentBalance] =
      accountEntity.ask((replyTo: ActorRef[AccountEntity.CurrentBalance]) =>
        AccountEntity.GetBalance(replyTo)
      )(4.minutes, actorSystemTyped.scheduler)
    val f = Await.result(a1, 20.seconds)
    logger.info("fff {}", f)
  }

//  val lookupLightningActor = actorSystemTyped.systemActorOf(
//    LookupLightningActor(),
//    "lookupLi"
//  )

//  val hotCreater = actorSystemTyped.systemActorOf(
//    SymbolHotCreator(lookupLightningActor, dataSource, logger),
//    "hotCreator"
//  )

//  def startHotActor(list: List[StockSymbol]) = {
//    list.foreach(r => {
//      hotCreater ! SymbolHotCreator.CreateA(r)
//    })
//  }

//  def getCodeNameFromDynamicActor(name: StockSymbol): Future[String] = {
//    logger.info("getCodeNameFromDynamicActor {}", name.code)
//    val a: Future[LightningStockName] =
//      lookupLightningActor.ask((replyTo: ActorRef[LightningStockName]) =>
//        LookupLightningActor.LookupProcyCmd(
//          name,
//          LightningStcokActor.GetSymbolName(replyTo)
//        )
//      )(4.minutes, actorSystemTyped.scheduler)
//    a.map(r => r.name)
//  }

//  final val ShardedStartSymbolActorShardedTypeKey
//    : EntityTypeKey[ShardedStartSymbolActor.ShardStartSymbolTrait] =
//    EntityTypeKey[ShardedStartSymbolActor.ShardStartSymbolTrait](
//      "ShardStartSymbolTrait"
//    )

//  val JepShardedTypeKey
//      : EntityTypeKey[ShardedJepQueryActor.SharedJepQueryCommand] =
//    EntityTypeKey[ShardedJepQueryActor.SharedJepQueryCommand]("ShardedJep")

//  val stockCodeNameRef: ActorRef[CodeNameActor.CodenameCommand] = {
//    actorSystemTyped.systemActorOf(
//      CodeNameActor(dataSource, logger),
//      "stockCodeNames"
//    )
//  }

//  val shardStartSymbolRegionRef: ActorRef[
//    ShardingEnvelope[ShardedStartSymbolActor.ShardStartSymbolTrait]
//  ] =
//    sharding.init(
//      Entity(ShardedStartSymbolActorShardedTypeKey)(createBehavior =
//        entityContext =>
//          ShardedStartSymbolActor(
//            entityContext.entityId,
//            logger,
//            stockCodeNameRef
//          )
//      )
//    )

//  val singletonLookupSymbolActor =
//    singletonManager.init(
//      SingletonActor(
//        Behaviors
//          .supervise(
//            LookupSymbolActor()
//          )
//          .onFailure[Exception](
//            SupervisorStrategy.restartWithBackoff(1.second, 10.seconds, 0.2)
//          ),
//        "singletonLookupSymbolActor"
//      )
//    )

//  val singletonCreateAllSymbolCreateActor =
//    singletonManager.init(
//      SingletonActor(
//        Behaviors
//          .supervise(
//            CreateAllSymbolCreateActor(
//              dataSource,
//              logger,
//              singletonLookupSymbolActor,
//              sharding,
//              ShardedStartSymbolActorShardedTypeKey,
//              system
//            )
//          )
//          .onFailure[Exception](
//            SupervisorStrategy.restartWithBackoff(1.second, 10.seconds, 0.2)
//          ),
//        "singletonCreateAllSymbolCreateActor"
//      )
//    )

  val updatePStatePriceProxy = RetryPolicy(
    maxAttempts = 4,
    retryDuration = 3.second,
    backOff = ExponentialBackOff, // default is FixedBackOff
    jitter = 5.second // default is no jitter
  )

//  def updateStockPriceInPState(
//    x: StockSymbol,
//    price: Double,
//    currentDateTime: DateTime
//  ): Future[StockSymbolPActor.Accepted] = {
//    logger.info("updateStockPrice updateStockPriceInPState start {} {}", x, price)
//    val updatePActorTimeout: Timeout = 40.seconds
//    val updatePStatePriceProxy1 = RetryPolicy(
//      maxAttempts = 3,
//      retryDuration = 4.second,
//      backOff = ExponentialBackOff, // default is FixedBackOff
//      jitter = 5.second // default is no jitter
//    )
//    val a1 = {
//      singletonLookupSymbolActor.ask((ref: ActorRef[StockSymbolPActor.Accepted]) =>
//        LookupSymbolActor
//          .LookupSymbolProxyCommand(
//            x,
//            StockSymbolPActor
//              .UpdateStockStatePrice(price, currentDateTime, ref)
//          )
//      )(
//        updatePActorTimeout,
//        actorSystemTyped.scheduler
//      )
//    }
//    retry(a1)(updatePStatePriceProxy1)
//      .map(r => {
//        logger.info("save spot item successed  {} ", x)
//        r
//      })
//      .recover { case NonFatal(error) =>
//        logger.info("save spot item updateStockPrice updateStockPriceInPState fail {} {}", x, error)
//        emailService.sendEmail(
//          "updateStockPrice error  after retried",
//          s"start ${x.toString} ${error.toString}"
//        )
//        StockSymbolPActor.Accepted
//      }
//  }

  lazy val aaRef = actorSystemTyped.systemActorOf(
    ContractStateActor1(),
    s"ContractStateActor1"
  )

//  def updateContractState(): Unit = {
//    implicit val timeout: Timeout = 20.seconds
//    val a1: Future[ConfirmationContractState] =
//      aaRef.ask((ref: ActorRef[ConfirmationContractState]) =>
//        ContractStateActor1.GetContractState(ref)
//      )(
//        timeout,
//        actorSystemTyped.scheduler
//      )
//    Await.result(retry(a1), 50.seconds)
//  }

  def updateContractState1(): Unit = {
    implicit val timeout: Timeout = 51.seconds
    //    val list =

    //    bankService.login()

    logger.info("login")
    logger.info("contract")
    val l = getStockContracts()
    logger.info("lllll {}", l)
//    aaRef ! ContractStateActor1.UpdateContractInfo(l)

    val a1 =
      aaRef.ask((ref: ActorRef[ConfirmationContractObject]) =>
        ContractStateActor1.UpdateContractInfo1(ref, l)
      )(
        timeout,
        actorSystemTyped.scheduler
      )
    Await.result(retry(a1), 60.seconds)
    //    val a1: Future[ConfirmationContractState] =
    //      aaRef.ask((ref: ActorRef[ConfirmationContractState]) =>
    //        ContractStateActor1.UpdateContractInfo(ref)
    //      )(
    //        timeout,
    //        actorSystemTyped.scheduler
    //      )
    //    Await.result(retry(a1), 50.seconds)
  }

  def updateContractState(): Unit = {
    implicit val timeout: Timeout = 20.seconds
    logger.info("login")
    logger.info("contract")
    val l = getStockContracts()
    aaRef ! ContractStateActor1.UpdateContractInfo(l)
//    val a1: Future[ConfirmationContractState] =
//      aaRef.ask((ref: ActorRef[ConfirmationContractState]) =>
//        ContractStateActor1.UpdateContractInfo(ref)
//      )(
//        timeout,
//        actorSystemTyped.scheduler
//      )
//    Await.result(retry(a1), 50.seconds)
  }

  def fetchImportantSellNotes(): List[CheckStockSellNoteItem] = {
    val s = fetchContractState
    s.list.map(r => {
      val l1 = r.stockOrderVOList.map(item => {
        val s = StockSymbol(item.code)
        val f1 = enterReason.downIn3Days()
        StockSellNote(
          name = s.getCodeName,
          important = f1._2(s)
        )
      })
      CheckStockSellNoteItem(name = r.contractId, l1)
    })
  }

  def fetchContractState(): ConfirmationContractState = {
    implicit val timeout: Timeout = 20.seconds
    val a1: Future[ConfirmationContractState] =
      aaRef.ask((ref: ActorRef[ConfirmationContractState]) =>
        ContractStateActor1.GetContractState(ref)
      )(
        timeout,
        actorSystemTyped.scheduler
      )
    Await.result(retry(a1), 50.seconds)
  }

//  def getPSate(x: StockSymbol): Future[StockPState] = {
//    implicit val timeout: Timeout = 20.seconds
//    val a1: Future[StockPState] = {
//      singletonLookupSymbolActor.ask((ref: ActorRef[StockPState]) =>
//        LookupSymbolActor
//          .LookupSymbolProxyCommand(x, StockSymbolPActor.GetPActorState(ref))
//      )(
//        timeout,
//        actorSystemTyped.scheduler
//      )
//    }
//    a1
//  }

  //  getSparkTable
  val shardJepQueryRegion: ActorRef[ShardingEnvelope[ShardedJepQueryActor.SharedJepQueryCommand]] =
    sharding.init(
      Entity(ShardedJepQueryActor.JepShardedTypeKey)(createBehavior =
        entityContext => ShardedJepQueryActor(entityContext.entityId, logger, dataSource)
      )
    )
//  lazy val joinQuantActor =
//    injector.instance[ActorRef[BundledJqActor.BundleJqCommand]]

  def sync000852(): Future[Unit] = {
//    val codes = getIndexContain(i"000852").map(r => StockSymbol(r.code))
//    val an: ActorRef[BunbledSyncActor.BunbledSyncActorCommand] =
//      system.spawnAnonymous(
//        BunbledSyncActor(
//          system.log,
//          sharding,
//          JepShardedTypeKey
//        )
//      )
//
//    implicit val timeout: Timeout = 6.hours
//
//    val a1: Future[BunbledSyncActor.ResultItem] =
//      an.ask(ref => BunbledSyncActor.BacthSyncSymbols(codes, ref))(
//        timeout,
//        actorSystemTyped.scheduler
//      )
//    a1.map(r => ())
    Future.unit
  }

//  def continue000852(): Future[Done] = {
//    logger.info("continue000852 start ")
//    val codes = getIndexContain(i"000852").map(r => StockSymbol(r.code))
//    Source(codes)
//      .mapAsync(1)((symbol: LSymbol) => {
//        val jepSharedActor = getShardedActor(symbol)
//        implicit val timeout1: Timeout = 2.hours
//        val f: Future[RunJepRet.RunJepRetMsg] =
//          jepSharedActor
//            .ask((ref: ActorRef[RunJepRet.RunJepRetMsg]) =>
//              ShardedJepQueryActor.HandleSaveContinueData(symbol, ref)
//            )
//        f.map(_ => ())
//      })
//      .runWith(Sink.ignore)
//  }

  def getHotStockPrice(
    stockSymbol: StockSymbol
  ) = {
    dynamicAStockPrice.getList(stockSymbol.code)
  }

  def testVolume(
  ) = {

//    val c = c"002763"
//    volumeIndicator.fetchData(c)
//    val data = Await.result(volumeIndicator.getList(c), 300.seconds)
//    logger.info("dat {}", data)

  }

  def testCodePrice() = {
    val c = c"002763"
    logger.info("right {}", c.getPrices().takeRight(5))
    logger.info("right 2 {}", c.getChangeSince(1))
    logger.info("right 2 {}", c.getChangeSince(2))
    logger.info("right 3 {}", c.getChangeSince(3))
  }

  def testNorth() = {
    val a = new NorthDataList(
      "沪股通",
      logger,
      policy
    )

    Await.result(
      a.fetchData(),
      200.seconds
    )
    val l = Await.result(
      a.getDataList(),
      200.seconds
    )
    logger.info("l {}", l)
    logger.info("l {}", l)
    //    .withColumnRenamed("平均值", "average")
    //    .withColumnRenamed("股息率", "dividendrate")
    //    .withColumnRenamed("最低30", "low30")
    //    .withColumnRenamed("最高30", "high30")

  }
  def testYjbg() = {
    val a = new YjbgDataList("20190331", logger, policy)
    Await.result(
      a.fetchData(),
      200.seconds
    )
    val l = Await.result(
      a.getDataList(),
      200.seconds
    )
    logger.info("l {}", l)
  }

  def testYjyg() = {
    val a = new YjygDataList("20190331", logger, policy)

    Await.result(
      a.fetchData(),
      200.seconds
    )
    val l = Await.result(
      a.getDataList(),
      200.seconds
    )
    logger.info("l {}", l)
  }

  def testEarnForcast() = {
    val a = new EarnForcastDataList(logger, policy)
    Await.result(
      a.fetchData(),
      200.seconds
    )

    val l = Await.result(
      a.getDataList(),
      200.seconds
    )
    logger.info("l {}", l)
  }

//  def testIndexValue() = {
//    val a = new IndexValueDataList("中证能源", "股息率", logger, policy)
//
//    Await.result(
//      a.fetchData(),
//      200.seconds
//    )
//
//    val l = Await.result(
//      a.getDataList(),
//      200.seconds
//    )
//    logger.info("l {}", l)
//
//  }

  def testSector() = {
//    sh600012
    //    600012  皖通高速
    //    6.790       -0.03         -0.44   6.790   6.800      6.820   6.870   6.890   6.760    5000453   33983438  15:00:00   12.261  0.940  1.126196e+06  7.914424e+05        0.42900

//    StructField(symbol,StringType,true)
    //    StructField(code,StringType,true)
    //    StructField(name,StringType,true)
    //    StructField(trade,DoubleType,false
    //    )StructField(pricechange,DoubleType,false)
    //    StructField(changepercent,DoubleType,false)
    //    StructField(buy,DoubleType,false)
    //    StructField(sell,DoubleType,false)StructField(settlement,DoubleType,false)StructField(open,DoubleType,false)StructField(high,DoubleType,false)StructField(low,DoubleType,false)StructField(volume,LongType,true)StructField(amount,LongType,true)StructField(ticktime,StringType,true)StructField(per,DoubleType,true)StructField(pb,DoubleType,true)StructField(mktcap,DoubleType,true)StructField(nmc,DoubleType,true)StructField(turnoverratio,DoubleType,true)

//    val s = new SectorDataList("新浪行业", logger, policy)
//    Await.result(s.fetchData(), 200.seconds)
//    val l = Await.result(s.getDataList(), 200.seconds)
//    logger.info(l.headOption.toString)
//    logger.info("lll {}", l)
    val new_glql = new SectorDetailList("new_glql", logger, policy)

    Await.result(
      new_glql.fetchData(),
      200.seconds
    )

    val l1 = Await.result(new_glql.getDataList(), 200.seconds)
    logger.info("lll {}", l1)
  }

  def testTimeSeries = {

    import spark.implicits._
    val l = List(PigPrice1(new java.sql.Date(DateTime.now.getMillis), 1)).toDF()

    dataFrameDao.saveDynamicTableWithout(l, "test_time_series")
  }

  def fetchPanmingDataList(
    indexSymbol: IndexSymbol
  ) = {
    panMingFactor.getList(indexSymbol)
  }

  lazy val optionRiskFactor = injector.instance[OptionRiskFactor]

  def getOptionQQLT() = {
    optionRiskFactor.getDataList()
//    (i"000050")
  }

  lazy val factor_ptionRiskMiniFactor = injector.instance[OptionRiskMiniFactor]

  def fetchFactorData() = {
    // panming
    emailService.sendEmail("panMingFactor", "start")
    panMingFactor.fetchData(IndexSymbol("000016"))
    logger.info("panming 000016 finish")
    panMingFactor.fetchData(IndexSymbol("000300"))
    logger.info("panming 000016 finish")
    emailService.sendEmail("panMingFactor", "finish")
  }

  sys.props.put("quill.macro.log", false.toString)
  sys.props.put("quill.binds.log", true.toString)

  def getKeZhuanZhai() = {
    retry {
      dataFrameDao.saveConvertibleBond(
        dataSource.getKeZhuanZhai()
      )
    }
  }

  def getTimeSeries(stockSymbol: StockSymbol): BaseBarSeries = {
    logger.info("getTimeSeries {}", stockSymbol)
    val f = timeSeries.getBaseBarSeries(stockSymbol)
    f.get
  }

  def aa(stockSymbol: StockSymbol) = {

    val closePrice: ClosePriceIndicator = new ClosePriceIndicator(getTimeSeries(stockSymbol))
    val sma = new FastDown1Indicator(closePrice, 3, logger)

    logger.info(" xxxxx {}", sma.getValue(1))
    logger.info(" xxxxx {}", sma.getValue(2))
//    logger.info("sma {}", sma.indicator.getValue(1))
//    logger.info("sma {}", sma.indicator.getValue(2))
  }

  def getNDaysBefore(date: DateTime, nDays: Int): Future[DateTime] = {
    getAsyncTradeDays().map(list => {
      val index = list.indexWhere(r => r.isAfter(date))
      list(index - nDays - 1)
    })
  }

  def aaaaaa(
    sy: StockSymbol
  ) = {
    val list = timeSeries.selectTimeSeriesSymbol(sy)
    val opens = TimeSeries.fromTimestamps(list.map(r => (r.date.toInstant.getEpochSecond, r.open)))

    val closes =
      TimeSeries.fromTimestamps(list.map(r => (r.date.toInstant.getEpochSecond, r.close)))

    Sessions.findSessions(closes, Duration.ofMinutes(10))
  }

  def getCountFor5StockSymbol(
    symbol: StockSymbol,
    date: DateTime,
    nDays: Int
  ): Future[Boolean] = {
    logger.info("checking symbol {}", symbol)
    val list = timeSeries.selectTimeSeriesSymbol(symbol)

    val r1 = list.map(r => (r.date.toInstant.getEpochSecond, r.close.toDouble))

    val timeSeries1 = TimeSeries.fromTimestamps(r1)

    val startFuture = getNDaysBefore(date, nDays)
    startFuture.map(start => {
      val end = date.withHourOfDay(23).toDate.toInstant
      val a1 = timeSeries1.slice(start.toDate.toInstant, end)

      if (a1.length <= nDays) {
        false
      } else {
        var res = true
        breakable {
          for (i <- 1 until a1.length) {
            logger.info("iiii {}", i)
            if (a1.get(i) < a1.get(i - 1)) {
              logger.info("previous {} current {}", a1.get(i - 1), a1.get(i))
              res = false
              break
            }
          }
        }
        logger.info("resutl {}", res)
        res
      }
    })
  }

  def distinctBy[A, B](xs: List[A])(f: A => B): List[A] =
    scala.reflect.internal.util.Collections.distinctBy(xs)(f)

//  def getHoldOptions() = {
//
//    val cookie = optionContract.getCookies()
//    val holds = optionContract.getHoldEarnContracts(cookie)
//
//    val f = holds
//      .map(r1 => {
//        getSparkTable
//          .getVegaOptionContractNum(r1.tickerSymbol)
//          .map(r => {
//            val f =
//              s"name : ${r1.tickerSymbol}  ${r.contract_num} ${r.short_name}  pre_pricce ${r1.last * r1.contMultnum} price ${r.new_price * r1.contMultnum} delta: ${r.delta} gamma: ${r.gamma} vix: ${r.vix}, amount: ${r1.holdNo}"
//            logger.info(f)
//            f
//          })
//      })
//      .map(r => r.getOrElse(""))
//      .mkString(LqSegment.separator)
//
//    f
////    emailService.sendEmail("期权 vega", f)
//
////    println(s"hold ${holds}")
//  }

//   TODO add file'

  def check5Lian(date: DateTime, nDays: Int): Unit = {
    emailService.sendEmail(
      "5lian",
      s"start $nDays day at date ${DateFormat.getDay(date)}"
    )
    logger.info(
      s"start $nDays day at date ${DateFormat.getDay(date)}"
    )
    val codes = getIndexContain(i"399303").map(r => StockSymbol(r.code))
    val txt = distinctBy(
      codes.zipWithIndex.filter(sumbol => {
        logger.info("start {} index {}", sumbol._1.code, sumbol._2)
        Await.result(
          getCountFor5StockSymbol(sumbol._1, date, nDays),
          60.seconds
        )
      })
    )(r => r._1.code)

    val rList = txt
      .map(r => r._1)
      .map(r => s"${r.getCodeName} ${r.code} chaodie: ${r.getChaodieDay().formatted("%.2f")}")

    val result =
      s"""
          |result: ${DateFormat.getDay(date)}
          |count: ${rList.length}
          |${rList.mkString(LqSegment.separator)}""".stripMargin

    emailService.sendEmail("5lian", result)
  }

  // TODO //
  def getCountFor5Lianyagn(
    list: List[StockSymbol],
    date: DateTime,
    nDays: Int
  ): Int = {
    Try {
      try {
        list.count(sumbol => Await.result(getCountFor5StockSymbol(sumbol, date, nDays), 60.seconds))
      } catch {
        case NonFatal(e) =>
          logger.error("getCountFor5Lianyagn {}", e.toString)
          throw new IllegalStateException
      }
    }.toOption.getOrElse(0)
  }

  def fetchBackendUrlFromCloud() = {
//    val b = quantConfig.fetchBackendU/rl()
//    b
  }

  def fetchBackendUrl() = {
//    val f = contractLogin.fetchTradeBackendUrl()
//    logger.info("f {}", f)
  }

  def syncPigData = {
    retry(pig.fetchData)
    retry(egg.fetchData)
  }

  def saveVixDataframe2DB(): Unit = {
    val a = dataSource.getVixDataSet()
    dataFrameDao.saveVixDataFrame(a)
    emailService.sendEmail("vix", s"vix synced")
  }

  def getSse(code: String): Unit = {
    logger.info("saving option {}", code)
    val f = dataSource.get_option_sina_sse_daily(code)

    if (f.isRight) {

//      tribe4.opt_10002273: 日期, 开盘, 最高, 最低, 收盘, 成交量

//      case class OptionPrice(
//                              date: String,
//                              open: Double,
//                              high: Double,
//                              low: Double,
//                              close: Double,
//                              volume: Double)
      val dataFrame = f.right.get
        .withColumnRenamed("日期", "date")
        .withColumnRenamed("开盘", "open")
        .withColumnRenamed("最高", "high")
        .withColumnRenamed("最低", "low")
        .withColumnRenamed("收盘", "close")
        .withColumnRenamed("成交量", "volume")
      dataFrameDao.saveOptionsDaily(dataFrame, code)
    }
  }

  def getSearchKey(): Unit = {}

  def test(stock: StockSymbol) = {
    import scala.concurrent.duration._
    logger.info("test", stock)
    Await.result(
      queryTable.getSymbolChaodieCache(stock),
      1.minutes
    )
  }

  def get_car_cpca_energy_sale(): List[MovieTime] = {
    val dateFrame = dataSource.get_car_cpca_energy_sale()
    val fileds = dateFrame.schema.fields.toList

    logger.info("date frame {}", fileds)

    logger.info("fileds(1).name{}", fileds(1).name)
    logger.info("fileds(2).name{}", fileds(2).name)

    val colList = dateFrame.collectAsList()
    val l = colList.map(item => {
      val month = item.getString(0)
      val time = s"${month.replace("月", "")}"
      val newTIme = if (time.length == 1) s"0$time" else time

      val a21 = s"${fileds(1).name.replace("年", "")}-$newTIme"
      val a22 = s"${fileds(2).name.replace("年", "")}-$newTIme"

      logger.info("month {}", month)
      logger.info("a2 {}", a21)
      val a1 = item.getDouble(1)
      logger.info("a1 {}", a1)
      val a2 = item.getDouble(2)

      List(
        MovieTime(DateFormat.parseyyyy_MM(a21), a1),
        MovieTime(DateFormat.parseyyyy_MM(a22), a2)
      )
    })
    val newList = l
      .foldRight(List.empty[MovieTime])((p, c) => {
        c ::: p
      })
      .filter(r => r.value > 0)
      .sortWith((a, b) => a.date.isBefore(b.date))

    newList
  }

  def savecar_cpca_energy_saleListList() = {
    getSparkTable.insertcar_cpca_energy_saleList(get_car_cpca_energy_sale())
  }

  def getOptionList(date: DateTime, symbol: OptionProductName) = {
    // TODO test
    if (symbol == OptionProductName.HX50) {
      val f = dataSource.get_option_finance_board(date, symbol)
      if (f.isRight) {
        val frame = f.right.get
        val f1 = frame
          .withColumnRenamed(
            "合约交易代码",
            "code"
          )
          .withColumnRenamed(
            "当前价",
            "price"
          )
          .withColumnRenamed(
            "行权价",
            "exerciseprice"
          )
          .withColumnRenamed(
            "数量",
            "amount"
          )
          .drop("前结价")
          .drop("涨跌幅")
          .withColumn("productname", lit(symbol.value))
        dataFrameDao.saveOptionsList(f1)
      }
    } else if (symbol == OptionProductName.HT300) {
      val f = dataSource.get_option_finance_board(date, symbol)
      if (f.isRight) {
        val frame = f.right.get
        val f1 = frame
          .withColumnRenamed(
            "合约交易代码",
            "code"
          )
          .withColumnRenamed(
            "当前价",
            "price"
          )
          .withColumnRenamed(
            "行权价",
            "exerciseprice"
          )
          .withColumnRenamed(
            "数量",
            "amount"
          )
          .drop("前结价")
          .drop("涨跌幅")
          .withColumn("productname", lit(symbol.value))
        dataFrameDao.saveOptionsList(f1)
      }
    }
  }

  def createVega() = {
    dataFrameDao.checkCreateVegaTable()
  }

  // TODO sync options
  def syncOptions() = {
    dataSource.get50Months.foreach(date => {
      logger.info("sync options 1")
      val f1 =
        dataSource.get_option_sina_sse_codes(HT300, date)
      if (f1.isRight) {
        val ff = f1.right.get
        ff._1.foreach(r => {
          //            getSse(r)
          getSseGreeks(r)
        })
        ff._2.foreach(r => {
          //            getSse(r)
          getSseGreeks(r)
        })
        Thread.sleep(300)
      } else {
        logger.info("f {}", f1)
      }
//      List(HX50, HT300).foreach(product => {
      val f =
        dataSource.get_option_sina_sse_codes(HX50, date)
      if (f.isRight) {
        val ff = f.right.get
        ff._1.foreach(r => {
//            getSse(r)
          getSseGreeks(r)
        })
        ff._2.foreach(r => {
//            getSse(r)
          getSseGreeks(r)
        })
        Thread.sleep(300)
      } else {
        logger.info("f {}", f)
      }
//      })
    })
  }

  def get_get_option_sina_sse_minute(code: String = "10003433") = {
    dataSource.get_option_sina_sse_minute(code)
  }

  def getSseGreeks(code1: String = "10003433") = {
    val dateFrame = dataSource.option_sina_sse_greeks(code1).right.get
    try {
      logger.info("code {} date frame {}", code1, dateFrame)
      val shortName = dateFrame.collect()(0).getString(1)
      val volume = dateFrame.collect()(1).getString(1)
      val delta = dateFrame.collect()(2).getString(1)
      val gamma = dateFrame.collect()(3).getString(1)
      val theta = dateFrame.collect()(4).getString(1)
      val vega = dateFrame.collect()(5).getString(1)
      val embeddedValue = dateFrame.collect()(6).getString(1)
      val vix = dateFrame.collect()(6).getString(1)

      val code = dateFrame.collect()(9).getString(1)
      val newPrice = dateFrame.collect()(11).getString(1)
      val exercisePrice = dateFrame.collect()(10).getString(1)

      val vegaOption = VegaOption(
        contract_num = code1,
        short_name = shortName,
        delta = delta.toDouble,
        volume = volume.toDouble,
        new_price = newPrice.toDouble,
        code = code,
        exercise_price = exercisePrice.toDouble,
        vega = vega.toDouble,
        embedded_value = embeddedValue.toDouble,
        theta = theta.toDouble,
        gamma = gamma.toDouble,
        vix = vix.toDouble
      )
      logger.info("vega {}", shortName)
      getSparkTable.insertVegaOption(vegaOption)
    } catch {
      case NonFatal(e) =>
        logger.error("xok {}", e)
    }

  }

  def getSymboleCodeName(symbol: LSymbol): String = {
    symbol match {
      case a: IndexSymbol => a.getCodeName
      case _              => "NotSupport"
    }
  }

  def getOrderPreview(): Future[List[BuyPreviewStock]] = {
    val l: Future[List[StockOrder]] = quantConfig.clouds

//    val f = l.flatMap(r => {
//      val l1 = r.filter(item => item.direction == OrderCommand.commandBuy)
//      val l2: List[Future[BuyPreviewStock]] = l1.map(r => {
//        getPSate(r.symbol).map(r1 =>
//          r1.currentPrice match {
//            case Some(p) =>
//              BuyPreviewStock(
//                stock = r.symbol,
//                name = r.symbol.getCodeName,
//                total = p * r.amountOpt.getOrElse(0)
//              )
////              s"${r.symbol.getCodeName} amount:  ${p * r.amountOpt.getOrElse(0)}"
//            case _ =>
//              BuyPreviewStock(stock = r.symbol, name = r.symbol.getCodeName)
//          }
//        )
//      })
//      Future.sequence(l2)
//    })

//    f
    Future.successful(List.empty)
  }

//  def orderLocal(): Try[Unit] = {
////    Try {
////      try {
////        bankService.login()
////      } catch {
////        case NonFatal(e) =>
////          fetchBackendUrlFromCloud()
////          bankService.login()
////      }
////
////      val clouds = quantConfig.tradeOrder
//////        Await.result(quantConfig.a, 60.seconds)
////      if (clouds.exists(p => p.channel.nonEmpty)) {
////        val f = clouds.map(item => {
////          logger.info("handling {}", item.symbol.code)
////          val priceType: Int = item.priceType match {
////            case Some(OrderPriceType.market) => 1
////            case _                           => 0
////          }
////          if (
////            false
//////            item.direction == OrderCommand.commandBuy
//////              && !item.symbol
//////              .getPrice()
//////              .isTradeOk
////          ) {
////            //            emailService.sendEmail("交易跌幅过大", item.toString)
////            Left(new Error("交易跌幅过大"))
////          } else {
////            logger.info("CreateOrder {}", item.symbol.code)
////            val r = bankService.createOrder(
////              InsertOrder(
////                contractId = item.channel,
////                stockCode = item.symbol.code,
////                entrustType = priceType,
////                entrustPrice = item.priceOpt.map(r => r.toString).getOrElse(""),
////                entrustNumber = item.amountOpt.get
////              ),
////              item.direction == OrderCommand.commandBuy
////            )
////            logger.info("rrrrr {}", r)
////            r
////          }
////        })
////
////        emailService.sendEmail(
////          "执行结果",
////          f.map(r => if (r.isRight) s"执行成功$r" else s"执行失败$r").mkString("\n")
////        )
////      } else {
////        emailService.sendEmail("没有合适的合约 命令", "")
////      }
////    } recover { case NonFatal(t) =>
////      logger.info("contract xxxxxx {}", t)
////    }
//  }

  def checkPrice() = {
    val s = c"000004"
    logger.info("s.getPrice() {}", s.getPrice())
  }
  def orderClound(): Try[Unit] = {
    Try {
//      bankService.login()
      val clouds = Await.result(quantConfig.clouds, 60.seconds)
      if (clouds.exists(p => p.channel.nonEmpty)) {
        val f = clouds.map(item => {
          logger.info("handling {}", item.symbol.code)
          val priceType: Int = item.priceType match {
            case Some(OrderPriceType.market) => 1
            case _                           => 0
          }
          if (
            item.direction == OrderCommand.commandBuy && !item.symbol
              .getPrice()
              .isTradeOk
          ) {
//            emailService.sendEmail("交易跌幅过大", item.toString)
            Left(new Error("交易跌幅过大"))
          } else {
            logger.info("CreateOrder {}", item.symbol.code)
//            val r = bankService.createOrder(
//              InsertOrder(
//                contractId = item.channel,
//                stockCode = item.symbol.code,
//                entrustType = priceType,
//                entrustPrice = item.priceOpt.map(r => r.toString).getOrElse(""),
//                entrustNumber = item.amountOpt.get
//              ),
//              item.direction == OrderCommand.commandBuy
//            )
//            logger.info("rrrrr {}", r)
//            r
          }
        })

//        emailService.sendEmail(
//          "执行结果",
//          f.map(r => if (r.isRight) s"执行成功$r" else s"执行失败$r").mkString("\n")
//        )
      } else {
        emailService.sendEmail("没有合适的合约 命令", "")
      }
    } recover { case NonFatal(t) =>
      logger.info("xxxxxx orderClound {}", t)
    }
  }
  def getVix(isSave: Boolean): File = {
    import spark.implicits._
    val a = dataSource.getVixDataSet()
    dataFrameDao.saveVixDataFrame(a)
    polyty.saveVixItem(a.as[VIxItem], isSave)
  }

  def getIndexCurrentPrice(indexSymbol: IndexSymbol): Either[Error, StockData] = {
    val f: Either[Error, util.HashMap[String, Any]] = dataSource.jepExecutor.run(
      s"pysnowball.quotec('${ObjectConvert.getIndexSimple(indexSymbol.code).toUpperCase}')",
      classOf[java.util.HashMap[String, Any]]
    )

    f match {
      case Left(value) =>
        println("ffffffff")
        Left(new Error("empty"))
      case Right(value) =>
        val v = value.asInstanceOf[java.util.HashMap[String, Any]]
        val c1: StockData = AB.a(
          v.get("data").asInstanceOf[java.util.List[java.util.HashMap[String, Any]]].get(0)
        )
        println(c1)
        Right(c1)

    }
  }

  def checkStrategy(): Unit = {
    val tradeLogics = Await.result(quantConfig.logics, 200.seconds)
    val resultl = tradeLogics.map(r => {
      tradeStrategy.next(r)
    })

    val arrayStructSchema = new StructType()
      .add("code", StringType)
      .add("name", StringType)
      .add("updateAt", StringType)
      .add("logic", StringType)
      .add("enterReason", StringType)
      .add("leaveReason", StringType)
      .add("content", StringType)

    val df: DataFrame = spark.createDataFrame(
      spark.sparkContext
        .parallelize(
          resultl.map(r =>
            Row(
              r.logic.symbol.code,
              r.logic.symbol.getCodeName,
              r.logic.updateWhen.map(r => DateFormat.getSafeDay(r.toMutableDateTime)).getOrElse(""),
              r.logic.tradeLogicMsg.getOrElse(""),
              r.logic.enterMeta.getOrElse(""),
              r.logic.leaveReasonMsg.getOrElse(""),
              r.content
            )
          )
        ),
      arrayStructSchema
    )

    notionService
      .savePageForItemType(
        UUID.fromString(UUIDUtil.insertDashUUID("36bb7808339041cba1809ac2b536ebb8")),
        s"股票策略 ${DateFormat
            .getDay(DateTime.now)}",
        df
      )

    val result = resultl
      .mkString(LqSegment.separator)
    emailService.sendEmail("策略建议", result)
  }

//  def getChaodieIndexSimpleCode(simpelCode: String): Dataset[IndexChaodie] = {
//    import spark.implicits._
//    val dataset = dataSource.getChaodieStock(simpelCode).as[IndexChaodie]
//    dataset
//  }

//  def saveChaodieCode2DB(stockSymbol: LSymbol): Unit = {
//    stockSymbol match {
//      case a: IndexSymbol =>
//        val dataframe = dataSource.getChaodieStock(stockSymbol.getJqCode)
//        dataFrameDao.saveChaodie(stockSymbol, dataframe)
//      case d: StockSymbol =>
//        val dataframe = dataSource.getChaodieStock(stockSymbol.getJqCode)
//        dataFrameDao.saveChaodie(stockSymbol, dataframe)
//      case c @ _ =>
//        logger.info("save chaodie {}", c)
//    }
//  }

  // visitor

  // visitor

  val checkerList: List[ResultChecker] = List(
    injector.instance[PanmingChecker],
    injector.instance[TimeChecker],
    injector.instance[PriceChecker]
  )

  def checkNoticeItem(notice: NoticeMe): Option[CheckResult] = {
    logger.info("notice cccccccccccc {}", notice.symbol)
    import net.codingwell.scalaguice.InjectorExtensions._
    val result = checkerList.foldLeft(Option.empty[CheckResult])((p, current) => {
      if (p.isDefined) p else current.run(notice)
    })
    result
  }

  final val notionService = new NotionService()

  def checkNotice: Unit = {
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    logger.info("notice ......")
    val notice = Await.result(quantConfig.notices, 300.seconds)
//      .take(2)
    logger.info("xxxxxx ......")
    logger.info("xxxxxx ......")
    logger.info("xxxxxx ......")
    logger.info("xxxxxx ......")
    logger.info("xxxxxx ......")
    logger.info("xxxxxx ......")
    logger.info("xxxxxx ......")
    logger.info("xxxxxx ......")
    logger.info("xxxxxx ......")
    logger.info("xxxxxx ......")

    logger.info("notice notice .size  {}", notice.size)

    val aList = notice.zipWithIndex.map(r => {
      logger.info("index {}, {} ", r._2, r._1.symbol, r._1.indexSymbol)
      checkNoticeItem(r._1)
    })

    val aL2: List[CheckResult] = aList
      .filter(_.isDefined)
      .map(_.get)
      .filter(r => r != null)

    val d = aL2.map(r => {
      logger.info("r.notice.dateTime {}", r.notice.symbol.code)

      logger.info("ssss start")
      val u = r.updateAt match {
        case Some(u) => DateFormat.getDay(u)
        case _       => ""
      }
      logger.info("ssss {}", u)

      logger.info("xxxxx")

      val add = r.notice.dateTime
        .map(r1 => {
          DateFormat.getSafeDay(r1.toMutableDateTime)
        })
        .getOrElse("")
      logger.info("xxxxx x {}", add)

      val d = s"${r.notice.referenceValue.getOrElse("")} ${add}"
      logger.info("xxxxx {}", d)

      val profit: String = r.notice.symbol match {
        case s: StockSymbol =>
          val n = BoatQuery.stock.stockData.stock_profit_sheet_by_report_emApi(s)
          val l = Await.result(n, 40.seconds)
          l.map(r =>
            r.take(8)
              .map(list => s"${list.NOTICE_DATE}: ${list.DEDUCT_PARENT_NETPROFIT_YOY},")
              .mkString("")
          ).getOrElse("")
        case _ => ""
      }

      val profit2: String = r.notice.symbol match {
        case s: StockSymbol =>
          logger.info("s code {}", s.code)
          Try {
            val l = retry {
              val m1 = BoatQuery.stock.stock_financial_analysis_indicatorApi(s)
              Await.result(m1, 90.seconds)
            }
            l.map(r =>
              r.take(8)
                .map(list => s"${list.`p_ri4qi1`}: ${list.`p_jing4li4run4zeng1zhang3lu4`},")
                .mkString("")
            ).getOrElse("")
          }.toOption.getOrElse(s"error ${s.code}")
        case _ => ""
      }

      Row(
        profit,
        profit2,
        r.notice.symbol.code,
        d,
        r.current.map(_.toString).getOrElse(""),
        r.notice.symbol.getCodeName,
        u,
        r.category,
        r.notice.messageOpt.getOrElse("")
      )
    })

    val arrayStructSchema = new StructType()
      .add("porfit", StringType)
      .add("porfit2", StringType)
      .add("code", StringType)
      .add("ref", StringType)
      .add("current", StringType)
      .add("codeName", StringType)
      .add("updateAt", StringType)
      .add("category", StringType)
      .add("msg", StringType)

    val df: DataFrame = spark.createDataFrame(
      spark.sparkContext
        .parallelize(d),
      arrayStructSchema
    )

    notionService
      .savePageForItemType(
        UUID.fromString(UUIDUtil.insertDashUUID("36bb7808339041cba1809ac2b536ebb8")),
        s"股票提醒 ${DateFormat
            .getDay(DateTime.now)}",
        df
      )

    val aL = aList
      .filter(_.isDefined)
      .map(_.get)
      .map(r => s"${r.title}: ${r.content}")

    logger.info("aL {}", aL)

    emailService.sendEmail(
      "提醒",
      aL
        .mkString(LqSegment.separator)
    )
  }

  def getStrong(date: DateTime): String = {
    Try {
      val f = dataSource.getStockEmZtPoolStrong(date)
      val list = f.collectAsList().toList
      list
        .take(20)
        .map(r => {
          val codeSymbol = StockSymbol(r.`代码`)
          logger.info("getStrong getChaodieList {}", codeSymbol)
          val chaodieList = codeSymbol.getChaodieDayList()
          logger.info("chaodieList {}", chaodieList)
          val d1 =
            Try(chaodieList(20)).toOption.getOrElse(0.0).formatted("%.2f")
          s"${r.`代码`} ${r.`名称`} 超跌$d1(20天前)-${chaodieList.headOption.map(r => r.formatted("%.2f")).getOrElse("")}  30天涨幅${codeSymbol
              .getChangeSince(30)
              .formatted("%.2f")}"
        })
        .mkString(LqSegment.separator)
    }.getOrElse("Strong")
  }

  def getPortfolioGroupFomrat(a: List[StockPortfolio], days: Int): String = {
    Formatter.getPercentFormat(getPortfolioGroup(a, days))
  }

  import org.joda.time.DateTimeZone

  import java.time.ZonedDateTime

  def zonedDateTimeToDateTime(zdt: ZonedDateTime): DateTime = new DateTime(
    zdt.toInstant.toEpochMilli,
    DateTimeZone.forID(zdt.getOffset.getId)
  )

  private def getStockContracts(): List[ContractDetailStockList] = {
//    Try {
//      bankService.login()
//      val contracts = bankService
//        .getContracts()
//        .map(r => r.data)
//        .getOrElse(List.empty[ContractItem])
//      seeContractOrderList1(contracts)
//    }.getOrElse(
//    )
    List.empty[ContractDetailStockList]
  }

//  def getSellNotice() = {
//    val l = getStockContracts()
//    val c = l.foldRight("")((a, b) => {
//      val l1 = CalcTools
//        .getContractList(a.stockOrderVOList)
//        .foldRight("")((c, d) => {
//          val stockSymbol = StockSymbol(c.code)
//          val f1 = enterReason.downIn3Days()._2(stockSymbol)
//          val content =
//            if (f1)
//              s"downIn3Days conntractId: ${a.contractId} ${c.volume} ${c.code} ${stockSymbol.getCodeName}${LqSegment.separator}"
//            else ""
//          s"$d$content"
//        })
//      s"$b$l1"
//    })
//    val holds = Await.result(quantConfig.holds, 200.seconds)
//    val c1 = holds.foldRight("")((a, b) => {
//      val l1 = a.list.foldRight("")((c, d) => {
//        val f1 = enterReason.downIn3Days()._2(c.stock)
//        val content =
//          if (f1)
//            s"downIn3Days conntractId: ${a.name} ${c.count} ${c.stock.getCodeName} ${c.stock.code}${LqSegment.separator}"
//          else ""
//        s"$d$content"
//      })
//      s"$b$l1"
//    })
//
//    logger.info("ccccccccccc")
//    logger.info(c)
//    emailService.sendEmail("Content Sell", s"$c${LqSegment.separator}$c1")
//  }

//  def getPortfolioList(
//    dayCount: Int = 15,
//    date: Option[DateTime] = None,
//    isPrint: Boolean = true
//  ) = {
//    logger.info("getPortfolioList")
//
////    bankService.login()
//    val contracts = List.empty[ContractItem]
////    bankService
////      .getContracts()
////      .map(r => r.data)
////      .getOrElse()
//
//    val t1 =
//      seeContractOrderList1(contracts).filter(r => r.stockOrderVOList.nonEmpty)
//
//    t1.foreach(r => {
//      val lsit =
//        r.stockOrderVOList.map(r => StockPortfolio(stock = StockSymbol(r.code), count = r.volume))
//      logger.info("llllllll {}", lsit)
//      getPortfolioGroupHistoryContract(
//        s"h_${r.contractId}",
//        lsit,
//        name = s"history_${r.name}",
//        dayCount,
//        date,
//        isPrint
//      )
//      logger.info("lsit {}", lsit.length)
//      logger.info("lsit {}", lsit.length)
//      logger.info("lsit {}", lsit.length)
//      if (lsit.nonEmpty) {
//        val l = getPortfolioGroupHistory75(lsit, dayCount, date)
//        saveTimeSeries(l, s"c75_${r.contractId}")
//
//        if (isPrint) {
//          polyty.print(
//            l,
//            s"change${r.name}"
//          )
//        }
//      }
//    })
//  }

  def getPortfolio(
    dayCount: Int = 15,
    date: Option[DateTime] = None,
    isPrint: Boolean = true
  ) = {
    logger.info("getPortfolio")

    val holds = Await.result(quantConfig.holds, 200.seconds)
    holds.foreach(list => {
      val h = getPortfolioGroupHistory75(list.list, dayCount, date)
      saveTimeSeries(h, s"ch_${list.name}")
      if (isPrint) {
        polyty.print(
          h,
          s"change_75${list.name}"
        )
      }
      getPortfolioGroupHistoryContract(
        s"h_${list.name}",
        list.list,
        s"history${list.name}",
        dayCount,
        date,
        isPrint
      )
    })
  }

//  def saveTrace(
//  ) = {
//  }

  def trace(
  ) = {
//
//    getPortfolio(15, Option.empty[DateTime])
//    getPortfolioList(15, Option.empty[DateTime])
//
  }

  def getPortfolioGroupHistoryContract(
    tableName: String,
    list1: List[StockPortfolio],
    name: String = "image",
    dayCount: Int = 15,
    date: Option[DateTime] = None,
    isPrint: Boolean = true
  ) = {

    try {
      logger.info("llllllll {}", name)
      val l = getPortfolioGroupHistory(list1, dayCount, date)

      saveTimeSeries(l, tableName)
      if (isPrint) {
        logger.info("thinked {}", l)
        polyty.print(l, name)
      }
    } catch {
      case NonFatal(t) =>
        logger.error("ply  getPortfolioGroupHistory1 {}", t)
    }
  }

  def getMeadiumPercentile(
    times: List[Double],
    double: Double = 0.5
  ): Double = {
    val f = Try {
      logger.info("times {}", times)
      val timesSorted = times.sorted
//        .sortWith(_ < _)
      logger.info("times {}", timesSorted)
      val percent = (timesSorted.length * double).asInstanceOf[Int]
      logger.info("percent {}", percent)
      timesSorted(percent)
    } recover { case NonFatal(x) =>
      logger.error(" getMeadiumPercentile {}", x)
      0.0
    }

    f.get
  }

  def get99thPercentile(times: List[Double]): Double = {
    logger.info("get99thPercentile {}", times.length)
    val timesSorted = times.sortWith(_ < _)
    val percent = (timesSorted.length * 0.78).asInstanceOf[Int]
    timesSorted(percent)
  }

  def getPercentile(times: List[Double], per: Double): Double = {
    logger.info("get99thPercentile {}", times.length)
    val timesSorted = times.sortWith(_ < _)
    val percent = (timesSorted.length * per).asInstanceOf[Int]
    timesSorted(percent)
  }

  def saveTimeSeriesDataFrame(list: DataFrame, name: String) = {
//    import spark.implicits._
//    val dfFromData1: DataFrame = list.map(r => PigPrice(r._1.toDate, r._2)).toDF()
    dataFrameDao.saveDynamicTableWithout(list, name)
  }

  def saveTimeSeries(list: List[Tuple2[DateTime, Double]], name: String) = {
    logger.info("saveTimeSeries {}", name)
    import spark.implicits._
    val dfFromData1: DataFrame =
      list.map(r => PigPrice1(new java.sql.Date(r._1.getMillis), r._2)).toDF()
    dataFrameDao.saveDynamicTableWithout(dfFromData1, name)
  }

  def getPortfolioGroupHistory75(
    list1: List[StockPortfolio],
    dayCount: Int = 15,
    date: Option[DateTime] = None
  ): List[Tuple2[DateTime, Double]] = {

    import Array._
    val date1: DateTime =
      date.getOrElse(Await.result(getLatesTradeDayForStrong, 30.seconds))
    logger.info("cccccccccc {}", DateFormat.getDay(date1))
    val tradeDays = Await.result(dataSource.getCurrentTradeDays(), 300.seconds)
    //    logger.info("size {}", tradeDays.length)
    //    logger.info("trade xxx {}", DateFormat.getDay(tradeDays.last))
    //
    val end = tradeDays.lastIndexWhere(p => p.isBefore(date1.plusMillis(1)))
    //    val end = start + dayCount

    logger.info("end {}", end)
    //    logger.info("end {}", end)
    logger.info("start {} end {}", end - dayCount, end)

    //    logger.info("trade start  {}", DateFormat.getDay(tradeDays(start)))
    //    logger.info("trade end  {}", DateFormat.getDay(tradeDays(end)))
    logger.info(
      "trade xxx {} {}",
      DateFormat.getDay(tradeDays(end - dayCount)),
      DateFormat.getDay(tradeDays(end))
    )

    //    list1.foreach(r => {
    //      updateAllSymbolPrice(r.stock)
    //    })

    //    logger.info("xxx  {}", range(0 , dayCount).mkString)
    //    List.empty[Double]
    val lxx = range(end - dayCount, end + 1).map(r12 => {
      val currentDate = tradeDays(r12)
      logger.info("currentDate {}", DateFormat.getDay(currentDate))

      val nums = list1.map(r => {
        logger.info("handleing {}", r.stock.code)
        val series = getTimeSeries(r.stock)
        val barDatas = series.getBarData()
        logger.info("handleing stock {} size", r.stock.code, barDatas.size())
        val f1 = barDatas.zipWithIndex.toList.indexWhere(dateTime =>
          zonedDateTimeToDateTime(dateTime._1.getEndTime).isEqual(currentDate)
        )
        logger.info(
          "end time {}",
          barDatas.map(r => r.getEndTime).last.toString
        )
        logger.info(
          "barDatas.size {} ,index {} currentDate {}",
          barDatas.size,
          f1,
          currentDate
        )
        val currentDay = barDatas.get(f1).getClosePrice.doubleValue
        logger.info("barDatas.get(f1 -1) {}", barDatas.get(f1 - 1).getEndTime)
        val previousDay = Try(barDatas.get(f1 - 1).getClosePrice.doubleValue)
          .getOrElse(currentDay)

        (currentDay - previousDay) / previousDay
      })

      if (nums.isEmpty) {
        logger.info("empty list ")
      }
      logger.info("current date {} {}", currentDate, nums)

      (currentDate, get99thPercentile(nums))
    })

//    logger.info("xxxxxxxxxxx {}", lxx.toString)
//
//    val base = lxx(0)._2
//    logger.info("base {}", base)
//    val result = lxx.map(r => (r._1, r._2 / base)).toList
//    logger.info("result {}", result)
    lxx.toList
//    result

  }

  def getPortfolioGroupHistory(
    list1: List[StockPortfolio],
    dayCount: Int = 15,
    date: Option[DateTime] = None
  ): List[Tuple2[DateTime, Double]] = {

    import Array._
    val date1: DateTime =
      date.getOrElse(retry(Await.result(getLatesTradeDayForStrong, 30.seconds)))
    logger.info("cccccccccc {}", DateFormat.getDay(date1))
    val tradeDays = retry(
      Await.result(dataSource.getCurrentTradeDays(), 30.seconds)
    )
//
    val end = tradeDays.lastIndexWhere(p => p.isBefore(date1.plusMillis(1)))
//    val end = start + dayCount

    logger.info("end {}", end)
//    logger.info("end {}", end)
    logger.info("start {} end {}", end - dayCount, end)

//    logger.info("trade start  {}", DateFormat.getDay(tradeDays(start)))
//    logger.info("trade end  {}", DateFormat.getDay(tradeDays(end)))
    logger.info(
      "trade xxx {} {}",
      DateFormat.getDay(tradeDays(end - dayCount)),
      DateFormat.getDay(tradeDays(end))
    )

//    list1.foreach(r => {
//      updateAllSymbolPrice(r.stock)
//    })

//    logger.info("xxx  {}", range(0 , dayCount).mkString)
//    List.empty[Double]
    val lxx = range(end - dayCount, end + 1).map(r12 => {
      val currentDate = tradeDays(r12)
      logger.info("currentDate {}", DateFormat.getDay(currentDate))

      val num = list1
        .map(r => {
          logger.info("handleing {}", r.stock.code)
          val series = getTimeSeries(r.stock)
          val barDatas = series.getBarData()
          val f1 = barDatas.zipWithIndex.toList.indexWhere(dateTime =>
            zonedDateTimeToDateTime(dateTime._1.getEndTime).isEqual(currentDate)
          )
          barDatas.get(f1).getClosePrice.doubleValue * r.count
        })
        .fold(0.0)((p, c) => p + c)
      (currentDate, num)
    })

    val base = lxx(0)._2
    logger.info("base {}", base)
    val result = lxx.map(r => (r._1, r._2 / base)).toList
    logger.info("result {}", result)
    result
  }

  def getPortfolioGroup(list1: List[StockPortfolio], days: Int): Double = {
    val list = list1.map(stock => {
      val series = getTimeSeries(stock.stock)
      val last = series.getEndIndex()

      val end = series.getBar(series.getEndIndex())
      val duration = if (last > days) last - days else 0
      val start = series.getBar(duration)
      if (series.isEmpty()) {
        throw new Error(s"get stock price error $stock")
      }

      logger.info("start {}", start.getClosePrice.doubleValue)
      logger.info("end {}", end.getClosePrice.doubleValue)
      (
        start.getClosePrice.doubleValue,
        end.getClosePrice.doubleValue,
        stock.count
      )
    })

    val l12 = list.foldLeft((0.0, 0.0))((p, c) => (p._1 + (c._1 * c._3), p._2 + (c._2 * c._3)))

    (l12._2 - l12._1) / l12._1
  }

  def getOptionVega() = {
    val options = Await.result(quantConfig.options, 60.seconds)
    val f = options
      .map(r1 => {
        getSparkTable
          .getVegaOptionContractNum(r1.option.getRealCode())
          .map(r => {
            val f =
              s"name: ${r.short_name} price ${r.new_price * 1000} delta: ${r.delta} gamma: ${r.gamma} vix: ${r.vix}, amount: ${r1.amount}"
            logger.info(f)
            f
          })
      })
      .map(r => r.getOrElse(""))
      .mkString(LqSegment.separator)

    emailService.sendEmail("期权", f)
  }

//  def check3ZhiWuya = {
//    val a1 = fetchAStockSpot()
//    val l = a1.stick.map(stock => {
//      logger.info("code {}", stock.code)
//      val st = StockSymbol(stock.code.takeRight(6))
//      s"${st.getCodeName} ${TaLib.crow(logger, getTimeSeries(st))}"
//    })
//    emailService.sendEmail("三只乌鸦", l.mkString(","))
//  }

  def updateDefaultClouds() = {
    quantConfig.updateDefaultClounds()
    emailService.sendEmail("update config", "")
  }

  def getHkItems() = {
    import spark.implicits._
    val hkItems =
      getSparkTable.hkSpotDateFrame.as[HkItem].collectAsList().toList
    logger.info("hk item {}", hkItems)
  }

  def updateChaodieInfo(stockSymbol: StockSymbol) = {
    logger.info(
      "updateChaodieInfo stock {}",
      JoinQuantName.getJq(stockSymbol.code)
    )

    val dataset =
      dataSource
        .getChaodieStock(stockSymbol.code)
      logger.info("getChaodieStock {}", dataset)
//    dataFrameDao.saveChaodie(stockSymbol, dataset)
  }

  def getLatesTradeDayForStrong: Future[DateTime] = {
    logger.info("getLatesTradeDayForStrong sssssssssssss ")
    dataSource
      .getLatesTradeDay()
      .flatMap(d => {
        val d1 = d.withHourOfDay(15)
        logger.info("getLatesTradeDayForStrong {}", d1)
        if (
          DateTime.now.isAfter(
            d1
          )
        ) {
          Future.successful(
            d1
          )
        } else {
          dataSource.getPreviousDay()
        }
      })
  }

  def getLatesTradeDay(): Future[DateTime] = {
    dataSource.getLatesTradeDay()
  }

  def test = {
    import com.datastax.oss.driver.api.core.CqlSession
    import com.datastax.oss.driver.api.core.config.DriverConfigLoader
    val loader = DriverConfigLoader.fromClasspath("application.conf")
    try {
      val session = CqlSession.builder.withConfigLoader(loader).build
      try {
        val rs = session.execute("select * from system_schema.keyspaces")
        val row = rs.one
        System.out.println(row.getString("keyspace_name"))
      } finally if (session != null) session.close()
    }
  }

  def getIndexNames(): Unit = {
    val r = dataSource.getIndexStockNames()
    val r1: Unit = dataFrameDao.saveIndexNames(r.right.get)
  }

  def checkConfig(): Option[Boolean] = {
    val notes = quantConfig.initialNotes
    Try {
      notes.foreach { r =>
        logger.info("checking {}", r.symbol.code)
        if (r.eventNameOpt.isEmpty) {
          throw new Error(s"note ${r.symbol.code} date time 不能为空")
        }
        if (r.dateTime.isEmpty) {
          throw new Error(s"note ${r.symbol.code} date time 不能为空")
        }
      }

      val tradeLogics = Await.result(quantConfig.logics, 200.seconds)
      tradeLogics.foreach { r =>
        logger.info("checking {}", r.symbol.code)
        logger.info("logic {}", r.tradeLogicMsg)
      }

      quantConfig.groups
        .flatMap(r => r.list.map(r => r.symbol))
        .distinct
        .foreach(group => {
          logger.info("checking {}", group.code)
          if (group.code.isEmpty || group.getCodeName.isEmpty) {
            throw new Error(s"error$group")
          }
        })

      quantConfig.groups
        .flatMap(r => r.items)
        .distinct
        .foreach(group => {
          logger.info("checking groups {}", group.code)
          if (group.code.isEmpty || group.getCodeName.isEmpty) {
            throw new Error(s"error$group")
          }
        })

      val clouds = Await.result(quantConfig.clouds, 60.seconds)
      clouds
        .map(r => r.symbol)
        .distinct
        .foreach(symbol => {
          logger.info("checking clouds {}", symbol.code)
          if (symbol.code.isEmpty) {
            if (symbol.getCodeName.isEmpty) {
              throw new Error(s"error $symbol")
            }
          }
        })
      true
    }.recover { case NonFatal(e) =>
      logger.error("checkConfig {}", e)
      emailService.sendEmail("检查配置", e.toString)
      false
    }.toOption
  }

  def updateStock(stock: StockSymbol) = {
    dataSource.updateStockV2(stock)
  }

  private def getShardedActor(symbol: LSymbol) = {
    val jepSharedActor: EntityRef[ShardedJepQueryActor.SharedJepQueryCommand] = {
      sharding.entityRefFor(JepShardedTypeKey, symbol.code)
    }
    jepSharedActor
  }

  def v3UpdateSymbolPrice(symbol: LSymbol): Future[RunJepRet.RunJepRetMsg] = {
    logger.info("v3UpdateSymbolPrice symbol {}", symbol)
    val jepSharedActor: EntityRef[ShardedJepQueryActor.SharedJepQueryCommand] = getShardedActor(
      symbol
    )
    implicit val timeout1: Timeout = 2.hours
    val f: Future[RunJepRet.RunJepRetMsg] =
      jepSharedActor
        .ask((ref: ActorRef[RunJepRet.RunJepRetMsg]) =>
          ShardedJepQueryActor.UpdateCommandPrice(symbol, ref)
        )
        .map(r => {
          logger.info("after Update symbol price {}", symbol)
          r
        })
    f.recoverWith { case NonFatal(x) =>
      logger.error(s"v3UpdateSymbolPrice Error {}", x)
      Future.successful(
        RunJepRet.JepQueryError(x)
      )
    }
  }

  def testChaodie1() = {
    val stock = c"601398"
    val l = Await.result(chaodieDataList.getList(stock), 20.minutes)
    logger.info("l {}", l)
  }

  def testJodata() = {
    import com.github.nscala_time.time.Imports._
    val r =
      com.github.nscala_time.time.Imports.DateTime.nextMonth < com.github.nscala_time.time.Imports.DateTime
        .now() + 2.months // returns Boolean = true
    logger.info("test joda {}", r)
  }
  def testOne(): Unit = {
    val d = queryTable.getIndex(IndexSymbol("000300")).map(r => r)
    val d1 = Await.result(d, 5.minutes)
    logger.info("index {}", d1)
  }

  val stockCacheActor = system.spawn(
    StockHistoryCacheActor(
      queryTable,
      config
    ),
    s"stockCacheActor"
  )
  // TODO update a spot
  /** deprecated  use v3UpdateSymbolPrice instead */
//  def updateAllSymbolPrice(item: LSymbol): Unit = {
//    logger.info("update All symbol price {}", item)
//    retry {
//      Await.result(
//        v3UpdateSymbolPrice(item),
//        5.minutes
//      )
//
//      item match {
//        case a: IndexSymbol =>
//          stockCacheActor ! StockHistoryCacheActor.UpdateCacheActor(a)
//        case _ =>
//      }
//    }
//    logger.info("update All symbol price  end {}", item)
//  }

  def syncCodeName(): Unit = {
    dataSource.syncCodeName()
  }

  def getStockList(stock: StockSymbol) = {

    import spark.implicits._
    val dataframe = getSparkTable.getStockDateFrame(stock)
    val weatherStation = dataframe.as[LStockItem]

    val r: List[LStockItem] = weatherStation.collectAsList().toList

    val series: TimeSeries[Double] = TimeSeries[Double](
      r.map(r => {
        logger.info("date {}", r.date)
        logger.info("date {}", r.date.getTime)
        logger.info("date {}", r.date.toInstant)
        r.date.toInstant
      }).toVector,
      r.map(item => item.close.toDouble).toVector
    )

    val seriesFrame = MovingAverage.calculateValuesList(series, 3)

    logger.info("seriesFrame {}", seriesFrame)

  }

  def geAllConcernSymbols: List[LSymbol] = {
    val b: List[LSymbol] = quantConfig.groups.flatMap(r => r.items)
    val d: List[LSymbol] =
      quantConfig.groups.flatMap(r => r.list.map(r => r.symbol))
    val a: List[LSymbol] = LogicConfig.getInitialTradeLogic(enterReason).map(r => r.symbol)
    val e: List[LSymbol] =
      NoticeConfig.getInitialNotice.filter(r => r.isValid).map(item => item.symbol)
    val c: List[LSymbol] = quantConfig.initialNotes.map(r => r.symbol)
    val notes: List[LSymbol] = e ::: a ::: b ::: d ::: c
    val l2 = notes.distinct
    l2
  }

//  def runStreamSyncVolumeTest() = {
//    val l = geAllConcernSymbols.take(5)
//    implicit val timeout1: Timeout = 2.hours
//    val source: Source[LSymbol, NotUsed] = Source(l)
//    val f: Future[Done] = source
//      .buffer(4000, OverflowStrategy.backpressure)
//      .mapAsync[RunJepRet.RunJepRetMsg](1)(stockSymbol => {
//        logger.info("runStreamSyncVolume {}", stockSymbol)
//        val f = getShardedActor(stockSymbol).ask((ref: ActorRef[RunJepRet.RunJepRetMsg]) =>
//          ShardedJepQueryActor.HandleSaveVolumeIndicator(stockSymbol, ref)
//        )
//        f
//      })
//      .runWith(Sink.ignore)
//    Await.result(f, 6.hours)
//
//  }

  def fetchIndexHistory(indexSymbol: IndexSymbol): Future[RetCacheHistory] = {
    val timeout1 = 20.seconds
    val f =
      stockCacheActor.ask(ref => StockHistoryCacheActor.FetchStockHistoryCommand(indexSymbol, ref))(
        timeout1,
        actorSystemTyped.scheduler
      )
    f
  }

  def runStreamSyncVolume() = {
    val l = geAllConcernSymbols

    implicit val timeout1: Timeout = 2.hours

    val source: Source[LSymbol, NotUsed] = Source(l)
    val f: Future[Done] = source
      .buffer(4000, OverflowStrategy.backpressure)
      .mapAsync[RunJepRet.RunJepRetMsg](1)(stockSymbol => {
        logger.info("runStreamSyncVolume {}", stockSymbol)
        val f = getShardedActor(stockSymbol).ask((ref: ActorRef[RunJepRet.RunJepRetMsg]) =>
          ShardedJepQueryActor.HandleSaveVolumeIndicator(stockSymbol, ref)
        )
        f
      })
      .runWith(Sink.ignore)
    Await.result(f, 6.hours)

  }

  def testSymbolEvents() = {
    val index = Await.result(
      quantConfig
        .getEventsBySymbol(i"000300")
        .map(l => {
          val l1 = l
            .filter(r => r.symbol.getName == i"000300".getName)
            .sortWith((a, b) => a.dateTime.get.isAfter(b.dateTime.get))
          RetStockNotes(
            l1
          )
        }),
      30.seconds
    )
    logger.info("index {}", index)
  }

  def testChaodie() = {
    val r = c"601398".getChaodieDay()
    logger.info("chao die {}", r)
  }

//  private def runStreamSyncChaodieHot(): Future[Done] = {
//    val l = geAllConcernSymbols
//    import akka.stream._
//    import akka.stream.scaladsl._
//    val source: Source[LSymbol, NotUsed] = Source(l)
//    val f: Future[Done] = source
//      .buffer(4000, OverflowStrategy.backpressure)
//      .mapAsync[Unit](1) {
//        case stockSymbol @ (a: StockSymbol) =>
//          logger.info(
//            "singletonLookupSymbolActor updateChaodie {} {}",
//            a,
//            NetUtils.getHostName
//          )
//          val fAsync = chaodieDataList
//            .getList(stockSymbol)
//            .flatMap(r => {
//              val item = r.takeRight(1).head
//              singletonLookupSymbolActor.ask((ref: ActorRef[StockSymbolPActor.Accepted]) =>
//                LookupSymbolActor
//                  .LookupSymbolProxyCommand(
//                    a,
//                    StockSymbolPActor
//                      .UpdateStockChaodieFactor(item.chaodie, ref)
//                  )
//              )(
//                20.seconds,
//                actorSystemTyped.scheduler
//              )
//            })
//            .recover { case NonFatal(x) =>
//              logger.info(
//                "singletonLookupSymbolActor updateChaodie {} {} {}",
//                a,
//                NetUtils.getHostName,
//                x
//              )
//              ()
//            }
//            .map(r => ())
//          retry(fAsync);
//        case _ =>
//          Future.successful()
//      }
//      .runWith(Sink.ignore)
//    f
//  }

  def v2SaveChaodie(symbol: StockSymbol) = {
    dataSource.v2SaveChaodie(symbol)
  }

  def getAllSymboll() = {
    quantConfig.getAllSymbol()
  }

  def syncAllSymbll() = {
    quantConfig.updateAllSymbol(geAllConcernSymbols)
  }

  def runStreamSyncChaodieTest1(skip: Int) = {
    val l = geAllConcernSymbols

    import akka.stream._
    import akka.stream.scaladsl._
    logger.info("count l {}", l.length)
    val f: Future[Done] = Source(l.zipWithIndex.drop(skip))
      .buffer(4000, OverflowStrategy.backpressure)
      .mapAsync[Unit](1)(stockSymbol => {
        logger.info("UpdateChaodieInfo {} {} {}", stockSymbol._1, stockSymbol._2, l.length)
        val f = Future(dataSource.v2SaveChaodie(stockSymbol._1))
        f
      })
      .runWith(Sink.ignore)
    Await.result(f, 5.hours)
  }

  def runStreamSyncChaodieTest() = {
    val l = getAllSymboll()
    import akka.stream._
    import akka.stream.scaladsl._
    logger.info("count l {}", l.length)
    val source: Source[LSymbol, NotUsed] = Source(l)
    val f: Future[Done] = source
      .buffer(4000, OverflowStrategy.backpressure)
      .mapAsync[Unit](1)(stockSymbol => {
        logger.info("UpdateChaodieInfo {}", stockSymbol)
        val f = chaodieDataList.fetchDataAsync(stockSymbol)
        f
      })
      .runWith(Sink.ignore)
    Await.result(f, 5.hours)
  }

//  def runStreamSyncChaodie() = {
//    val l = geAllConcernSymbols
//    import akka.stream._
//    import akka.stream.scaladsl._
//    logger.info("count l {}", l.length)
//    val source: Source[LSymbol, NotUsed] = Source(l)
//    val f: Future[Done] = source
//      .buffer(4000, OverflowStrategy.backpressure)
//      .mapAsync[Unit](1)(stockSymbol => {
//        logger.info("UpdateChaodieInfo {}", stockSymbol)
//        val f = chaodieDataList.fetchDataAsync(stockSymbol)
//        val f2: Future[Unit] = f.flatMap(r => {
//          stockSymbol match {
//            case a: StockSymbol =>
//              val f3 = chaodieDataList
//                .getList(stockSymbol)
//                .flatMap(r => {
//                  val item = r.takeRight(1).head
//                  singletonLookupSymbolActor.ask((ref: ActorRef[StockSymbolPActor.Accepted]) =>
//                    LookupSymbolActor
//                      .LookupSymbolProxyCommand(
//                        a,
//                        StockSymbolPActor
//                          .UpdateStockChaodieFactor(item.chaodie, ref)
//                      )
//                  )(
//                    20.seconds,
//                    actorSystemTyped.scheduler
//                  )
//                })
////              f3.map(_ => ()).recover { case NonFatal(x) =>
////                logger.error("singletonLookupSymbolActor ask {} {}", a, x)
////                ()
////              }
//            case _ => Future.successful()
//          }
//        })
//        f2
//      })
//      .runWith(Sink.ignore)
//    Await.result(f, 5.hours)
////    Await.result(runStreamSyncChaodieHot(), 5.hours)
//  }

  def syncNotePrices(): Unit = {
    emailService.sendEmail("start sync note price", "start")
    val notes = quantConfig.initialNotes
    val l2 = notes.map(r => r.symbol).distinct
//    syncPriceInContractList(l2)
    emailService.sendEmail("已经同步Note  sync all", "ok")
  }

  def getIndexContain(symbol: IndexSymbol): List[IndexContain] = {
    val f = dataSource.getIndexCodes(symbol.code)
    logger.info("f.collectAsList().toList {}", f.collectAsList().toList)
    f.collectAsList().toList
  }

  // TODO deprecated
//  def syncAllSpot() = {
//    val a1 = fetchAStockSpot()
//    try {
//      a1.stick.foreach(stock => {
//        updateAllSymbolPrice(StockSymbol(stock.code.takeRight(6)))
//      })
//    } catch {
//      case NonFatal(e) =>
//        logger.error("sync All spot {}", e)
//        emailService.sendEmail(
//          "sync spot contain error {}",
//          s"sync spot contain end $e"
//        )
//    }
//    emailService.sendEmail(
//      "sync spot contain end",
//      s"sync spot contain end"
//    )
//  }

//  def syncIndexContainPrice() = {
//    logger.info("sync code in 000903")
//    emailService.sendEmail("sync index contain", "start")
//    val indexes = List(i"399303")
//
//    indexes.zipWithIndex.foreach(index => {
//      logger.info(s"fetching index ${index._1} in ${index._2}")
//      try {
//        val codes = getIndexContain(index._1)
//        val r1 = codes.zipWithIndex.foldLeft(("", 0))((p, c) => {
//          logger.info(s"fetching stocking code ${c._1} in ${c._2}")
//          val symbol = StockSymbol(c._1.code)
//          logger.info("update symbol")
//          updateAllSymbolPrice(symbol)
//          logger.info("get Time series")
//          val series = getTimeSeries(symbol)
//          val result = StockSelector.get5LianYang(series, 30, 5)
//          if (result.ok) {
//            val txt = p._1.concat(
//              s"5连阳 ${symbol.code} ${symbol.getCodeName} ${LqSegment.separator}"
//            )
//            (txt, p._2 + 1)
//          } else {
//            p
//          }
//        })
//        emailService.sendEmail(
//          "sync index contain",
//          s"指数 6连阳个数 ${r1._2} ${LqSegment.separator} ${r1._1} "
//        )
//      } catch {
//        case NonFatal(e) =>
//          logger.error(s"Failed to sync index {} contain {} ", index._2, e)
//          logger.info(s"Failed to sync index {} contain {} ", index._2, e)
//      }
//    })
//
//    emailService.sendEmail("sync index contain end", "end")
//  }

  def syncHold(): Unit = {
    val holds = Await.result(quantConfig.holds, 200.seconds)
    val l1 = holds.flatMap(r => r.list).map(r => r.stock)
//    syncPriceInContractList(l1)
//    l1.distinct.foreach(item => {
//      logger.info(s"syncing {}", item.getSimpleName)
//      import com.github.takezoe.retry._
//      retry {
//        updateAllSymbolPrice(item)
//      }
//    })
    emailService.sendEmail("已经sync all", "ok")
  }

  def syncGroupsPrice(): Unit = {
    val l1 = quantConfig.groups.flatMap(r => r.items).toList
    val l2 = quantConfig.groups.flatMap(r => r.list.map(_.symbol)).toList
    val all: immutable.Seq[LSymbol] = l1 ::: l2
//    syncPriceInContractList(all.distinct.toList)
//    all.distinct.foreach(item => {
//      logger.info(s"syncing {}", item.getSimpleName)
//      import com.github.takezoe.retry._
//      retry {
//        updateAllSymbolPrice(item)
//      }
//    })
    emailService.sendEmail("已经Group价格", "ok")
  }

  def checkOrder: Either[Error, String] = {
    quantConfig.validateOrder()
  }

  def getstock_report_disclosure: Dataset[ReportDate] = {
    dataSource.getstock_report_disclosure()
  }

//  case class AdddA()

  def insertSpot(
    stockSymbol: StockSymbol,
    date: DateTime,
    price: TodayStockPrice
  ) = {
    getSparkTable.insertDate(stockSymbol, date, price)
  }

  // TODO deprecated
  def updateAStockSpotBatchInsert(): Unit = {
    val a = fetchAStockSpot()
    val size = a.stick.size
    try {
      a.stick.zipWithIndex.foreach(item => {
        Thread.sleep(1000)
        retry {
          try {
            logger.info("price daily price {} ,{}", item._2, size)
            val stockSYmbo = StockSymbol(item._1.code.drop(2))

            getSparkTable.insertDate(stockSYmbo, a.date, item._1)
          } catch {
            case NonFatal(e) =>
              logger.info("xxx {}", e)
              throw new Error(e)
          }
        }
      })
    } catch {
      case e: Throwable =>
        logger.error(s"update a Strock {}", e)
        emailService.sendEmail(
          "updateStock",
          s" update stock${e.toString}"
        )
    }

    a.stick.zipWithIndex.foreach(item => {
      retry {
        logger.info("price daily price {} ,{}", item._2, size)
        val stockSYmbo = StockSymbol(item._1.code.drop(2))
        //        dataFrameDao.checkCreate(stockSYmbo)

        getSparkTable.insertDate(stockSYmbo, a.date, item._1)
      }
    })

//    emailService.sendEmail(
//      "update Stock Spot ",
//      optionContract.getOptionResult()
//    )
  }

  // TODO deprecated
//  def quant_FetchAStockSpotMedium(): Unit = {
//    val a12 = fetchAStockSpot()
//    val a1 = a12.stick.map(r => {
//      (r.close - r.open) / r.open
//    })
//    val r = getMeadiumPercentile(a1)
//    logger.info("r {}", r)
//    getSparkTable.insertMedium(MediumItem(a12.date, r))
//  }

  /** TODO deprecated */
//  def updateAStockSpot1InContractSync(): Unit = {
//
//    bankService.login()
//
//    logger.info("login")
//    logger.info("contract")
////    val f: List[List[ContractOrderInfo]] = bankService
////      .getContractsAndTradeLog2()
////      .map(r => CalcTools.getContractList(r))
////
////    val holds = Await.result(quantConfig.holds, 200.seconds)
////    val list1 = holds
////      .flatMap(r => r.list)
////      .map(r => r.stock.code) ::: f.flatten.map(r => r.code)
//
//    val a = fetchAStockSpot().stick
//    logger.info("fetch A stock spot {}", a)
////    a.foreach(r => {
////      retry {
////        Thread.sleep(2000)
////        updateAllSymbolPrice(StockSymbol(r.code.drop(2)))
////      }
////    })
//
//    emailService.sendEmail(
//      "before end",
//      ""
//    )
//    logger.info("end")
//  }

  val tradeLogsDurableState = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[List[ContractOrderItem]]](
      JdbcDurableStateStore.Identifier
    )

  def getContractInfo(): Future[List[ContractOrderItem]] = {
    val f4 = for {
      g <- tradeLogsDurableState.getObject(AState.contract)
    } yield g.value.getOrElse(List.empty[ContractOrderItem])
    f4.recover { case NonFatal(x) =>
      logger.error("getContractInfo {}", x)
      List.empty[ContractOrderItem]
    //        Future.successful()
    }
  }

//  def updateAStockSpot1InContract(): Unit = {
//
//    bankService.login()
//
//    logger.info("login")
//    logger.info("contract")
//    val f = bankService
//      .getContractsAndTradeLog2()
//      .map(r => CalcTools.getContractList(r.contractList))
//
//    val holds = Await.result(quantConfig.holds, 200.seconds)
//    val list1 = holds
//      .flatMap(r => r.list)
//      .map(r => r.stock.code) ::: f.flatten.map(r => r.code)
//
//    val a = fetchAStockSpot()
//    val l = a.stick
//      .map(r => {
//        val stockSYmbo = StockSymbol(r.code.drop(2))
//        A2(stockSYmbo, a.date, r)
//      })
//      .filter(r => list1.contains(r.stockSymbol.code))
//
//    //val a1 = TodayStockPrice(
//    //  code = "000001",
//    //  open = 1,
//    //  close=40,
//    //  high = 40,
//    //  low=4,
//    //  volume=5
//    //)
//
//    //    val l =List(
//    //
//    //      A2(StockSymbol("000001"), DateTime.now().plusDays(10), a1)
//    //    )
//    logger.info("list contain count {}", list1.length)
//    logger.info("list contain count {}", list1.head)
//    logger.info("list contain count {}", l.head)
//    skunkService.store(l).unsafeRunSync()
//
//    emailService.sendEmail(
//      "before end",
//      ""
//    )
//    logger.info("end")
//  }

//  def updateAStockSpot11(): Unit = {
//    val a = fetchAStockSpot()
//    val l = a.stick.map(r => {
//      val stockSYmbo = StockSymbol(r.code.drop(2))
//      A2(stockSYmbo, a.date, r)
//    })
////val a1 = TodayStockPrice(
////  code = "000001",
////  open = 1,
////  close=40,
////  high = 40,
////  low=4,
////  volume=5
////)
//
////    val l =List(
////
////      A2(StockSymbol("000001"), DateTime.now().plusDays(10), a1)
////    )
//    logger.info("l {}", l)
//    skunkService.store(l).unsafeRunSync()
//    logger.info("end")
//  }

  def updateAStockSpot(): Unit = {
    val a = fetchAStockSpot()
    val size = a.stick.size
    try {
      a.stick.zipWithIndex.foreach(item => {
        retry {
          try {
            logger.info("price daily price {} ,{}", item._2, size)
            val stockSYmbo = StockSymbol(item._1.code.drop(2))
            getSparkTable.insertDate(stockSYmbo, a.date, item._1)
          } catch {
            case NonFatal(e) =>
              logger.info("xxx {}", e)
              throw new Error(e)
          }
        }
      })
    } catch {
      case e: Throwable =>
        logger.error(s"update a Strock {}", e)
        emailService.sendEmail(
          "updateStock",
          s" update stock${e.toString}"
        )
    }
//
//    a.stick.zipWithIndex.foreach((item) => {
//      retry {
//        logger.info("price daily price {} ,{}", item._2, size)
//        val stockSYmbo = StockSymbol(item._1.code.drop(2))
////        dataFrameDao.checkCreate(stockSYmbo)
//
//        getSparkTable.insertDate(stockSYmbo, a.date, item._1)
//      }
//    })
//
//    emailService.sendEmail(
//      "update Stock Spot ",
//      optionContract.getOptionResult()
//    )
  }

  def fetchAStockSpotBackup(): LastStockPrice = {
//    dataSource.getAStockEmSpot()
    retry {
      val tradeDay = getLatesTradeDay()
      val stockPandas = dataSource.getAStockSpot()
      //      case class WeatherStation( date: java.sql.Timestamp,
      //                                 open: String,
      //                                 close: String,
      //                                 high: String,
      //                                 low: String,
      //                                 volume: String,
      //                                 turnover: String,
      //                                 outstanding_share: String
      //                               )

      val dateframe = stockPandas.right.get

      import spark.implicits._

      val renamedDateFrame = dateframe
        .withColumnRenamed("代码", "code")
        .withColumnRenamed("最新价", "close")
        .withColumnRenamed("今开", "open")
        .withColumnRenamed("最高", "high")
        .withColumnRenamed("最低", "low")
        .withColumnRenamed("成交量", "volume")

      renamedDateFrame.show(5, 1000)
      val list = renamedDateFrame.as[TodayStockPrice].collectAsList().toList
      LastStockPrice(Await.result(tradeDay, 20.seconds), list)
    }
  }

  def fetchAStockSpot(): LastStockPrice = {
    try {
      fetchAStockSpotBackup()
    } catch {
      case NonFatal(x) =>
        logger.info("spot retrying ")
        dataSource.getAStockEmSpot()
    }
  }

  def fetchAStockSpot2(): LastStockPrice = {
//    dataSource.getAStockEmSpot()

    fetchAStockSpotBackup()
//    d.printSchema()
    //    retry {
//      val tradeDay = getLatesTradeDay()
//      val stockPandas = dataSource.getAStockSpot()
//      //      case class WeatherStation( date: java.sql.Timestamp,
////                                 open: String,
////                                 close: String,
////                                 high: String,
////                                 low: String,
////                                 volume: String,
////                                 turnover: String,
////                                 outstanding_share: String
////                               )
//
//      val dateframe = stockPandas.right.get
//
//      import spark.implicits._
//
//      val renamedDateFrame = dateframe
//        .withColumnRenamed("代码", "code")
//        .withColumnRenamed("最新价", "close")
//        .withColumnRenamed("今开", "open")
//        .withColumnRenamed("最高", "high")
//        .withColumnRenamed("最低", "low")
//        .withColumnRenamed("成交量", "volume")
//
//      val list = renamedDateFrame.as[TodayStockPrice].collectAsList().toList
//      LastStockPrice(Await.result(tradeDay, 20.seconds), list)
//    }
  }

  def fetchSaveFundNameList() = {
    val f = dataSource.getFundNames()
    val df1 = f.right.get
    // '基金类型'
    // '
//      case class FundNames(
//                            short_pinyin: String,
//                            short_name: String,
//                            fund_type: String,
//: String
//                          )
    val renamedDateFrame = df1
      .withColumnRenamed("基金代码", "code")
      .withColumnRenamed("拼音缩写", "short_pinyin")
      .withColumnRenamed("基金简称", "short_name")
      .withColumnRenamed("基金类型", "fund_type")
      .withColumnRenamed("拼音全称", "full_fund")

    dataFrameDao.saveFundNameList(renamedDateFrame)
  }
  def fetchSaveFundDayPrice(jijinSymbol: JiJinSymbol) = {
    retry {
      val f = dataSource.fetchFundDailyPrice(jijinSymbol)
      logger.info("f {}", f)
      dataFrameDao.saveFundPriceList(f, jijinSymbol.getPriceTableName)
    }
  }

  def getDailyPrice(jijinSymbol: JiJinSymbol) = {
    queryTable.getFundDailyPrice1(jijinSymbol)
  }

  //  def getOpenFundDaily = {
//
//    val rest = dataSource.getOpenFundDaily()
//    if (rest.isRight) {
//      import spark.implicits._
//      val fundDaily: DataFrame = rest.right.get
//      val dropValues = fundDaily.columns.toList.filter(_.startsWith("20"))
//      val droppedDateFrame = fundDaily
//        .drop(dropValues: _*)
//
//      val renamedDateFrame = droppedDateFrame
//        .withColumnRenamed(
//          "基金代码",
//          "code"
//        )
//        .withColumnRenamed(
//          "基金简称",
//          "name"
//        )
//        .withColumnRenamed(
//          "日增长值",
//          "daygrowvalue"
//        )
//        .withColumnRenamed(
//          "日增长率",
//          "daygrowrate"
//        )
//        .withColumnRenamed(
//          "申购状态",
//          "claimstatus"
//        )
//        .withColumnRenamed(
//          "赎回状态",
//          "redeemstatus"
//        )
//        .withColumnRenamed(
//          "手续费",
//          "changefee"
//        )
//      //,,,,,赎回状态,手续费
//
//      dataFrameDao.saveFundNames(renamedDateFrame)
//    }
//  }

  def getstock_report_disclosureComming(date: DateTime): String = {
    dataSource
      .getstock_report_disclosure()
      .collectAsList()
      .toList
      .filter(r =>
        r.code.startsWith("00") || r.code.startsWith("30") || r.code.startsWith(
          "600"
        )
      )
      .filter(r =>
        (r.forth == DateFormat.getDay(date)) ||
          (r.third == DateFormat.getDay(date)) ||
          (r.second == DateFormat.getDay(date)) ||
          (r.first == DateFormat.getDay(date))
      )
      .take(20)
      .toList
      .map(r => {
        logger.info("stockSymbol get ChaodieDay {}", r.code)
        s"""
           |${r.name}  ${StockSymbol(r.code).getChaodieDay()}
           |first: ${r.first} second: ${r.second} third: ${r.third}
           |""".stripMargin
      })
      .mkString(LqSegment.separator)
  }

  def getForcastToday(): String = {
    retry {
      val content = dataSource.getForcast
        .collect()
        .map(row => s"${row(2)}, ${row(3)}")
        .mkString(LqSegment.separator)
      s"""预期大幅提升报告${LqSegment.separator}
    $content${LqSegment.separator}"""
    }
  }

  // TODO code name
//  http://fundf10.eastmoney.com/ccmx_000001.html
  def getCodeName(l: LSymbol): String = {
    l.getCodeName
  }

  def fetchStockHkSpot() = {
    val f = dataSource.getStockHkSpot()
    if (f.isRight) {
      logger.info("fff {}", f)
      dataFrameDao.saveHkItems(f.right.get)
    }
  }

//  def seeContractOrderList1(
//    contractIds: List[ContractItem]
//  ): List[ContractDetailStockList] = {
//    seeContractOrderList(contractIds).map(r => {
//      r.copy(stockOrderVOList = CalcTools.getContractList(r.stockOrderVOList))
//    })
//  }

//  def seeContractOrderList(
//    contractIds: List[ContractItem]
//  ): List[ContractDetailStockList] = {
//    List.empty[ContractDetailStockList]
//    bankService.login()
//    contractIds.map(contract => {
//      val f = bankService.contractStockClosingOrder(contract.contractId)
//      val item = f.right.get.data.stockOrderVOList
//      if (f.isRight) {
//
//        ContractDetailStockList(
//          contract.contractName,
//          contract.contractId,
//          stockOrderVOList = item
//        )
//      } else {
//        ContractDetailStockList(
//          contract.contractName,
//          contract.contractId,
//          stockOrderVOList = List.empty[ContractOrderInfo]
//        )
//      }
//    })
//  }

  def testPriceSince(stock: StockSymbol) = {
    logger.info(
      "format {}",
      Formatter.getPercentFormat(stock.getChangeSince(10))
    )
  }

  def seeCurrent(): String = {
    logger.info("seeCurrent")
    val holds = Await.result(quantConfig.holds, 200.seconds)

    holds
      .map(r => {
        val groupChangePercent = getPortfolioGroupFomrat(
          r.list,
          1
        )

        val list = r.list
          .map(r1 =>
            s"""${r1.stock.getCodeName}  count: ${r1.count} ${r1.stock.code} change_percent ${Formatter
                .getPercent(r1.stock.getChangeSince(1))}"""
          )
          .mkString(LqSegment.separator)
        logger.info("lsit {}", list)
        s"groupChange: ${r.name} $groupChangePercent ${LqSegment.separator} $list"
      })
      .mkString(LqSegment.separator)
  }

  def seeContract(contractId: String): String = {
//    bankService.login()
    ""
//    val f = bankService.contractStockClosingOrder(contractId)
//    val item = CalcTools.getContractList(f.right.get.data.stockOrderVOList)
//    if (f.isRight) {
//      val groupChangePercent = getPortfolioGroupFomrat(
//        item.map(r => StockPortfolio(StockSymbol(r.code), r.volume)),
//        1
//      )
//
//      val list = item
//        .map(r =>
//          s"""${r.direction} ${r.codeName} ${r.volume} change_percent ${Formatter
//              .getPercent(StockSymbol(r.code).getChangeSince(1))}"""
//        )
//        .mkString(LqSegment.separator)
//      logger.info("lsit {}", list)
//      s"groupChange: $groupChangePercent ${LqSegment.separator} $list"
//    } else {
//      "ERROR"
//    }
  }

  def getContractLogByContract(contractId: String): List[ContractOrderInfo] = {
//    bankService.login()
    List.empty[ContractOrderInfo]
//    val f = bankService.contractStockClosingOrder(contractId)
//    val item = f.right.get.data.stockOrderVOList
//    CalcTools.getContractList(item)
    //    if(f.isRight) {
////      val list = item.data.stockOrderVOList.map(r => s"""${r.codeName} change_percent ${Formatter
////        .getPercent(StockSymbol(r.code).getPriceSince(2))}""").mkString(LqSegment.separator)
////      logger.info("lsit {}", list)
//    }
//    item
  }

  def getSwDataList() = {
    import spark.implicits._
    getSparkTable.sWDateFrame.as[SwBlock].collectAsList()
  }

  def get_SW_INDEX_SPOT() = {
    val f = dataSource.get_sw_index_spot()
    if (f.isRight) {

      val frame = f.right.get
        .withColumnRenamed(
          "指数代码",
          "code"
        )
        .withColumnRenamed(
          "指数名称",
          "name"
        )
        .withColumnRenamed(
          "昨收盘",
          "close"
        )
        .withColumnRenamed(
          "今开盘",
          "open"
        )
        .withColumnRenamed(
          "成交额",
          "amount"
        )
        .withColumnRenamed(
          "最高价",
          "high"
        )
        .withColumnRenamed(
          "最低价",
          "low"
        )
        .withColumnRenamed(
          "最新价",
          "price"
        )
        .withColumnRenamed(
          "成交量",
          "volume"
        )
      dataFrameDao.saveSWIndex(frame)
    }
  }

  def getPricesMALatest(stockSymbol: StockSymbol, day: Int) = {
    stockSymbol.getPricesMALatest(day)
  }

  def getPriceSince(stockSymbol: StockSymbol, day: Int) = {
    stockSymbol.getPriceSince(day)
  }

//  def getNoteList(codes: List[LSymbol]): String = {
//    codes
//      .map {
//        case r: StockSymbol =>
//          s"${r.getCodeName} ${r.getCaiwuPage} ${r.getEvents} price: ${r.getPrices().takeRight(1).map(r => r.price).headOption}  30天涨幅${Formatter
//            .getPercent(r.getChangeSince(30))} ${r.getChaodieDayList().last.formatted("%.2f")} 50MA ${r
//            .getPricesMALatest(50)}  200MA ${r.getPricesMALatest(200)}"
//        case item @ _ =>
//          s"NOTE SUPPORT ${item.code} ${item.getTableName} $item"
//      }
//      .mkString(LqSegment.separator)
//  }

  def getLatestPrice(stockSymbol: StockSymbol) = {
    stockSymbol
      .getPrices()
      .takeRight(1)
      .headOption
      .map(r => r.price)
  }

  def itemEventsRetro(symbol1: LSymbol): String = {
    symbol1 match {
      case symbol: StockSymbol =>
        s"""<h3>${symbol.getCodeName}</h3> ${symbol.getCaiwuPage}  ${symbol.getEvents} ${symbol.getGuZhi}  ${symbol.getYanbao} current price: ${symbol
            .getPrices()
            .takeRight(1)
            .headOption
            .map(r => r.price)}  50MA ${symbol
            .getPricesMALatest(50)
            .formatted("%.2f")}  200MA ${symbol
            .getPricesMALatest(200)
            .formatted("%.2f")} 超跌:${symbol
            .getChaodieDay()
            .formatted("%.2f")}"""

      case symbol: IndexSymbol =>
        s"""<h3>${symbol.getCodeName} ${symbol.getContainLink()}</h3>"""

      case fundSymbol: JiJinSymbol =>
        s"""<h3>${fundSymbol.getCodeName}</h3>  ${fundSymbol.getDocument} ${fundSymbol.getFundDetail}"""
      case _ =>
        s"NOT SUPPORT $symbol1"
    }
  }

  def getGroupList(codes: List[LSymbol]): String = {

    val llist = codes.filter(r =>
      r.symbolType == SymbolEnum.stock || r.symbolType == SymbolEnum.index || r.symbolType == SymbolEnum.jijin
    )
    // FIXME get price NOt get price
    llist.isEmpty match {
      case true  => "NOT"
      case false =>
        //          val aList: List[StockCodePrice] = groupsPrice.right.get
        //            .collect()
        //            .toList
        //            .sortBy(stockPrice =>
        //              LqQury.getChangePercent(stockPrice.open, stockPrice.close)
        //            )

        val list = llist
          .map {
            case fundSymbol: JiJinSymbol =>
              s"""<h3>${fundSymbol.getCodeName}</h3> daily price 30 days ago: ${Formatter
                  .getPercent(fundSymbol.getPriceSince(30))}  last ${Formatter
                  .getPercent(
                    fundSymbol.getPriceSince(2)
                  )}  ${fundSymbol.getDocument} ${fundSymbol.getFundDetail}
               """.stripMargin
            case symbol: StockSymbol =>
              logger.info("stock symbol {}", symbol.code)
              // TODO 昨日涨幅
              val stockPrice = Formatter.getPercent(symbol.getChangeSince(2))
              s"""<h3>${symbol.code}</h3> ${symbol.getCaiwuPage}  ${symbol.getEvents} ${symbol.getGuZhi} ${symbol.getCodeName}  涨幅: $stockPrice" 30天涨幅${Formatter
                  .getPercent(symbol.getChangeSince(30))}
                   ${symbol.getYanbao} 超跌:${symbol
                  .getChaodieDay()
                  .formatted("%.2f")}
              """
            case symbol: IndexSymbol =>
              s"""<h3>${symbol.code}  ${symbol.getCodeName}</h3>
                 """.stripMargin
            case symbol: UsSymbol =>
              s"""<h3>${symbol.code}  ${symbol.getCodeName}</h3>
              """.stripMargin
            case _ =>
              "XXXXXXXXXXXXXXXXXX"
          }
          .mkString(LqSegment.separator)
        s"""
           ${LqSegment.separator}
           |$list
           |""".stripMargin
    }
  }

  def getGroupListRetro: String = {
    quantConfig.groups
      .map(group => {
        val list =
          if (group.list.isEmpty) group.items else group.list.map(r => r.symbol)
        // http://stock.jrj.com.cn/industry/
        s"""group${LqSegment.separator} name:${group.groupName}${LqSegment.separator}
       ${getGroupList(list)}
       """
      })
      .mkString(LqSegment.separator)
  }

  def getFangLiang() = {
    emailService.sendEmail(
      "fangliang",
      s"start day at date "
    )
    val codes = getIndexContain(i"399303").map(r => StockSymbol(r.code))
    val r = codes
      .filter(r => !r.code.startsWith("300"))
      .filter(r => checkHasMaxVolume(r))
      .map(r => s"${r.code} ${r.getCodeName}")
      .mkString(LqSegment.separator)
    emailService.sendEmail(
      "fangliang",
      s"$r"
    )
  }

  def checkHasMaxVolume(stock: StockSymbol): Boolean = {
    val f = timeSeries.getBaseBarSeries(stock)
    val list = f.get
    val endIndex = list.getEndIndex
    if (list.getBarCount > 6) {
      val sum = (0 to 4).foldRight(0.0)((r, a) => {
        val a1 = list.getBar(endIndex - r - 1).getVolume
        a1.doubleValue() + a
      })
      (sum / 5) * 2 < list.getBar(endIndex).getVolume.doubleValue()
    } else {
      false
    }
  }

  def getOptionResult(): Unit = {
//    val optionContract = new OptionContract()
//    emailService.sendEmail("optionContract ", optionContract.getOptionResult())
  }

//  def get50Price(): Unit = {
//    val optionContract = new OptionContract()
//    optionContract.get50Price()
//  }

//  lazy val opitionDurableState = DurableStateStoreRegistry
//    .get(system)
//    .durableStateStoreFor[JdbcDurableStateStore[List[QContractItem]]](
//      JdbcDurableStateStore.Identifier
//    )

//  def getOptionContracts(): Future[List[QContractItem]] = {
//    val f1 = for {
//      g <- opitionDurableState.getObject(AState.optionOrder)
//      d = g.value.getOrElse(List.empty[QContractItem])
//    } yield d
//    f1
//  }

  def fetchSavePgOptionContract() = {
//    val optionContract = new OptionContract()
//    val cookies = optionContract.getCookies()
//    logger.info("cookie {}", cookies)
//    val a = optionContract.getHoldEarnContracts(cookies)
//
//    val f1 = for {
//      g <- opitionDurableState.getObject(AState.optionOrder)
//      version = g.revision + 1
//      d <- opitionDurableState.upsertObject(
//        AState.optionOrder,
//        version,
//        a,
//        "t123"
//      )
//    } yield d
//
//    Await.result(f1, 200.seconds)
  }

//  def getOptionEntract(): OptionContractAndHolding = {
//    val optionContract = new OptionContract()
//    val cookies = optionContract.getCookies()
//    logger.info("cookie {}", cookies)
//
//    logger.info(
//      "optionContract.getHoldEarn {}",
//      optionContract.getHoldEarn(cookies)
//    )
//
//    logger.info("optionContract.get {}", optionContract.getOptional(cookies))
//    logger.info("optionContract.get {}", optionContract.getOptional(cookies))
//
//    // get entrust log
//    optionContract.getEntrust(cookies)
//  }

  def syncPriceInContractList(l: List[LSymbol]) = {
//    val source: Source[LSymbol, NotUsed] = Source(l)
//    val f: Future[Done] = source
//      .buffer(4000, OverflowStrategy.backpressure)
//      .mapAsync[RunJepRet.RunJepRetMsg](1)(stockSymbol => v3UpdateSymbolPrice(stockSymbol))
//      .runWith(Sink.ignore)
//    Await.result(f, 6.hours)
  }

  def syncPriceInContract() = {
//    logger.info("bankService.getContracts() {}", bankService.getContracts())
//    val l = Try {
//      bankService.login()
//      val contracts = bankService.getContracts().right.get.data
//      contracts
//        .flatMap(r => getContractLogByContract(r.contractId))
//        .map(r => StockSymbol(r.code))
//    }.recover { case NonFatal(x) =>
//      logger.error("syncPriceInContract {}", x)
//      List.empty[StockSymbol]
//    }
    List.empty[LSymbol]
//    syncPriceInContractList(l.getOrElse(List.empty[LSymbol]))
  }

  def retroSummary(): EmailResult = {

    try {
      emailService.sendEmail("retro", " started")

      emailService.sendEmail(
        "复盘 step",
        s"get Earn state end"
      )
      logger.info("getEarnState")
//      val earnRateList = dataSource.earnRateListSummary
      emailService.sendEmail(
        "复盘 step",
        s"get Earn RateList End"
      )
      logger.info("earnRateList ")
//      val forcastToday = getForcastToday()
      logger.info("forcastToday   ")

//      val chaodieFile = getChaodieIndex("000300.XSHG", isSave = true)
//      val chaodieFileZZ500 =
//        getChaodieIndex(i"000905".getCodeName, isSave = true)

//      val optionContract = new OptionContract()
//      saveVixDataframe2DB()
//      val a = dataSource.getVixDataSet()
//      logger.info("  getVixDataSet ")
//      polyty.saveVixItem(a.as[VIxItem], isSave = true)
//      val vixFile = polyty.getVixImage(isSave = true)

//      val holdOptions = Try(getHoldOptions()).getOrElse("")

//      bankService.login()
//      val contracts = Try(
//        bankService
//          .getContracts()
//          .map(r => r.data)
//          .getOrElse(List.empty[ContractItem])
//      ).toOption.getOrElse(
//        List.empty[ContractItem]
//      )

      emailService.sendEmail(
        "复盘 step",
        s"hold options"
      )

      logger.info("holdOptions   ")

      val notes = Try(
        quantConfig.initialNotes
          .map(r => r.symbol)
          .distinct
          .map(group => itemEventsRetro(group))
          .mkString(LqSegment.separator)
      ).getOrElse("note err ")

      emailService.sendEmail(
        "复盘 step",
        s"group info step start "
      )
      val groupInfo = getGroupListRetro

      emailService.sendEmail(
        "复盘 step",
        s"group info step end"
      )

//      val sellNOte = getSellNotice()
//      emailService.sendEmail(
//        "复盘 step",
//        s"sell note"
//      )

//      val contractGroup = contracts
//        .map(r =>
//          s"${r.contractName}: ${r.contractId} ${r.amountAvailable}" +
//            s"${seeContract(r.contractId)}"
//        )
//        .mkString(LqSegment.separator)
      emailService.sendEmail(
        "复盘 step",
        s"contractGroup note"
      )

//      val optionResult = Try(optionContract.getOptionResult()).getOrElse("")
      emailService.sendEmail(
        "复盘 step",
        s"optionResult note"
      )
      //      val panmingOption = panmingPrint(true, i"000300")
//      val panmingZZ500 = panmingPrint(true, i"000905")

      //        Await.result(panMingFactor.getList(IndexSymbol("000016")), 100.seconds)
//      s"000300 超跌: ${c"000300".getChaodieDay()}",
      val chaodie300 = retry(
        Await
          .result(panMingFactor.getList(IndexSymbol("000016")), 100.seconds)
          .last
      )

      val list = List(
        LqHtml.link(
          "http://fund.eastmoney.com/LOF_jzzzl.html#os_0;isall_0;ft_;pt_8",
          "LOF基金"
        ),
        LqHtml.link(
          "http://www.szse.cn/market/fund/list/lofFundList/index.html",
          "LOF基金"
        ),
        QuickLink.getLinks,
        groupInfo,
        "",
//        optionResult,
        LqHtml.link("http://optiontools.cn/iv_surface/510300/1/line", "隐含波动率"),
        LqHtml.link("http://optiontools.cn/iv_surface/510300/1/line", "隐含波动率"),
        LqHtml
          .link("http://optiontools.cn/iv_surface2/510300/1/scatter", "隐含波动率"),
//        s"vix ${a.as[VIxItem].collectAsList().toList.takeRight(1).map(r => r.vix).headOption.getOrElse(0)}",

//      val result =
//        Await.result(panMingFactor.getList(IndexSymbol("000016")), 100.seconds)
        s"000300 超跌: ${chaodie300.date} ${chaodie300.value}",
//        s"000300 判明: ${panmingOption.map(r => r.chaodie).getOrElse(0.0).formatted("%.2f")}",
        s"000300 超跌: ${i"000905".getChaodieDay()}",
//        s"zz500 判明: ${panmingZZ500.map(r => r.chaodie).getOrElse(0.0).formatted("%.2f")}",
        // TODO notes
        s"Contracts\n${LqSegment.separator}",
        LqHtml.link("http://stock.jrj.com.cn/industry/", "行业"),
        retry(getStrong(Await.result(getLatesTradeDayForStrong, 200.seconds))),
        "",
        "",
//        earnRateList,
//        forcastToday
        notes
      )

      EmailResult(
        list.mkString(LqSegment.separator),
        List.empty[File]
      )
    } catch {
      case NonFatal(x) =>
        x.printStackTrace()
        logger.error("retro error {}", x)
        EmailResult(
          x.toString,
          List.empty[File]
        )
    }
  }

  def getTableFromStock(table: StockSymbol): Future[RetStock] = {
    queryTable.getStock(table)
  }

  def imple3(code: StockSymbol) = {
    val f = for {
      a <- queryTable.getStock(code)
      c <- quantConfig.getEventsBySymbol(code)
      d <- queryTable.getSymbolChaodieCache1(code)
    } yield {
      logger.info("ddd {}", d)
      logger.info("ddd {}", d)
//      val filteredStock = c.filter(r => r.dateTime.isDefined)
//      val f = filteredStock.map(a => (a.dateTime.get -> a)).toMap
      val f1 = d.records.map(a => a.date -> a.chaodie).toMap

      val filteredStock = c.filter(r => r.dateTime.isDefined)

      val f = filteredStock.map(a => a.dateTime.get -> a).toMap
      RetListWithEventStock(records =
        a.records.map(r =>
          EventStock(
            date = r.date,
            info = r,
            chaodie = f1.get(r.date),
            event = f.get(r.date)
          )
        )
      )
    }
    f
  }
  def fetchStockItems(code: AINput) = {
    val s: StockSymbol = StockSymbol(code.code.replaceAll("s_", ""))
    logger.info("s. {}", s.getName)
    val f = for {
      stockList <- queryTable.getCacheStock1(s)
      eventsList <-
        quantConfig.getEventsBySymbol(s)
      chaodie1 <- queryTable.getSymbolChaodieCache(s)
    } yield {
      val eventList = eventsList.filter(r => r.dateTime.isDefined)
      val eventMap = eventList.map(a => a.dateTime.get -> a).toMap

      val chaodieMap = chaodie1.records.map(r => r.date -> r.chaodie).toMap
      RetListWithEventStock(records =
        stockList.records.map(r =>
          EventStock(
            date = r.date,
            info = r,
            chaodie = chaodieMap.get(r.date),
            event = eventMap.get(r.date)
          )
        )
      )
    }
    f
  }

  def saveUsName() = {
    val f = dataSource.getUsStock()
    if (f.isRight) {
      val frame = f.right.get
      dataFrameDao.saveUsNames(frame)
    }
  }

  def getContractNum(l: OptionSymbol) = {
    l.getContractNum()
  }

  def getName() = {
    getSparkTable.getVegaOptionContractNum("510300P2107M05750")
  }

  def getAsyncTradeDays(): Future[List[DateTime]] = {
    dataSource
      .getTradeDaysList()
      .map(r1 => r1.map(r => new DateTime(r.trade_date)))
  }

  def getNorthSummary(): String = {
    val a = Try {
      retry {
        val f = dataSource.getNorthPriceIn("3日", OptionBkName.hangye).right.get
        val results = f
          .take(1000)
          .map(row => s"${row.getString(1)} ${row.getDouble(2)}")
          .mkString(LqSegment.separator)
        s"北向3天增持板块:${LqSegment.separator} $results${LqSegment.separator} http://data.eastmoney.com/hsgtcg/hy.html ${LqSegment.separator}"
      }
    }.toOption.getOrElse("北向数据有误")

    val b = Try {
      retry {
        val f = dataSource.getNorthPriceIn("3日", OptionBkName.gainian).right.get
        val results = f
          .take(1000)
          .map(row => s"${row.getString(1)} ${row.getDouble(2)}")
          .mkString(LqSegment.separator)
        s"北向3天增持板块:${LqSegment.separator} $results${LqSegment.separator} http://data.eastmoney.com/hsgtcg/hy.html ${LqSegment.separator}"
      }
    }.toOption.getOrElse("北向数据有误")

    List(a, b).mkString(LqSegment.separator)
  }

  def stashCommands() = {
    val f = for {
      a <- quantConfig.sechdulerCommands.getObject("commands")
    } yield {
      a.value.getOrElse(List.empty[SchedulerCommand])
    }
    Await.result(f, 30.seconds)
  }
  def testSchedulerCommands() = {
    val l = Await.result(
      quantConfig.sechdulerCommands.getObject("commands"),
      30.seconds
    )
    logger.info("l {}", l)
    l.value
  }

  def emptyCommand() = {
    val f = for {
      a <- quantConfig.sechdulerCommands.getObject("commands")
      version = a.revision + 1
      b <- quantConfig.sechdulerCommands.upsertObject(
        "commands",
        version,
        List.empty[SchedulerCommand],
        "tag"
      )
    } yield {
      b
    }
    Await.result(f, 30.seconds)
  }

  def deleteCommands(command: SchedulerCommand) = {
    val f = for {
      a <- quantConfig.sechdulerCommands.getObject("commands")
      l = {
        val list = a.value.getOrElse(List.empty[SchedulerCommand])
        logger.info("scheduler deleteCommands {}", list)
        val l1 =
          if (list.contains(command)) list.filter(r => r != command) else list
        logger.info("scheduler deleteCommands update {}", l1)
        l1
      }
      version = a.revision + 1
      b <- quantConfig.sechdulerCommands.upsertObject(
        "commands",
        version,
        l,
        "tag"
      )
    } yield {
      b
    }
    Await.result(f, 30.seconds)
  }

  def pushCommands(command: SchedulerCommand) = {
    val f = for {
      a <- quantConfig.sechdulerCommands.getObject("commands")
      l = {
        val list = a.value.getOrElse(List.empty[SchedulerCommand])
        if (list.contains(command)) list else list.::(command)
      }
      version = a.revision + 1
      b <- quantConfig.sechdulerCommands.upsertObject(
        "commands",
        version,
        l,
        "tag"
      )
    } yield { b }
    Await.result(f, 30.seconds)
  }

  def runWithCommands(command: SchedulerCommand, func: () => Unit) = {
    try {
      pushCommands(command)
      func()
    } finally {
      deleteCommands(command)
    }
  }

  def syncHotCodeName() = {
    dataSource.syncCodeName()

    val f = dataSource.getCodeNames
    f.map(r => StockSymbol(r.code))
      .foreach(item => {
        dataFrameDao.createCodeTable(item)
      })

    emailService.sendEmail(
      "syncCodeName",
      "ok"
    )
  }

//  step: Option[String],
//  logic: Option[String],
//  strategyName: Option[String],
//  reference: Option[Double],
//  history : List[TradeHistory]
  def getQuantList() = {
    val l = LogicConfig
      .getInitialTradeLogic(enterReason)
      .map(r =>
        TradeLogicRecord(
          code = r.symbol.code,
          name = r.symbol.getCodeName,
          logic = r.enterMeta,
          strategyName = r.tradeLogicMsg,
          step = r.currentStep,
          history = r.tradeHistory
        )
      )
    Future.successful(l)
  }

//  def sellContract(data: ReqSellContract) = {
//
//    bankService.login()
////    val contractId = contract
//
//    val r = bankService.contractStockClosingOrder(data.contractId)
//    val l2 = r
//      .map(r => CalcTools.getContractList(r.data.stockOrderVOList))
//      .getOrElse(List.empty[ContractOrderInfo])
//
//    // 卖出
//    l2.foreach(item => {
//      logger.info("item {}", item)
//      val r2 = bankService.createOrder(
//        InsertOrder(
//          contractId = data.contractId,
//          stockCode = item.code,
//          entrustType = 1, // market
//          entrustPrice = "",
//          entrustNumber = item.volume
//        ),
//        item.direction == "卖出"
//      )
//
//      if (r2.isRight) {
//        emailService.sendEmail(
//          "Contracts OK",
//          r2.toString
//        )
//      } else {
//        emailService.sendEmail(
//          "Contracts FAIL",
//          r.toString
//        )
//      }
//    })
//
//  }

//  def sellStock(data: ReqSellStock) = {
//    bankService.login()
//    val contractId = data.contractId
//
//    val r = bankService.contractStockClosingOrder(contractId)
//    val l2 = r
//      .map(r => CalcTools.getContractList(r.data.stockOrderVOList))
//      .getOrElse(List.empty[ContractOrderInfo])
//
//    // 卖出
//    l2.filter(item => item.code == data.stockSymbol)
//      .foreach(item => {
//        logger.info("item {}", item)
//        val r2 = bankService.createOrder(
//          InsertOrder(
//            contractId = contractId,
//            stockCode = item.code,
//            entrustType = 1, // market
//            entrustPrice = "",
//            entrustNumber = item.volume
//          ),
//          item.direction == "卖出"
//        )
//
//        if (r2.isRight) {
//          emailService.sendEmail(
//            "Contracts OK",
//            r2.toString
//          )
//        } else {
//          emailService.sendEmail(
//            "Contracts FAIL",
//            r.toString
//          )
//        }
//      })
//  }

  def t() = {
    val a = fetchAStockSpot()
    logger.info(
      "a {}",
      a.stick.map(r => r.code.slice(2, 4)).distinct.mkString(",")
    )
  }

  def fetchSpot(
    spotMsg: ActorRef[SpotActor.SpotMsg]
  ) = {
//    try {
//      val a = fetchAStockSpot()
//
//      val list = Future(dataSource.getCodeNames)
//        .map(l => l.map(r => r.code))
//        .map(codeList => {
//          a.stick
//            .filter(r => codeList.contains(r.code.drop(2)))
//        })
//
//      val l = Await.result(list, 20.minutes)
//      val a1 = l
//        .filter(r => !r.code.drop(2).startsWith("68"))
//        .filter(r => !r.code.drop(2).startsWith("83"))
//        .filter(r => !r.code.drop(2).startsWith("43"))
//        .filter(r => !r.code.drop(2).startsWith("87"))
//        .filter(r => !r.code.drop(2).startsWith("20"))
//        .map(r =>
//          (
//            StockSymbol(r.code.drop(2)),
//            r.close
//          )
//        )
//
//      emailService.sendEmail(
//        "fetch all spot",
//        s"start l ${a1.length} "
//      )
//
//      val source = Source(
//        a1.zipWithIndex
//      )
////      val time = DateTime.now
////      logger.info("fetchAStockSpot {} {}", DateFormat.getSecondsFormat(time), a1.length)
////      val f: Future[Done] = source
////        .take(quantConfig.getSpotCount)
////        .buffer(4700, OverflowStrategy.backpressure)
////        .throttle(1, 300.milliseconds)
////        .mapAsync(2)(r1 => {
////          val r = r1._1
////          logger.info(
////            "update updating stock price {} of {} :  {} {}",
////            r1._2,
////            a1.length,
////            DateFormat.getSecondsFormat(time),
////            r._1
////          )
////        })
////        .runWith(Sink.ignore)
//
////      Await.result(f, 100.minutes)
////      logger.info("fetchAStockSpot finished {}", a1.length)
//
//      emailService.sendEmail("updateStockPriceOk", "ok")
//      spotMsg ! SpotActor.SaveLastStockPrice(a)
//      Thread.sleep(10000)
//    } catch {
//      case NonFatal(x) =>
//        emailService.sendEmail("updateStockPrice error batch error", x.toString)
//        logger.error("update all stock price fail{}", x)
//    }
  }

  def handleCommand(
    command: SchedulerCommand,
    spotMsg: ActorRef[SpotActor.SpotMsg]
  ) = {

    logger.info(
      "quantConfig.getSchedulerFlag().getOrElse(true) {}",
      quantConfig.getSchedulerFlag().getOrElse(true)
    )
    if (quantConfig.getSchedulerFlag().getOrElse(true)) {
      handleCommand1(command, spotMsg)
    }

  }

  def handleCommand1(
    command: SchedulerCommand,
    spotMsg: ActorRef[SpotActor.SpotMsg]
  ) = {
    logger.info("handle command {}", command)

    runWithCommands(
      command,
      () => {
        command match {
          case SchedulerCommand.updateNotes =>
            Await.result(quantConfig.updateNotes(), 6.hours)
            emailService.sendEmail(
              "updateNote",
              s"update"
            )
          case SchedulerCommand.syncWasteTime =>
            try {
              syncPigData
              savecar_cpca_energy_saleListList()
              logger.info("syncPriceInContract")
              syncGroupsPrice()
              syncPriceInContract()
              logger.info("syncIndexContainPrice")
//              syncIndexContainPrice()
              logger.info("panMingFactor")
              panMingFactor.fetchData(IndexSymbol("000300"))
            } catch {
              case NonFatal(x) =>
                logger.error("waste time {}", x)
                emailService.sendEmail(
                  "waste time error",
                  s"continue ${x.toString}"
                )
            }

//          case SchedulerCommand.saveTrace =>
//          saveTrace()

          case SchedulerCommand.tradeDay =>
            retry(Await.result(dataSource.syncTradeDay(), 200.seconds));

//          case SchedulerCommand.temp =>
//            emailService.sendEmail(
//              "temp step",
//              "temp start"
//            )
////            fetchSpot(spotMsg)
//            emailService.sendEmail(
//              "temp step",
//              "temp end"
//            )

          case SchedulerCommand.meadium =>
            emailService.sendEmail(
              "cmeadium  step",
              ""
            )
            meadiumDataList.fetchDataByCout(i"000852", 0.8)
            meadiumDataList.fetchDataByCout(i"000852", 0.5)
            emailService.sendEmail(
              "cmeadium  step",
              ""
            )
          case SchedulerCommand.continue =>
            try {
//              emailService.sendEmail(
//                "continue step",
//                "sync399303 start"
//              )
//              Await.result(
//                sync000852(),
//                8.hours
//              )
//              emailService.sendEmail(
//                "continue step",
//                "sync399303 start end"
//              )
//              Await.result(
//                continue000852(),
//                6.hours
//              )

//              emailService.sendEmail(
//                "continue step",
//                "continue end"
//              )
//            indexContinuesDataList.fetchDataByCout(i"000016", 4)

              indexContinuesDataList.fetchDataByCout(i"000016", 5)
              emailService.sendEmail(
                "continue step",
                "continue completed"
              )
            } catch {
              case NonFatal(x) =>
                logger.error("continue error {}", x)
                emailService.sendEmail(
                  "continue error",
                  s"continue ${x.toString}"
                )
            }

          case SchedulerCommand.chaodie =>
            emailService.sendEmail(
              "start chaodie",
              "save chaodie"
            )
            runStreamSyncChaodieTest()
            saveVixDataframe2DB()
//            try {
//              runStreamSyncChaodie()
//            } catch {
//              case NonFatal(x) =>
//                emailService.sendEmail(
//                  "chaodie end err",
//                  s"save chaodie ${x.toString}"
//                )
//                logger.info("SchedulerCommand.chaodie")
//            }
            emailService.sendEmail(
              "chaodie end",
              "save chaodie"
            )
            logger.info("SchedulerCommand.chaodie")

          case SchedulerCommand.syncNotePrice =>
            val f = Try {
              syncNotePrices()
              emailService.sendEmail(
                "已经拉取价格数据",
                "已经发送文件"
              )
              Right("")
            }.recover { case NonFatal(x) =>
              logger.error(s"parse data sync node prices {}", x)
              Left(new Error(x.toString))
              emailService.sendEmail(
                "[price]拉取价格数据[error]",
                x.toString
              )
            }

          case SchedulerCommand.syncOptions =>
            syncOptions()

//          case SchedulerCommand.factorData =>
//            fetchFactorData()

//          case SchedulerCommand.sellNotice =>
//            getSellNotice()

          case SchedulerCommand.syncPig =>
            syncPigData

          case SchedulerCommand.sector =>
            testSector()
            testYjbg()
            testYjyg()

          case SchedulerCommand.syncUsedPrice =>
            dataSource.updateAllSymbolPrice(i"000016")
            dataSource.updateAllSymbolPrice(i"000905")
            dataSource.updateAllSymbolPrice(i"000300")

            syncPriceInContract()
            syncHold()
            syncGroupsPrice()
            emailService.sendEmail(
              "step",
              "used price synced"
            )

          case SchedulerCommand.syncCodeName =>
            println(" Finally!")
            Try {
              syncHotCodeName()

              Right("")
            }.recover { case NonFatal(x) =>
              logger.error(s"sync code names data ${}", x)
              Left(new Error(x.toString))
              emailService.sendEmail(
                "syncCodeName Error",
                x.toString
              )
            }

          case SchedulerCommand.syncVix =>
            // TODO test info
//            retry {
//              saveVixDataframe2DB()
//            }
            emailService.sendEmail(
              "step",
              "save joinquant"
            )
            runStreamSyncVolume()
            emailService.sendEmail(
              "step",
              "save volume"
            )
          case SchedulerCommand.syncContract =>
            updateContractState1()

          case SchedulerCommand.panming =>
            emailService.sendEmail(
              "判明start",
              "end"
            )
            fetchFactorData()
            emailService.sendEmail(
              "判明end",
              "end"
            )

          case SchedulerCommand.retro =>
            emailService.sendEmail(
              "notice",
              s"start at ${DateFormat.getDayHourFormat(DateTime.now)}"
            )
            checkNotice

          case SchedulerCommand.retro =>
            emailService.sendEmail(
              "复盘",
              s"start at ${DateFormat.getDayHourFormat(DateTime.now)}"
            )
            val result = retroSummary()

            emailService.sendEmail(
              "复盘",
              result.summary,
              result.files
            )

          case SchedulerCommand.`strategy` =>
            checkStrategy()
        }
      }
    )
  }

  def shutdown(): Unit = {
    spark.stop()
  }
}
