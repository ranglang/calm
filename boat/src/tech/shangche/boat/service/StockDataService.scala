package tech.shangche.boat.service

import com.lqiong.jep.models.StockHotPrice1
import com.lqiong.model.StockSymbol
import com.onectrm.akshare.api.generated.stock.{
  stock_profit_sheet_by_report_emRequest,
  B_Stock_profit_sheet_by_report_emResponse
}
import com.typesafe.config.ConfigFactory
import sttp.client3._
import sttp.client3.asynchttpclient.future.AsyncHttpClientFutureBackend
import sttp.client3.circe.asJson
import tech.shangche.boat.converter.MapConverter
import tech.shangche.boat.models.{ReqStockItemData, STOCK_ZH_A_HIST_Item}
import tech.shangche.boat.traits.StockDataServiceInter

import scala.concurrent.{ExecutionContext, Future}
import scala.concurrent.duration.{DurationInt, FiniteDuration}

class StockDataService(implicit private val ex: ExecutionContext) extends StockDataServiceInter {

  private val backend = AsyncHttpClientFutureBackend(
    options = SttpBackendOptions.connectionTimeout(1.minute)
  )

  val boatService = new BoatService()
  private lazy val akShareBackend = ConfigFactory.load().getString("AK_SHARE_BACKEND")
  import io.circe.generic.auto._
  private val url = s"${akShareBackend}/api/public/stock_zh_a_hist"

  def stock_zh_a_hist(item: ReqStockItemData): Future[List[StockHotPrice1]] = {
    implicit val timeout: FiniteDuration = 60.seconds
    val resp = basicRequest
      .get(uri"${url}?${MapConverter.getMap(item.transform1)}")
      .readTimeout(5.minutes)
      .response(asJson[List[STOCK_ZH_A_HIST_Item]])
      .send(backend)
    resp
      .map(r => r.body.getOrElse(List.empty))
      .map(iem => {
        iem.map(r => r.universal)
      })
  }

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
}
