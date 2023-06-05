package com.lqiong.jep.option

import akka.event.LoggingAdapter
import com.github.takezoe.retry.{retry, RetryPolicy}
import com.google.inject.{Inject, Injector}
import com.lqiong.email.EmailServiceTrait
import com.lqiong.jep.claim.model.{ContinuesDataList, TradeDayLists}
import com.lqiong.jep.entry.{
  DateFormat,
  HkItem,
  LStockItem,
  LastStockPrice,
  QuantConfig,
  SparkUtil,
  TodayStockPrice
}
import com.lqiong.jep.option.cassandra.GetSparkTable
import com.lqiong.jep.selector.A.TimeSeriesSelect
import com.lqiong.model._
import com.lqiong.model.order._
import com.lqiong.shared.email.{AppConfig, PostgresqlConfig}
import com.typesafe.config.Config
import main.scala.com.a.lqiong.jep.option.StoreItem
import org.apache.spark.sql
import org.apache.spark.sql.types.DateType
import org.apache.spark.sql.{DataFrame, Dataset, SaveMode, SparkSession}
import org.joda.time.DateTime

import java.io.File
import java.util
import java.util.concurrent.Executors
import scala.collection.JavaConverters._
import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.language.postfixOps
import scala.util.Try
import scala.util.control.NonFatal

case class FundDateList1(
  date: java.sql.Date,
  price: Double,
  change_pct: Double
) {
  implicit val encodeDate = org.apache.spark.sql.Encoders.DATE
}

