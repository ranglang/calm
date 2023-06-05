package tech.shangche.boat

import akka.actor.typed.ActorSystem
import com.lqiong.model.StockSymbol
import com.onectrm.akshare.api.generated.stock.{
  stock_financial_analysis_indicatorRequest,
  stock_financial_analysis_indicatorResponse,
  stock_individual_info_emRequest,
  stock_profit_sheet_by_report_emRequest,
  B_Stock_profit_sheet_by_report_emResponse,
  Respstock_financial_analysis_indicatorResponse
}
import io.circe.generic.JsonCodec
import scalacache.memoization.{memoize, memoizeF}
import tech.shangche.boat.service.{AService, BoatService, IndexDataService, StockDataService}
import tech.shangche.boat.traits.{IndexStockDataServiceInter, StockDataServiceInter}

import java.time.LocalDate
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.DurationInt

trait StockStock {
  val stockData: StockDataServiceInter
  def stock_financial_analysis_indicatorApi(
    symbol: StockSymbol
  ): Future[Option[List[Respstock_financial_analysis_indicatorResponse]]]
  def stock_profit_sheet_by_report_emApi(
    code: StockSymbol
  ): Future[Option[List[B_Stock_profit_sheet_by_report_emResponse]]]
  def stock_individual_info_emApi(code: StockSymbol): Future[Option[StockInfo]]
}

@JsonCodec
case class StockInfo(
  name: String, // 股票简称
  industry: String, // 行业
  value: Double // 总市值
)

//lazy final val boatService = new BoatService()
//override val stockData: StockDataServiceInter = new StockDataService()
//implicit val system: ActorSystem[Nothing],
class StockStock1(
  boatService: BoatService,
  val stockData: StockDataServiceInter
) extends StockStock {
  import scala.concurrent.ExecutionContext.Implicits.global

  import scalacache._
  import scalacache.memcached._
  import net.spy.memcached._
  val memcachedcache = "194.163.143.112:11211"
  import scalacache.serialization.circe._
  import scalacache.modes.scalaFuture._

  val memcachedClient = new MemcachedClient(
    new BinaryConnectionFactory(),
    AddrUtil.getAddresses(memcachedcache)
  )

  import io.circe.generic.auto._
  implicit val stock_financial_analysis_indicatorResponse_1
    : Cache[Option[List[Respstock_financial_analysis_indicatorResponse]]] = MemcachedCache(
    memcachedClient
  )

  override def stock_profit_sheet_by_report_emApi(
    code: StockSymbol
  ): Future[Option[List[B_Stock_profit_sheet_by_report_emResponse]]] = {
    boatService
      .stock_profit_sheet_by_report_emApi(
        stock_profit_sheet_by_report_emRequest.of(
          code.getSimpleName()
        )
      )
      .map(r => r.body.toOption)
  }

  lazy final val a1 = new AService()

  override def stock_financial_analysis_indicatorApi(
    symbol: StockSymbol
  ): Future[Option[List[Respstock_financial_analysis_indicatorResponse]]] = {
    memoizeF[Future, Option[List[Respstock_financial_analysis_indicatorResponse]]](Some(1.hour)) {
      a1.stock_financial_analysis_indicatorApi(
        stock_financial_analysis_indicatorRequest.of(
          symbol.code
        )
      ).map(r => {
        import io.scalaland.chimney.dsl._
        r.body.toOption.map(mm => {
          mm.take(8)
            .map(r => {
              r.into[Respstock_financial_analysis_indicatorResponse].transform
            })
        })
      })
    }
  }

  override def stock_individual_info_emApi(code: StockSymbol): Future[Option[StockInfo]] = {
    implicit val impl_StockInfo: Cache[Option[StockInfo]] = MemcachedCache(memcachedClient)
    memoizeF[Future, Option[StockInfo]](Some(5.days)) {
      boatService
        .stock_individual_info_emApi(stock_individual_info_emRequest.of(code.code))
        .map(r => {
          r.body.toOption
            .map(list => {
              list.foldLeft(Map.empty[String, String])((r, c) => {
                r.+((c.`p_item`, c.`p_value`))
              })
            })
            .map(map => {
              StockInfo(
                name = map.get("股票简称").get,
                industry = map.get("行业").get,
                value = map.get("总市值").get.toDouble
              )
            })
        })
    }
  }
}

trait IndexStock {
  val indexData: IndexStockDataServiceInter
}

object IndexStock extends IndexStock {
  import scala.concurrent.ExecutionContext.Implicits.global

  override val indexData: IndexStockDataServiceInter = new IndexDataService()
}
