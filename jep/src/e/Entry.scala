package e

import akka.Done
import akka.actor.ActorSystem
import akka.event.LoggingAdapter
import akka.persistence.jdbc.testkit.scaladsl.SchemaUtils
import com.google.inject.Guice
import com.lqiong.email.EmailServiceTrait
import com.lqiong.email.module.ConfigModule
import com.lqiong.jep.entry._
import com.lqiong.jep.entry.a.UUIDUtil
import com.lqiong.jep.modules._
import com.lqiong.jep.option.QuantEngine
import com.lqiong.jep.studys.Study
import com.lqiong.jep.{AINput, MCache, Rainer}
import com.lqiong.model.{IndexSymbol, StockTrait}
//import com.lqiong.selenium.FetchValueCaller
import com.monovore.decline.enumeratum._
import com.monovore.decline.{CommandApp, Opts}
import com.typesafe.config.ConfigFactory
import org.joda.time.DateTime

import java.util.UUID
import scala.concurrent.Future
import scala.util.control.NonFatal

//https://dmoj.ca/problem/a4b1/submit
// https://quantropy.readthedocs.io/en/latest/index.html

import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, ExecutionContext}

// 投资记录
// ,,,
// , , ,

//{a=1, b=2}

case class A(name: String)
case class B(c: A)

