package com.lqiong.jep.entry

import akka.actor.ActorSystem
import akka.event.LoggingAdapter
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.state.DurableStateStoreRegistry
import akka.stream.scaladsl.{Sink, Source}
import akka.stream.{Materializer, OverflowStrategy}
import akka.util.Timeout
import akka.{Done, NotUsed}
import com.github.takezoe.retry.{retry, RetryPolicy}
import com.google.inject.Inject
import com.lqiong.claim.items.SchedulerCommand
import com.lqiong.jep.config.{LogicConfig, NoteConfig, NoticeConfig}
import com.lqiong.jep.entry.item.AState
import com.lqiong.jep.studys.S002978
import com.lqiong.model.LSymbol
import com.lqiong.model.order._
import com.lqiong.model.symbol.codesyntax._
import com.lqiong.model.trade.TradeLogic

import java.io.File
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.language.postfixOps
import scala.util.control.NonFatal
// 买入 603039

class QuantConfig @Inject() (
  val enterReason: EnterReason,
  implicit val ex: ExecutionContext,
  val logger: LoggingAdapter,
  val system: ActorSystem,
  implicit val materializer: Materializer,
  implicit val retryProxy: RetryPolicy
) extends ConfigTrait {

  //  300490 4连涨
  override val clues = List(
    // 600268

    // 601222

    // 600886
    // 603697
//    西藏矿业
    //   核心通胀率

    // 000090
    // 000402
    // 000709
    // 000932
    // 000708
    // 6000048
    // 金隅股份
    // 601187
    // 厦门银行
    // https://quizlet.com/282893655/test
    // 600900
    // 601923
    // 002608
    // 601860
    // 601916
    // 600339
    // 600782

    // 601000
    // 000709
    // 600035

    // 601000

    // 600755
    // 600674
    // 600649
    // 002789
    // 601088
    // 埃斯顿
    // https://devblogs.microsoft.com/typescript/announcing-typescript-4-4/
  )

  override def options: Future[List[HoldOption]] = {
    storeOptions
      .getObject(EnumSyncOption.options1.entryName)
      .map(r => r.value)
      .map(r => r.getOrElse(List.empty))
  }

//  override val options: List[HoldOption] = {
//    import com.lqiong.model.symbol.codesyntax._
//    List(
//      HoldOption(
//        OrderCommand.commandBuy,
//        opt"HX2108C3300",
//        t"2021-08-04",
//        7
//      ),
//      HoldOption(
//        OrderCommand.commandBuy,
//        opt"HT2108C5000",
//        t"2021-08-04",
//        1,
//        Some(
//          t"2021-08-04"
//        )
//      ),
//      HoldOption(
//        OrderCommand.commandSell,
//        opt"HX2109P3100",
//        t"2021-08-04",
//        1,
//        Some(
//          t"2021-08-04"
//        )
//      )
//    )
//  }

  override val initialNotes: List[StockNote] = {
    NoteConfig.initialNotes
  }

  override def logics: Future[List[TradeLogic]] = {
    // 国产替代
//    val tradeLogicList = List(
//      trade code c"603218" step 1 logic "IC高景气" shots List(
//        call when t"2021-08-07" amount 100 msg "买入"
//      ),
//      trade code c"300671" step 0 logic "IC高景气",
//      trade code c"600746" step 0 logic "醋酸景气",
//      trade code c"002425" step 0 enterBy enterReason.aboveChaoDieBy(
//        50
//      ) // leave TODO
//        logic "高景气" start t"2021-07-11" enter "OKKKKk" leave "",
//      trade code c"002261" step 0 enterBy enterReason.aboveChaoDieBy(
//        50
//      ) // leave TODO
//        logic "华为工作体系注入" start t"2021-07-11" enter "OKKKKk" leave "",
//      trade code c"603232" step 0 enterBy enterReason.aboveChaoDieBy(
//        50
//      ) // leave TODO
//        logic "传媒复苏" start t"2021-07-11" enter "OKKKKk" leave "",
//      trade code c"300251" step 0 enterBy enterReason.aboveChaoDieBy(
//        50
//      ) // leave TODO
//        logic "传媒复苏" start t"2021-07-11" enter "OKKKKk" leave "",
//      trade code c"300747" leaveBy enterReason.downChaodieBy(
//        70
//      ) step 0 leaveBy enterReason.downIn3Days(), // leave TODO
//      trade code c"300747" leaveBy enterReason.downChaodieBy(
//        70
//      ) step 0 enterBy enterReason.aboveChaoDieBy(50) // leave TODO
//        logic "国产替代逻辑" start t"2021-07-11" enter "OKKKKk" leave "",
//      trade code c"601216" leaveBy enterReason.downChaodieBy(
//        70
//      ) step 0 enterBy enterReason.aboveChaoDieBy(50) // leave TODO
//        logic "半年报超预期" start t"2021-07-11" enter "OKKKKk" leave "",
//      trade code c"300212" enterBy enterReason.aboveChaoDieBy(
//        50
//      ) step 0 logic "数据湖基础软件" start t"2021-07-11" enter "OKKKKk" leave "盈利下降" shots List(
//      ),
//      trade code c"600588" enterBy enterReason.aboveChaoDieBy(
//        50
//      ) step 0 logic "saas协同效应" start t"2021-07-11" enter "OKKKKk" leave "盈利下降" shots List(
//      ),
//      trade code c"000959" leaveBy enterReason.downChaodieBy(
//        60
//      ) step 1 enterBy enterReason.aboveChaoDieBy(50) // leave TODO
//        logic "周期景气" start t"2021-06-19" enter "OKKKKk" leave "离开" shots List(
//          put when t"2021-07-02" amount 100
//        ),
//      trade code c"603529" logic "电动车" start t"2021-06-19" enter "OKKKKk" leave "离开" shots List(),
//      trade code c"002227" leaveBy enterReason.downChaodieBy(
//        60
//      ) enterBy enterReason.aboveChaoDieBy(50)
//        logic "奥特迅 新能源景气，电动车覆盖量" start t"2021-06-19" enter "OKKKKk" leave "离开" shots List(
//          put when t"2021-07-02" amount 300
//        ),
//      trade code c"002930" leaveBy enterReason.downChaodieBy(
//        60
//      ) enterBy enterReason.aboveChaoDieBy(50)
//        logic "宏川智慧,化学物品运输,逻辑需要3年" start t"2021-07-02" enter "OKKKKk" leave "离开" shots List(
//          put when t"2021-07-02" amount 200
//        ),
//      trade code c"601238" leaveBy enterReason.downChaodieBy(
//        40
//      ) enterBy enterReason.aboveChaoDieBy(50)
//        logic "新能源车，小米上来，格局变更" start t"2021-07-02" enter "OKKKKk" leave "离开" shots List(
//          put when t"2021-07-02" amount 600
//        ),
//      trade code c"603568" leaveBy enterReason.downChaodieBy(
//        40
//      ) enterBy enterReason.aboveChaoDieBy(50)
//        logic "伟明环保, 龙头，绿水清山，环保订单确保" start t"2021-07-02" enter "OKKKKk" leave "离开" shots List(
//          put when t"2021-07-02" amount 300
//        ),
//      trade code c"002455" logic "百川股份, 化工材料" start t"2021-07-04" enter "涨幅100%" leave "离开" biji Study.s603386,
//      trade code c"603567" leaveBy enterReason.downChaodieBy(
//        40
//      ) enterBy enterReason.aboveChaoDieBy(50)
//        logic "中成药" start t"2021-07-02" end t"2021-07-11" enter "OKKKKk" leave "离开" shots List(
//          put when t"2021-07-02" amount 100
//        )
//    )

    Future.successful(LogicConfig.getInitialTradeLogic(enterReason))

//    tradeLogicDurableState
//      .getObject(tradeLogicConstant)
//      .map(r => r.value)
//      .map(r => r.getOrElse(List.empty))

  }

  override def notices: Future[List[NoticeMe]] = {
    storeNotices
      .getObject(AState.noticeConfig)
      .map(r => r.value)
      .map(r => r.getOrElse(List.empty))
  }

  override def groups: List[NoticeGroup] = {
    import com.lqiong.model.order.noticesGroups._
    List(
      noticesGroup name "刘小玲 支付宝" members List(
        j"519975",
        j"519929",
        j"090007",
        j"000409",
        j"000054",
        j"008763",
        j"008763",
        j"001752",
        j"502000",
        j"515230", // 软件
        j"159852", // 软件
        j"159995"
      ),
      noticesGroup name "2022-02-14" in List(
        StarDate(
          c"002955",
          t"2022-02-14",
          Some("教学平板")
        ),
        StarDate(
          c"002955",
          t"2022-02-14",
          Some("教学平板")
        )
      ),
      noticesGroup name "TOLEARN " in List(
        StarDate(
          c"000713",
          t"2021-08-05",
          Some("原因")
        ),
        StarDate(
          c"603825",
          t"2021-08-05",
          Some("原因")
        ),
        StarDate(
          c"002667",
          t"2021-08-05"
        ),
        StarDate(
          c"002483",
          t"2021-08-05"
        ),
        StarDate(
          c"000637",
          t"2021-08-05",
          Some("也燃气")
        ),
        StarDate(
          S002978.symbol,
          t"2021-08-05",
          Some("钛白粉,航空专用")
        ),
        StarDate(
          c"000700",
          t"2021-08-05",
          Some("量很完美")
        ),
        StarDate(
          c"600468",
          t"2021-08-05",
          Some("量很完美")
        )
      ),
      noticesGroup name "海通证券" members List(
        c"603218",
        c"601218"
      ),
      noticesGroup name "2021-08-05" members List(
        c"000713"
      ),
      noticesGroup name "2021-08-04" members List(
        c"000829",
        c"002035",
        c"603565",
        c"601028",
        c"300235",
        c"300039",
        c"300247",
        c"300562",
        c"000815",
        c"000815"
      ),
      noticesGroup name "2021-08-03" members List(
        c"003012",
        c"600079",
        c"600258"
      ),
      noticesGroup name "2021-08-04" members List(
        c"003012",
        c"002946",
        c"002007",
        c"000333",
        c"300659"
      ),
      noticesGroup name "convertiable" members List(
        b"123116",
        b"113597" // 佳力图转债
      ),
      noticesGroup name "中证转债" members List(
        i"000832" // 中证转债
      ),
      noticesGroup name "current" members List(
        c"002930",
        c"601238",
        c"603568",
        c"002455"
      ),
      noticesGroup name "环保" members List(
        c"603568"
      ),
      noticesGroup name "saas" members List(
        c"600588", // 指数
        c"603232"
      ),
      noticesGroup name "yingshou" members List(
        c"300354"
      ),
      noticesGroup name "风险逻辑" members List(
        c"002724"
      ),
      noticesGroup name "镜头" members List(
        c"300691"
      ),
      noticesGroup name "USA" members List(
        u"FB"
      ),
      noticesGroup name "永辉超市" members List(
        c"601933"
      ),
      noticesGroup name "youse" members List(
        c"000630",
        c"002439",
        c"600845"
      ),
      noticesGroup name "zhengquan" members List(
        c"601377",
        c"600958"
      ),
      noticesGroup name "nongye" members List(
        c"600371",
        c"300087",
        c"300327", // 中颖电子
        c"002015", // 002015
        c"300623"
      ),
      noticesGroup name "mengchaung" members List(
        c"002988",
        c"002972",
        c"605228"
      ),
      noticesGroup name "gongye" members List(
        c"002283",
        c"002043"
      ),
      noticesGroup name "buy" members List(
        c"601238",
        c"000301",
        c"300747"
      ),
      noticesGroup name "tiyu" members List(
        c"605299",
        c"000558"
      ),
      noticesGroup name "dianli" members List(
        c"600900" // 长江电力
      ),
      noticesGroup name "line" members List(
        c"002739"
      ),
      noticesGroup name "negnyuan" members List(
        c"601877",
        c"600203"
      ),
      noticesGroup name "likuang" members List(
        c"300631", // 久吾高科
        c"600338", // 塔国明珠
        c"300573", // 兴齐眼药
        c"603127", // 兴齐眼药
        c"300759",
        c"300596",
        c"601231",
        c"600486", //
        c"000625" // 长安汽车
      ),
      noticesGroup name "fund" members List(
        j"850004"
      ),
      noticesGroup name "bank" members List(
        c"601398"
      ),
      noticesGroup name "ov" members List(
        c"603337"
      ),
      noticesGroup name "dichan" members List(
        c"002416"
      ),
      noticesGroup name "dichang" members List(
        c"600582"
      ),
      noticesGroup name "youse" members List(
        c"600459"
      ),
      noticesGroup name "baihuo" members List(
        c"002845"
      ),
      noticesGroup name "baihuo" members List(
        c"600792"
      ),
      noticesGroup name "fushi" members List(
        c"605080"
      ),
      noticesGroup name "dd" members List(
        c"600160"
      ),
      noticesGroup name "baihuo" members List(
        c"600729",
        c"600828",
        c"600827"
      ),
      noticesGroup name "teaching" members List(
        c"603799", // 华友钴业
        c"603444", // 游戏
//        c"301009",
        c"605009",
        c"300456"
      ),
      noticesGroup name "zscq" members List(
        c"002235", // 知识产权,
        c"603189",
        c"300413"
      ),
      noticesGroup name "enegy" members List(
        c"002709"
      ),
      noticesGroup name "jiankang" members List(
        c"002626"
      ),
      noticesGroup name "teaching" members List(
        c"300010" // 豆神教育
      ),
      noticesGroup name "robot" members List(
        c"603583"
      ),
      noticesGroup name "live" members List(
        c"002291" // 星期六
      ),
      noticesGroup name "live" members List(
        c"600079" // 星期六
      )
    )
  }

  // 金山文档
  // 追踪美股数据
  val backendUrlConfig = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[String]](
      JdbcDurableStateStore.Identifier
    )

  val sechdulerCommands = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[List[SchedulerCommand]]](
      JdbcDurableStateStore.Identifier
    )

  val stockNoteList = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[List[StockNoteDate]]](
      JdbcDurableStateStore.Identifier
    )

  val schedulerFlag = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[Boolean]](
      JdbcDurableStateStore.Identifier
    )

  val storeStock = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[List[StockOrder]]](
      JdbcDurableStateStore.Identifier
    )

  val storeNotices = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[List[NoticeMe]]](
      JdbcDurableStateStore.Identifier
    )

