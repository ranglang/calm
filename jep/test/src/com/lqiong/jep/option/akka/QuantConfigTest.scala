//package com.lqiong.jep.option.A
//
//import akka.actor.ActorSystem
//
//import scala.concurrent.duration._
//import com.github.takezoe.retry.{LinerBackOff, RetryPolicy}
//import com.lqiong.claim.test.StockImpl1
//import com.lqiong.jep.entry.{DateFormat, EnterReason, QuantConfig}
//import com.lqiong.jep.option.JepExecutor
//import com.lqiong.shared.email.LCassandraConfig
//import com.typesafe.config.ConfigFactory
//import org.apache.log4j.{Level, Logger}
//import org.apache.spark.sql.SparkSession
//import org.joda.time.DateTime
//import org.scalatest.BeforeAndAfterAll
//import org.scalatest.flatspec.AsyncFlatSpec
//import org.scalatest.matchers.must.Matchers
//import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
//
//import java.io.File
//import java.util
//import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`
//import scala.language.postfixOps
//
//class QuantConfigTest() extends AsyncFlatSpec with Matchers with BeforeAndAfterAll {
//
//  lazy val stockImpl1 = new StockImpl1()
//  lazy val enterReason = new EnterReason()(stockImpl1)
//  lazy val quantConfig  = new QuantConfig(enterReason)
//
//  val config = ConfigFactory.load()
//
//  lazy val cassandraConfig= LCassandraConfig(
//    cassandraKeyspace = config.getString("cassandra.keyspace"),
//    cassandraHost = config.getString("cassandra.host"),
//    cassandraUserName = config.getString("cassandra.username"),
//    cassandraPassword = config.getString("cassandra.password"),
//    cassandraDataCenter = config.getString("cassandra.data_center"),
//    cassandraPort = config.getInt("cassandra.port"),
//    cassandraTruststorePath =
//      config.getString("cassandra.cassandraTruststorePath"),
//    cassandraTruststorePassword =
//      config.getString("cassandra.cassandraTruststorePassword")
//  )
//
//  Logger.getLogger("org").setLevel(Level.WARN)
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
//    .config(
//      "spark.cassandra.connection.port",
//      cassandraConfig.cassandraPort
//    )
//    .config(
//      "spark.cassandra.connection.host",
//      cassandraConfig.cassandraHost
//    )
//    .config("spark.cassandra.output.concurrent.writes", 1)
//    .config(
//      "spark.cassandra.auth.username",
//      cassandraConfig.cassandraUserName
//    )
//    .config("spark.cassandra.output.metrics", "true")
//    .config(
//      "spark.cassandra.auth.password",
//      cassandraConfig.cassandraPassword
//    )
//    .getOrCreate()
//
//  spark.sparkContext.setLogLevel("WARN")
//  Logger.getLogger("org.apache.spark").setLevel(Level.WARN)
//  Logger.getLogger("org.spark-project").setLevel(Level.WARN)
//
//
//  lazy val retryPolicy = RetryPolicy(
//      maxAttempts = 5,
//      retryDuration = 10.seconds,
//      backOff = LinerBackOff, // default is FixedBackOff
//      jitter = 20.seconds // default is no jitter
//    )
//
//  val actorSystem = ActorSystem("actor")
//  val jepExecutor = new JepExecutor()(
//    spark,
//    retryPolicy,
//    actorSystem.log,
//    true
//  )
//
//
//  it should "should concat" in {
//
//    /**
//     * check option
//     *
//     */
//    quantConfig.options.reduce((item, p) => {
//      item.option.code.nonEmpty should equal(true)
//      item
//    })
//
//    quantConfig.notes.reduce((item, p) => {
//      item.symbol.code.nonEmpty should equal(true)
//      item.dateTime should not equal true
//      item
//    })
//
//    quantConfig.notices.reduce((item, p) => {
//      item.symbol.code.nonEmpty should equal(true)
//      item.dateTime should not equal true
//      item
//    })
//
//    quantConfig.groups.reduce((group, p) => {
//      // items code
//      if(group.items.nonEmpty) {
//        group.items.reduce((item, p) => {
//          item.code.nonEmpty should equal(true)
//          item
//        })
//      }
//
//      // items code
//      if(group.list.nonEmpty) {
//        group.list.reduce((item, p) => {
//          item.symbol.code.nonEmpty should  equal(true)
//          item.date should not equal true
//          item
//        })
//      }
//      group
//    })
//
//    def getPreviousDay(): DateTime = {
//        val l: util.List[String] = jepExecutor
//          .runJepCode[util.List[String]](
//            Option.empty[File],
//            Some(
//              s"""import datetime;
//                 |from jqdatasdk import *;""".stripMargin
//            ),
//            s"""list(get_trade_days(count=100, end_date=datetime.date.today()))""".stripMargin
//          )
//          .right
//          .get
//        DateFormat.fromString(l.takeRight(2).head)
//    }
//
//    getPreviousDay() should equal ("")
//
//    1 shouldBe 1
//  }
//
// override  def afterAll() = {
//   actorSystem.terminate();
//   spark.close();
// }
//
//}
//
