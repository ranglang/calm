package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.google.inject.Inject
import com.lqiong.jep.entry.{Polyty, QueryTable}
import com.lqiong.jep.option.{DataFrameDao, JepExecutor}
import com.lqiong.model.{AbstractData, PigPrice}

import scala.concurrent.{ExecutionContext, Future}

class PigDataList @Inject() (
  val polyty: Polyty,
  implicit val jepExecutor: JepExecutor,
  implicit val dataFrameDao: DataFrameDao,
  implicit val queryTable: QueryTable,
  implicit val ex: ExecutionContext,
  val logger: LoggingAdapter
) extends AbstractData[PigPrice]("pig") {

  override val scriptsToDateframe: List[String] = List(
    "import akshare as ak",
    "ak.futures_pig_info(symbol=\"猪肉批发价\")"
  )

//  def print() = {
////         val list = table
////           .vixTable()
////           .map(r => {
////             VIxDateTime(date = DateFormat.parseTxt(r.date), vix = r.vix)
////           })
////           .sortWith((a, b) => a.date.isBefore(b.date))
//    val list = getList.sortWith((a, b) => a.date.after(b.date))
//
//    //    val a = DateTimeFormat.forPattern("d MMMM");
//    import plotly._
//    val labels = list.map(r => DateFormat.getDay(new DateTime(r.date)))
//    val valuesA = list.map(r => r.value.toDouble)
//
//    val plots =
//      Seq(
//        Scatter(Seq(labels: _*), Seq(valuesA: _*), name = "猪肉价格")
//      )
//
//    val layout = Layout().withTitle(get_table_name)
//    polyty.print(new File(getImageName), plots, layout, false)
//  }

  override def getList: Future[List[PigPrice]] = {
    import queryTable.db._
    val r1 = dynamicQuerySchema[PigPrice](get_table_name)
    val result: Future[List[PigPrice]] = queryTable.db
      .run(r1)
    result
  }

  override def fetchData: Unit = {
    val r = jepExecutor.runDateFrameByExecImportList(scriptsToDateframe)
    if (r.isRight) {
      val d = r.right.get
      dataFrameDao.saveDynamicTable(d, get_table_name)
    } else {
      logger.info("save  load")
    }
  }

}
