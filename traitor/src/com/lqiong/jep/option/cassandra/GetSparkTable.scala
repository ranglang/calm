package com.lqiong.jep.option.cassandra

import akka.actor.ActorSystem
import akka.event.LoggingAdapter
import akka.{Done, NotUsed}
import cats.conversions.all.autoWidenFunctor
import com.github.takezoe.retry.{RetryPolicy, retry}
import com.google.inject.Inject
import com.lqiong.jep.entry.{DateFormat, LStockItem, QuillEncoder, TodayStockPrice}
import com.lqiong.jep.option._
import com.lqiong.model.StockSymbol
import com.lqiong.shared.email.PostgresqlConfig
import io.getquill.{PostgresAsyncContext, SnakeCase}
import org.apache.spark.sql.SparkSession
import org.joda.time.DateTime

import java.sql.Timestamp
import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.control.NonFatal

case class VIxDateTime(date: DateTime, vix: String)

case class VIx(date: String, vix: String)

class GetSparkTable @Inject() (
  implicit val spark: SparkSession,
  val cassandraConfig: PostgresqlConfig,
  implicit val ex: ExecutionContext,
  implicit val policy: RetryPolicy,
  implicit val system: ActorSystem,
  val logger: LoggingAdapter
) {

  val db = retry {
    new PostgresAsyncContext(SnakeCase, "ctx") with QuillEncoder
  }

  import db._

  def shutdownSpark() = {
    spark.stop()
  }

  def executeSQL(url: String) = {
    try {
      try {
        logger.info("excuting sql {} ", url)
        db.probe(url)

        logger.info("excutted {}", url);
//          Await.result(db.executeAction(url), 3.minutes)
      } catch {
        case NonFatal(x) => {
          logger.error("execute sql dbtable {}", x)
          throw new Error("create sql error")
        }
      }
    } catch {
      case NonFatal(x) =>
        logger.error("ee executeSQL {}", x)
    }
  }

//  def earnRateList(): List[KeyValueOptionValue] = {
//    retry {
//      val a: CassandraTableScanRDD[KeyValueOptionValue] = {
//        spark.sparkContext
//          .cassandraTable[KeyValueOptionValue](
//            cassandraConfig.database,
//            "earnrate"
//          )
//      }
//      a.collect().toList
//    }
//  }

  def getStockDateFrame(stock: StockSymbol) = {
    retry {
      val a = spark.read
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", stock.getTableName)
        .load()
      a
    }
  }

  def hkSpotDateFrame = {
    retry {
      val a = spark.read
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.hkSpot)
        .load()
      a
    }
  }

  def convertibleDateFrame = {
    retry {
      val a = spark.read
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.convertible_bond)
        .load()
      a
    }
  }

  def sWDateFrame = {
    retry {
      val a = spark.read
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.sw_index)
        .load()
      a
    }
  }

  def usaDateFrame = {
    retry {
      val a = spark.read
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.usStockName)
        .load()
      a
    }
  }

  def optionListDateframe = {
    retry {
      val a = spark.read
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.option_list)
        .load()
      a
    }
  }

  def fundNamesDateFrame = {
    retry {
      val a = spark.read
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.fundNamesTableName)
        .load()
      a
    }
  }

  def getOptionsListDateFrame = {
    retry {
      val a = spark.read
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.option_list)
        .load()
      a
    }
  }

  def codeNameDataFrame = {
    retry {
      val a = spark.read
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.codenames)
        .load()
      a
    }
  }

  def asyncCodeNames(): Future[List[CodeName]] = {
    retry {
      val r1 = dynamicQuerySchema[CodeName](TableNames.codenames)
      val result: Future[List[CodeName]] = db
        .run(r1)
        .map(r => r.toList)
      result
    }
  }

  def codeNamesAsync(): Future[List[CodeName]] = {
    retry {
      val r1 = dynamicQuerySchema[CodeName](TableNames.codenames)
      val result: Future[List[CodeName]] = db
        .run(r1)
        .map(r => r.toList)
      result
    }
  }
