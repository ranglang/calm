package com.lqiong.jep.entry
import com.github.takezoe.retry.{RetryPolicy, retry}
import com.google.inject.Inject
import com.lqiong.jep.option.TableNames
import com.lqiong.model._
import com.lqiong.model.order.FundDateList
import io.getquill._
import net.spy.memcached.MemcachedClient
import org.slf4j.LoggerFactory

import scala.concurrent.duration.DurationInt
import scala.concurrent.{ExecutionContext, Future}
import scala.util.control.NonFatal

object ChaodieDataListName {
  def getTableName(name: LSymbol) = {
    val name1 = s"cdstock${name.code}"
    name1
  }
}

class QueryTable @Inject() (
  implicit val ex: ExecutionContext,
  implicit val retryPolicy: RetryPolicy,
val memcachedClient: MemcachedClient
  ) extends QueryTableInter {

  val logger = LoggerFactory.getLogger(getClass.getName)
  lazy val db = {
    retry {
      new PostgresAsyncContext(SnakeCase, "ctx") with QuillEncoder
    }
  }

  import db._
  import net.spy.memcached._
  import scalacache._
  import scalacache.memcached._
  import scalacache.memoization.{memoize, memoizeF}
  import scalacache.modes.scalaFuture._
  import scalacache.serialization.circe._

  def getSymbolChaodie(stockSymbol: LSymbol): Future[RetStockChaoDie] = {
    import io.circe.generic.auto._
    implicit val RetStockChaoDieImpl: Cache[RetStockChaoDie] = MemcachedCache(memcachedClient)
      import org.joda.time.DateTime
      val r1 = dynamicQuerySchema[StockChaoDie](s"cd${stockSymbol.getName}")
      val result: Future[RetStockChaoDie] = db
        .run(r1)
        .map(r =>
          RetStockChaoDie(records =
            r.map(r =>
              StockChaoDieJoda(
                date = new DateTime(r.date),
                chaodie = r.chaodie
              )
            )
          )
        ) recover { case NonFatal(x) =>
        logger.error("getsymbol chaodie {}", x)
        RetStockChaoDie(records = List.empty[StockChaoDieJoda])
      }
      result
  }

  def getSymbolChaodieCache1(stockSymbol: LSymbol): Future[RetStockChaoDie] = {
    import io.circe.generic.auto._
    implicit val RetStockChaoDieImpl: Cache[RetStockChaoDie] = MemcachedCache(memcachedClient)
    memoizeF[Future,
      RetStockChaoDie
    ](Some(1.hour)) {
      import org.joda.time.DateTime
      val r1 = dynamicQuerySchema[StockChaoDie](ChaodieDataListName.getTableName(stockSymbol))
      val result: Future[RetStockChaoDie] = db
        .run(r1)
        .map(r =>
          RetStockChaoDie(records =
            r.map(r =>
              StockChaoDieJoda(
                date = new DateTime(r.date),
                chaodie = r.chaodie
              )
            )
          )
        ) recover { case NonFatal(x) =>
        logger.error("getsymbol chaodie {}", x)
        RetStockChaoDie(records = List.empty[StockChaoDieJoda])
      }
      result
    }
  }

  def getSymbolChaodie1(stockSymbol: LSymbol): Future[RetStockChaoDie] = {
    implicit val RetStockChaoDieImpl: Cache[RetStockChaoDie] = MemcachedCache(memcachedClient)
      import org.joda.time.DateTime
      val r1 = dynamicQuerySchema[StockChaoDie](ChaodieDataListName.getTableName(stockSymbol))
      val result: Future[RetStockChaoDie] = db
        .run(r1)
        .map(r =>
          RetStockChaoDie(records =
            r.map(r =>
              StockChaoDieJoda(
                date = new DateTime(r.date),
                chaodie = r.chaodie
              )
            )
          )
        ) recover { case NonFatal(x) =>
        logger.error("getsymbol chaodie {}", x)
        RetStockChaoDie(records = List.empty[StockChaoDieJoda])
      }
      result
  }

  def getSymbolChaodieCache(stockSymbol: LSymbol): Future[RetStockChaoDie] = {
    import io.circe.generic.auto._
    implicit val RetStockChaoDieImpl: Cache[RetStockChaoDie] = MemcachedCache(memcachedClient)
      memoizeF[Future,
        RetStockChaoDie
      ](Some(1.hour)) {
        getSymbolChaodie1(stockSymbol)
      }
  }

  def getIndexHistory(
    name: IndexSymbol
  ): Future[List[IndexDailyPriceJodata]] = {
    import org.joda.time.DateTime
    val r1 = dynamicQuerySchema[IndexDailyPrice](name.getTableName)
      .sortBy(p => p.date)(Ord.desc)
      .take(600)
    val r2: Future[List[IndexDailyPrice]] = db.run(r1)
    r2.map(r3 =>
      r3.map(r =>
        IndexDailyPriceJodata(
          date = new DateTime(r.date),
          close = r.close,
          open = r.open,
          high = r.high,
          low = r.low,
          volume = r.volume
        )
      )
    )
  }

  def getIndex(name: IndexSymbol): Future[RetIndexPrice] = {
    val result: Future[RetIndexPrice] = getIndexHistory(name)
      .map(r => {
        logger.info("RetIndexPrice get Index {}", r.length)
        // .takeRight(600)
        RetIndexPrice(records = r)
      })
      .recover { case NonFatal(x) =>
        logger.error("getIndex IndexDailyPriceJodata {}", x)
        RetIndexPrice(records = List.empty[IndexDailyPriceJodata])
      }
    result
  }

  def getCacheStock1(name: StockSymbol): Future[RetStock] = {
    import io.circe.generic.auto._
    implicit val implRetStock: Cache[RetStock] = MemcachedCache(memcachedClient)
    memoizeF[Future,
      RetStock
    ](Some(1.hour)) {
      getStock(name)
    }
    }

  def getStock(name: StockSymbol): Future[RetStock] = {
    import org.joda.time.DateTime
    // TODO set query paging size
    val r1 = dynamicQuerySchema[LStockItem](s"tb_qfq_${name.code}")
      .sortBy(p => p.date)(Ord.desc)
      .take(600)

    val result: Future[RetStock] = db
      .run(r1)
      .map(r =>
        RetStock(records =
          r.map(r =>
            WeatherStation1(
              date = new DateTime(r.date),
              open = r.open,
              close = r.close,
              high = r.high,
              low = r.low,
              volume = r.volume,
              turnover = r.turnover,
              outstanding_share = r.outstanding_share
            )
          )
        )
    )

    result.recover { case NonFatal(x) =>
      logger.info("weather station {}", x)
      RetStock(records = List.empty[WeatherStation1])
    }
  }

  def getIndexItems(): Future[List[RetIndexItem]] = {
    val r1 = dynamicQuerySchema[RetIndexItem](TableNames.indexSpot)
    val result: Future[List[RetIndexItem]] = db
      .run(r1)
    result
  }

  def getFundDailyPrice1(code: JiJinSymbol): Future[List[FundDateList]] = {
    val r1 = dynamicQuerySchema[FundDateList](code.getPriceTableName)
    val result: Future[List[FundDateList]] = db
      .run(r1)
      .map(r => r.sortBy(_.date))
    result
  }

  override def getFundDailyPrice(code: String): Future[List[FundDateList]] = {
    getFundDailyPrice1(JiJinSymbol(code))
//    val r1 = dynamicQuerySchema[FundDateList](JiJinSymbol(code))
//    val result: Future[List[FundDateList]] = db
//      .run(r1)
//      .map(r => r.sortBy(_.date))
//    result
  }
}