class ClaimDataSource @Inject() (
  val dataFrameDao: DataFrameDao,
  val jepExecutor: JepExecutor,
  val emailService: EmailServiceTrait,
  val quantConfig: QuantConfig,
  val config: Config,
  implicit val spark: SparkSession,
  val getLqiongTable: GetSparkTable,
  implicit val retryPolicy: RetryPolicy,
  val logger: LoggingAdapter,
  val appConfig: AppConfig,
  val cassandraConfig: PostgresqlConfig,
  val injector: Injector,
  val time: TimeSeriesSelect,
  val continuesDataList: ContinuesDataList
) {

  implicit val ec =
    ExecutionContext.fromExecutor(Executors.newFixedThreadPool(1))

  import net.codingwell.scalaguice.InjectorExtensions._
  lazy val tradeDay = injector.instance[TradeDayLists]

  def fetchContinue(symbol: LSymbol) = {
    logger.info("fetchContinue {}", symbol)
    continuesDataList.fetchData(symbol)
  }

  def syncTradeDay() = {
    Future {
      tradeDay.fetchData
    }
  }

  def getTradeDaysList() = {
    tradeDay.getList
  }

  lazy val lazyTradeDaysList = {
    Await.result(tradeDay.getList, 30.seconds)
  }
  lazy val lazyTradeDayList = Await.result(getTradeDaysList(), 30.seconds)

  def getCurrentTradeDays(): Future[List[DateTime]] = {
    val b2 = Future(lazyTradeDayList)
      .map(r => r.map(r => new DateTime(r.trade_date)))
      .map(rl => {
        val d1 = rl.indexWhere(r => r.isAfter(DateTime.now))
        rl.slice(0, d1)
      })
    b2
  }

  def getLatesTradeDay(): Future[DateTime] = {
    retry {
      getCurrentTradeDays().map(r => r.last)
    }
  }

  def getPreviousDay(): Future[DateTime] = {
    getCurrentTradeDays().map(l => l.takeRight(2).head)
  }

  lazy val timeA = config.getDuration("lqiong.save-limit")

  def getCodeByOptionSymbol(symbol: OptionSymbol) = {}

  def getHkItems() = {
    import spark.implicits._
    retry {
      getLqiongTable.hkSpotDateFrame.as[HkItem].collect.toList
    }
  }

  def getSwIndex() = {
    import spark.implicits._
    retry {
      getLqiongTable.sWDateFrame.as[SwBlock].collect.toList
    }
  }

  def getUsaNameList() = {
    import spark.implicits._
    retry {
      getLqiongTable.usaDateFrame.as[UsStock].collect.toList
    }
  }

  def getConvertibleBond() = {
    import spark.implicits._
    retry {
      getLqiongTable.convertibleDateFrame.as[ConvertibleBond].collect.toList
    }
  }

  def getFundNameList() = {
    logger.info("getFundNameList")
    import spark.implicits._
    logger.info("getFundNameList")
    getLqiongTable.fundNamesDateFrame.as[FundNames].collect.toList
  }

  def getForcast = {
    retry {
      val a = jepExecutor.runDateFrameByFile(
        new File("jep/resources/python/forcast.py"),
        "get_last_day_forcast_upward();"
      )
      logger.info("aaaaaa {}", a)
      a.right.get
    }
  }

  /** @param jointQuantCode
    * @return
    */

  def getVolueIndicatorDataFrame(jointQuantCode: String): DataFrame = {
    retry {
      jepExecutor
        .runJqDateFrameByFile(
          quantConfig.volumeIndicatorFile,
          s"run('$jointQuantCode')",
          convertDate = true
        )
        .right
        .get
        .na
        .drop()
    }
  }

  /** @param jointQuantCode
    * @return
    */

  def getPanMingDataFrame(jointQuantCode: String): DataFrame = {
    retry {
      jepExecutor
        .runJqDateFrameByFile(
          quantConfig.panMingFile,
          s"indexChaodie('$jointQuantCode')",
          convertDate = true
        )
        .right
        .get
        .na
        .drop()
    }
  }

//  def getVixDataSetAsync(): Future[DataFrame] = {
//    Future {
//      logger.info("getVixDataSetAsync")
//
//      val r = jepExecutor
//        .runDateFrameByFile(
//          quantConfig.pythonVixFile,
//          "get()",
//          addDate = true
//        )
//      if (r.isRight) {
//        r.right.get
//      } else {
//        logger.error("def getVixDataSet(): DataFrame = { {}", r.left)
//        spark.emptyDataFrame
//      }
//    }
//  }

  def getVixDataSet(): DataFrame = {
    val r = jepExecutor
      .runDateFrameByFile(
        quantConfig.pythonVixFile,
        "get()",
        addDate = true
      )
    if (r.isRight) {
      r.right.get
    } else {
      logger.error("  def getVixDataSet(): DataFrame = { {}", r.left)
      r.right.get
    }
  }

  def getQQLT50(): DataFrame = {
    try {
      val f: Either[Error, DataFrame] = jepExecutor
        .runDateFrameByExecImportListConvertByName(
          List(
            "import akshare as ak",
            "ak.option_50etf_qvix()"
          ),
          convertDate = Some("date")
//            Some("纳入日期")
        )
      f match {
        case Right(x) =>
          x
        case _ =>
          throw new Error("Note Ok")
      }
    } catch {
      case NonFatal(x) =>
        logger.error("xxxxxxxxx {}", x)
        spark.emptyDataFrame
    }
  }

  private def getIndexCon(simpleCodeName: String): DataFrame = {
    try {
      val f: Either[Error, DataFrame] = jepExecutor
        .runDateFrameByExecImportListConvertByName(
          List(
            "import akshare as ak",
            s"""ak.index_stock_cons("$simpleCodeName")"""
          ),
          convertDate = Some("纳入日期")
        )
      f match {
        case Right(x) =>
          x
        case _ =>
          throw new Error("Note Ok")
      }
    } catch {
      case NonFatal(x) =>
        logger.error("xxxxxxxxx {}", x)
        spark.emptyDataFrame
    }
  }

  def getIndexCodes(simpleCodeName: String): Dataset[IndexContain] = {
//    品种代码  品种名称        纳入日期
//    0    601799  星宇股份  2021-06-15
    val f: DataFrame = getIndexCon(simpleCodeName)
      .withColumnRenamed("品种代码", "code")
      .withColumnRenamed("品种名称", "name")
      .withColumnRenamed("纳入日期", "date")

    import spark.implicits._
    // 线上场景
    f.as[IndexContain]
  }

  def getKeZhuanZhai(): DataFrame = {
    retry {
      val f = jepExecutor
        .runDateFrameByExecImport(
          "import akshare as ak",
          s"""ak.bond_zh_hs_cov_spot()"""
        )
        .right
        .get
      f
    }

  }

  def fetchFundDailyPriceAs(fund: JiJinSymbol): List[ItemPrice] = {
    logger.info("fetchFundDailyPriceAs", fund)

    retry {
      val f = Try {
        import org.apache.spark.sql._
        import spark.implicits._
        implicit val e1: Encoder[(String, java.util.Date)] =
          org.apache.spark.sql.Encoders.kryo[(String, java.util.Date)]
        implicit val e = org.apache.spark.sql.Encoders.DATE
        val f1 = fetchFundDailyPrice(fund).as[FundDateList1]
        val f2 = f1
          .collectAsList()
          .map(r => ItemPrice(new DateTime(r.date), r.price))
          .toList
        f2
      }
      val f1 = f recover { case NonFatal(x) =>
        List.empty[ItemPrice]
      }
      f1.get
    }
  }

  def fetchFundDailyPrice(fund: JiJinSymbol): DataFrame = {
    logger.info("Fetch Fund daily price")
    retry {
      val f = Try {
        jepExecutor
          .runDateFrameByExecImportList(
            List(
              "import akshare as ak",
              "import pandas as pd",
              s"""df1=ak.fund_em_open_fund_info(fund="${fund.code}", indicator="单位净值走势")""",
              s"""df2=pd.to_numeric(df1["日增长率"], errors = 'coerce')""",
              s"""df3=pd.to_numeric(df1["单位净值"], errors = 'coerce')""",
              s"""df1["日增长率"]=df2""",
              s"""df1["单位净值"]=df3""",
              s"df1"
            )
          )
          .right
          .get
          .withColumnRenamed("净值日期", "date")
          .withColumnRenamed("单位净值", "price")
          .withColumnRenamed("日增长率", "change_pct")
      }

      val f1: Try[DataFrame] = f.recover { case NonFatal(x) =>
        logger.info("errror {}", x)
        spark.emptyDataFrame
      }
      val f2 = f1.toOption.get
      f2
    }
  }

  def getstock_report_disclosure(date: String = "2021半年报") = {
    retry {
      import spark.implicits._
      val f = jepExecutor
        .runDateFrameByExecImport(
          "import akshare as ak",
          s"""ak.stock_report_disclosure(market="沪深", period="$date")"""
        )
        .right
        .get
        .withColumnRenamed("股票代码", "code")
        .withColumnRenamed("股票简称", "name")
        .withColumnRenamed("首次预约", "first")
        .withColumnRenamed("初次变更", "second")
        .withColumnRenamed("二次变更", "third")
        .withColumnRenamed("三次变更", "forth")
        .withColumnRenamed("实际披露", "real")
      f.as[ReportDate]
    }
  }

  def getStockEmZtPoolStrong(date: DateTime): Dataset[Qiangshigu] = {
    retry {
      import spark.implicits._
      jepExecutor
        .runDateFrameByExecImport(
          "import akshare as ak",
          s"""ak.stock_em_zt_pool_strong(date='${DateFormat
              .getConnectedDate(date)}')"""
        )
        .right
        .get
        .as[Qiangshigu]
    }
  }

  def getPriceSince(stockSymbol: StockSymbol, date: Int = 30): Double = {
    Try {
      time
        .selectTimeSeriesSymbol(stockSymbol)
        .takeRight(date + 1)
        .headOption
        .map(r => r.close)
    }.toOption.flatten.getOrElse(0)
  }

//  def getPriceSince(jqCode: String, date: Int = 30): Double = {
//    retry {
//      import spark.implicits._
//      val f = jepExecutor
//        .runDateFrameByExecImport(
//          "from jqdatasdk import *",
//          s"""get_price('$jqCode', count=$date, end_date='${DateFormat
//            .getDay(
//              DateTime.now
//            )}', fq="pre",fields=['open','close','high','low','volume','money'])"""
//        )
//        .right
//        .get
//        .as[StockPrice]
//
//      val list = f.collectAsList()
//      if (list.size < 2) {
//        0.0
//      } else {
//        val last1 = list.takeRight(1).last.close
//        logger.info("last {}", last1)
//        val head = list.head.close
//        logger.info("head {}", head)
//        Try((last1 - head) / head)
//          .getOrElse(0.0)
//      }
//    }
//  }

//  def getPricePre(jqCode: String) = {
//    retry {
//      import spark.implicits._
//      jepExecutor
//        .runDateFrameByExecImport(
//          "from jqdatasdk import *",
//          s"""get_price('$jqCode', end_date='${DateFormat
//            .getDay(
//              DateTime.now
//            )}',count=1, fq="pre",fields=['open','close','high','low','volume','money'])"""
//        )
//        .right
//        .get
//        .as[StockPrice]
//        .take(1)
//        .headOption
//    }
//  }

  lazy final val getCodeNames: List[CodeName] = {
    retry(
      Await.result(getLqiongTable.codeNamesAsync(), 80.seconds)
    )
  }

  def getCodeNamesAsync(): Future[List[CodeName]] = {
//    Future.successful(getCodeNames)
    Future.successful(List.empty)
  }

  def v2SaveChaodie(stockSymbol: LSymbol) = {
    stockSymbol match {
      case a: StockSymbol => {
        logger.info(
          "updateChaodieInfo stock {}",
          JoinQuantName.getJq(a.code)
        )
        println(
          "updateChaodieInfo stock {}",
          JoinQuantName.getJq(a.code)
        )
        if (a.code.nonEmpty) {
          val dataset = {
            getChaodieStock(a.code)
          }
          dataset.printSchema(5)
          logger.info("dataset.collect().length data {}", dataset.collect().length)
          dataFrameDao.saveChaodie(stockSymbol, dataset)
        }
      }
      case _ => {
        logger.info("v2SaveChaodie symbol {}", stockSymbol)
      }
    }
  }

  def getChaodieStock(
    joinQuantCode: String, // joinQuant
    date: Option[DateTime] = Option.empty[DateTime]
  ): DataFrame = {
    retry {
      Thread.sleep(appConfig.requestIdle.getSeconds * 1000);
      val f = jepExecutor
        .runJqDateFrameByFile(
          quantConfig.chaodieFile,
          s"getChaodie('$joinQuantCode', '${DateFormat
              .getDay(date.getOrElse(DateTime.now))}', 400)",
          convertDate = true
        )
        .right
        .get
        .na
        .drop
      f
    }
  }

  def getNormalizeCode(code: String): Future[String] = {
    if (code == "000300") {
      Future.successful(
        "000300.XSHG"
      )
    } else if (code == "510050") {
      Future.successful(
        "510050.XSHG"
      )
    } else if (code == "000905") {
      Future.successful(
        "000905.XSHG"
      )
    } else {
      jepExecutor
        .runJqJepCodeByImport[util.List[String]](
          "from jqdatasdk import *",
          s"""normalize_code([\"$code\"])""".stripMargin
        )
        .map(r => r.right.get.asScala.head)
    }
  }

  def syncCodeName() = {
    retry {
      val a = getCodeNames1();
      if (a.isRight) {
        val dataframe: DataFrame = a.right.get
        logger.info(SparkUtil.getSummary(dataframe));
        logger.info(s"columns\n{}", dataframe.columns.toList.toString)
        dataFrameDao.saveCodeNames(a.right.get)
      } else {
        logger.error("syncCodeName err {}", a)
      }
    }
  }

  private def updateIndex(code: IndexSymbol) = {
    retry {
      val a = getIndexStock(code);
      logger.info(" a a a {}", a)
      if (a.isRight) {
        logger.info(" updateIndex{}", a)
        a.right.get.printSchema()
        dataFrameDao.saveIndexDataframe(code, a.right.get)
      } else {
        logger.error(" updateIndex err {}", a)
      }
    }
    logger.info("update Index saved {}", code)
  }

  def getAndSaveSwIndexDaily(code: SwIndexSymbol) = {
    retry {
      val f = get_sw_index_daily(code.code)
      if (f.isRight) {
        dataFrameDao.saveSwIndexDataframe(code, f.right.get)
      }
    }
  }

  def fetchSaveFundDayPrice(jijinSymbol: JiJinSymbol) = {
    retry {
      val f = fetchFundDailyPrice(jijinSymbol)
      logger.info("f {}", f)
      dataFrameDao.saveFundPriceList(f, jijinSymbol.getPriceTableName)
    }
  }
  def updateAllSymbolPrice(code: LSymbol) = {
    logger.info("saving saving updateAllSymbolPrice {}", code)
    code match {
      case a: StockSymbol => updateStockV2(a)
      case l: IndexSymbol => updateIndex(l)
      case l: JiJinSymbol => fetchSaveFundDayPrice(l)
//      case l: SwIndexSymbol => getAndSaveSwIndexDaily(l)
      case c @ _ =>
        logger.info("update price note support {}", c.code)
    }
    Thread.sleep(2000)
    logger.info("saved {}", code.code)
    println("saved {}", code.code)
  }

  def writeToPostgresql[T](
    table: String,
    dataset: Dataset[T],
    mode: SaveMode = SaveMode.Append
  ) = {
    val POSTGRESQL_FORMAT = "jdbc"

    val postgresqlSinkOptions: Map[String, String] = Map(
      "dbtable"  -> table,
      "user"     -> cassandraConfig.user, // Database username
      "password" -> cassandraConfig.password, // Database passwordPassword
      "driver"   -> "org.postgresql.Driver",
      "url" -> s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
    )

    logger.info(s"ssssss")
    logger.info(s"ssssss")
    logger.info(s"ssssss")
    logger.info(s"ssssss")
    logger.info(s"ssssss")
    logger.info(s"ssssss")
    dataset.writeStream
      .foreachBatch { (batch: Dataset[T], _: Long) =>
        batch.write
          .format(POSTGRESQL_FORMAT)
          .options(postgresqlSinkOptions)
          .mode(mode)
          .save()
      }
      .start()
      .awaitTermination()
  }

  def updateStockStream(code: StockSymbol) = {
    retry {
      logger.info("updateStock {}", code)
      val a = getDeprecatedStockAndConvert(code);
      if (a.isRight) {
        val dataframe: DataFrame = a.right.get
        logger.info(SparkUtil.getSummary(dataframe))
        logger.info(s"columns\n{}", dataframe.columns.toList.toString)

        implicit def asFiniteDuration(d: java.time.Duration) =
          scala.concurrent.duration.Duration.fromNanos(d.toNanos)

        val df1 = a.right.get

        import spark.implicits._
//        getLqiongTable.drop(code)

        getLqiongTable.dropStockSymbol(code)
        getLqiongTable.streamT1(
          code,
          df1.as[LStockItem].collectAsList().toList
        )
//          .foreach {
//          r  => {
//             dynamicQuerySchema[WeatherStation](code.getTableName)
//             getLqiongTable.insert(code, r)
//          }
//        }

//        writeToPostgresql(code.getTableName,  )

//        logger.info("time out {}", timeA)
//        Await.result(
//          dataFrameDao.saveDataframe(
//            code,
//            //        2.withColumn("date", df2("date").cast(DateType))
//          ),
//          timeA
//        )
        // TODO  calculate
      } else {
        emailService.sendEmail(s"update error code $code", a.toString)
        logger.error(s" update code $code err {}", a)
        throw new Error("error info fetch error")
      }
    }
  }

  def updateStockV2(code: StockSymbol) = {
    retry {
      logger.info("updateStock {}", code)
      val a = getDeprecatedStockAndConvert(code);
      if (a.isRight) {
        val dataframe: DataFrame = a.right.get
        logger.info(SparkUtil.getSummary(dataframe))
        logger.info(s"columns\n{}", dataframe.columns.toList.toString)

        implicit def asFiniteDuration(d: java.time.Duration) =
          scala.concurrent.duration.Duration.fromNanos(d.toNanos)

        val df1 = a.right.get

//        val df2 = df1
//          .withColumnRenamed("日期", "date")
//          .withColumnRenamed("开盘", "open")
//          .withColumnRenamed("收盘", "close")
//          .withColumnRenamed("最高", "high")
//          .withColumnRenamed("最低", "low")
//          .withColumnRenamed("成交量", "low")
//          .withColumnRenamed("换手率", "turnover")
//          .withColumnRenamed("涨跌额", "outstanding_share")
//          .drop("振幅")

//             开盘                                成交额    振幅   涨跌幅   涨跌额   换手率
//        0     2017-03-01   8.65   8.65   8.71   8.63   346994  3.301580e+08  0.93  0.12  0.01  0.21
//        1     2017-03-02   8.67   8.59   8.70   8.58   403629  3.823959e+08  1.39 -0.69 -0.06  0.24
//        2     2017-03-03   8.57   8.56   8.59   8.52   342655  3.219525e+08  0.81 -0.35 -0.03  0.20
//        3     2017-03-06   8.56   8.61   8.62   8.55   404511  3.812123e+08  0.82  0.58  0.05  0.24

        Await.result(
          dataFrameDao.saveDataframe(
            code,
            df1
          ),
          timeA
        )
        // TODO  calculate
      } else {
        emailService.sendEmail(s"update error code $code", a.toString)
        logger.error(s" update code $code err {}", a)
        throw new Error("error info fetch error")
      }
    }
  }

  def updateStock(code: StockSymbol) = {
    retry {
      logger.info("updateStock {}", code)
      val a = getDeprecatedStockAndConvert(code);
      if (a.isRight) {
        val dataframe: DataFrame = a.right.get
        logger.info(SparkUtil.getSummary(dataframe))
        logger.info(s"columns\n{}", dataframe.columns.toList.toString)

        implicit def asFiniteDuration(d: java.time.Duration) =
          scala.concurrent.duration.Duration.fromNanos(d.toNanos)

        Await.result(
          dataFrameDao.saveDataframe(code, a.right.get),
          timeA
        )
        // TODO  calculate
      } else {
        emailService.sendEmail(s"update error code $code", a.toString)
        logger.error(s" update code $code err {}", a)
        throw new Error("error info fetch error")
      }
    }
  }

  def getIndexStockNames(): Either[Error, sql.DataFrame] = {
    retry {
      jepExecutor.runDateFrameByExecImport(
        "import akshare as ak",
        s"""ak.stock_zh_index_spot()""".stripMargin
      )
    }
  }

  def getCodeNames1(): Either[Error, sql.DataFrame] = {
    retry {
      jepExecutor.runDateFrameByExecImport(
        "import akshare as ak",
        s"""ak.stock_info_a_code_name()""".stripMargin
      )
    }
  }

  def getCodeNames2(): Dataset[StoreItem] = {
    import spark.implicits._
    getCodeNames1().right.get.as[StoreItem]
  }

