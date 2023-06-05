package com.lqiong.jep.entry

import com.lqiong.jep.entry.a.UUIDUtil
import org.apache.spark.sql.{DataFrame, Row, SparkSession}
import org.apache.spark.sql.types.{StringType, StructType}

import java.util.UUID

object EntryNotion extends App {

  val notionService = new NotionService()
//  val c = quantEngine.dataSource.getCodeNames2

  val arrayStructData = Seq(
    Row("James1", "dddd"),
    Row("James13", "dddd3")
  )

  implicit val spark: SparkSession = SparkSession
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
  //
  val arrayStructSchema = new StructType()
    .add("code", StringType)
    .add("name", StringType)

  val df: DataFrame = spark.createDataFrame(
    spark.sparkContext
      .parallelize(arrayStructData),
    arrayStructSchema
  )
  df.printSchema()

  import spark.implicits._
  //  c.show(1)
//  logger.info("notion1  {}", c)
  notionService
    .savePageForItemType(
      UUID.fromString(UUIDUtil.insertDashUUID("36bb7808339041cba1809ac2b536ebb8")),
      "title",
      df
    )
  sys.exit(0)

}
