package com.lqiong.jep.entry

import akka.event.LoggingAdapter
import com.github.takezoe.retry.retry
import com.google.inject.Inject
import com.lqiong.jep.option.{IndexChaodie, PanMingChaoDieItem, VIxItem}
import com.lqiong.jep.option.cassandra.{GetSparkTable, VIxDateTime}
import com.lqiong.model.{IndexSymbol, StockSymbol}
import com.typesafe.scalalogging.Logger
import levsha.dsl.svg.image
import org.apache.spark.sql.Dataset
import org.joda.time.DateTime
import plotly.layout.Layout

import java.io.File
import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`

class PolytyPrinter @Inject() (
  val polyty: Polyty,
  val table: GetSparkTable,
  quantConfig: QuantConfig,
  val logger: LoggingAdapter
) {

  def print(
    list: List[Tuple2[DateTime, Double]],
    name: String = "image",
    isSave: Boolean = false,
    file: File = quantConfig.panmingImage
  ): Unit = {

    val labels = list.map(r => DateFormat.getDay(r._1))
    val values = list.map(r => r._2)

//    val a = dataFrame.take(1).head
//    logger.info(s"a{}", a)
//    val list = dataFrame.collectAsList().toList
//    val labels = list.map(r => r.date)
//    logger.info(labels.toString)
//    val valuesA = list.map(r => r.chaodie.toString)
    import plotly._
//    logger.info(valuesA.toString)
    val path = Seq(
      Scatter(Seq(labels: _*), Seq(values: _*), name = name)
    )
    val layout = Layout().withTitle(name)
    polyty.print(file, path, layout, isSave)
  }

  def savePanming(
    index: IndexSymbol,
    dataFrame: Dataset[PanMingChaoDieItem],
    isSave: Boolean
  ): File = {
    val a = dataFrame.take(1).head
    logger.info(s"a{}", a)
    val list = dataFrame.collectAsList().toList
    val labels = list.map(r => r.date)
    logger.info(labels.toString)
    val valuesA = list.map(r => r.chaodie.toString)
    import plotly._
    logger.info(valuesA.toString)
    val path = Seq(
      Scatter(Seq(labels: _*), Seq(valuesA: _*), name = "AB")
    )
    val layout = Layout().withTitle(s"Pannming ${index.code}")
    polyty.print(quantConfig.panmingImage, path, layout, isSave)
    quantConfig.panmingImage
  }

  def saveVixItem(
    dataFrame: Dataset[VIxItem],
    isSave: Boolean
  ): File = {
    val list: List[VIxItem] = dataFrame.collect().toList
    import plotly._
    val labels = list.map(r => r.date)
    val valuesA = list.map(r => r.vix)
    val path = Seq(
      Scatter(Seq(labels: _*), Seq(valuesA: _*), name = "A")
    )
    val layout = Layout().withTitle("VIx")
    polyty.print(quantConfig.optionFile, path, layout, isSave)
    quantConfig.optionFile
  }

  def saveChaodieImage(
    stockSymbol: StockSymbol,
    dataFrame: Dataset[IndexChaodie],
    isSave: Boolean
  ): File = {
    val list: List[IndexChaodie] = dataFrame.collect().toList
    import plotly._
    val labels = list.map(r => r.date)
    val valuesA = list.map(r => r.chaodie)
    val path = Seq(
      Scatter(Seq(labels: _*), Seq(valuesA: _*), name = "A")
    )

    val layout = Layout().withTitle("Chaodie")
    val file = new File(s"/tmp/${stockSymbol.code}_chaodie.png")
    polyty.print(file, path, layout, isSave)
    file
  }

  def getVixImage(days: Int = 60, isSave: Boolean): File = {
    val list = table
      .vixTable()
      .map(r => {
        VIxDateTime(date = DateFormat.parseTxt(r.date), vix = r.vix)
      })
      .sortWith((a, b) => a.date.isBefore(b.date))
//    val a = DateTimeFormat.forPattern("d MMMM");
    import plotly._
    val labels = list.map(r => DateFormat.getDay(r.date)).takeRight(days)
    val valuesA = list.map(r => r.vix.toDouble)

    val plots =
      Seq(
        Scatter(Seq(labels: _*), Seq(valuesA: _*), name = "A")
      )

    val layout = Layout().withTitle("Vix")
    polyty.print(quantConfig.vixImageFile, plots, layout, isSave)
    quantConfig.vixImageFile
  }

//  def getVixImage(days: Int = 60, isSave: Boolean): File = {
//    val list = table
//      .vixTable()
//      .map(r => {
//        VIxDateTime(date = DateFormat.parseTxt(r.date), vix = r.vix)
//      })
//      .sortWith((a, b) => a.date.isBefore(b.date))
//    //    val a = DateTimeFormat.forPattern("d MMMM");
//    import plotly._
//    val labels = list.map(r => DateFormat.getDay(r.date)).takeRight(days)
//    val valuesA = list.map(r => r.vix.toDouble)
//
//    val plots =
//      Seq(
//        Scatter(Seq(labels: _*), Seq(valuesA: _*), name = "A")
//      )
//
//    val layout = Layout().withTitle("Vix")
//    polyty.print(quantConfig.vixImageFile, plots, layout, isSave)
//    quantConfig.vixImageFile
//  }
}