//  TradeLogic
  val tradeLogicDurableState = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[List[TradeLogic]]](
      JdbcDurableStateStore.Identifier
    )

  val storeOptions = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[List[HoldOption]]](
      JdbcDurableStateStore.Identifier
    )

  val allSymbol = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[List[LSymbol]]](
      JdbcDurableStateStore.Identifier
    )

  val spotCount = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[Int]](
      JdbcDurableStateStore.Identifier
    )

  val storeHolds = DurableStateStoreRegistry
    .get(system)
    .durableStateStoreFor[JdbcDurableStateStore[List[PortfolioGroup]]](
      JdbcDurableStateStore.Identifier
    )

  def getName = (stock: LSymbol) => s"stock2_${stock.symbolType}_${stock.getName}"

  def saveNotes(
    stock: LSymbol,
    stockNotes: List[StockNoteDate]
  ): Future[Done] = {
    logger.info("save note {}", stock)
    val name = getName(stock)
    val f1 = for {
      g <- stockNoteList.getObject(name)
      version = g.revision + 1
      d <- stockNoteList.upsertObject(name, version, stockNotes, "t123")
    } yield d
    f1
  }

  def getSchedulerFlag(): Option[Boolean] = {
    val r = Await.result(schedulerFlag.getObject("schedulerEnable"), 60.seconds)
    r.value
  }

  def getSpotCount() = {
    val f = spotCount.getObject("spotCount")
    val r = Await.result(f, 40.seconds)
    r.value.getOrElse(5001)
  }

  def fetchBackendUrl(): String = {
    retry {
      val f = backendUrlConfig.getObject("backendUrl")
      val r = Await.result(f, 40.seconds)
      logger.info("rrrr {}", r.value)
      r.value.getOrElse("")
    }
  }

  def getAllSymbol() = {
    val g1 = for {
      l <- allSymbol.getObject("allSymbol")
    } yield l.value.getOrElse(List.empty)
    Await.result(g1, 600.seconds)
  }

  def updateAllSymbol(spotCount1: List[LSymbol]) = {
    val g1 = for {
      l <- allSymbol.getObject("allSymbol")
      version = l.revision + 1
      d <- allSymbol.upsertObject(
        "allSymbol",
        version,
        spotCount1,
        "t123"
      )
    } yield d
    Await.result(g1, 60.seconds)
  }

  def updateSpotCount(spotCount1: Int) = {
    val g1 = for {
      l <- spotCount.getObject("spotCount")
      version = l.revision + 1
      d <- spotCount.upsertObject(
        "spotCount",
        version,
        spotCount1,
        "t123"
      )
    } yield d
    Await.result(g1, 60.seconds)
  }

  // scheduler
