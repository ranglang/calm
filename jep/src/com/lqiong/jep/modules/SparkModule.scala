package com.lqiong.jep.modules

import com.google.inject.{AbstractModule, Provides, Singleton}
import com.lqiong.email.EmailServiceTrait
import com.lqiong.jep.EmailService
import com.lqiong.jep.option.StockImpl
import com.lqiong.model.StockTrait
import com.lqiong.shared.email.PostgresqlConfig
import net.codingwell.scalaguice.ScalaModule
import org.apache.spark.sql.SparkSession

class SparkModule extends AbstractModule with ScalaModule {

  override def configure(): Unit = {
    bind[EmailServiceTrait].to[EmailService].in[Singleton]
    bind[StockTrait].to[StockImpl].in[Singleton]
  }

  @Singleton
  @Provides
  def getSpark(config: PostgresqlConfig): SparkSession = {

    import org.apache.log4j.{Level, Logger}
    Logger.getLogger("org").setLevel(Level.OFF)

    Logger.getLogger("org").setLevel(Level.ERROR)
    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("akka").setLevel(Level.OFF)
    Logger.getLogger("o.a.spark.scheduler.DAGScheduler").setLevel(Level.OFF)
    Logger.getLogger("o.a").setLevel(Level.OFF)
    Logger.getLogger("c.j").setLevel(Level.OFF)
    Logger.getLogger("o.s").setLevel(Level.OFF)

    val spark: SparkSession = SparkSession
      .builder()
      .appName("Spark SQL basic example")
      .config("spark.master", "local")
      .config("spark.rpc.message.maxSize", "256")
      .config("spark.driver.memory", "4000m")
      .config("spark.executor.memory", "4000m")
      .config("spark.log-level", "INFO") // TODO update error
      //      .config("spark.sql.shuffle.partitions", "4")
      //      .config("spark.task.cpus", 3)
      //      .config("spark.executor.cores", 1)
      //      .config("spark.executor.instances", 2)
      //      .config("spark.dynamicAllocation.maxExecutors", 2)
      //      .config("spark.cassandra.connection.ssl.enabled", "true")
      //      .config("spark.cassandra.connection.ssl.trustStore.path", config.cassandraTruststorePath)
      //      .config("spark.cassandra.connection.ssl.trustStore.password", config.cassandraTruststorePassword)
      .config("spark.cassandra.output.concurrent.writes", 1)
      .config("spark.cassandra.output.metrics", "true")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")
    //    spark.sparkContext.setLogLevel(Level.ERROR)

    //    Logger.getLogger("org.apache.spark").setLevel(Level.INFO)
    //    Logger.getLogger("org.spark-project").setLevel(Level.INFO)

    spark
  }
}