//  /** get jq codes
//    * @param codes
//    * @return
//    */
//  def getStockList(codes: List[LSymbol]): Either[Error, sql.DataFrame] = {
//    retry {
//      jepExecutor.runDateFrameByExecImport(
//        "from jqdatasdk import *",
//        s"""get_price([${getNormalizeCodesBySymbol(codes)
//          .map(r => s"'$r'")
//          .mkString(",")}], end_date='${DateFormat.getDay(
//          DateTime.now
//        )}',count=1)"""
//      )
//    }
//  }

  def getIndexStock(code: IndexSymbol): Either[Error, sql.DataFrame] = {
    logger.info(s"simple ${code.getSimpleName}")
    retry {
      jepExecutor.runDateFrameByExecImportList(
        List(
          "import akshare as ak",
          s"""ak.stock_zh_index_daily(symbol="${code.getSimpleName}")""".stripMargin
        ),
        convertDate = Some("date")
      )
    }
  }

  def getStock(code: StockSymbol): Either[Error, sql.DataFrame] = {
    retry {
      jepExecutor.runDateFrameByExecImport(
        "import akshare as ak",
        s"""ak.stock_zh_a_daily(symbol="${code.getSimpleName}", start_date="${DateFormat
            .getDay(DateTime.now.minusYears(3))}", adjust="qfq")""".stripMargin
      )
    }
  }

  def getDeprecatedStockAndConvert(
    code: StockSymbol
  ): Either[Error, sql.DataFrame] = {
//    ak.stock_zh_a_hist(symbol = "000001", start_date = "20170301", end_date =
//    '20210907
//    ', adjust = "qfq"
//    )
    retry {
      val d1 = jepExecutor.runDateFrameByExecImportListConvert(
        List(
          "import akshare as ak",
          s"""ak.stock_zh_a_hist(symbol="${code.code}", start_date="${DateFormat
              .getDay(DateTime.now.minusYears(1))}", adjust="qfq")""".stripMargin
        ),
        convertDate = false
      )
//
//      date: java.sql.Timestamp,
//      open: Double,
//      close: Double,
//      high: Double,
//      low: Double,
//      volume: Double,
//      turnover: Double,
//      outstanding_share: Double

      if (d1.isRight) {
        val df2 = d1.right.get
          .withColumnRenamed("日期", "date")
          .withColumnRenamed("开盘", "open")
          .withColumnRenamed("收盘", "close")
          .withColumnRenamed("最高", "high")
          .withColumnRenamed("最低", "low")
          .withColumnRenamed("成交量", "volume")
          .withColumnRenamed("换手率", "turnover")
          .withColumnRenamed("成交额", "outstanding_share")
          .drop("振幅")
          .drop("涨跌幅")
          .drop("成交额")
          .drop("涨跌额")

        val df4 = df2.withColumn("date", df2("date").cast(DateType))
        Right(df4)
      } else {
        d1
      }
    }
  }

