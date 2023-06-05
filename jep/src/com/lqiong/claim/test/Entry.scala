//package com.lqiong.claim.test
//
//import akka.actor.ActorSystem
//import akka.event.LoggingAdapter
//
//import scala.concurrent.duration._
//import com.github.takezoe.retry.{LinerBackOff, RetryPolicy}
//import com.lqiong.jep.entry.{DateFormat, EnterReason, QuantConfig, QueryTable}
//import com.lqiong.jep.option.JepExecutor
//import com.lqiong.shared.email.PostgresqlConfig
//import com.outworkers.phantom.Manager.logger
//import com.typesafe.config.ConfigFactory
//import org.apache.log4j.{Level, Logger}
//import org.apache.spark.sql.SparkSession
//import org.joda.time.DateTime
//
//import java.io.File
//import java.util
//import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`
//import scala.concurrent.ExecutionContext
//import scala.reflect.internal.FatalError
//import scala.util.control.NonFatal
//
//object Entry extends App {
//
//  val config = ConfigFactory.load()
//
//  lazy val spark: SparkSession = SparkSession
//    .builder()
//    .appName("Spark SQL basic example")
//    .config("spark.master", "local")
//    .config("spark.rpc.message.maxSize", "256")
//    .config("spark.driver.memory", "3000m")
//    .config("spark.executor.memory", "3000m")
//    .config("spark.log-level", "WARN") // TODO update error
//    //      .config("spark.task.cpus", 3)
//    //      .config("spark.executor.cores", 1)
//    //      .config("spark.executor.instances", 2)
//    //      .config("spark.dynamicAllocation.maxExecutors", 2)
//    //      .config("spark.cassandra.connection.ssl.enabled", "true")
//    //      .config("spark.cassandra.connection.ssl.trustStore.path", config.cassandraTruststorePath)
//    //      .config("spark.cassandra.connection.ssl.trustStore.password", config.cassandraTruststorePassword)
//    .getOrCreate()
//
//  spark.sparkContext.setLogLevel("WARN")
//  Logger.getLogger("org.apache.spark").setLevel(Level.WARN)
//  Logger.getLogger("org.spark-project").setLevel(Level.WARN)
//
//  val actorSystem = ActorSystem("actor")
//  def test() = {
//
////    implicit val queryTable: QueryTable,
////    implicit val ex: ExecutionContext,
////    implicit val retry1: RetryPolicy,
////    val logger: LoggingAdapter
////    lazy val stockImpl1 = new StockImpl1()
////    lazy val enterReason = new EnterReason()(stockImpl1)
////    lazy val quantConfig = new QuantConfig(enterReason)
////
////    Logger.getLogger("org").setLevel(Level.WARN)
////
////    lazy val retryPolicy = RetryPolicy(
////      maxAttempts = 5,
////      retryDuration = 10.seconds,
////      backOff = LinerBackOff, // default is FixedBackOff
////      jitter = 20.seconds // default is no jitter
////    )
////
////    val jepExecutor = new JepExecutor()(
////      spark,
////      retryPolicy,
////      actorSystem.log,
////      true
////    )
////
////    def checkIfTrue(a: Boolean) = {
////      if (!a) {
////        logger.error("not right")
////        throw FatalError("ERROR")
////      }
////    }
////
////    def checkIfTime(a: Option[DateTime]) = {
////      if (a == null) {
////        logger.info("checking {}", a)
////        logger.error("not right")
////        throw FatalError("ERROR")
////      }
////    }
////
////    /** check option
////      */
////    quantConfig.options.reduce((item, p) => {
////      checkIfTrue(
////        item.option.code.nonEmpty
////      )
////      item
////    })
////
////    quantConfig.notes.reduce((item, p) => {
////      checkIfTrue(item.symbol.code.nonEmpty)
////      checkIfTime(item.dateTime)
////      item
////    })
////
////    quantConfig.notices.reduce((item, p) => {
////      checkIfTrue(
////        item.symbol.code.nonEmpty
////      )
////      checkIfTime(item.dateTime)
////      item
////    })
////
////    quantConfig.groups.reduce((group, p) => {
////      // items code
////      if (group.items.nonEmpty) {
////        group.items.reduce((item, p) => {
////          checkIfTrue(
////            item.code.nonEmpty
////          )
////          item
////        })
////      }
////
////      // items code
////      if (group.list.nonEmpty) {
////        group.list.reduce((item, p) => {
////          checkIfTrue(item.symbol.code.nonEmpty)
////          checkIfTime(
////            Some(
////              item.date
////            )
////          )
////          item
////        })
////      }
////      group
////    })
////
////    def getPreviousDay(): DateTime = {
////      val l: util.List[String] = jepExecutor
////        .runJepCode[util.List[String]](
////          Option.empty[File],
////          Some(
////            s"""import datetime;
////               |from jqdatasdk import *;""".stripMargin
////          ),
////          s"""list(get_trade_days(count=100, end_date=datetime.date.today()))""".stripMargin
////        )
////        .right
////        .get
////      DateFormat.fromString(l.takeRight(2).head)
////    }
////
////    checkIfTime(
////      Some(
////        getPreviousDay()
////      )
////    )
////
////    actorSystem.logger.info("ok ok");
////
////    actorSystem.terminate()
////    spark.close();
////    sys.exit(0)
//  }
//
//  try {
//    test()
//  } catch {
//    case NonFatal(x) =>
//      x.printStackTrace();
//      throw FatalError(x.toString)
//      actorSystem.terminate()
//      spark.close();
//      throw new Throwable()
//      sys.exit(1);
//  }
//
//  sys.addShutdownHook(() => {
//    actorSystem.terminate()
//    spark.close();
//  })
//}