//  def codeNames(): List[CodeName] = {
//    retry {
//      val r1 = dynamicQuerySchema[CodeName](TableNames.codenames)
//      val result: Future[List[CodeName]] = db
//        .run(r1)
//        .map(r => r.toList)
//      logger.info("code names {}", r1)
//      Await.result(result, 200.seconds)
////      val a: CassandraTableScanRDD[CodeName] = {
////        spark.sparkContext
////          .cassandraTable[CodeName](cassandraConfig.cassandraKeyspace, "codenames")
////          .select("code", "name")
////      }
////      a.collect().toList
//    }
//  }

  def vixTable(): List[VIx] = {
    List.empty[VIx]
//    retry {
//      val a: CassandraTableScanRDD[VIx] = {
//        spark.sparkContext
//          .cassandraTable[VIx](
//            cassandraConfig.database,
//            TableNames.vixs
//          )
//          .select("date", "vix")
//      }
//      a.limit(1000).collect().toList
//    }
  }

  def insertDateFuture(
    stockSymbol: StockSymbol,
    date: DateTime,
    price: TodayStockPrice
  ): Future[RunActionResult] = {
    //    date: java.sql.Timestamp,
    //    open: String,
    //    close: String,
    //    high: String,
    //    low: String,
    //    volume: String,
    //    turnover: String,
    //    outstanding_share: String

    val currentPrice = LStockItem(
      date = new Timestamp(DateFormat.fromString(DateFormat.getDay(date)).getMillis),
      open = price.open,
      close = price.close,
      high = price.high,
      low = price.low,
      volume = price.volume,
      turnover = 0.0, //
      outstanding_share = 0.0
    )

    logger.info("handling {}", stockSymbol.getTableName)
    val name: String = stockSymbol.getTableName

    //    INSERT INTO Product AS t (id,sku) VALUES (1, 10) ON CONFLICT (id) DO UPDATE SET sku = (t.sku + EXCLUDED.sku)

    //    date: java.sql.Timestamp,
    //    open: Double,
    //    close: Double,
    //    high: Double,
    //    low: Double,
    //    volume: Double,
    //    turnover: Double,
    //    outstanding_share: Double
    //        .insert(_.date ->  currentPrice.date)
    //        .insert(_.date -> currentPrice.date)
    //        .onConflictUpdate(_.id)
    //      .insert(lift(currentPrice))

    val selectGroupsByUser =
      s"CREATE TABLE IF NOT EXISTS ${stockSymbol.getTableName} (date timestamp PRIMARY KEY, open float8, high float8, low float8, close float8, volume float8, outstanding_share float8, turnover float8)"

    db.probe(selectGroupsByUser)

    //    date = new Timestamp(DateFormat.fromString(DateFormat.getDay(date)).getMillis),
    //    open = price.open,
    //    close = price.close,
    //    high = price.high,
    //    low = price.low,
    //    volume = price.volume,
    //    turnover = "0", //
    //    outstanding_share = "0"
    //    val a = DateFormat.getDay(new DateTime(currentPrice.date.getTime))
    //    val rawQuery = quote {
    //  (id: WeatherStation, time: String) => infix"""INSERT INTO ${lift(name)} (date, open, close, high, low,volume, turnover, outstanding_share) values ('${time}', ${id.open}, ${id.close}, ${id.high}, ${id.low}, ${id.volume}, ${id.turnover}, ${id.outstanding_share});""".as[Action[Long]]
    // };

    //    cqlsh> INSERT INTO cycling.cyclist_name (id, lastname, firstname) VALUES (5b6962dd-3f90-4c93-8f61-eabfa4a803e2, 'VOS','Marianne');
    //    println(quote(rawQuery(lift(currentPrice), lift(name), lift(a))))

    val f2 = for {
      r1 <- db.run(
        dynamicQuerySchema[LStockItem](name)
          .filter(r => r.date == lift(currentPrice.date))
          .take(1)
      )
      l <- {
        if (r1.isEmpty) {
          logger.info("xxxxxx ")
          val circles = dynamicQuerySchema[LStockItem](name)
            .insertValue(currentPrice)
            .onConflictIgnore
          db.run(circles)
        } else {
          logger.info("xxxxxx22222222222222 ")
          implicit val personUpdateMeta = updateMeta[LStockItem](_.date)
          val circles = dynamicQuerySchema[LStockItem](name)
            .filter(_.date == lift(currentPrice.date))
            .updateValue(currentPrice)
          db.run(circles)
        }
      }
    } yield l
    f2
  }

  def insertDate(
    stockSymbol: StockSymbol,
    date: DateTime,
    price: TodayStockPrice
  ): Unit = {
    //    date: java.sql.Timestamp,
    //    open: String,
    //    close: String,
    //    high: String,
    //    low: String,
    //    volume: String,
    //    turnover: String,
    //    outstanding_share: String

    val currentPrice = LStockItem(
      date = new Timestamp(DateFormat.fromString(DateFormat.getDay(date)).getMillis),
      open = price.open,
      close = price.close,
      high = price.high,
      low = price.low,
      volume = price.volume,
      turnover = 0.0, //
      outstanding_share = 0.0
    )

    logger.info("handling {}", stockSymbol.getTableName)
    val name: String = stockSymbol.getTableName

//    INSERT INTO Product AS t (id,sku) VALUES (1, 10) ON CONFLICT (id) DO UPDATE SET sku = (t.sku + EXCLUDED.sku)

//    date: java.sql.Timestamp,
//    open: Double,
//    close: Double,
//    high: Double,
//    low: Double,
//    volume: Double,
//    turnover: Double,
//    outstanding_share: Double
//        .insert(_.date ->  currentPrice.date)
//        .insert(_.date -> currentPrice.date)
//        .onConflictUpdate(_.id)
//      .insert(lift(currentPrice))

    val selectGroupsByUser =
      s"CREATE TABLE IF NOT EXISTS ${stockSymbol.getTableName} (date timestamp PRIMARY KEY, open float8, high float8, low float8, close float8, volume float8, outstanding_share float8, turnover float8)"

    db.probe(selectGroupsByUser)

//    date = new Timestamp(DateFormat.fromString(DateFormat.getDay(date)).getMillis),
//    open = price.open,
//    close = price.close,
//    high = price.high,
//    low = price.low,
//    volume = price.volume,
//    turnover = "0", //
//    outstanding_share = "0"
//    val a = DateFormat.getDay(new DateTime(currentPrice.date.getTime))
//    val rawQuery = quote {
//  (id: WeatherStation, time: String) => infix"""INSERT INTO ${lift(name)} (date, open, close, high, low,volume, turnover, outstanding_share) values ('${time}', ${id.open}, ${id.close}, ${id.high}, ${id.low}, ${id.volume}, ${id.turnover}, ${id.outstanding_share});""".as[Action[Long]]
//};

//    cqlsh> INSERT INTO cycling.cyclist_name (id, lastname, firstname) VALUES (5b6962dd-3f90-4c93-8f61-eabfa4a803e2, 'VOS','Marianne');
//    println(quote(rawQuery(lift(currentPrice), lift(name), lift(a))))

    val f2 = for {
      r1 <- db.run(
        dynamicQuerySchema[LStockItem](name)
          .filter(r => r.date == lift(currentPrice.date))
          .take(1)
      )
      l <- {
        if (r1.isEmpty) {
          logger.info("xxxxxx ")
          val circles = dynamicQuerySchema[LStockItem](name)
            .insertValue(currentPrice)
            .onConflictIgnore
          db.run(circles)
        } else {
          logger.info("xxxxxx22222222222222 ")
          implicit val personUpdateMeta = updateMeta[LStockItem](_.date)
          val circles = dynamicQuerySchema[LStockItem](name)
            .filter(_.date == lift(currentPrice.date))
            .updateValue(currentPrice)
          db.run(circles)
        }
      }
    } yield l
    val re = Await.result(f2, 200.seconds)

    logger.info("akk {}", re)

    logger.info("akk {}", re)
  }