//  def getDeprecatedStockAndConvert(code: StockSymbol): Either[Error, sql.DataFrame] = {
//    retry {
//      jepExecutor.runDateFrameByExecImportListConvert(
//        List(
//          "import akshare as ak",
//          s"""ak.stock_zh_a_daily(symbol="${code.getSimpleName}", start_date="${DateFormat
//            .getDay(DateTime.now.minusYears(3))}", adjust="qfq")""".stripMargin
//        ),
//        convertDate = true
//      )
//    }
//  }

  def getAStockSpot(): Either[Error, sql.DataFrame] = {
    retry {
      jepExecutor.runDateFrameByExecImport(
        "import akshare as ak",
        s"""ak.stock_zh_a_spot()""".stripMargin
      )
    }
  }

  def getAStockEmSpot() = {
    val tradeDay = getLatesTradeDay()
    val f = jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      s"""ak.stock_zh_a_spot_em()""".stripMargin
    )
    val list = f match {
      case Right(a) => {
        import spark.implicits._
        val toDropColumsn = a.columns.toList.filter(r =>
          !List("代码", "最新价", "今开", "最高", "最高", "最低", "成交量").contains(r)
        )

        val d = a
          .drop(toDropColumsn: _*)
          .withColumnRenamed("最新价", "close")
          .withColumnRenamed("代码", "code")
          .withColumnRenamed("最新价", "close")
          .withColumnRenamed("今开", "open")
          .withColumnRenamed("最高", "high")
          .withColumnRenamed("最低", "low")
          .withColumnRenamed("成交量", "volume")

        d.show(5)

        d
          .as[TodayStockPrice]
          .collectAsList()
          .toList
      }
      case _ => {
        List.empty[TodayStockPrice]
      }
    }
    LastStockPrice(
      Await.result(tradeDay, 3.minutes),
      list.map(r => r.copy(code = s"xx${r.code}"))
    )
  }

