package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.google.inject.Inject
import com.lqiong.jep.entry.{DateFormat, Polyty, QueryTable}
import com.lqiong.jep.option.{DataFrameDao, JepExecutor}
import com.lqiong.model.AbstractData
import org.apache.spark.sql.functions.{col, udf}
import org.apache.spark.sql.types.DateType

import java.util.Date
import scala.concurrent.{ExecutionContext, Future}

case class CommonItemValue(
  date: Date,
  value: Double
)

case class EggPrice(
  date: Date,
  price: Double
)

class EggDataList @Inject() (
  private val polyty: Polyty,
  implicit val jepExecutor: JepExecutor,
  implicit val dataFrameDao: DataFrameDao,
  implicit val queryTable: QueryTable,
  implicit val ex: ExecutionContext,
  private val logger: LoggingAdapter
) extends AbstractData[EggPrice]("egg_price") {

  override val scriptsToDateframe: List[String] = List(
    "import akshare as ak",
    "ak.futures_egg_price()"
  )

  override val createTable = {
    s"CREATE TABLE IF NOT EXISTS ${this.get_table_name} (date timestamp PRIMARY KEY, price real)"
  }

  override def getList: Future[List[EggPrice]] = {
    import queryTable.db._
    val r1 = dynamicQuerySchema[EggPrice](get_table_name)
    val result: Future[List[EggPrice]] = queryTable.db
      .run(r1)
    result
  }

  override def fetchData: Unit = {
    val r = jepExecutor.runDateFrameByExecImportList(scriptsToDateframe)
    if (r.isRight) {
      val d = r.right.get
      d.printSchema()
      val squared = udf((s: String) => {
        logger.info("ssssss {}", s)
        logger.info("ssssss {}", DateFormat.getTimeSlashFormat(s))
        DateFormat.getDay(DateFormat.getTimeSlashFormat(s))
      })

      val r1 = d
        .filter(!col("date").contains("2/29"))
        .withColumn("date", squared(col("date")).cast(DateType))

      r1.show(10)

      dataFrameDao.saveDynamicTable(r1, get_table_name)

    } else {
      logger.info("save  load")
    }
  }

}
