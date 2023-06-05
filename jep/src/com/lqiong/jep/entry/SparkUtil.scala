package com.lqiong.jep.entry

import org.apache.spark.sql.{DataFrame, Dataset}

object SparkUtil {
  def getDatasetSummary[T](dataframe: Dataset[T]): String = {
    dataframe.printSchema()
    val showString =
      classOf[org.apache.spark.sql.DataFrame].getDeclaredMethod(
        "showString",
        classOf[Int],
        classOf[Int],
        classOf[Boolean]
      )
    showString.setAccessible(true)

    val a1 = showString
      .invoke(
        dataframe,
        10.asInstanceOf[Object],
        20.asInstanceOf[Object],
        false.asInstanceOf[Object]
      )
      .asInstanceOf[String]
    a1
  }
  def getSummary(dataframe: DataFrame): String = {
    val showString =
      classOf[org.apache.spark.sql.DataFrame].getDeclaredMethod(
        "showString",
        classOf[Int],
        classOf[Int],
        classOf[Boolean]
      )
    showString.setAccessible(true)

    val a1 = showString
      .invoke(
        dataframe,
        10.asInstanceOf[Object],
        20.asInstanceOf[Object],
        false.asInstanceOf[Object]
      )
      .asInstanceOf[String]
    a1
  }

}
