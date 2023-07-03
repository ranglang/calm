package com.lqiong.jep.option

import akka.actor.ActorSystem
import akka.actor.typed.scaladsl.adapter.ClassicActorSystemOps
import akka.event.LoggingAdapter
import akka.util.Timeout
import com.github.takezoe.retry.{retry, RetryPolicy}
import com.google.inject.Inject
import com.lqiong.claim.actor
import com.lqiong.claim.actor.CodeNameActor
import com.lqiong.jep.StockItem
import com.lqiong.jep.claim.model.{ChaodieDataList, DynamicAStockPrice, PanmingFactor}
import com.lqiong.jep.entry.{QueryTable, StockChaoDie}
import com.lqiong.jep.models.StockHotPrice1
import com.lqiong.model._
import com.typesafe.config.Config
import e.SnowballService
import model.Data
import org.apache.spark.sql.SparkSession
import org.joda.time.DateTime
import tech.shangche.boat.models.ReqIndexItem
import tech.shangche.boat.query.BoatQuery

import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, ExecutionContext}
import scala.language.postfixOps
import scala.util.Try

class StockImpl @Inject() (
  val dataSource: ClaimDataSource,
  val panMingFactor: PanmingFactor,
  implicit val spark: SparkSession,
  implicit val retryPolicy: RetryPolicy,
  implicit val queryTable: QueryTable,
  implicit val ex: ExecutionContext,
  val dynamicAPrice: DynamicAStockPrice,
  val logger: LoggingAdapter,
  val actorSystem: ActorSystem,
  implicit val t: Timeout,
  val chaodieDataList: ChaodieDataList,
  val config: Config
) extends StockTrait {
  val a1 = new CacheService1(config)

  lazy val snowballService = new SnowballService()

  implicit val system = actorSystem.toTyped
  val f = system.systemActorOf(actor.CodeNameActor(dataSource, logger), "codeName")
  f ! CodeNameActor.CodeNameFetchTick

  override def getPrice(code: String): StockHotPrice1 = {
    retry {
      val f = Await.result(
        snowballService.fetchStockHotPrice(code),
        60.seconds
      )
      logger.info("result code {}", code)

      val head: Data = f.right.get.data.head
      StockHotPrice1(
        date = code,
        price = head.current,
        open = head.open,
        close = head.last_close,
        high = head.high,
        low = head.low,
        volume = head.trade_volume.map(r => r.toDouble).getOrElse(0d),
        mount = 0
      )
    }
  }

  override def getCodeName(code: String): String = {
    val f = dataSource.getCodeNames.find(r => r.code == code).map(r => r.name).getOrElse("")
    f
  }

  override def getDayChaodieList(
    code: String,
    date: Option[DateTime] = Option.empty[DateTime]
  ): List[StockChaoDie] = {

    logger.info("getDayChaodieList {}", code)
    // TODO lsymbol
    val f = {
      Await.result(chaodieDataList.getList(StockSymbol(code)), 200.seconds)
    }
    f
    //    f.map(r => r.chaodie)
  }

  override def getDayChaodie(
    code: String,
    date: Option[DateTime] = Option.empty[DateTime]
  ): Double = {
    logger.info("getDaychaodie {}", date);
    val f = Await.result(
      chaodieDataList.getByDate(StockSymbol(code), date.getOrElse(DateTime.now)),
      200.seconds
    )
    logger.info("llllllllll {}", f)
    val f1 = f.map(_.chaodie.toDouble).getOrElse(0d)
    logger.info("llllllllll {}", f1)
    f1

//    val f =
//      Await.result(chaodieDataList.getList(StockSymbol(code)), 200.seconds)
//    val d1: Double = date match {
//      case Some(t) =>
//        val a: Option[Long] = f
//          .map(r => r)
//          .find(r1 => t.toLocalDate.equals(new org.joda.time.LocalDate(r1.date)))
//          .map(r => r.chaodie)
//        a.get.toDouble
//
//      case _ => {
//        f.takeRight(1)
//          .headOption
//          .map(r => r.chaodie)
//          .getOrElse[Long](0L)
//          .toDouble
//      }
//    }
//    d1
  }

  //  getPriceSince
  // getPriceSince
  override def getPriceSince(code: String, day: Int): Double = {
    dataSource.getPriceSince(StockSymbol(code), day)
  }

//  override def getPanMing(code: String): List[Double] = {
//    dataSource.getPanMing(code).collectAsList().toList.map(r => r.chaodie)
//  }

  override def getFundName(code: String): String = {
    Try {
      dataSource.getFundNameList
        .find(r => r.code == code)
        .map(r => r.short_name)
        .getOrElse("")
    }.getOrElse("")
  }

  override def getUsaName(code: String): String = {
    dataSource
      .getUsaNameList()
      .find(r => r.symbol == code)
      .map(r => r.cname)
      .getOrElse("")

  }

  override def getConvertibleName(code: String): String = {
    dataSource
      .getConvertibleBond()
      .find(r => r.code == code)
      .map(r => r.name)
      .getOrElse("")
  }

  override def getSwIndexName(code: String): String = {
    dataSource
      .getSwIndex()
      .find(r => r.code == code)
      .map(r => r.name)
      .getOrElse("")
  }

  override def getHkItemName(code: String): String = {
    dataSource
      .getHkItems()
      .find(r => r.symbol == code)
      .map(r => r.name)
      .getOrElse("")
  }

  override def getOptionCode(l: String): String = {
    logger.info("llllllllll {}", l)
    dataSource
      .getVegaOptionContractNum(l)
      .map(r => r.contract_num)
      .getOrElse("")
  }

  override def getFundSince(code: JiJinSymbol): List[ItemPrice] = {
    logger.info("getFundSince  {}", code)
    val f = dataSource.fetchFundDailyPriceAs(code)
    f
  }

  override def getStockPrices(code: StockSymbol): List[ItemPrice] = {
    val stockItem = new StockItem(code.code, retryPolicy)
    val l = stockItem
      .getList()
      .map(r => ItemPrice(new org.joda.time.DateTime(r._1), r._2))
      .sortWith((a, b) => a.date.isBefore(b.date))
    l
  }

  override def indexGetPrice(code: String): StockHotPrice1 = {
    retry {
      val a = BoatQuery.index.indexData.getPrice(
        ReqIndexItem(
          symbol = code
        )
      )
      Await.result(a, 60.seconds)
    }
  }

  override def getPanming(code: String): Double = {
    val mertrieResult =
      panMingFactor.getList(
        IndexSymbol(code)
      )
    val f = Try(Await.result(mertrieResult, 120.seconds)).getOrElse(List.empty)
    val a: Double = Try(f.takeRight(1).head.value).getOrElse(0)
    a
  }
}