//  import akshare as ak
//    stock_zh_a_spot_df = ak.stock_zh_a_spot()

//  def getWeb: List[String] = {
//    sharedInterpreter.exec("import akshare as ak");
//    val a: util.ArrayList[String] = sharedInterpreter.getValue(
//      """
//        |ak.weibo_index(word="期货", time_type="3month")
//        |""".stripMargin,
//      classOf[java.util.ArrayList[String]]
//    )
//    println(a)
//    a.asScala.toList
//  }

  //  import akshare as ak
  //  option_sina_sse_expire_day_df = ak.option_sina_sse_expire_day(trade_date="202002", symbol="50ETF", exchange="null")
  //  print(option_sina_sse_expire_day_df)

  def get50Months: List[DateTime] = {
    val a = jepExecutor.runDateFrameList(
      List(
        "import akshare as ak",
        """
          |ak.option_sina_sse_list(symbol="50ETF", exchange="null")
          |""".stripMargin
      )
    )

    a.map(r => r.map(r => DateFormat.parseyyyyMM(r)).toList)
      .getOrElse(List.empty[DateTime])
  }

//  510050
  def get_option_sina_sse_codes(
    productName: OptionProductName,
    month: DateTime
  ): Either[Error, (util.ArrayList[String], util.ArrayList[String])] = {

    val name =
      if (productName == OptionProductName.HT300) "510300" else "510050"

    val f = jepExecutor.runDateFrameTuple(
      List(
        "import akshare as ak",
        s"""a1 = ak.option_sina_sse_codes(trade_date="${DateFormat
            .getMonth_yyyyMM(month)}", underlying="$name")""",
        s"""left = a1[0]""",
        s"""right = a1[1]""",
        "[left,right]"
      )
    )

    f
  }

  //  华夏上证50ETF期权	金融期权	上海证券交易所	2015-02-09
  //  华泰柏瑞沪深300ETF期权	金融期权	上海证券交易所	2019-12-23
  //  嘉实沪深300ETF期权	金融期权	深圳证券交易所	2019-12-23
  //  沪深300股指期权	金融期权	中国金融期货交易所	2019-12-23

  def get_option_finance_board(date: DateTime, symbol: OptionProductName) = {
    jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      s"""ak.option_finance_board(symbol="${symbol.value}", end_month="${DateFormat
          .getMonth_yyyyMM(date)}")"""
    )
  }

  def getNorthPriceIn(period: String, priceInType: OptionBkName) = {
    jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      s"""ak.stock_em_hsgt_board_rank(symbol="${priceInType.value}", indicator="$period").sort_values(by='最新涨跌幅', ascending=False)""".stripMargin
    )
  }

  def getStockHkSpot() = {
    jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      "ak.stock_hk_spot()"
    )
  }

  def getOpenFundDaily() = {
    jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      "ak.fund_em_open_fund_daily()"
    )
  }

  def getFundNames() = {
    jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      "ak.fund_em_fund_name()"
    )
  }

  def getUsStock() = {
    jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      "ak.get_us_stock_name()"
    )
  }

  def get_sw_index_spot() = {
    jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      s"""ak.sw_index_spot()"""
    )
  }

  def get_car_cpca_energy_sale() = {
    retry {
      val r = jepExecutor.runDateFrameByExecImport(
        "import akshare as ak",
        s"""ak.car_cpca_energy_sale()"""
      )
      r.right.get
    }
  }

  // some
  def get_option_sina_sse_daily(code: String) = {
    jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      s"""ak.option_sina_sse_daily(code="$code")"""
    )
  }

  def option_sina_sse_greeks(code: String) = {
    jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      s"""ak.option_sina_sse_greeks(code="$code")"""
    )
  }

  def get_sw_index_daily(code: String, date: DateTime = DateTime.now) = {
    jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      s""" ak.sw_index_daily(index_code="$code", start_date="2018-12-01", end_date="${DateFormat
          .getDay(date)}")"""
    )
  }