//  symbol: LSymbol
  def fetchScheduler() = {
    val f = Await.result(schedulerFlag.getObject("schedulerEnable"), 60.seconds)
    logger.info("schedulerEnable{}", f.value.toString)
  }

  def updateSchedulerFlag(isUpdate: Boolean) = {
    val g1 = for {
      l <- schedulerFlag.getObject("schedulerEnable")
      version = l.revision + 1
      d <- schedulerFlag.upsertObject(
        "schedulerEnable",
        version,
        isUpdate,
        "t123"
      )
    } yield d
    Await.result(g1, 60.seconds)
  }

  def getEventsBySymbol(symbol: LSymbol): Future[List[StockNote]] = {
    val g = stockNoteList.getObject(getName(symbol))
    g.map(r1 =>
      r1.value
        .getOrElse(List.empty[StockNoteDate])
        .map(r => {
          StockNote(
            symbol = r.symbol,
            dateTime = r.dateTime.map(r => new org.joda.time.DateTime(r)),
            eventNameOpt = r.eventNameOpt,
            descriptionOpt = r.descriptionOpt,
            url = r.url,
            levelOpt = r.levelOpt
          )
        })
    )
  }

  import order._
  def tradeOrder: List[StockOrder] = {
    val current = "5a64b57004a671179df68f93639e1fa7"
    val default = List(
      buy code c"001979" amount 600 via current quickly
//      buy code c"600497" amount 200 via current quickly,
//      buy code c"000038" amount 600 via current quickly,
//      buy code c"600876" amount 300 via current quickly,
//      buy code c"002699" amount 800 via current quickly,
    )
    default
  }

  def getHoldStock: List[PortfolioGroup] = {
    val holds = {
      List(
        PortfolioGroup(
          "contract1",
          //      buy code c"600363" amount 100 via current quickly, //华翔集团
          List(
            StockPortfolio(
              c"600363",
              100
            ),
            StockPortfolio(
              c"603167",
              400
            ),
            StockPortfolio(
              c"605258",
              100
            ),
            StockPortfolio(
              c"600308",
              300
            )
          )
        )
      )
    }
    holds
  }

  def updateNotes(): Future[Done] = {
    implicit val timeout1: Timeout = 2.hours
    val a = initialNotes.distinct
    val source: Source[StockNote, NotUsed] = Source(a)
    val f: Future[Done] = source
      .buffer(4000, OverflowStrategy.backpressure)
      .mapAsync[Done](1)(stockSymbol => {
        val f = saveNotes(
          stockSymbol.symbol,
          initialNotes
            .filter(r1 => r1.symbol == stockSymbol.symbol)
            .map(r => {
              StockNoteDate(
                symbol = r.symbol,
                dateTime = r.dateTime.map(r => r.toDate),
                eventNameOpt = r.eventNameOpt,
                descriptionOpt = r.descriptionOpt,
                url = r.url,
                levelOpt = r.levelOpt
              )
            })
        )
        f
      })
      .runWith(Sink.ignore)
    f
  }

  def updateDefaultClounds() = {
    retry {
      logger.info("getDefaultClounds")
      val default = tradeOrder

      val options = List(
        HoldOption(
          OrderCommand.commandBuy,
          opt"HX2108C3300",
          t"2021-08-04",
          7
        )
      )

      val f1 = for {
        g <- storeStock.getObject(EnumSyncOption.couldOption1.entryName)
        version = g.revision + 1
        d <- storeStock.upsertObject(
          EnumSyncOption.couldOption1.entryName,
          version,
          default,
          "t123"
        )
      } yield d

      val f2 = for {
        g <- storeOptions.getObject(EnumSyncOption.options1.entryName)
        version = g.revision + 1
        d <- storeOptions.upsertObject(
          EnumSyncOption.options1.entryName,
          version,
          options,
          "t123"
        )
      } yield d

      val f3 = for {
        g <- storeHolds.getObject(EnumSyncOption.holdOption1.entryName)
        version = g.revision + 1
        d <- storeHolds.upsertObject(
          EnumSyncOption.holdOption1.entryName,
          version,
          getHoldStock,
          "t123"
        )
      } yield d

      val f4 = for {
        g <- storeNotices.getObject(AState.noticeConfig)
        version = g.revision + 1
        d <- storeNotices.upsertObject(
          AState.noticeConfig,
          version,
          NoticeConfig.getInitialNotice,
          "t123"
        )
      } yield d

//      val f5 = for {
//        g <- tradeLogicDurableState.getObject(tradeLogicConstant)
//        version = g.revision + 1
//        d <- tradeLogicDurableState.upsertObject(
//          tradeLogicConstant,
//          version,
//          getInitialTradeLogic(),
//          "t123"
//        )
//      } yield d

      try {
        Await.result(Future.sequence(List(f1, f2, f3, f4)), 600.seconds)
      } catch {
        case NonFatal(e) =>
          logger.error("e {}", e)
      }
    }
  }

  override def clouds: Future[List[StockOrder]] = {
    storeStock
      .getObject(EnumSyncOption.couldOption1.entryName)
      .map(r => r.value)
      .map(r => r.getOrElse(List.empty))
  }

  override def holds = {
    storeHolds
      .getObject(EnumSyncOption.holdOption1.entryName)
      .map(r => r.value)
      .map(r => r.getOrElse(List.empty))
  }

  override def rules: List[String] = List(
    "says it's important",
    "big -> small",
    "强势股 -> 10日线",
    "prepare for tomorrow",
    "量区域建仓 ,等 待股价上涨",
    "r007 say flow",
    "pe is price",
    "Don't buy new lows",
    "Don't short new hight",
    "Always be patience"
  )

  override def validateOrder(): Either[Error, String] = {
    val r =
      try {
        val clouds1 = Await.result(clouds, 60.seconds)
        if (clouds1.exists(item => item.symbol.code.isEmpty)) {
          return Left(new Error("code error "))
        }
        Right("")
      } catch {
        case NonFatal(x) =>
          Left(new Error(x.toString))
      }
    r
  }

  override val optionFile: File = new File("/tmp/chaodie.png")
  override val panmingImage: File = new File("/tmp/panming.png")
  override val chaodieFile: File = new File("jep/resources/python/chaodie.py")
  val pythonVixFile: File = new File("jep/resources/python/opt.py")
  override val imageChaodieFile: File = new File("/tmp/chaodie.png")
  override val vixImageFile: File = new File("/tmp/vix.png")
  override val normalizeCodeFile: File = new File(
    "jep/resources/python/normalize_code.py"
  )
  override val panMingFile: File = new File(
    "jep/resources/python/index_down.py"
  )

  val volumeIndicatorFile: File = new File(
    "jep/resources/python/lianghua.py"
  )
}