object Entry
    extends CommandApp(
      name = "claim",
      header = "be a claim and a rich guy",
      main = {
//        Kamon.init()
        sys.props.put("quill.macro.log", false.toString)
        sys.props.put("quill.binds.log", true.toString)

        val skip: Opts[Int] =
          Opts
            .option[Int]("skip", help = "days ago.", short = "s")
            .withDefault(0)

        val days: Opts[String] =
          Opts
            .option[String]("day", help = "days ago.", short = "d")
            .withDefault(DateFormat.getDay(DateTime.now))

        val channel: Opts[String] =
          Opts
            .option[String]("t", help = "Person to greet.", short = "t")

        val channel1 = channel.orNone

        val contract: Opts[String] =
          Opts
            .option[String]("contract", help = "Person to greet.", short = "x")
            .withDefault("")

        val code: Opts[String] =
          Opts
            .option[String]("code", help = "Person to greet.", short = "c")
            .withDefault("000050")

        val categoryArgument = Opts.argument[Category]("category")
        import cats.syntax.apply._

        (code, days, contract, channel1, categoryArgument, skip).mapN {
          (x, day, contract, channel, category, skp) =>
            {
              val system = ActorSystem("claim")
              val injector = Guice.createInjector(
                new ConfigModule(),
                new AkkaMaterializerModule(system),
                new AkkaSharedClusterModule(),
                new ExecutionContextModule,
                new EmailModule,
                new MemcachedClientModule(),
                new LoggingModule(category.toString),
                new JepExecutorModule,
                new RetryModule,
                new SparkModule,
                new QueryTableModule,
                new QuantEngineModule,
                new JoinquantModule
              )
              import net.codingwell.scalaguice.InjectorExtensions._
              val emailService = injector.instance[EmailServiceTrait]
              val quantEngine = injector.instance[QuantEngine]
              val logger = injector.instance[LoggingAdapter]
              val queryTable = injector.instance[QueryTable]
              val ex = injector.instance[ExecutionContext]
              implicit val stockTrait = injector.instance[StockTrait]

              logger.info("***************88")
              logger.info("***************88")
              logger.info("***************88")
              logger.info("***************88")
              logger.info("")
              logger.info("")
              logger.info("cate {}", category)
              println(s"cate ${category}")
              logger.info("")
              logger.info("")
              logger.info("***************88")
              logger.info("***************88")
              logger.info("***************88")
              logger.info("***************88")
              logger.info("***************88")
              category match {
                case Category.egg =>
                  import com.lqiong.model.symbol.codesyntax._
                  val f = bk"人工智能"

                  logger.info(
                    "quantEngine.getName() {}",
                    quantEngine.getCodeName(f)
                  )
                  logger.info(
                    "quantEngine.getName() {}",
                    f.getPrices()
                  )
                  quantEngine.shutdown()
                  sys.exit(0)
                case Category.bug =>
                  import com.lqiong.model.symbol.codesyntax._
                  val f = bk"人工智能"

                  logger.info(
                    "quantEngine.getName() {}",
                    quantEngine.getCodeName(f)
                  )
                  logger.info(
                    "quantEngine.getName() {}",
                    f.getPrices()
                  )
                  quantEngine.shutdown()
                  sys.exit(0)
                case Category.volume =>
                  quantEngine.testVolume()
                  sys.exit(0)

                case Category.portfolio =>
                  //                  val portfolio = PortfolioGroup(
                  //                    "portfolio",
                  //                    List(
                  //                      StockPortfolio(
                  //                        c"600748",
                  //                        100
                  //                      ),
                  //                      StockPortfolio(
                  //                        c"002891",
                  //                        100
                  //                      )
                  //                    )
                  //                  )
                  logger.info("day {}", day)

                  val time1 = DateFormat.fromString(day).withHourOfDay(15)
                  logger.info("time1  {}", time1)

                  val time = DateFormat.fromString(day)
                  //                    if (DateFormat.fromString(day).isAfter(time1))
                  //                    else DateFormat.fromString(day).minusDays(1)
                  //                  }

                  logger.info("time {}", time)

                  quantEngine
                    .getPortfolio(
                      15,
                      Some(
                        time
                      )
                    )
                  sys.exit(0)

                case Category.movie =>
                  logger.info("movie")
                  val a = quantEngine.savecar_cpca_energy_saleListList()
                  logger.info(s"movie ${a}")
                //                case Category.trade_days =>
//                  logger.info("trade days {}", quantEngine.getTradeDays())

                case Category.continues =>
                  sys.exit(0)
//                  continuesDataList.fetchData(symbol)
//                  quantEngine.testContinues();
//                  quantEngine.continue000852()
//                  quantEngine.testIndexContinue();
//                  emailService.sendEmail(
//                    "continues",
//                    "continues"
//                  )
//                  import com.lqiong.model.symbol.codesyntax._
//                  val some = quantEngine.getCountFor5Lianyagn(
//                    List(c"000603", c"002011"),
//                    t"2021-04-09",
//                    4
//                  )
//                  logger.info("some {}", some)

//                import scala.concurrent.duration._
//                val a =
//                  Await.result(table1.getSymbolChaodie(c"600845"), 5.minutes)
//                logger.info(a.toString)
                case Category.`chaodie_quill` =>
                  import com.lqiong.model.symbol.codesyntax._

                  import scala.concurrent.duration._
                  val a =
                    Await.result(
                      queryTable.getSymbolChaodieCache(c"600845"),
                      5.minutes
                    )
                  logger.info(a.toString)
                case Category.study =>
                  logger.info(Study.s603386.toString)
                case Category.nname =>
                  import com.lqiong.model.symbol.codesyntax._
                  val names = quantEngine.getCodeName(i"000097")
                  logger.info("index name {}", names);

                case Category.vega =>
//                  emailService.sendEmail(
//                    "vega编译",
//                    quantEngine.getHoldOptions()
//                  )
//                  510050P2109M03100

//                  val names = quantEngine.getIndexNames()
//                  logger.info("index name {}", names);

                  sys.exit(0)

                case Category.indexName =>
                  val names = quantEngine.getIndexNames()
                  logger.info("index name {}", names);

                case Category.lian5 =>
                  quantEngine.check5Lian(DateFormat.fromString(day), 5)
                  sys.exit(0)

                case Category.clean =>
                  quantEngine.emptyCommand()
                  sys.exit(0)

                case Category.history4 =>
                  quantEngine.check5Lian(DateFormat.fromString(day), 4)
                  sys.exit(0)

                case Category.hot =>
                  val version =
                    classOf[Runtime].getPackage.getImplementationVersion

                  logger.info("v {}", version)
                  println(version)
                  //                  quantEngine.updateAStockSpot1InContractSync()
//                  quantEngine.quant_FetchAStockSpotMedium()
                  sys.exit(0)

                case Category.spot =>
                  quantEngine.t()
//                  quantEngine.dataSource.syncTradeDay()
//                  quantEngine.updateAStockSpot1InContractSync()

                  sys.exit(0)

//                case Category.contain =>
//                  quantEngine.syncIndexContainPrice()

                case Category.indexName =>
                  val names = quantEngine.getIndexNames()
                  logger.info("index name {}", names);

                case Category.groups =>
                  val r = quantEngine.getGroupListRetro
                  logger.info("groups retro {}", r);

                case Category.checkConfig =>
                  emailService.sendEmail(
                    "编译",
                    s"配置检查${quantEngine.checkConfig()}"
                  )
                  sys.exit(0)

                case Category.fundamentals =>
                  sys.exit(0)

                case Category.index =>
                  println("ok ")
                  import com.lqiong.model.symbol.codesyntax._
//                  quantEngine.dataSource.updateAllSymbolPrice(sw"801010")
//                  quantEngine.updateAllSymbolPrice(i"510050")
                  logger.info("ok {}")

                case Category.pig =>
                  quantEngine.syncPigData
                  sys.exit(0)

                case Category.cal_opt =>
                  quantEngine.getOptionResult()
                  sys.exit(0)

                case Category.north =>
                  val a = quantEngine.getNorthSummary()
                  emailService.sendEmail("north", a)

                case Category.contractnum =>
                  logger.info("login")
                  logger.info("contract")
//                  bankService.login()
                  logger.info("loginn")
//                  val f = bankService.getContracts()
//                  logger.info(s"f ${f.toString}")

//                  emailService.sendEmail(
//                    "Contract",
//                    f.toString
//                  )

                  sys.exit(0)

                case Category.sell_contract =>
                  println("sell_contract")
//                  bankService.login()
//                  val contractId = contract

//                  val r = bankService.contractStockClosingOrder(contractId)
//                  val l2 = r
//                    .map(r => CalcTools.getContractList(r.data.stockOrderVOList))
//                    .getOrElse(List.empty[ContractOrderInfo])
//
//                  // 卖出
//                  l2.foreach(item => {
//                    logger.info("item {}", item)
//                    val r2 = bankService.createOrder(
//                      InsertOrder(
//                        contractId = contractId,
//                        stockCode = item.code,
//                        entrustType = 1, // market
//                        entrustPrice = "",
//                        entrustNumber = item.volume
//                      ),
//                      item.direction == "卖出"
//                    )
//
//                    if (r2.isRight) {
//                      emailService.sendEmail(
//                        "Contracts OK",
//                        r2.toString
//                      )
//                    } else {
//                      emailService.sendEmail(
//                        "Contracts FAIL",
//                        r.toString
//                      )
//                    }
//                  })
                case Category.list => {
                  println(Category.list)
                  println(Category.order)
                  sys.exit(0)
                }

                case Category.before =>
                  sys.exit(0)

//                case Category.login =>
//                  bankService.login()

//                case Category.contracts =>
//                  bankService.login()
//
//                  logger.info("login")
//                  logger.info("contract")
//                  val f = bankService
//                    .getContractsAndTradeLog2()
//                    .map(r => CalcTools.getContractList(r.contractList))
//                  logger.info(s"f ${f.toString}")
//
//                  emailService.sendEmail(
//                    "Contracts",
//                    f.toString
//                  )
//                  quantEngine.syncPriceInContract();

//                if (f.isRight) {
//                  f.right.get.data.foreach(r => {
//                    logger.info(s"r${r.contractId}")
//                    logger.info(
//                      bankService
//                        .contractStockClosingOrder(r.contractId)
//                        .toString
//                    )
//                    logger.info(s"r closing records ${r.contractId}")
//                  })
//                }
//                  sys.exit(0);
                case Category.pilu =>
                  emailService.sendEmail(
                    "披露",
                    quantEngine.getstock_report_disclosureComming(
                      DateTime.now.withDayOfMonth(17).withMonthOfYear(8)
                    )
                  )
                  quantEngine.shutdown()
                case Category.retro =>
                  val retroSummary = quantEngine.retroSummary()
                  emailService.sendEmail(
                    "复盘",
                    retroSummary.summary,
                    retroSummary.files
                  )
                  logger.info("sended")
                  quantEngine.shutdown()

                case Category.syncCode =>
                  quantEngine.syncCodeName
                  emailService
                    .sendEmail("sync Code Name", "Ok")
                  quantEngine.shutdown()
                  sys.exit(0)
                case Category.opt =>
                  quantEngine.getOptionResult()
                  quantEngine.getOptionVega()

                case Category.sync =>
                  logger.info("okkkk,hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh")
                  quantEngine.syncAllSymbll()
                  quantEngine.syncGroupsPrice()
                  quantEngine.syncPriceInContract()
                  Await.result(quantEngine.quantConfig.updateNotes(), 6.hours)
                  quantEngine.quantConfig.updateDefaultClounds()
                  logger.info("okkkk,hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh")
                  sys.exit(0)

                case Category.volumes =>
                  logger.info("okkkk")
                  quantEngine.getFangLiang()

                case Category.`update_notes` =>
                  Await.result(quantEngine.quantConfig.updateNotes(), 6.hours)
                  logger.info(s"updated")
                  sys.exit()
                case Category.`update_clouds` =>
                  logger.info(s"updated")
                  logger.info(s"updated")
                  logger.info(s"updated")
                  logger.info(s"updated")
                  logger.info(s"updated")
//                  quantEngine.updateContractxxx()
                  quantEngine.updateDefaultClouds()
                  logger.info(s"updated")
                  logger.info(s"updated")
                  logger.info(s"updated")
                  logger.info(s"updated")
                  logger.info(s"updated")
                  sys.exit()

                case Category.hk =>
                  quantEngine.getHkItems()
                  sys.exit()

                case Category.rainer =>
                  Rainer.run()
                  sys.exit()

                case Category.upodate_spot_count =>
                  quantEngine.quantConfig.updateSpotCount(2000)
                  sys.exit(0)

                case Category.code =>
//                  val symbol = StockSymbol(x)
//                  quantEngine.updateAllSymbolPrice(symbol)
                  //                  i"399303"
                  sys.exit(0)

                case Category.enable_schedule =>
                  quantEngine.quantConfig.updateSchedulerFlag(true)
                  sys.exit(0)

                case Category.snowball =>
                  quantEngine.checkPrice()

                  implicit val ec: scala.concurrent.ExecutionContext =
                    scala.concurrent.ExecutionContext.global
                  val a = new SnowballService()
                  val p = Await.result(a.fetchStockHotPrice("000004"), 9.seconds)
                  println(s"pppp ${p}")
                  logger.info("ppp {}", p)
                  sys.exit(0)

                case Category.disable_schedule =>
                  quantEngine.quantConfig.updateSchedulerFlag(false)
                  sys.exit(0)
                case Category.test =>
                  import com.lqiong.model.symbol.codesyntax._
                  val f = quantEngine.queryTable.getStock(c"003000")
                  val f32 = Await.result(f, 40.seconds)
                  logger.info("f3 {}", f32);
//                    dataSource.updateAllSymbolPrice(i"000905")
                  import net.codingwell.scalaguice.InjectorExtensions._
//                  val a1 = injector.instance[SearchTapirController]
//                  quantEngine.dataSource.updateAllSymbolPrice(i"000016")
//                  quantEngine.dataSource.updateAllSymbolPrice(i"000905")
//                  quantEngine.dataSource.updateAllSymbolPrice(i"000300")
//                  sys.exit(0)

//                  logger.info("a1 {}", a1)
//                  val r = quantEngine.getTimeSeries(c"603887")
//                  logger.info(" rrrrr {}", r.getBarData.size())
//                  logger.info(" rrrrr {}", DateFormat.getDay(JDateTime.get(r.getBarData.get(0).getBeginTime)))
//                  quantEngine.testCaiwu
//                  quantEngine.aa(c"603887")

                  //                  val s = quantEngine.updateChaodieInfo(StockSymbol("603887"))
//                  logger.info(s"head {}", s)

//                  val l = injector.instance[EggDataList].fetchData
//                 logger.info("egg {}", "1")

//                  val a = new AgisoService(system.log, system.dispatcher)
//                  val l = quantEngine.geAllConcernSymbols
//                  logger.info("l {}", l.length)
//                  logger.info("l {}", l.map(r => r.code))
//                  logger.info("l {}", l.map(r => r.code))
//
//                  val l2 =
//                    a.batchSave(l.filter(r => r.symbolType == SymbolEnum.stock).map(r => r.code))
//                  Await.result(l2, 60.seconds)

                  //                  quantEngine.testPersistence7()
//                  quantEngine.syncCodeName()
//                  s.records.headOption
//                  println(s"head {}", s.records.headOption)
//                  logger.info(s"head {}", s.records.lastOption)
//                  println(s"head {}", s.records.lastOption)
//                  quantEngine.syncBackend()
//                  val f = quantEngine.fetchBackendUrlFromCloud()
//                  logger.info("a {}", f)

//                  logger.info(
//                    "quantEngine.quantConfig.getSpotCount() {}",
//                    quantEngine.quantConfig.getSpotCount()
//                  )
//                  Thread.sleep(20000)
//                  logger.info("xxxx {}", quantEngine.fetchContractState())
//                  logger.info()
//                  logger.info(
//                    "aaa {}",
//                      quantEngine.dataSource.getAStockEmSpot()
//                  )
//                  logger.info(
//                    "aaa {}",
//                    quantEngine.geAllConcernSymbols
//                      .map(r => r.code)
//                      .contains("002595")
//                  )
//                  val f = Await.result(
//                    quantEngine.queryTable.getIndex(IndexSymbol("000300")),
//                    50.seconds
//                  )
//                  logger.info("fff {}", f);
//                  val d = queryTable.getIndex(IndexSymbol("000300")).map(r => r)
//                  quantEngine.testOne()
//                  quantEngine.updateContractxxx()
//                  logger.info("ddd {}", d)
//                  quantEngine.emptyCommand()
//                  quantEngine.testPersistence7()

                  sys.exit(0)

                  try {

//                    quantEngine.updateAllSymbolPrice(i"601021")
//                    val f = queryTable.getIndex(i"000016");
//                    val f1 = Await.result(f, 50.seconds)
//                    logger.info("f1 {}", f1)
//                    quantEngine.testNorth();

//                    quantEngine.testEarnForcast();

//                    quantEngine.testSector()
//                    syncHotCodeName()

//                    quantEngine.getCodeNames()
//                    quantEngine.syncCodeName()
//                    quantEngine.testPriceSince(symbol)

//                    quantEngine.updateAllSymbolPrice(symbol)

//                    quantEngine.testFractor()

//                    val r = quantEngine.dataSource.test()
//                    logger.info(quantEngine.dataSource.getVixDataSet().toString)
//                    PoEditor.diff(PoEditor.getEnListh(), PoEditor.getZH2())
//                    PoEditor.getZH2()
//                    PoEditor.diff(PoEditor.getEnListh(), PoEditor.getZH2())
//                    PoEditor.diff(PoEditor.getEnListh(), PoEditor.getZH())
//                   val r =  PoEditor.getZH().terms.filter(term => term.translation.isDefined)
//                    logger.info("r {}", r)
//                    PoEditor.getEnListh()
//                    quantEngine.updateAllSymbolPrice(symbol)
//                    injector.instance[EggDataList].fetchData
//
//                    val l = injector.instance[EggDataList].getList
//                    logger.info("egg {}", "1")
//                    symbol.getPriceSince(30)
//                    logger.info(
//                      "getPriceSince {}",
//                      quantEngine.getPriceSince(symbol, 20)
//                    )

                  } catch {
                    case NonFatal(x) =>
                      logger.error("test updateStock {}", x)
                  }
//                  val l = TaLib.black(logger, quantEngine.getTimeSeries(symbol))
//                  logger.info("l: result {}", l)

//                  quantEngine.shutdown();
//                  sys.exit()
                //                val now = Instant.now()
//                val series: TimeSeries[Double] = TimeSeries[Double](
//                  Vector(
//                    now,
//                    now.plusSeconds(1),
//                    now.plusSeconds(2),
//                    now.plusSeconds(3)
//                  ),
//                  Vector(3, 4, 5, 6)
//                )
//                val a1 = MovingAverage.calculateValues(series.values, 3)
//                logger.info("series {}", series.index)
//                logger.info("a1 {}", a1)
//                val a2 = MovingAverage.calculateLastMA(Array(1,4, 5, 7, 8), 2)
//                logger.info("a2 {}", a2)

//                  quantEngine.syncPigData
//                  val a = quantEngine.seeCurrent();
//                  logger.info("a {}", a)
//                  emailService
//                    .sendEmail("see Current", a)

//                  logger.info("xa {}", quantEngine.getTimeSeries(symbol))

//                  val series = quantEngine.getTimeSeries(symbol)
//                  val r = StockSelector.get5LianYang(series, 30, 6)
//
//                  logger.info("r {}", r)

//                logger.info("series {}", series)
//                RSI2Strategy.execute(quantEngine.getTimeSeries(symbol))
//                SimpleMovingAverageBacktest.execute(series)

//                BuyAndSellSignalsToChart.execute(series)
//                TradingBotOnMovingBarSeries.execute(series)
                //                AAB.execute(series)

                // val a = quantEngine.getPricesMALatest(symbol)
                //  logger.info("aaaaaaaaaaaaaa {}", a)
                //    logger.info(symbol.getPricesMALatest())
                //                quantEngine.fetchSaveStock(symbol)

//                logger.info("index {}", a2.index)
//                logger.info("a1 {}", a2.values)
                // Stats.median(xs) shouldBe 2.5
//                logger.info("series.length {}",  Stats.median(Seq(1,2,3)))
//                logger.info("series.length {}", series.length)
//                import com.lqiong.model.symbol.codesyntax._
//                val symbol = c"603218"
//                val stockPrice = (symbol.getPriceSince(2) * 100).formatted("%.2f")
//
//                logger.info("syncData {}", stockPrice);
//
                case Category.forcast =>
//                  val r1 = quantEngine.getForcastToday()
                  emailService
                    .sendEmail("复盘", "")
                  quantEngine.shutdown()

                case Category.notice =>
                  try {
                    quantEngine.checkNotice
                    sys.exit(0)
                    quantEngine.shutdown()
                  } catch {
                    case NonFatal(x) => {
                      logger.info("sync memcached  addd {}", x)
                      x.printStackTrace()
                    }
                  }

                case Category.memcached =>
                  val a = new MCache(ConfigFactory.load(), ex)
                  logger.info("sync memcached  memcached {}", a.run(logger))
                  sys.exit(0)
                case Category.create_vega =>
                  quantEngine.syncOptions()
                  logger.info("sync options")
                  sys.exit(0)

                case Category.see_contract =>
                  logger.info("see contract")
                  val result =
                    quantEngine.seeContract("7b73d790b720dcac5fda7e6043c061f6")
                  logger.info(result.toString)

                  emailService.sendEmail("contracts change percent", result)

                  sys.exit(0)

                case Category.sw_index =>
//                  quantEngine.getContractLogs()
                  sys.exit(0)
                case Category.value =>
//                  val a = new FetchValueCaller().run(x)
//                  emailService.sendEmail("复盘", a.toString)
                  quantEngine.shutdown()
                case Category.convertible_bond =>
                  val f = quantEngine.getKeZhuanZhai()
                  logger.info("f ", f)
                case Category.panming =>
//                  quantEngine.fetchFactorData()
                  import com.lqiong.model.symbol.codesyntax._
                  val f = Await.result(quantEngine.panMingFactor.getLatest(i"000016"), 400.seconds)
                  logger.info(s"f ${f}")
                  sys.exit(0)
//                  quantEngine.()

                case Category.option =>
//               quantEngine.getOptionResult()
//               logger.info("entract {}", quantEngine.get50Price());

                  logger.info("task start");
                  val fx89 = Await.result(
                    quantEngine.panMingFactor.getRealTimeLatest(IndexSymbol("000016")),
                    50.seconds
                  )
//                  val f3 =
//                    Await.result(quantEngine.factor_ptionRiskMiniFactor.getLatest(), 50.seconds)

                  logger.info("task end {}", fx89);
//                  logger.info("task end");
                  sys.exit(0)
//                quantEngine.saveVixDataframe2DB();

                case Category.strategy =>
                  val f = Await.result(
                    quantEngine.getQuantList(),
                    30.seconds
                  )
                  Thread.sleep(1000 * 20)
                  logger.info("f {}", f)
                  sys.exit(0)

                case Category.vix =>
                  quantEngine.saveVixDataframe2DB()
                  injector.instance[PolytyPrinter].getVixImage(isSave = false)

//                case Category.scheduler =>
//                  injector.instance[QuantEngineController].runServer()
//                  sys.exit(0)
//                  quantEngine.checkConfig()
//                injector.instance[Lq_scheduler].run_scheduler(true)

                case Category.sell =>
                  emailService.sendEmail(
                    "sell",
                    s"start ${channel}"
                  )
                  logger.info("sell");

                case Category.order =>
                  import com.lqiong.model.symbol.codesyntax._
                  logger.info("oorder ");
//                  logger.info("oorder ");
//                  logger.info("oorder ");
//                  quantEngine.fetchFactorData()
                  val f = quantEngine
                    .fetchPanmingDataList(i"000016")
                  val r = Await.result(f, 40.minutes)

                  logger.info("r {}", r)
                  //                  emailService.sendEmail(
//                    "checking",
//                    quantEngine.checkOrder.toString
//                  )
//                  quantEngine.orderLocal()
//                  val order = quantEngine.checkOrder
//                  if (order.isRight) {
//                    quantEngine.shutdown()
//                  }

                  sys.exit(0)
//              case Category.table =>
//                val dataFrame = quantEngine.getCodeNamesDataFrame()
//                logger.info("is price Ok {}", dataFrame)
                case Category.chaodie =>
                  quantEngine.runStreamSyncChaodieTest1(skp)
//                   import com.lqiong.model.symbol.codesyntax._
//                  quantEngine.v2SaveChaodie(c"002328")
//                  val a = c"300502".getChaodieDayList().lastOption
//                  logger.info("sssssss {}", a)
                  sys.exit(0)

                case Category.notion1 =>
                  System.out.println(System.getProperty("java.library.path"))
                  //                  o.
                  System.out.println(
                    System.setProperty(
                      "CHROME_DRIVER_PATH",
                      "/Users/rang/rang/claim/selenium/chromedriver"
                    )
                  )

                  logger.info(System.getProperty("java.library.path"))
                  logger.info(System.getProperty("java.library.path"))
                  logger.info(System.getProperty("java.library.path"))
                  logger.info(System.getProperty("java.library.path"))
                  logger.info(System.getProperty("java.library.path"))
                  logger.info("notion PYTHON_HOME  {}", System.getenv("PYTHON_HOME"))
                  logger.info("notionLD_LIBRARY_PATH  {}", System.getenv("LD_LIBRARY_PATH"))
                  logger.info("notion PYTHON_HOME  {}", System.getenv("PATH"))

                  import java.util
                  System.out.println(
                    "******************************Environment Vars*****************************"
                  )
                  val enviorntmentVars = System.getenv
                  enviorntmentVars.entrySet.forEach(println)

                  val notionService = new NotionService()
                  val c = quantEngine.dataSource.getCodeNames2

                  c.show(1)
                  logger.info("notion1  {}", c)
                  notionService
                    .savePageForItem(
                      UUID.fromString(UUIDUtil.insertDashUUID("36bb7808339041cba1809ac2b536ebb8")),
                      c
                    )
                  sys.exit(0)
                case Category.codename =>
                  val done: Future[Done] = SchemaUtils.createIfNotExists()(system)
                  Await.result(done, 60.seconds)

                  quantEngine.syncHotCodeName()
                  val c = quantEngine.dataSource.getCodeNames
                  logger.info("c  {}", c)
                  println(s"c: ${c}")
                  sys.exit(0)

                case Category.ball => {
                  println("logic start")
                  import io.circe._

                  println(quantEngine.getIndexCurrentPrice(IndexSymbol("000016")))
                  println(quantEngine.getIndexCurrentPrice(IndexSymbol("000300")))

                  println("logic end")
                  sys.exit(0)
                }

                case Category.logic =>
                  quantEngine.checkStrategy()
                  println("logic end")
                  sys.exit(0)

                case Category.create =>
                  emailService.sendEmail(
                    "create",
                    "syncCodeName"
                  )
                  quantEngine.syncCodeName()
                  quantEngine.fetchStockHkSpot()
                  emailService.sendEmail(
                    "create",
                    "saveUsName"
                  )
                  quantEngine.saveUsName()

                  quantEngine.createVega()

                  emailService.sendEmail(
                    "create",
                    "start createVega"
                  )
                  emailService.sendEmail(
                    "create",
                    "fetchStockHkSpot"
                  )

                  emailService.sendEmail(
                    "create",
                    "create completing"
                  )

                  quantEngine.syncOptions()

                  emailService.sendEmail(
                    "create",
                    "syncOptions"
                  )

                  emailService.sendEmail(
                    "create",
                    "start syncCodeName"
                  )
                  quantEngine.syncCodeName()

                  emailService.sendEmail(
                    "create",
                    "getKeZhuanZhai"
                  )
                  quantEngine.getKeZhuanZhai()
                  emailService.sendEmail(
                    "create",
                    "getIndexName"
                  )
                  quantEngine.getIndexNames()
                  emailService.sendEmail(
                    "create",
                    "fetchSaveFundNameList"
                  )
                  quantEngine.fetchSaveFundNameList()
                  quantEngine.shutdown()
                  sys.exit(0)

                case Category.sync_all =>
                  quantEngine.syncGroupsPrice()
//                  quantEngine.syncHoldGroupPrice();
                  quantEngine.syncPriceInContract()
                  quantEngine.syncNotePrices()

                  emailService.sendEmail(
                    "sync_note_price",
                    "sync_hold_price start"
                  )
                  // 603790
                  emailService.sendEmail(
                    "sync_all",
                    "sync_all start"
                  )

                  emailService.sendEmail(
                    "sync_hold",
                    "sync_hold start"
                  )
                  quantEngine.syncHold()
                  emailService.sendEmail(
                    "sync_all",
                    "sync completed"
                  )
                  quantEngine.shutdown();

                case Category.`note_price` =>
                  quantEngine.syncNotePrices()
                  quantEngine.shutdown();
                case Category.`group_price` =>
                  quantEngine.syncGroupsPrice()
                  quantEngine.shutdown();

                case Category.quill =>
                  import com.lqiong.model.symbol.codesyntax._
//                  quantEngine.v2SaveChaodie(
//                    c"603529"
//                  )
                  val d = quantEngine.fetchStockItems(
                    AINput(
                      code = "002967",
                      `type` = "",
                      period = ""
                    )
                  )
                  val result =
                    Await.result(d, 50.seconds).records.map(r => (r.info, r.chaodie)).take(20)
                  logger.info("result {}", result)

//                case Category.server =>
//                  injector.instance[QuantEngineController].runServer()
                case Category.default =>
                  logger.info("not activated ")
                  emailService.sendEmail(
                    "claim",
                    s"no activated"
                  )
              }
            }
        }
      }
    )