////
//    retry {
//      val a = quote(cardListSchema.insert(lift(currentPrice)))
//      val f = db.run(a)
//      Await.result(f, 30.seconds)
//    }
//  }

  def insertMedium(list: MediumItem): Unit = {
    val d =
      """CREATE TABLE IF NOT EXISTS zhongweishu( date timestamp CONSTRAINT pk_zhongweishu PRIMARY KEY, value float);""".stripMargin
    db.probe(d)

    logger.info("item");
    val a = quote {
      querySchema[MediumItem]("zhongweishu")
        .insert(lift(list))
        .onConflictUpdate(_.date)(_.value -> _.value)
//        .onConflictUpdate(_.date)((t,e) => t.value -> (t.value))
    }

    logger.info("xxs {}", a.toString())
//    logger.info("xxx {}", db.);
    Await.result(
      db.run(a),
      1.minutes
    )
  }

  def insertcar_cpca_energy_saleList(list: List[MovieTime]): Unit = {
    val d =
      """CREATE TABLE IF NOT EXISTS car_cpca_energy_sale(date timestamp CONSTRAINT constraint_name PRIMARY KEY, value float);""".stripMargin
    db.probe(d)

    implicit val personUpdateMeta = updateMeta[MovieTime](_.date)

    logger.info("item");
    val a = quote {
      liftQuery(list).foreach(e =>
        querySchema[MovieTime]("car_cpca_energy_sale")
          .insert(_.date -> e.date, _.value -> e.value)
          .onConflictUpdate(_.date)(_.value -> _.value)
      )
    }

    Await.result(
      db.run(a),
      200.seconds
    ) // : List[Long] size = 2. Contains 1 @ positions, where row was inserted E.g List(1,1)
    // INSERT INTO Person (id,name,age) VALUES (?, ?, ?)

//    val a = quote(query[VegaOption].insert(lift(item)).onConflictIgnore)
//    val f = db.run(a)
//    Await.result(f, 30.seconds)
  }

  def insertVegaOption(item: VegaOption): Unit = {
    retry {
      val a = quote(query[VegaOption].insert(lift(item)).onConflictIgnore)
      val f = db.run(a)
      Await.result(f, 200.seconds)
    }
  }

  def getVegaOptionContractNum(code: String): Option[VegaOption] = {
    retry {
      val a = quote(query[VegaOption].filter(r => r.code == lift(code)).take(1))
      val result: Future[Option[VegaOption]] = db
        .run(a)
        .map(r => r.headOption)

      Await.result(result, 200.seconds)
    }

  }

  def dropStockSymbol(name: StockSymbol) = {

    val dropTable =
      s"DROP TABLE IF EXISTS ${name.getTableName}"

    executeSQL(dropTable)

    val selectGroupsByUser =
      s"CREATE TABLE IF NOT EXISTS ${name.getTableName} (date timestamp PRIMARY KEY, open Text, high text, low text, close text, volume text, outstanding_share text, turnover text)"
    executeSQL(selectGroupsByUser)
  }

  def streamT(stock: StockSymbol, data: List[LStockItem]): Unit = {

    logger.info("data \n\n xxxxxx {}", data)
    import akka.stream._
    import akka.stream.scaladsl._
    val source: Source[LStockItem, NotUsed] = Source(data)
    val f: Future[Done] = source
      .buffer(2000, OverflowStrategy.backpressure)
      .runWith(Sink.foreachAsync(1)(author => insert(stock, author)))
    Await.result(f, 300.seconds)
  }

  def insert(stockSymbol: StockSymbol, w: LStockItem): Future[Unit] = {
    logger.info("w {}", w)
    val r1 = dynamicQuerySchema[LStockItem](stockSymbol.getTableName)
    db.run(r1.insertValue(w)).map(_ => ())
  }

//  def insert1(circles: List[WeatherStation], codeNaem: String) = {
//      quote {
//        liftQuery(circles).foreach(data => personSchemaMeta.insertValue(data))
//      }
//  }

  def streamT1(stock: StockSymbol, data: List[LStockItem]): Future[Unit] = {
    val name: String = stock.getTableName
    implicit val personSchemaMeta = dynamicQuerySchema[LStockItem](name)
//    val  name= quote(name1)
    data.foreach { item =>
      db.run(personSchemaMeta.insertValue(item))
    }
//    }
//
//
    Future.successful(())
  }
}
