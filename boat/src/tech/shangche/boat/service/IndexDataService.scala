package tech.shangche.boat.service

import com.lqiong.jep.models.StockHotPrice1
import com.typesafe.config.ConfigFactory
import sttp.client3._
import sttp.client3.asynchttpclient.future.AsyncHttpClientFutureBackend
import sttp.client3.circe.asJson
import tech.shangche.boat.converter.MapConverter
import tech.shangche.boat.models.{ReqIndexItem, ReqStockItemData, STOCK_ZH_A_HIST_Item}
import tech.shangche.boat.traits.{IndexStockDataServiceInter, StockDataServiceInter}

import scala.concurrent.{ExecutionContext, Future}
import scala.concurrent.duration.{DurationInt, FiniteDuration}

case class STOCK_ZH_A_HIST_Item(
  `时间`: String,
  `开盘`: Double,
  `收盘`: Double,
  `最高`: Double,
  `最低`: Double,
  `成交量`: Double,
  `成交额`: Double,
  `最新价`: Double
) {

  def universal(): StockHotPrice1 = {
    import io.scalaland.chimney.dsl._
    this
      .into[StockHotPrice1]
      .withFieldRenamed(_.`开盘`, _.open)
      .withFieldRenamed(_.`收盘`, _.close)
      .withFieldRenamed(_.`最高`, _.high)
      .withFieldRenamed(_.`最低`, _.low)
      .withFieldRenamed(_.`成交量`, _.volume)
      .withFieldRenamed(_.`成交额`, _.mount)
      .withFieldRenamed(_.`最新价`, _.price)
      .withFieldRenamed(_.`时间`, _.date)
      .transform
  }
}

class IndexDataService(implicit private val ex: ExecutionContext)
    extends IndexStockDataServiceInter {

  private val backend = AsyncHttpClientFutureBackend(
    options = SttpBackendOptions.connectionTimeout(1.minute)
  )

  private lazy val akShareBackend = ConfigFactory.load().getString("AK_SHARE_BACKEND")
  import io.circe.generic.auto._
  private val url = s"${akShareBackend}/api/public/index_zh_a_hist_min_em"

  def index_zh_a_hist_min_em(item: ReqIndexItem): Future[List[StockHotPrice1]] = {
    implicit val timeout: FiniteDuration = 60.seconds
    val resp = basicRequest
      .get(uri"${url}?${MapConverter.getMapIndex(item)}")
      .readTimeout(5.minutes)
      .response(asJson[List[STOCK_ZH_A_HIST_Item]])
      .send(backend)
    resp
      .map(r => {
        r.body.getOrElse(List.empty)
      })
      .map(iem => {
        iem.map(r => r.universal)
      })
  }

  override def getPrice(code: ReqIndexItem): Future[StockHotPrice1] = {
    index_zh_a_hist_min_em(code).map(r => r.last)
  }
}