//  case class CaseClass (时间: String,价格: String,成交: String,持仓: String,均价: String)

  def get_option_sina_sse_minute(code: String) = {
    jepExecutor.runDateFrameByExecImport(
      "import akshare as ak",
      s"""ak.option_sina_sse_minute(code="$code").drop(columns=['日期'])"""
    )
  }

//  def get_option_sina_finance_minute(code: String) = {
//    sharedInterpreter.exec("import akshare as ak");
//    sharedInterpreter.exec(s"""
//         |df1=ak.option_sina_finance_minute(code="$code")
//         |""".stripMargin);
//    dataFrameDao.toDataFrame("df1")
//  }

  //  _df - [期权合约简称,300ETF沽3月4900]
  //    INFO  dataFrameDao_option_sina_sse_greeks_df - [成交量,0]

//  def getVega(code: String): VegaOption = {
//    sharedInterpreter.exec("import akshare as ak");
//    sharedInterpreter.exec(s"""
//         |option_sina_sse_greeks_df = ak.option_sina_sse_greeks(code="$code")
//         |""".stripMargin);
//    val dateFrame = dataFrameDao.toDataFrame("option_sina_sse_greeks_df")
//
//    val shortName = dateFrame.collect()(0).getString(1)
//    val volume = dateFrame.collect()(1).getString(1)
//    val delta = dateFrame.collect()(2).getString(1)
//    val gamma = dateFrame.collect()(3).getString(1)
//    val theta = dateFrame.collect()(4).getString(1)
//    val vega = dateFrame.collect()(5).getString(1)
//
//    VegaOption(
//      shortName = shortName,
//      delta = delta.toDouble,
//      volume = volume.toDouble,
//      vega = vega.toDouble,
//      theta = theta.toDouble,
//      gamma = gamma.toDouble
//    )
//    //    logger.info(shortName.toString)
//    //
//    ////    VegaOption
//    //
//    //    dateFrame
//
//    //    s_df - [期权合约简称,300ETF沽3月4900]
//    //   INFO  dataFrameDao_option_sina_sse_greeks_df - [成交量,0]
//    //    import akshare as ak
//    //      option_sina_finance_minute_df = ak.option_sina_finance_minute(code="10002415")
//    //    print(option_sina_finance_minute_df)
//
//    //    字段                  值
//    //      0   期权合约简称       50ETF购2月2500
//    //      1      成交量                626
//    //    2    Delta                  1
//    //    3    Gamma                  0
//    //    4    Theta               -0.1
//    //    5     Vega                  0
//    //    6    隐含波动率             0.0008
//    //    7      最高价             0.4799
//    //    8      最低价             0.4477
//    //    9     交易代码  510050C2002M02500
//    //      10     行权价             2.5000
//    //    11     最新价             0.4550
//    //    12    理论价值             0.4591
//    //
//  }
  //  import akshare as ak
  //  option_finance_board_df = ak.option_finance_board(symbol="嘉实沪深300ETF期权", end_month="2003")
  //  print(option_finance_board_df)

  //  import akshare as ak
  //  option_sina_sse_codes_df = ak.option_sina_sse_codes(trade_date="202002", underlying="510300")
  //  print(option_sina_sse_codes_df)

//  def getContractListByCode(code: String): List[String] = {
//    sharedInterpreter.exec("import akshare as ak");
//    val a = sharedInterpreter.getValue(s"""
//         |ak.option_sina_sse_codes(trade_date="$code", underlying="510300")
//         |""".stripMargin)
//    //    UnmodifiableRandomAccessList
//    //    val a2: util.List[_ <: util.ArrayList[String]] => util.List[util.ArrayList[String]] = java.util.Collections.unmodifiableList[util.ArrayList[String]]
//    val a1 = Collections.unmodifiableList(
//      a.asInstanceOf[util.List[_ <: util.ArrayList[String]]]
//    )
//    a1.get(0).asScala.toList // 合约
//    a1.get(1).asScala.toList // 合约
//  }

  //  import akshare as ak
  //  option_sina_sse_list_df = ak.option_sina_sse_list(symbol="50ETF", exchange="null")
  //  print(option_sina_sse_list_df)

  def getVegaOptionContractNum(code: String) = {
    retry {
      getLqiongTable.getVegaOptionContractNum(code)
    }
  }

}
