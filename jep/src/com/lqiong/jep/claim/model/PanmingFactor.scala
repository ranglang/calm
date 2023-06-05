package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.google.inject.Inject
import com.lqiong.jep.entry.{JsonDateTime, QueryTable}
import com.lqiong.jep.option.{ClaimDataSource, DataFrameDao, PanMingChaoDieItem2}
import com.lqiong.model.{IndexSymbol, LSymbol}
import io.circe.generic.JsonCodec
import io.getquill.Ord
import org.apache.spark.sql.{DataFrame, Row, SparkSession}
import org.joda.time.DateTime
import scalacache.Cache
import scalacache.memcached.MemcachedCache
import scalacache.memoization.memoizeF
import tech.shangche.boat.query.BoatQuery.stock.memcachedClient

import scala.collection.convert.ImplicitConversions.`list asScalaBuffer`
import scala.concurrent.duration.DurationInt
import scala.concurrent.{ExecutionContext, Future}
import scala.util.Try
import scala.util.control.NonFatal

@JsonCodec
case class PanMingChaoDieItem3(value: Double, date: java.sql.Timestamp) extends PanMingChaoDieItem31
//{
//  import io.circe.generic.JsonCodec
//  import io.circe.{Decoder, Encoder, Json}
//
//  implicit val dateWithoutMillisEncoder23: Encoder[java.sql.Timestamp] =
//    new Encoder[java.sql.Timestamp] {
//      override def apply(a: java.sql.Timestamp): Json =
//        Encoder.encodeLong.apply(a.getTime)
//    }
//}

object PanMingChaoDieItem3 extends PanMingChaoDieItem31
trait PanMingChaoDieItem31 extends JsonDateTime {
  import io.circe.generic.JsonCodec
  import io.circe.{Decoder, Encoder, Json}

  implicit val dateWithoutMillisDncoder23222: Decoder[java.sql.Timestamp] = Decoder[Long]
    .emapTry(r => Try(new java.sql.Timestamp(r)))
//  =
//    new Decoder[java.sql.Timestamp] {
//      override def apply(c: HCursor): Result[Timestamp] = new Timestamp(c.value)
//    }
  implicit val dateWithoutMillisEncoder23222: Encoder[java.sql.Timestamp] =
    new Encoder[java.sql.Timestamp] {
      override def apply(a: java.sql.Timestamp): Json =
        Encoder.encodeLong.apply(a.getTime)
    }
}

class PanmingFactor @Inject() (
  val dataSource: ClaimDataSource,
  implicit val dataFrameDao: DataFrameDao,
  logger: LoggingAdapter,
  implicit val queryTable: QueryTable,
  implicit val spark: SparkSession,
  implicit val executionContext: ExecutionContext
) extends AbsctractFactor[PanMingChaoDieItem2] {
  override val name: String = "pm"

  def get_table_name(code: String): String = {
    s"${name}_${code}"
  }

  override def cal(symbol: LSymbol, date: DateTime): Double = 0

  override def calList(symbol: LSymbol): List[(DateTime, Double)] = {
    symbol match {
      case index: IndexSymbol =>
        import spark.implicits._
        val a1 = dataSource.getPanMingDataFrame(index.code)
        val l = a1
          .as[PanMingChaoDieItem3]
          .collectAsList()
          .toList
          .map(r => (new DateTime(r.date), r.value))
        l
      case _ =>
        List.empty[(DateTime, Double)]
    }
  }

  def getRealTimeLatest(symbol: LSymbol): Future[Option[PanMingChaoDieItem3]] = {
    import io.circe.generic.JsonCodec
    import io.circe.generic.auto._
    import io.circe.{Decoder, Encoder, Json}
    import scalacache.modes.scalaFuture._
    import scalacache.serialization.circe._

    implicit val a1: Cache[Option[PanMingChaoDieItem3]] = MemcachedCache(memcachedClient)
    memoizeF[Future, Option[PanMingChaoDieItem3]](Some(10.minutes)) {
      getRealTimeList(symbol).map(r => r.lastOption)
    }
  }

  def getRealTimeList(symbol: LSymbol) = {
    Future {
      implicit val ec: org.apache.spark.sql.Encoder[PanMingChaoDieItem3] =
        org.apache.spark.sql.Encoders.product[PanMingChaoDieItem3]
      symbol match {
        case index: IndexSymbol =>
          val a2: DataFrame = dataSource.getPanMingDataFrame(index.code)
          import org.apache.spark.sql.functions.col
          import org.apache.spark.sql.types.DateType
          val a1 = a2.withColumn("date", col("date").cast(DateType))

          val count = 90
          import scala.collection.JavaConverters._
          val a: java.util.List[Row] = a1.tail(count).toList.asJava
          spark.createDataFrame(a, a1.schema).show(count)

          logger.info(a1.head(5).toList.map(r => r.get(0).toString).mkString(","))

          a1.as[PanMingChaoDieItem3].collectAsList().toList
        case _ =>
          logger.info("ok {}");
          List.empty
      }
    }

  }
  override def fetchData(symbol: LSymbol): Unit = {
    symbol match {
      case index: IndexSymbol =>
        val a2: DataFrame = dataSource.getPanMingDataFrame(index.code)
        import org.apache.spark.sql.functions.col
        import org.apache.spark.sql.types.DateType
        val a1 = a2.withColumn("date", col("date").cast(DateType))
        a1.show(5)
        logger.info(a1.head(5).toList.map(r => r.get(0).toString).mkString(","))
        logger.info(a1.tail(5).toList.map(r => r.get(1).toString).mkString(","))
        dataFrameDao.saveDynamicTable(
          a1,
          get_table_name(index.code)
        )
      case _ =>
        logger.info("ok {}");
    }
  }

  override def getLatest(symbol: LSymbol): Future[Option[PanMingChaoDieItem2]] = {
    symbol match {
      case index: IndexSymbol =>
        import queryTable.db._
//        import sttp.tapir.generic.auto._
        val r1 =
          dynamicQuerySchema[PanMingChaoDieItem2](get_table_name(index.code))
        val result: Future[Option[PanMingChaoDieItem2]] = queryTable.db
          .run(r1.sortBy(_.date)(Ord.desc).take(1))
          .map(_.headOption)
        result.recover { case NonFatal(x) =>
          logger.error("panming Factor error {}", x)
          Option.empty[PanMingChaoDieItem2]
        }
      case _ =>
        Future.successful(Option.empty[PanMingChaoDieItem2])
    }
  }

  override def getList(symbol: LSymbol): Future[List[PanMingChaoDieItem2]] = {
    symbol match {
      case index: IndexSymbol =>
        import queryTable.db._
        val r1 =
          dynamicQuerySchema[PanMingChaoDieItem2](get_table_name(index.code))
        val result: Future[List[PanMingChaoDieItem2]] = queryTable.db
          .run(r1)
        result.recover { case NonFatal(x) =>
          logger.error("panming Factor error {}", x)
          List.empty[PanMingChaoDieItem2]
        }
      case _ =>
        Future.successful(List.empty[PanMingChaoDieItem2])
    }
  }
}
