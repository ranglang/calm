package tech.shangche.boat.service

import com.typesafe.config.ConfigFactory
import sttp.client3.asynchttpclient.future.AsyncHttpClientFutureBackend
import sttp.client3.circe.asJson
import sttp.client3._

import scala.concurrent.ExecutionContext
import scala.concurrent.duration.{DurationInt, FiniteDuration}

class AService(implicit private val ex: ExecutionContext) {

  private val backend = AsyncHttpClientFutureBackend(
    options = SttpBackendOptions.connectionTimeout(1.minute)
  )

  private lazy val akShareBackend = ConfigFactory.load().getString("AK_SHARE_BACKEND")

  def futures_comm_infoApi(
    item: com.onectrm.akshare.api.generated.futures.futures_comm_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_comm_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_comm_infoResponse]])
      .send(backend)
    resp
  }

  def futures_ruleApi(item: com.onectrm.akshare.api.generated.futures.futures_ruleRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_ruleResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_ruleResponse]])
      .send(backend)
    resp
  }

  def futures_inventory_99Api(
    item: com.onectrm.akshare.api.generated.futures.futures_inventory_99Request
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_inventory_99Response._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_inventory_99Response]]
      )
      .send(backend)
    resp
  }

  def futures_inventory_emApi(
    item: com.onectrm.akshare.api.generated.futures.futures_inventory_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_inventory_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_inventory_emResponse]]
      )
      .send(backend)
    resp
  }

  def futures_dce_position_rankApi(
    item: com.onectrm.akshare.api.generated.futures.futures_dce_position_rankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_dce_position_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_dce_position_rankResponse]]
      )
      .send(backend)
    resp
  }

  def futures_czce_warehouse_receiptApi(
    item: com.onectrm.akshare.api.generated.futures.futures_czce_warehouse_receiptRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_czce_warehouse_receiptResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.futures.futures_czce_warehouse_receiptResponse
        ]]
      )
      .send(backend)
    resp
  }

  def futures_dce_warehouse_receiptApi(
    item: com.onectrm.akshare.api.generated.futures.futures_dce_warehouse_receiptRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_dce_warehouse_receiptResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.futures.futures_dce_warehouse_receiptResponse
        ]]
      )
      .send(backend)
    resp
  }

  def futures_shfe_warehouse_receiptApi(
    item: com.onectrm.akshare.api.generated.futures.futures_shfe_warehouse_receiptRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_shfe_warehouse_receiptResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.futures.futures_shfe_warehouse_receiptResponse
        ]]
      )
      .send(backend)
    resp
  }

  def futures_to_spot_dceApi(
    item: com.onectrm.akshare.api.generated.futures.futures_to_spot_dceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_to_spot_dceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_to_spot_dceResponse]])
      .send(backend)
    resp
  }

  def futures_to_spot_czceApi(
    item: com.onectrm.akshare.api.generated.futures.futures_to_spot_czceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_to_spot_czceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_to_spot_czceResponse]]
      )
      .send(backend)
    resp
  }

  def futures_to_spot_shfeApi(
    item: com.onectrm.akshare.api.generated.futures.futures_to_spot_shfeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_to_spot_shfeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_to_spot_shfeResponse]]
      )
      .send(backend)
    resp
  }

  def futures_delivery_dceApi(
    item: com.onectrm.akshare.api.generated.futures.futures_delivery_dceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_delivery_dceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_delivery_dceResponse]]
      )
      .send(backend)
    resp
  }

  def futures_delivery_czceApi(
    item: com.onectrm.akshare.api.generated.futures.futures_delivery_czceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_delivery_czceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_delivery_czceResponse]]
      )
      .send(backend)
    resp
  }

  def futures_delivery_shfeApi(
    item: com.onectrm.akshare.api.generated.futures.futures_delivery_shfeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_delivery_shfeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_delivery_shfeResponse]]
      )
      .send(backend)
    resp
  }

  def futures_delivery_match_dceApi(
    item: com.onectrm.akshare.api.generated.futures.futures_delivery_match_dceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_delivery_match_dceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_delivery_match_dceResponse]]
      )
      .send(backend)
    resp
  }

  def futures_delivery_match_czceApi(
    item: com.onectrm.akshare.api.generated.futures.futures_delivery_match_czceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_delivery_match_czceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_delivery_match_czceResponse]]
      )
      .send(backend)
    resp
  }

  def futures_zh_spotApi(item: com.onectrm.akshare.api.generated.futures.futures_zh_spotRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_zh_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_zh_spotResponse]])
      .send(backend)
    resp
  }

  def futures_zh_realtimeApi(
    item: com.onectrm.akshare.api.generated.futures.futures_zh_realtimeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_zh_realtimeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_zh_realtimeResponse]])
      .send(backend)
    resp
  }

  def futures_zh_minute_sinaApi(
    item: com.onectrm.akshare.api.generated.futures.futures_zh_minute_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_zh_minute_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_zh_minute_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def futures_zh_daily_sinaApi(
    item: com.onectrm.akshare.api.generated.futures.futures_zh_daily_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_zh_daily_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_zh_daily_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def get_futures_dailyApi(
    item: com.onectrm.akshare.api.generated.futures.get_futures_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_get_futures_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.get_futures_dailyResponse]])
      .send(backend)
    resp
  }

  def futures_hq_subscribe_exchange_symbolApi(
    item: com.onectrm.akshare.api.generated.futures.futures_hq_subscribe_exchange_symbolRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_hq_subscribe_exchange_symbolResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.futures.futures_hq_subscribe_exchange_symbolResponse
        ]]
      )
      .send(backend)
    resp
  }

  def futures_foreign_commodity_realtimeApi(
    item: com.onectrm.akshare.api.generated.futures.futures_foreign_commodity_realtimeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_foreign_commodity_realtimeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.futures.futures_foreign_commodity_realtimeResponse
        ]]
      )
      .send(backend)
    resp
  }

  def futures_foreign_histApi(
    item: com.onectrm.akshare.api.generated.futures.futures_foreign_histRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_foreign_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_foreign_histResponse]]
      )
      .send(backend)
    resp
  }

  def futures_foreign_detailApi(
    item: com.onectrm.akshare.api.generated.futures.futures_foreign_detailRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_foreign_detailResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_foreign_detailResponse]]
      )
      .send(backend)
    resp
  }

  def futures_global_commodity_histApi(
    item: com.onectrm.akshare.api.generated.futures.futures_global_commodity_histRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_global_commodity_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.futures.futures_global_commodity_histResponse
        ]]
      )
      .send(backend)
    resp
  }

  def futures_sgx_dailyApi(
    item: com.onectrm.akshare.api.generated.futures.futures_sgx_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_sgx_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_sgx_dailyResponse]])
      .send(backend)
    resp
  }

  def futures_main_sinaApi(
    item: com.onectrm.akshare.api.generated.futures.futures_main_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_main_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_main_sinaResponse]])
      .send(backend)
    resp
  }

  def futures_contract_detailApi(
    item: com.onectrm.akshare.api.generated.futures.futures_contract_detailRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_contract_detailResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_contract_detailResponse]]
      )
      .send(backend)
    resp
  }

  def futures_return_index_nhApi(
    item: com.onectrm.akshare.api.generated.futures.futures_return_index_nhRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_return_index_nhResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_return_index_nhResponse]]
      )
      .send(backend)
    resp
  }

  def futures_price_index_nhApi(
    item: com.onectrm.akshare.api.generated.futures.futures_price_index_nhRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_price_index_nhResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_price_index_nhResponse]]
      )
      .send(backend)
    resp
  }

  def futures_nh_volatility_indexApi(
    item: com.onectrm.akshare.api.generated.futures.futures_nh_volatility_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_nh_volatility_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_nh_volatility_indexResponse]]
      )
      .send(backend)
    resp
  }

  def futures_board_index_nhApi(
    item: com.onectrm.akshare.api.generated.futures.futures_board_index_nhRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_board_index_nhResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_board_index_nhResponse]]
      )
      .send(backend)
    resp
  }

  def futures_variety_index_nhApi(
    item: com.onectrm.akshare.api.generated.futures.futures_variety_index_nhRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_variety_index_nhResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_variety_index_nhResponse]]
      )
      .send(backend)
    resp
  }

  def futures_correlation_nhApi(
    item: com.onectrm.akshare.api.generated.futures.futures_correlation_nhRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_correlation_nhResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_correlation_nhResponse]]
      )
      .send(backend)
    resp
  }

  def futures_index_cscidxApi(
    item: com.onectrm.akshare.api.generated.futures.futures_index_cscidxRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_index_cscidxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_index_cscidxResponse]]
      )
      .send(backend)
    resp
  }

  def futures_spot_stockApi(
    item: com.onectrm.akshare.api.generated.futures.futures_spot_stockRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_spot_stockResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_spot_stockResponse]])
      .send(backend)
    resp
  }

  def futures_comex_inventoryApi(
    item: com.onectrm.akshare.api.generated.futures.futures_comex_inventoryRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_comex_inventoryResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_comex_inventoryResponse]]
      )
      .send(backend)
    resp
  }

  def futures_pig_infoApi(
    item: com.onectrm.akshare.api.generated.futures.futures_pig_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_pig_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_pig_infoResponse]])
      .send(backend)
    resp
  }

  def futures_pig_rankApi(
    item: com.onectrm.akshare.api.generated.futures.futures_pig_rankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_pig_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_pig_rankResponse]])
      .send(backend)
    resp
  }

  def futures_egg_price_yearlyApi(
    item: com.onectrm.akshare.api.generated.futures.futures_egg_price_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_egg_price_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_egg_price_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def futures_egg_priceApi(
    item: com.onectrm.akshare.api.generated.futures.futures_egg_priceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_egg_priceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_egg_priceResponse]])
      .send(backend)
    resp
  }

  def futures_egg_price_areaApi(
    item: com.onectrm.akshare.api.generated.futures.futures_egg_price_areaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_egg_price_areaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.futures.futures_egg_price_areaResponse]]
      )
      .send(backend)
    resp
  }

  def futures_news_shmetApi(
    item: com.onectrm.akshare.api.generated.futures.futures_news_shmetRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.futures.JsonItem_futures_news_shmetResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.futures.futures_news_shmetResponse]])
      .send(backend)
    resp
  }

  def energy_carbon_domesticApi(
    item: com.onectrm.akshare.api.generated.energy.energy_carbon_domesticRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.energy.JsonItem_energy_carbon_domesticResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.energy.energy_carbon_domesticResponse]]
      )
      .send(backend)
    resp
  }

  def energy_carbon_bjApi(
    item: com.onectrm.akshare.api.generated.energy.energy_carbon_bjRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.energy.JsonItem_energy_carbon_bjResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.energy.energy_carbon_bjResponse]])
      .send(backend)
    resp
  }

  def energy_carbon_szApi(
    item: com.onectrm.akshare.api.generated.energy.energy_carbon_szRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.energy.JsonItem_energy_carbon_szResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.energy.energy_carbon_szResponse]])
      .send(backend)
    resp
  }

  def energy_carbon_euApi(
    item: com.onectrm.akshare.api.generated.energy.energy_carbon_euRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.energy.JsonItem_energy_carbon_euResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.energy.energy_carbon_euResponse]])
      .send(backend)
    resp
  }

  def energy_carbon_hbApi(
    item: com.onectrm.akshare.api.generated.energy.energy_carbon_hbRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.energy.JsonItem_energy_carbon_hbResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.energy.energy_carbon_hbResponse]])
      .send(backend)
    resp
  }

  def energy_carbon_gzApi(
    item: com.onectrm.akshare.api.generated.energy.energy_carbon_gzRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.energy.JsonItem_energy_carbon_gzResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.energy.energy_carbon_gzResponse]])
      .send(backend)
    resp
  }

  def energy_oil_histApi(item: com.onectrm.akshare.api.generated.energy.energy_oil_histRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.energy.JsonItem_energy_oil_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.energy.energy_oil_histResponse]])
      .send(backend)
    resp
  }

  def energy_oil_detailApi(
    item: com.onectrm.akshare.api.generated.energy.energy_oil_detailRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.energy.JsonItem_energy_oil_detailResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.energy.energy_oil_detailResponse]])
      .send(backend)
    resp
  }

  def currency_boc_sinaApi(item: com.onectrm.akshare.api.generated.fx.currency_boc_sinaRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fx.JsonItem_currency_boc_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fx.currency_boc_sinaResponse]])
      .send(backend)
    resp
  }

  def currency_boc_safeApi(item: com.onectrm.akshare.api.generated.fx.currency_boc_safeRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fx.JsonItem_currency_boc_safeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fx.currency_boc_safeResponse]])
      .send(backend)
    resp
  }

  def fx_spot_quoteApi(item: com.onectrm.akshare.api.generated.fx.fx_spot_quoteRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fx.JsonItem_fx_spot_quoteResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fx.fx_spot_quoteResponse]])
      .send(backend)
    resp
  }

  def fx_swap_quoteApi(item: com.onectrm.akshare.api.generated.fx.fx_swap_quoteRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fx.JsonItem_fx_swap_quoteResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fx.fx_swap_quoteResponse]])
      .send(backend)
    resp
  }

  def fx_pair_quoteApi(item: com.onectrm.akshare.api.generated.fx.fx_pair_quoteRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fx.JsonItem_fx_pair_quoteResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fx.fx_pair_quoteResponse]])
      .send(backend)
    resp
  }

  def currency_pair_mapApi(item: com.onectrm.akshare.api.generated.fx.currency_pair_mapRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fx.JsonItem_currency_pair_mapResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fx.currency_pair_mapResponse]])
      .send(backend)
    resp
  }

  def currency_histApi(item: com.onectrm.akshare.api.generated.fx.currency_histRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fx.JsonItem_currency_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fx.currency_histResponse]])
      .send(backend)
    resp
  }

  def macro_fx_sentimentApi(
    item: com.onectrm.akshare.api.generated.fx.macro_fx_sentimentRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fx.JsonItem_macro_fx_sentimentResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fx.macro_fx_sentimentResponse]])
      .send(backend)
    resp
  }

  def bank_fjcf_table_detailApi(
    item: com.onectrm.akshare.api.generated.bank.bank_fjcf_table_detailRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bank.JsonItem_bank_fjcf_table_detailResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bank.bank_fjcf_table_detailResponse]])
      .send(backend)
    resp
  }

  def bond_cash_summary_sseApi(
    item: com.onectrm.akshare.api.generated.bond.bond_cash_summary_sseRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_cash_summary_sseResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_cash_summary_sseResponse]])
      .send(backend)
    resp
  }

  def bond_deal_summary_sseApi(
    item: com.onectrm.akshare.api.generated.bond.bond_deal_summary_sseRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_deal_summary_sseResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_deal_summary_sseResponse]])
      .send(backend)
    resp
  }

  def get_bond_bankApi(item: com.onectrm.akshare.api.generated.bond.get_bond_bankRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_get_bond_bankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.get_bond_bankResponse]])
      .send(backend)
    resp
  }

  def bond_spot_quoteApi(item: com.onectrm.akshare.api.generated.bond.bond_spot_quoteRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_spot_quoteResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_spot_quoteResponse]])
      .send(backend)
    resp
  }

  def bond_spot_dealApi(item: com.onectrm.akshare.api.generated.bond.bond_spot_dealRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_spot_dealResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_spot_dealResponse]])
      .send(backend)
    resp
  }

  def bond_china_yieldApi(item: com.onectrm.akshare.api.generated.bond.bond_china_yieldRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_china_yieldResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_china_yieldResponse]])
      .send(backend)
    resp
  }

  def bond_repo_zh_tickApi(
    item: com.onectrm.akshare.api.generated.bond.bond_repo_zh_tickRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_repo_zh_tickResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_repo_zh_tickResponse]])
      .send(backend)
    resp
  }

  def bond_zh_hs_spotApi(item: com.onectrm.akshare.api.generated.bond.bond_zh_hs_spotRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_zh_hs_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_zh_hs_spotResponse]])
      .send(backend)
    resp
  }

  def bond_zh_hs_dailyApi(item: com.onectrm.akshare.api.generated.bond.bond_zh_hs_dailyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_zh_hs_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_zh_hs_dailyResponse]])
      .send(backend)
    resp
  }

  def bond_zh_hs_cov_spotApi(
    item: com.onectrm.akshare.api.generated.bond.bond_zh_hs_cov_spotRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_zh_hs_cov_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_zh_hs_cov_spotResponse]])
      .send(backend)
    resp
  }

  def bond_zh_hs_cov_dailyApi(
    item: com.onectrm.akshare.api.generated.bond.bond_zh_hs_cov_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_zh_hs_cov_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_zh_hs_cov_dailyResponse]])
      .send(backend)
    resp
  }

  def bond_zh_hs_cov_minApi(
    item: com.onectrm.akshare.api.generated.bond.bond_zh_hs_cov_minRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_zh_hs_cov_minResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_zh_hs_cov_minResponse]])
      .send(backend)
    resp
  }

  def bond_zh_hs_cov_pre_minApi(
    item: com.onectrm.akshare.api.generated.bond.bond_zh_hs_cov_pre_minRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_zh_hs_cov_pre_minResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_zh_hs_cov_pre_minResponse]])
      .send(backend)
    resp
  }

  def bond_zh_covApi(item: com.onectrm.akshare.api.generated.bond.bond_zh_covRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_zh_covResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_zh_covResponse]])
      .send(backend)
    resp
  }

  def bond_zh_cov_infoApi(item: com.onectrm.akshare.api.generated.bond.bond_zh_cov_infoRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_zh_cov_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_zh_cov_infoResponse]])
      .send(backend)
    resp
  }

  def bond_cov_comparisonApi(
    item: com.onectrm.akshare.api.generated.bond.bond_cov_comparisonRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_cov_comparisonResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_cov_comparisonResponse]])
      .send(backend)
    resp
  }

  def bond_cb_jslApi(item: com.onectrm.akshare.api.generated.bond.bond_cb_jslRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_cb_jslResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_cb_jslResponse]])
      .send(backend)
    resp
  }

  def bond_cb_redeem_jslApi(
    item: com.onectrm.akshare.api.generated.bond.bond_cb_redeem_jslRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_cb_redeem_jslResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_cb_redeem_jslResponse]])
      .send(backend)
    resp
  }

  def bond_cb_index_jslApi(
    item: com.onectrm.akshare.api.generated.bond.bond_cb_index_jslRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_cb_index_jslResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_cb_index_jslResponse]])
      .send(backend)
    resp
  }

  def bond_cb_adj_logs_jslApi(
    item: com.onectrm.akshare.api.generated.bond.bond_cb_adj_logs_jslRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_cb_adj_logs_jslResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_cb_adj_logs_jslResponse]])
      .send(backend)
    resp
  }

  def bond_investing_globalApi(
    item: com.onectrm.akshare.api.generated.bond.bond_investing_globalRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_investing_globalResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.bond.bond_investing_globalResponse]])
      .send(backend)
    resp
  }

  def bond_futures_deliverable_couponsApi(
    item: com.onectrm.akshare.api.generated.bond.bond_futures_deliverable_couponsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_futures_deliverable_couponsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.bond.bond_futures_deliverable_couponsResponse
        ]]
      )
      .send(backend)
    resp
  }

  def bond_china_close_returnApi(
    item: com.onectrm.akshare.api.generated.bond.bond_china_close_returnRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_china_close_returnResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.bond.bond_china_close_returnResponse]]
      )
      .send(backend)
    resp
  }

  def bond_treasure_issue_cninfoApi(
    item: com.onectrm.akshare.api.generated.bond.bond_treasure_issue_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.bond.JsonItem_bond_treasure_issue_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.bond.bond_treasure_issue_cninfoResponse]]
      )
      .send(backend)
    resp
  }

  def macro_bank_usa_interest_rateApi(
    item: com.onectrm.akshare.api.generated.interest_rate.macro_bank_usa_interest_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_macro_bank_usa_interest_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.interest_rate.macro_bank_usa_interest_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_bank_euro_interest_rateApi(
    item: com.onectrm.akshare.api.generated.interest_rate.macro_bank_euro_interest_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_macro_bank_euro_interest_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.interest_rate.macro_bank_euro_interest_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_bank_newzealand_interest_rateApi(
    item: com.onectrm.akshare.api.generated.interest_rate.macro_bank_newzealand_interest_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_macro_bank_newzealand_interest_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.interest_rate.macro_bank_newzealand_interest_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_bank_china_interest_rateApi(
    item: com.onectrm.akshare.api.generated.interest_rate.macro_bank_china_interest_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_macro_bank_china_interest_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.interest_rate.macro_bank_china_interest_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_bank_switzerland_interest_rateApi(
    item: com.onectrm.akshare.api.generated.interest_rate.macro_bank_switzerland_interest_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_macro_bank_switzerland_interest_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.interest_rate.macro_bank_switzerland_interest_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_bank_english_interest_rateApi(
    item: com.onectrm.akshare.api.generated.interest_rate.macro_bank_english_interest_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_macro_bank_english_interest_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.interest_rate.macro_bank_english_interest_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_bank_australia_interest_rateApi(
    item: com.onectrm.akshare.api.generated.interest_rate.macro_bank_australia_interest_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_macro_bank_australia_interest_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.interest_rate.macro_bank_australia_interest_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_bank_japan_interest_rateApi(
    item: com.onectrm.akshare.api.generated.interest_rate.macro_bank_japan_interest_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_macro_bank_japan_interest_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.interest_rate.macro_bank_japan_interest_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_bank_russia_interest_rateApi(
    item: com.onectrm.akshare.api.generated.interest_rate.macro_bank_russia_interest_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_macro_bank_russia_interest_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.interest_rate.macro_bank_russia_interest_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_bank_india_interest_rateApi(
    item: com.onectrm.akshare.api.generated.interest_rate.macro_bank_india_interest_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_macro_bank_india_interest_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.interest_rate.macro_bank_india_interest_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_bank_brazil_interest_rateApi(
    item: com.onectrm.akshare.api.generated.interest_rate.macro_bank_brazil_interest_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_macro_bank_brazil_interest_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.interest_rate.macro_bank_brazil_interest_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def rate_interbankApi(
    item: com.onectrm.akshare.api.generated.interest_rate.rate_interbankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_rate_interbankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.interest_rate.rate_interbankResponse]]
      )
      .send(backend)
    resp
  }

  def repo_rate_histApi(
    item: com.onectrm.akshare.api.generated.interest_rate.repo_rate_histRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.interest_rate.JsonItem_repo_rate_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.interest_rate.repo_rate_histResponse]]
      )
      .send(backend)
    resp
  }

  def sport_olympic_histApi(
    item: com.onectrm.akshare.api.generated.others.sport_olympic_histRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_sport_olympic_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.sport_olympic_histResponse]])
      .send(backend)
    resp
  }

  def sport_olympic_winter_histApi(
    item: com.onectrm.akshare.api.generated.others.sport_olympic_winter_histRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_sport_olympic_winter_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.sport_olympic_winter_histResponse]]
      )
      .send(backend)
    resp
  }

  def car_cpca_energy_saleApi(
    item: com.onectrm.akshare.api.generated.others.car_cpca_energy_saleRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_car_cpca_energy_saleResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.car_cpca_energy_saleResponse]])
      .send(backend)
    resp
  }

  def car_gasgoo_sale_rankApi(
    item: com.onectrm.akshare.api.generated.others.car_gasgoo_sale_rankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_car_gasgoo_sale_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.car_gasgoo_sale_rankResponse]])
      .send(backend)
    resp
  }

  def news_cctvApi(item: com.onectrm.akshare.api.generated.others.news_cctvRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_news_cctvResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.news_cctvResponse]])
      .send(backend)
    resp
  }

  def sunrise_dailyApi(item: com.onectrm.akshare.api.generated.others.sunrise_dailyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_sunrise_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.sunrise_dailyResponse]])
      .send(backend)
    resp
  }

  def sunrise_monthlyApi(item: com.onectrm.akshare.api.generated.others.sunrise_monthlyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_sunrise_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.sunrise_monthlyResponse]])
      .send(backend)
    resp
  }

  def air_quality_hebeiApi(
    item: com.onectrm.akshare.api.generated.others.air_quality_hebeiRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_air_quality_hebeiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.air_quality_hebeiResponse]])
      .send(backend)
    resp
  }

  def air_city_tableApi(item: com.onectrm.akshare.api.generated.others.air_city_tableRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_air_city_tableResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.air_city_tableResponse]])
      .send(backend)
    resp
  }

  def air_quality_histApi(
    item: com.onectrm.akshare.api.generated.others.air_quality_histRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_air_quality_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.air_quality_histResponse]])
      .send(backend)
    resp
  }

  def air_quality_rankApi(
    item: com.onectrm.akshare.api.generated.others.air_quality_rankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_air_quality_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.air_quality_rankResponse]])
      .send(backend)
    resp
  }

  def air_quality_watch_pointApi(
    item: com.onectrm.akshare.api.generated.others.air_quality_watch_pointRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_air_quality_watch_pointResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.air_quality_watch_pointResponse]]
      )
      .send(backend)
    resp
  }

  def fortune_rankApi(item: com.onectrm.akshare.api.generated.others.fortune_rankRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_fortune_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.fortune_rankResponse]])
      .send(backend)
    resp
  }

  def fortune_rank_engApi(
    item: com.onectrm.akshare.api.generated.others.fortune_rank_engRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_fortune_rank_engResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.fortune_rank_engResponse]])
      .send(backend)
    resp
  }

  def forbes_rankApi(item: com.onectrm.akshare.api.generated.others.forbes_rankRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_forbes_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.forbes_rankResponse]])
      .send(backend)
    resp
  }

  def xincaifu_rankApi(item: com.onectrm.akshare.api.generated.others.xincaifu_rankRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_xincaifu_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.xincaifu_rankResponse]])
      .send(backend)
    resp
  }

  def hurun_rankApi(item: com.onectrm.akshare.api.generated.others.hurun_rankRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_hurun_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.hurun_rankResponse]])
      .send(backend)
    resp
  }

  def movie_boxoffice_realtimeApi(
    item: com.onectrm.akshare.api.generated.others.movie_boxoffice_realtimeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_movie_boxoffice_realtimeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.movie_boxoffice_realtimeResponse]]
      )
      .send(backend)
    resp
  }

  def movie_boxoffice_dailyApi(
    item: com.onectrm.akshare.api.generated.others.movie_boxoffice_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_movie_boxoffice_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.movie_boxoffice_dailyResponse]]
      )
      .send(backend)
    resp
  }

  def movie_boxoffice_weeklyApi(
    item: com.onectrm.akshare.api.generated.others.movie_boxoffice_weeklyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_movie_boxoffice_weeklyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.movie_boxoffice_weeklyResponse]]
      )
      .send(backend)
    resp
  }

  def movie_boxoffice_monthlyApi(
    item: com.onectrm.akshare.api.generated.others.movie_boxoffice_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_movie_boxoffice_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.movie_boxoffice_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def movie_boxoffice_yearlyApi(
    item: com.onectrm.akshare.api.generated.others.movie_boxoffice_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_movie_boxoffice_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.movie_boxoffice_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def movie_boxoffice_yearly_first_weekApi(
    item: com.onectrm.akshare.api.generated.others.movie_boxoffice_yearly_first_weekRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_movie_boxoffice_yearly_first_weekResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.others.movie_boxoffice_yearly_first_weekResponse
        ]]
      )
      .send(backend)
    resp
  }

  def movie_boxoffice_cinema_dailyApi(
    item: com.onectrm.akshare.api.generated.others.movie_boxoffice_cinema_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_movie_boxoffice_cinema_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.movie_boxoffice_cinema_dailyResponse]]
      )
      .send(backend)
    resp
  }

  def movie_boxoffice_cinema_weeklyApi(
    item: com.onectrm.akshare.api.generated.others.movie_boxoffice_cinema_weeklyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_movie_boxoffice_cinema_weeklyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.movie_boxoffice_cinema_weeklyResponse]]
      )
      .send(backend)
    resp
  }

  def video_tvApi(item: com.onectrm.akshare.api.generated.others.video_tvRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_video_tvResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.video_tvResponse]])
      .send(backend)
    resp
  }

  def video_variety_showApi(
    item: com.onectrm.akshare.api.generated.others.video_variety_showRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_video_variety_showResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.video_variety_showResponse]])
      .send(backend)
    resp
  }

  def business_value_artistApi(
    item: com.onectrm.akshare.api.generated.others.business_value_artistRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_business_value_artistResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.business_value_artistResponse]]
      )
      .send(backend)
    resp
  }

  def online_value_artistApi(
    item: com.onectrm.akshare.api.generated.others.online_value_artistRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_online_value_artistResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.online_value_artistResponse]])
      .send(backend)
    resp
  }

  def club_rank_gameApi(item: com.onectrm.akshare.api.generated.others.club_rank_gameRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_club_rank_gameResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.club_rank_gameResponse]])
      .send(backend)
    resp
  }

  def player_rank_gameApi(
    item: com.onectrm.akshare.api.generated.others.player_rank_gameRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_player_rank_gameResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.player_rank_gameResponse]])
      .send(backend)
    resp
  }

  def cost_livingApi(item: com.onectrm.akshare.api.generated.others.cost_livingRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_cost_livingResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.cost_livingResponse]])
      .send(backend)
    resp
  }

  def death_companyApi(item: com.onectrm.akshare.api.generated.others.death_companyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_death_companyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.death_companyResponse]])
      .send(backend)
    resp
  }

  def nicorn_companyApi(item: com.onectrm.akshare.api.generated.others.nicorn_companyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_nicorn_companyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.nicorn_companyResponse]])
      .send(backend)
    resp
  }

  def maxima_companyApi(item: com.onectrm.akshare.api.generated.others.maxima_companyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_maxima_companyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.others.maxima_companyResponse]])
      .send(backend)
    resp
  }

  def stock_js_weibo_reportApi(
    item: com.onectrm.akshare.api.generated.others.stock_js_weibo_reportRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_stock_js_weibo_reportResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.stock_js_weibo_reportResponse]]
      )
      .send(backend)
    resp
  }

  def index_bloomberg_billionairesApi(
    item: com.onectrm.akshare.api.generated.others.index_bloomberg_billionairesRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_index_bloomberg_billionairesResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.others.index_bloomberg_billionairesResponse]]
      )
      .send(backend)
    resp
  }

  def index_bloomberg_billionaires_histApi(
    item: com.onectrm.akshare.api.generated.others.index_bloomberg_billionaires_histRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.others.JsonItem_index_bloomberg_billionaires_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.others.index_bloomberg_billionaires_histResponse
        ]]
      )
      .send(backend)
    resp
  }

  def option_finance_boardApi(
    item: com.onectrm.akshare.api.generated.option.option_finance_boardRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_finance_boardResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.option.option_finance_boardResponse]])
      .send(backend)
    resp
  }

  def option_risk_indicator_sseApi(
    item: com.onectrm.akshare.api.generated.option.option_risk_indicator_sseRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_risk_indicator_sseResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_risk_indicator_sseResponse]]
      )
      .send(backend)
    resp
  }

  def option_cffex_hs300_list_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_cffex_hs300_list_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_cffex_hs300_list_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_cffex_hs300_list_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_cffex_zz1000_list_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_cffex_zz1000_list_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_cffex_zz1000_list_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_cffex_zz1000_list_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_cffex_hs300_spot_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_cffex_hs300_spot_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_cffex_hs300_spot_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_cffex_hs300_spot_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_cffex_hs300_daily_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_cffex_hs300_daily_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_cffex_hs300_daily_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_cffex_hs300_daily_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_sse_list_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_sse_list_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_sse_list_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.option.option_sse_list_sinaResponse]])
      .send(backend)
    resp
  }

  def option_sse_expire_day_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_sse_expire_day_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_sse_expire_day_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_sse_expire_day_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_sse_codes_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_sse_codes_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_sse_codes_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_sse_codes_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_sse_spot_price_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_sse_spot_price_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_sse_spot_price_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_sse_spot_price_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_sse_underlying_spot_price_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_sse_underlying_spot_price_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_sse_underlying_spot_price_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.option.option_sse_underlying_spot_price_sinaResponse
        ]]
      )
      .send(backend)
    resp
  }

  def option_sse_greeks_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_sse_greeks_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_sse_greeks_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_sse_greeks_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_sse_minute_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_sse_minute_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_sse_minute_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_sse_minute_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_sse_daily_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_sse_daily_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_sse_daily_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_sse_daily_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_finance_minute_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_finance_minute_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_finance_minute_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_finance_minute_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_current_emApi(
    item: com.onectrm.akshare.api.generated.option.option_current_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_current_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.option.option_current_emResponse]])
      .send(backend)
    resp
  }

  def option_lhb_emApi(item: com.onectrm.akshare.api.generated.option.option_lhb_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_lhb_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.option.option_lhb_emResponse]])
      .send(backend)
    resp
  }

  def option_value_analysis_emApi(
    item: com.onectrm.akshare.api.generated.option.option_value_analysis_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_value_analysis_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_value_analysis_emResponse]]
      )
      .send(backend)
    resp
  }

  def option_risk_analysis_emApi(
    item: com.onectrm.akshare.api.generated.option.option_risk_analysis_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_risk_analysis_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_risk_analysis_emResponse]]
      )
      .send(backend)
    resp
  }

  def option_premium_analysis_emApi(
    item: com.onectrm.akshare.api.generated.option.option_premium_analysis_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_premium_analysis_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_premium_analysis_emResponse]]
      )
      .send(backend)
    resp
  }

  def option_commodity_contract_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_commodity_contract_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_commodity_contract_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.option.option_commodity_contract_sinaResponse
        ]]
      )
      .send(backend)
    resp
  }

  def option_commodity_contract_table_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_commodity_contract_table_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_commodity_contract_table_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.option.option_commodity_contract_table_sinaResponse
        ]]
      )
      .send(backend)
    resp
  }

  def option_commodity_hist_sinaApi(
    item: com.onectrm.akshare.api.generated.option.option_commodity_hist_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_commodity_hist_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.option.option_commodity_hist_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def option_shfe_dailyApi(
    item: com.onectrm.akshare.api.generated.option.option_shfe_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_shfe_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.option.option_shfe_dailyResponse]])
      .send(backend)
    resp
  }

  def option_dce_dailyApi(
    item: com.onectrm.akshare.api.generated.option.option_dce_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_dce_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.option.option_dce_dailyResponse]])
      .send(backend)
    resp
  }

  def option_czce_dailyApi(
    item: com.onectrm.akshare.api.generated.option.option_czce_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_czce_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.option.option_czce_dailyResponse]])
      .send(backend)
    resp
  }

  def option_czce_histApi(
    item: com.onectrm.akshare.api.generated.option.option_czce_histRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.option.JsonItem_option_czce_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.option.option_czce_histResponse]])
      .send(backend)
    resp
  }

  def macro_cnbsApi(item: com.onectrm.akshare.api.generated.macros.macro_cnbsRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_cnbsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_cnbsResponse]])
      .send(backend)
    resp
  }

  def macro_china_qyspjgApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_qyspjgRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_qyspjgResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_qyspjgResponse]])
      .send(backend)
    resp
  }

  def macro_china_fdiApi(item: com.onectrm.akshare.api.generated.macros.macro_china_fdiRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_fdiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_fdiResponse]])
      .send(backend)
    resp
  }

  def macro_china_lprApi(item: com.onectrm.akshare.api.generated.macros.macro_china_lprRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_lprResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_lprResponse]])
      .send(backend)
    resp
  }

  def macro_china_shrzgmApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_shrzgmRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_shrzgmResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_shrzgmResponse]])
      .send(backend)
    resp
  }

  def macro_china_gdp_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_gdp_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_gdp_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_gdp_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_cpi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_cpi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_cpi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_cpi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_cpi_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_cpi_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_cpi_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_cpi_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_ppi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_ppi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_ppi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_ppi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_exports_yoyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_exports_yoyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_exports_yoyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_exports_yoyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_imports_yoyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_imports_yoyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_imports_yoyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_imports_yoyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_trade_balanceApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_trade_balanceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_trade_balanceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_trade_balanceResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_gyzjzApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_gyzjzRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_gyzjzResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_gyzjzResponse]])
      .send(backend)
    resp
  }

  def macro_china_industrial_production_yoyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_industrial_production_yoyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_industrial_production_yoyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_industrial_production_yoyResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_pmi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_pmi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_pmi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_pmi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_cx_pmi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_cx_pmi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_cx_pmi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_cx_pmi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_cx_services_pmi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_cx_services_pmi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_cx_services_pmi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_cx_services_pmi_yearlyResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_non_man_pmiApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_non_man_pmiRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_non_man_pmiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_non_man_pmiResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_fx_reserves_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_fx_reserves_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_fx_reserves_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_fx_reserves_yearlyResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_m2_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_m2_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_m2_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_m2_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_new_house_priceApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_new_house_priceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_new_house_priceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_new_house_priceResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_enterprise_boom_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_enterprise_boom_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_enterprise_boom_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_enterprise_boom_indexResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_national_tax_receiptsApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_national_tax_receiptsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_national_tax_receiptsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_national_tax_receiptsResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_bank_financingApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_bank_financingRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_bank_financingResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_bank_financingResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_insurance_incomeApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_insurance_incomeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_insurance_incomeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_insurance_incomeResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_mobile_numberApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_mobile_numberRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_mobile_numberResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_mobile_numberResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_vegetable_basketApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_vegetable_basketRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_vegetable_basketResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_vegetable_basketResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_agricultural_productApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_agricultural_productRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_agricultural_productResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_agricultural_productResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_agricultural_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_agricultural_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_agricultural_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_agricultural_indexResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_energy_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_energy_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_energy_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_energy_indexResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_commodity_price_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_commodity_price_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_commodity_price_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_commodity_price_indexResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_global_sox_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_global_sox_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_global_sox_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_global_sox_indexResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_yw_electronic_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_yw_electronic_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_yw_electronic_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_yw_electronic_indexResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_construction_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_construction_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_construction_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_construction_indexResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_construction_price_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_construction_price_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_construction_price_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_construction_price_indexResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_lpi_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_lpi_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_lpi_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_lpi_indexResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_bdti_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_bdti_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_bdti_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_bdti_indexResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_bsi_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_bsi_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_bsi_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_bsi_indexResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_new_financial_creditApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_new_financial_creditRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_new_financial_creditResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_new_financial_creditResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_cpiApi(item: com.onectrm.akshare.api.generated.macros.macro_china_cpiRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_cpiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_cpiResponse]])
      .send(backend)
    resp
  }

  def macro_china_gdpApi(item: com.onectrm.akshare.api.generated.macros.macro_china_gdpRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_gdpResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_gdpResponse]])
      .send(backend)
    resp
  }

  def macro_china_ppiApi(item: com.onectrm.akshare.api.generated.macros.macro_china_ppiRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_ppiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_ppiResponse]])
      .send(backend)
    resp
  }

  def macro_china_pmiApi(item: com.onectrm.akshare.api.generated.macros.macro_china_pmiRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_pmiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_pmiResponse]])
      .send(backend)
    resp
  }

  def macro_china_gdzctzApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_gdzctzRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_gdzctzResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_gdzctzResponse]])
      .send(backend)
    resp
  }

  def macro_china_hgjckApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_hgjckRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hgjckResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_hgjckResponse]])
      .send(backend)
    resp
  }

  def macro_china_czsrApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_czsrRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_czsrResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_czsrResponse]])
      .send(backend)
    resp
  }

  def macro_china_whxdApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_whxdRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_whxdResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_whxdResponse]])
      .send(backend)
    resp
  }

  def macro_china_wbckApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_wbckRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_wbckResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_wbckResponse]])
      .send(backend)
    resp
  }

  def macro_china_hbApi(item: com.onectrm.akshare.api.generated.macros.macro_china_hbRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hbResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_hbResponse]])
      .send(backend)
    resp
  }

  def macro_china_gkscczApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_gkscczRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_gkscczResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_gkscczResponse]])
      .send(backend)
    resp
  }

  def macro_china_bond_publicApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_bond_publicRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_bond_publicResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_bond_publicResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_xfzxxApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_xfzxxRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_xfzxxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_xfzxxResponse]])
      .send(backend)
    resp
  }

  def macro_china_reserve_requirement_ratioApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_reserve_requirement_ratioRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_reserve_requirement_ratioResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_reserve_requirement_ratioResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_consumer_goods_retailApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_consumer_goods_retailRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_consumer_goods_retailResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_consumer_goods_retailResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_society_electricityApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_society_electricityRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_society_electricityResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_society_electricityResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_society_traffic_volumeApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_society_traffic_volumeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_society_traffic_volumeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_society_traffic_volumeResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_postal_telecommunicationalApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_postal_telecommunicationalRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_postal_telecommunicationalResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_postal_telecommunicationalResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_international_tourism_fxApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_international_tourism_fxRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_international_tourism_fxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_international_tourism_fxResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_passenger_load_factorApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_passenger_load_factorRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_passenger_load_factorResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_passenger_load_factorResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_freight_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_freight_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_freight_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_freight_indexResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_central_bank_balanceApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_central_bank_balanceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_central_bank_balanceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_central_bank_balanceResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_insuranceApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_insuranceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_insuranceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_insuranceResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_supply_of_moneyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_supply_of_moneyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_supply_of_moneyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_supply_of_moneyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_swap_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_swap_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_swap_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_swap_rateResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_foreign_exchange_goldApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_foreign_exchange_goldRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_foreign_exchange_goldResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_foreign_exchange_goldResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_retail_price_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_retail_price_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_retail_price_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_retail_price_indexResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_real_estateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_real_estateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_real_estateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_real_estateResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_fx_goldApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_fx_goldRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_fx_goldResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_fx_goldResponse]])
      .send(backend)
    resp
  }

  def macro_china_money_supplyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_money_supplyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_money_supplyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_money_supplyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_stock_market_capApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_stock_market_capRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_stock_market_capResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_stock_market_capResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_shibor_allApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_shibor_allRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_shibor_allResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_shibor_allResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_hk_market_infoApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_hk_market_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hk_market_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_hk_market_infoResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_daily_energyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_daily_energyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_daily_energyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_daily_energyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_rmbApi(item: com.onectrm.akshare.api.generated.macros.macro_china_rmbRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_rmbResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_rmbResponse]])
      .send(backend)
    resp
  }

  def macro_china_market_margin_szApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_market_margin_szRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_market_margin_szResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_market_margin_szResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_market_margin_shApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_market_margin_shRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_market_margin_shResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_market_margin_shResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_au_reportApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_au_reportRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_au_reportResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_au_reportResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_ctciApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_ctciRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_ctciResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_ctciResponse]])
      .send(backend)
    resp
  }

  def macro_china_ctci_detailApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_ctci_detailRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_ctci_detailResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_ctci_detailResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_ctci_detail_histApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_ctci_detail_histRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_ctci_detail_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_ctci_detail_histResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_hk_cpiApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_hk_cpiRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hk_cpiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_hk_cpiResponse]])
      .send(backend)
    resp
  }

  def macro_china_hk_cpi_ratioApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_hk_cpi_ratioRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hk_cpi_ratioResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_hk_cpi_ratioResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_hk_rate_of_unemploymentApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_hk_rate_of_unemploymentRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hk_rate_of_unemploymentResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_hk_rate_of_unemploymentResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_hk_gbpApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_hk_gbpRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hk_gbpResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_hk_gbpResponse]])
      .send(backend)
    resp
  }

  def macro_china_hk_gbp_ratioApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_hk_gbp_ratioRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hk_gbp_ratioResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_hk_gbp_ratioResponse]]
      )
      .send(backend)
    resp
  }

  def macro_china_hk_building_volumeApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_hk_building_volumeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hk_building_volumeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_hk_building_volumeResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_hk_building_amountApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_hk_building_amountRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hk_building_amountResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_hk_building_amountResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_hk_trade_diff_ratioApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_hk_trade_diff_ratioRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hk_trade_diff_ratioResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_china_hk_trade_diff_ratioResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_china_hk_ppiApi(
    item: com.onectrm.akshare.api.generated.macros.macro_china_hk_ppiRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_china_hk_ppiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_china_hk_ppiResponse]])
      .send(backend)
    resp
  }

  def macro_usa_gdp_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_gdp_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_gdp_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_gdp_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_cpi_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_cpi_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_cpi_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_cpi_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_core_cpi_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_core_cpi_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_core_cpi_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_core_cpi_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_personal_spendingApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_personal_spendingRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_personal_spendingResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_personal_spendingResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_retail_salesApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_retail_salesRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_retail_salesResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_retail_salesResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_import_priceApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_import_priceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_import_priceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_import_priceResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_export_priceApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_export_priceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_export_priceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_export_priceResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_lmciApi(item: com.onectrm.akshare.api.generated.macros.macro_usa_lmciRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_lmciResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_lmciResponse]])
      .send(backend)
    resp
  }

  def macro_usa_unemployment_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_unemployment_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_unemployment_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_unemployment_rateResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_job_cutsApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_job_cutsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_job_cutsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_job_cutsResponse]])
      .send(backend)
    resp
  }

  def macro_usa_non_farmApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_non_farmRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_non_farmResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_non_farmResponse]])
      .send(backend)
    resp
  }

  def macro_usa_adp_employmentApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_adp_employmentRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_adp_employmentResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_adp_employmentResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_core_pce_priceApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_core_pce_priceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_core_pce_priceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_core_pce_priceResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_real_consumer_spendingApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_real_consumer_spendingRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_real_consumer_spendingResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_usa_real_consumer_spendingResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_usa_trade_balanceApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_trade_balanceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_trade_balanceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_trade_balanceResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_current_accountApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_current_accountRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_current_accountResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_current_accountResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_rig_countApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_rig_countRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_rig_countResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_rig_countResponse]])
      .send(backend)
    resp
  }

  def macro_usa_ppiApi(item: com.onectrm.akshare.api.generated.macros.macro_usa_ppiRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_ppiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_ppiResponse]])
      .send(backend)
    resp
  }

  def macro_usa_core_ppiApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_core_ppiRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_core_ppiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_core_ppiResponse]])
      .send(backend)
    resp
  }

  def macro_usa_api_crude_stockApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_api_crude_stockRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_api_crude_stockResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_api_crude_stockResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_pmiApi(item: com.onectrm.akshare.api.generated.macros.macro_usa_pmiRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_pmiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_pmiResponse]])
      .send(backend)
    resp
  }

  def macro_usa_ism_pmiApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_ism_pmiRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_ism_pmiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_ism_pmiResponse]])
      .send(backend)
    resp
  }

  def macro_usa_industrial_productionApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_industrial_productionRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_industrial_productionResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_usa_industrial_productionResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_usa_durable_goods_ordersApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_durable_goods_ordersRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_durable_goods_ordersResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_usa_durable_goods_ordersResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_usa_factory_ordersApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_factory_ordersRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_factory_ordersResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_factory_ordersResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_services_pmiApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_services_pmiRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_services_pmiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_services_pmiResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_business_inventoriesApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_business_inventoriesRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_business_inventoriesResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_usa_business_inventoriesResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_usa_ism_non_pmiApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_ism_non_pmiRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_ism_non_pmiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_ism_non_pmiResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_house_startsApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_house_startsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_house_startsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_house_startsResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_new_home_salesApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_new_home_salesRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_new_home_salesResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_new_home_salesResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_building_permitsApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_building_permitsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_building_permitsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_building_permitsResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_exist_home_salesApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_exist_home_salesRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_exist_home_salesResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_exist_home_salesResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_house_price_indexApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_house_price_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_house_price_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_house_price_indexResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_spcs20Api(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_spcs20Request
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_spcs20Response._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_spcs20Response]])
      .send(backend)
    resp
  }

  def macro_usa_pending_home_salesApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_pending_home_salesRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_pending_home_salesResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_pending_home_salesResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_phsApi(item: com.onectrm.akshare.api.generated.macros.macro_usa_phsRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_phsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_phsResponse]])
      .send(backend)
    resp
  }

  def macro_usa_cb_consumer_confidenceApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_cb_consumer_confidenceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_cb_consumer_confidenceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_usa_cb_consumer_confidenceResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_usa_nfib_small_businessApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_nfib_small_businessRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_nfib_small_businessResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_nfib_small_businessResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_michigan_consumer_sentimentApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_michigan_consumer_sentimentRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_michigan_consumer_sentimentResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_usa_michigan_consumer_sentimentResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_usa_eia_crude_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_eia_crude_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_eia_crude_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_eia_crude_rateResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_initial_joblessApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_initial_joblessRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_initial_joblessResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_initial_joblessResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_crude_innerApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_crude_innerRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_crude_innerResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_crude_innerResponse]]
      )
      .send(backend)
    resp
  }

  def macro_euro_gdp_yoyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_gdp_yoyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_gdp_yoyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_euro_gdp_yoyResponse]])
      .send(backend)
    resp
  }

  def macro_euro_cpi_momApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_cpi_momRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_cpi_momResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_euro_cpi_momResponse]])
      .send(backend)
    resp
  }

  def macro_euro_cpi_yoyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_cpi_yoyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_cpi_yoyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_euro_cpi_yoyResponse]])
      .send(backend)
    resp
  }

  def macro_euro_ppi_momApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_ppi_momRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_ppi_momResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_euro_ppi_momResponse]])
      .send(backend)
    resp
  }

  def macro_euro_retail_sales_momApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_retail_sales_momRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_retail_sales_momResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_euro_retail_sales_momResponse]]
      )
      .send(backend)
    resp
  }

  def macro_euro_employment_change_qoqApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_employment_change_qoqRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_employment_change_qoqResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_euro_employment_change_qoqResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_euro_unemployment_rate_momApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_unemployment_rate_momRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_unemployment_rate_momResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_euro_unemployment_rate_momResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_euro_trade_balanceApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_trade_balanceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_trade_balanceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_euro_trade_balanceResponse]]
      )
      .send(backend)
    resp
  }

  def macro_euro_current_account_momApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_current_account_momRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_current_account_momResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_euro_current_account_momResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_euro_industrial_production_momApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_industrial_production_momRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_industrial_production_momResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_euro_industrial_production_momResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_euro_manufacturing_pmiApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_manufacturing_pmiRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_manufacturing_pmiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_euro_manufacturing_pmiResponse]]
      )
      .send(backend)
    resp
  }

  def macro_euro_services_pmiApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_services_pmiRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_services_pmiResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_euro_services_pmiResponse]]
      )
      .send(backend)
    resp
  }

  def macro_euro_zew_economic_sentimentApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_zew_economic_sentimentRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_zew_economic_sentimentResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_euro_zew_economic_sentimentResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_euro_sentix_investor_confidenceApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_sentix_investor_confidenceRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_sentix_investor_confidenceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_euro_sentix_investor_confidenceResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_germany_ifoApi(
    item: com.onectrm.akshare.api.generated.macros.macro_germany_ifoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_germany_ifoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_germany_ifoResponse]])
      .send(backend)
    resp
  }

  def macro_germany_cpi_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_germany_cpi_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_germany_cpi_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_germany_cpi_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_germany_cpi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_germany_cpi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_germany_cpi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_germany_cpi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_germany_trade_adjustedApi(
    item: com.onectrm.akshare.api.generated.macros.macro_germany_trade_adjustedRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_germany_trade_adjustedResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_germany_trade_adjustedResponse]]
      )
      .send(backend)
    resp
  }

  def macro_germany_gdpApi(
    item: com.onectrm.akshare.api.generated.macros.macro_germany_gdpRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_germany_gdpResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_germany_gdpResponse]])
      .send(backend)
    resp
  }

  def macro_germany_retail_sale_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_germany_retail_sale_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_germany_retail_sale_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_germany_retail_sale_monthlyResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_germany_retail_sale_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_germany_retail_sale_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_germany_retail_sale_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_germany_retail_sale_yearlyResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_germany_zewApi(
    item: com.onectrm.akshare.api.generated.macros.macro_germany_zewRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_germany_zewResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_germany_zewResponse]])
      .send(backend)
    resp
  }

  def macro_swiss_svmeApi(
    item: com.onectrm.akshare.api.generated.macros.macro_swiss_svmeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_swiss_svmeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_swiss_svmeResponse]])
      .send(backend)
    resp
  }

  def macro_swiss_tradeApi(
    item: com.onectrm.akshare.api.generated.macros.macro_swiss_tradeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_swiss_tradeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_swiss_tradeResponse]])
      .send(backend)
    resp
  }

  def macro_swiss_cpi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_swiss_cpi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_swiss_cpi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_swiss_cpi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_swiss_gdp_quarterlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_swiss_gdp_quarterlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_swiss_gdp_quarterlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_swiss_gdp_quarterlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_swiss_gbd_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_swiss_gbd_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_swiss_gbd_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_swiss_gbd_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_swiss_gbd_bank_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_swiss_gbd_bank_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_swiss_gbd_bank_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_swiss_gbd_bank_rateResponse]]
      )
      .send(backend)
    resp
  }

  def macro_japan_bank_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_japan_bank_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_japan_bank_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_japan_bank_rateResponse]]
      )
      .send(backend)
    resp
  }

  def macro_japan_cpi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_japan_cpi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_japan_cpi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_japan_cpi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_japan_core_cpi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_japan_core_cpi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_japan_core_cpi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_japan_core_cpi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_japan_unemployment_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_japan_unemployment_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_japan_unemployment_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_japan_unemployment_rateResponse]]
      )
      .send(backend)
    resp
  }

  def macro_japan_head_indicatorApi(
    item: com.onectrm.akshare.api.generated.macros.macro_japan_head_indicatorRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_japan_head_indicatorResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_japan_head_indicatorResponse]]
      )
      .send(backend)
    resp
  }

  def macro_uk_halifax_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_halifax_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_halifax_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_halifax_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_uk_halifax_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_halifax_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_halifax_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_halifax_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_uk_tradeApi(item: com.onectrm.akshare.api.generated.macros.macro_uk_tradeRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_tradeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_tradeResponse]])
      .send(backend)
    resp
  }

  def macro_uk_bank_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_bank_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_bank_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_bank_rateResponse]])
      .send(backend)
    resp
  }

  def macro_uk_core_cpi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_core_cpi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_core_cpi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_core_cpi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_uk_core_cpi_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_core_cpi_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_core_cpi_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_core_cpi_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_uk_cpi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_cpi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_cpi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_cpi_yearlyResponse]])
      .send(backend)
    resp
  }

  def macro_uk_cpi_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_cpi_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_cpi_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_cpi_monthlyResponse]])
      .send(backend)
    resp
  }

  def macro_uk_retail_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_retail_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_retail_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_retail_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_uk_retail_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_retail_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_retail_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_retail_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_uk_rightmove_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_rightmove_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_rightmove_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_rightmove_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_uk_rightmove_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_rightmove_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_rightmove_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_rightmove_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_uk_gdp_quarterlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_gdp_quarterlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_gdp_quarterlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_gdp_quarterlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_uk_gdp_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_gdp_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_gdp_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_gdp_yearlyResponse]])
      .send(backend)
    resp
  }

  def macro_uk_unemployment_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_uk_unemployment_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_uk_unemployment_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_uk_unemployment_rateResponse]]
      )
      .send(backend)
    resp
  }

  def macro_australia_retail_rate_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_australia_retail_rate_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_australia_retail_rate_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_australia_retail_rate_monthlyResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_australia_tradeApi(
    item: com.onectrm.akshare.api.generated.macros.macro_australia_tradeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_australia_tradeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_australia_tradeResponse]]
      )
      .send(backend)
    resp
  }

  def macro_australia_unemployment_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_australia_unemployment_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_australia_unemployment_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_australia_unemployment_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_australia_ppi_quarterlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_australia_ppi_quarterlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_australia_ppi_quarterlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_australia_ppi_quarterlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_australia_cpi_quarterlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_australia_cpi_quarterlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_australia_cpi_quarterlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_australia_cpi_quarterlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_australia_cpi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_australia_cpi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_australia_cpi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_australia_cpi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_australia_bank_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_australia_bank_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_australia_bank_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_australia_bank_rateResponse]]
      )
      .send(backend)
    resp
  }

  def macro_canada_new_house_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_canada_new_house_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_canada_new_house_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_canada_new_house_rateResponse]]
      )
      .send(backend)
    resp
  }

  def macro_canada_unemployment_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_canada_unemployment_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_canada_unemployment_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_canada_unemployment_rateResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_canada_tradeApi(
    item: com.onectrm.akshare.api.generated.macros.macro_canada_tradeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_canada_tradeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_canada_tradeResponse]])
      .send(backend)
    resp
  }

  def macro_canada_retail_rate_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_canada_retail_rate_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_canada_retail_rate_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_canada_retail_rate_monthlyResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_canada_bank_rateApi(
    item: com.onectrm.akshare.api.generated.macros.macro_canada_bank_rateRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_canada_bank_rateResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_canada_bank_rateResponse]]
      )
      .send(backend)
    resp
  }

  def macro_canada_core_cpi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_canada_core_cpi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_canada_core_cpi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_canada_core_cpi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_canada_core_cpi_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_canada_core_cpi_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_canada_core_cpi_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_canada_core_cpi_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_canada_cpi_yearlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_canada_cpi_yearlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_canada_cpi_yearlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_canada_cpi_yearlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_canada_cpi_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_canada_cpi_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_canada_cpi_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_canada_cpi_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_canada_gdp_monthlyApi(
    item: com.onectrm.akshare.api.generated.macros.macro_canada_gdp_monthlyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_canada_gdp_monthlyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_canada_gdp_monthlyResponse]]
      )
      .send(backend)
    resp
  }

  def macro_cons_gold_volumeApi(
    item: com.onectrm.akshare.api.generated.macros.macro_cons_gold_volumeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_cons_gold_volumeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_cons_gold_volumeResponse]]
      )
      .send(backend)
    resp
  }

  def macro_cons_gold_changeApi(
    item: com.onectrm.akshare.api.generated.macros.macro_cons_gold_changeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_cons_gold_changeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_cons_gold_changeResponse]]
      )
      .send(backend)
    resp
  }

  def macro_cons_gold_amountApi(
    item: com.onectrm.akshare.api.generated.macros.macro_cons_gold_amountRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_cons_gold_amountResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_cons_gold_amountResponse]]
      )
      .send(backend)
    resp
  }

  def macro_cons_silver_volumeApi(
    item: com.onectrm.akshare.api.generated.macros.macro_cons_silver_volumeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_cons_silver_volumeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_cons_silver_volumeResponse]]
      )
      .send(backend)
    resp
  }

  def macro_cons_silver_changeApi(
    item: com.onectrm.akshare.api.generated.macros.macro_cons_silver_changeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_cons_silver_changeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_cons_silver_changeResponse]]
      )
      .send(backend)
    resp
  }

  def macro_cons_silver_amountApi(
    item: com.onectrm.akshare.api.generated.macros.macro_cons_silver_amountRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_cons_silver_amountResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_cons_silver_amountResponse]]
      )
      .send(backend)
    resp
  }

  def macro_cons_opec_monthApi(
    item: com.onectrm.akshare.api.generated.macros.macro_cons_opec_monthRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_cons_opec_monthResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_cons_opec_monthResponse]]
      )
      .send(backend)
    resp
  }

  def macro_euro_lme_holdingApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_lme_holdingRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_lme_holdingResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_euro_lme_holdingResponse]]
      )
      .send(backend)
    resp
  }

  def macro_euro_lme_stockApi(
    item: com.onectrm.akshare.api.generated.macros.macro_euro_lme_stockRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_euro_lme_stockResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.macro_euro_lme_stockResponse]])
      .send(backend)
    resp
  }

  def macro_usa_cftc_nc_holdingApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_cftc_nc_holdingRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_cftc_nc_holdingResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_cftc_nc_holdingResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_cftc_c_holdingApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_cftc_c_holdingRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_cftc_c_holdingResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.macros.macro_usa_cftc_c_holdingResponse]]
      )
      .send(backend)
    resp
  }

  def macro_usa_cftc_merchant_currency_holdingApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_cftc_merchant_currency_holdingRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_cftc_merchant_currency_holdingResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_usa_cftc_merchant_currency_holdingResponse
        ]]
      )
      .send(backend)
    resp
  }

  def macro_usa_cftc_merchant_goods_holdingApi(
    item: com.onectrm.akshare.api.generated.macros.macro_usa_cftc_merchant_goods_holdingRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_macro_usa_cftc_merchant_goods_holdingResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.macros.macro_usa_cftc_merchant_goods_holdingResponse
        ]]
      )
      .send(backend)
    resp
  }

  def news_economic_baiduApi(
    item: com.onectrm.akshare.api.generated.macros.news_economic_baiduRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.macros.JsonItem_news_economic_baiduResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.macros.news_economic_baiduResponse]])
      .send(backend)
    resp
  }

  def hf_sp_500Api(item: com.onectrm.akshare.api.generated.hf.hf_sp_500Request) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.hf.JsonItem_hf_sp_500Response._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.hf.hf_sp_500Response]])
      .send(backend)
    resp
  }

  def crypto_js_spotApi(item: com.onectrm.akshare.api.generated.dc.crypto_js_spotRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.dc.JsonItem_crypto_js_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.dc.crypto_js_spotResponse]])
      .send(backend)
    resp
  }

  def crypto_histApi(item: com.onectrm.akshare.api.generated.dc.crypto_histRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.dc.JsonItem_crypto_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.dc.crypto_histResponse]])
      .send(backend)
    resp
  }

  def crypto_bitcoin_hold_reportApi(
    item: com.onectrm.akshare.api.generated.dc.crypto_bitcoin_hold_reportRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.dc.JsonItem_crypto_bitcoin_hold_reportResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.dc.crypto_bitcoin_hold_reportResponse]]
      )
      .send(backend)
    resp
  }

  def crypto_bitcoin_cmeApi(
    item: com.onectrm.akshare.api.generated.dc.crypto_bitcoin_cmeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.dc.JsonItem_crypto_bitcoin_cmeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.dc.crypto_bitcoin_cmeResponse]])
      .send(backend)
    resp
  }

  def crypto_crixApi(item: com.onectrm.akshare.api.generated.dc.crypto_crixRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.dc.JsonItem_crypto_crixResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.dc.crypto_crixResponse]])
      .send(backend)
    resp
  }

  def nlp_ownthinkApi(item: com.onectrm.akshare.api.generated.nlp.nlp_ownthinkRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.nlp.JsonItem_nlp_ownthinkResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.nlp.nlp_ownthinkResponse]])
      .send(backend)
    resp
  }

  def nlp_answerApi(item: com.onectrm.akshare.api.generated.nlp.nlp_answerRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.nlp.JsonItem_nlp_answerResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.nlp.nlp_answerResponse]])
      .send(backend)
    resp
  }

  def stock_zh_index_daily_emApi(
    item: com.onectrm.akshare.api.generated.index.stock_zh_index_daily_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_stock_zh_index_daily_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.index.stock_zh_index_daily_emResponse]]
      )
      .send(backend)
    resp
  }

  def index_zh_a_histApi(item: com.onectrm.akshare.api.generated.index.index_zh_a_histRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_zh_a_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_zh_a_histResponse]])
      .send(backend)
    resp
  }

  def index_zh_a_hist_min_emApi(
    item: com.onectrm.akshare.api.generated.index.index_zh_a_hist_min_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_zh_a_hist_min_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.index.index_zh_a_hist_min_emResponse]]
      )
      .send(backend)
    resp
  }

  def index_stock_consApi(item: com.onectrm.akshare.api.generated.index.index_stock_consRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_stock_consResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_stock_consResponse]])
      .send(backend)
    resp
  }

  def index_investing_global_from_urlApi(
    item: com.onectrm.akshare.api.generated.index.index_investing_global_from_urlRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_investing_global_from_urlResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.index.index_investing_global_from_urlResponse
        ]]
      )
      .send(backend)
    resp
  }

  def weibo_indexApi(item: com.onectrm.akshare.api.generated.index.weibo_indexRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_weibo_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.weibo_indexResponse]])
      .send(backend)
    resp
  }

  def sw_index_dailyApi(item: com.onectrm.akshare.api.generated.index.sw_index_dailyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_sw_index_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.sw_index_dailyResponse]])
      .send(backend)
    resp
  }

  def sw_index_daily_indicatorApi(
    item: com.onectrm.akshare.api.generated.index.sw_index_daily_indicatorRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_sw_index_daily_indicatorResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.index.sw_index_daily_indicatorResponse]]
      )
      .send(backend)
    resp
  }

  def spot_goodsApi(item: com.onectrm.akshare.api.generated.index.spot_goodsRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_spot_goodsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.spot_goodsResponse]])
      .send(backend)
    resp
  }

  def index_cflp_priceApi(item: com.onectrm.akshare.api.generated.index.index_cflp_priceRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_cflp_priceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_cflp_priceResponse]])
      .send(backend)
    resp
  }

  def stock_zh_index_hist_csindexApi(
    item: com.onectrm.akshare.api.generated.index.stock_zh_index_hist_csindexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_stock_zh_index_hist_csindexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.index.stock_zh_index_hist_csindexResponse]]
      )
      .send(backend)
    resp
  }

  def index_pmi_com_cxApi(item: com.onectrm.akshare.api.generated.index.index_pmi_com_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_pmi_com_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_pmi_com_cxResponse]])
      .send(backend)
    resp
  }

  def index_pmi_man_cxApi(item: com.onectrm.akshare.api.generated.index.index_pmi_man_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_pmi_man_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_pmi_man_cxResponse]])
      .send(backend)
    resp
  }

  def index_pmi_ser_cxApi(item: com.onectrm.akshare.api.generated.index.index_pmi_ser_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_pmi_ser_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_pmi_ser_cxResponse]])
      .send(backend)
    resp
  }

  def index_dei_cxApi(item: com.onectrm.akshare.api.generated.index.index_dei_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_dei_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_dei_cxResponse]])
      .send(backend)
    resp
  }

  def index_ii_cxApi(item: com.onectrm.akshare.api.generated.index.index_ii_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_ii_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_ii_cxResponse]])
      .send(backend)
    resp
  }

  def index_si_cxApi(item: com.onectrm.akshare.api.generated.index.index_si_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_si_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_si_cxResponse]])
      .send(backend)
    resp
  }

  def index_fi_cxApi(item: com.onectrm.akshare.api.generated.index.index_fi_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_fi_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_fi_cxResponse]])
      .send(backend)
    resp
  }

  def index_bi_cxApi(item: com.onectrm.akshare.api.generated.index.index_bi_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_bi_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_bi_cxResponse]])
      .send(backend)
    resp
  }

  def index_nei_cxApi(item: com.onectrm.akshare.api.generated.index.index_nei_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_nei_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_nei_cxResponse]])
      .send(backend)
    resp
  }

  def index_li_cxApi(item: com.onectrm.akshare.api.generated.index.index_li_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_li_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_li_cxResponse]])
      .send(backend)
    resp
  }

  def index_ci_cxApi(item: com.onectrm.akshare.api.generated.index.index_ci_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_ci_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_ci_cxResponse]])
      .send(backend)
    resp
  }

  def index_ti_cxApi(item: com.onectrm.akshare.api.generated.index.index_ti_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_ti_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_ti_cxResponse]])
      .send(backend)
    resp
  }

  def index_neaw_cxApi(item: com.onectrm.akshare.api.generated.index.index_neaw_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_neaw_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_neaw_cxResponse]])
      .send(backend)
    resp
  }

  def index_awpr_cxApi(item: com.onectrm.akshare.api.generated.index.index_awpr_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_awpr_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_awpr_cxResponse]])
      .send(backend)
    resp
  }

  def index_cci_cxApi(item: com.onectrm.akshare.api.generated.index.index_cci_cxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_cci_cxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.index.index_cci_cxResponse]])
      .send(backend)
    resp
  }

  def stock_zh_index_value_csindexApi(
    item: com.onectrm.akshare.api.generated.index.stock_zh_index_value_csindexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_stock_zh_index_value_csindexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.index.stock_zh_index_value_csindexResponse]]
      )
      .send(backend)
    resp
  }

  def index_value_hist_funddbApi(
    item: com.onectrm.akshare.api.generated.index.index_value_hist_funddbRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.index.JsonItem_index_value_hist_funddbResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.index.index_value_hist_funddbResponse]]
      )
      .send(backend)
    resp
  }

  def article_oman_rvApi(item: com.onectrm.akshare.api.generated.article.article_oman_rvRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.article.JsonItem_article_oman_rvResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.article.article_oman_rvResponse]])
      .send(backend)
    resp
  }

  def article_rlab_rvApi(item: com.onectrm.akshare.api.generated.article.article_rlab_rvRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.article.JsonItem_article_rlab_rvResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.article.article_rlab_rvResponse]])
      .send(backend)
    resp
  }

  def article_ff_crrApi(item: com.onectrm.akshare.api.generated.article.article_ff_crrRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.article.JsonItem_article_ff_crrResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.article.article_ff_crrResponse]])
      .send(backend)
    resp
  }

  def article_epu_indexApi(
    item: com.onectrm.akshare.api.generated.article.article_epu_indexRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.article.JsonItem_article_epu_indexResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.article.article_epu_indexResponse]])
      .send(backend)
    resp
  }

  def stock_sse_summaryApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sse_summaryRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sse_summaryResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_sse_summaryResponse]])
      .send(backend)
    resp
  }

  def stock_szse_summaryApi(
    item: com.onectrm.akshare.api.generated.stock.stock_szse_summaryRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_szse_summaryResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_szse_summaryResponse]])
      .send(backend)
    resp
  }

  def stock_szse_area_summaryApi(
    item: com.onectrm.akshare.api.generated.stock.stock_szse_area_summaryRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_szse_area_summaryResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_szse_area_summaryResponse]]
      )
      .send(backend)
    resp
  }

  def stock_szse_sector_summaryApi(
    item: com.onectrm.akshare.api.generated.stock.stock_szse_sector_summaryRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_szse_sector_summaryResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_szse_sector_summaryResponse]]
      )
      .send(backend)
    resp
  }

  def stock_sse_deal_dailyApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sse_deal_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sse_deal_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_sse_deal_dailyResponse]])
      .send(backend)
    resp
  }

  def stock_individual_info_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_individual_info_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_individual_info_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_individual_info_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_zh_a_spot_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_spot_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_spot_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_spot_emResponse]])
      .send(backend)
    resp
  }

  def stock_sh_a_spot_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sh_a_spot_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sh_a_spot_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_sh_a_spot_emResponse]])
      .send(backend)
    resp
  }

  def stock_sz_a_spot_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sz_a_spot_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sz_a_spot_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_sz_a_spot_emResponse]])
      .send(backend)
    resp
  }

  def stock_bj_a_spot_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_bj_a_spot_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_bj_a_spot_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_bj_a_spot_emResponse]])
      .send(backend)
    resp
  }

  def stock_new_a_spot_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_new_a_spot_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_new_a_spot_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_new_a_spot_emResponse]])
      .send(backend)
    resp
  }

  def stock_kc_a_spot_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_kc_a_spot_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_kc_a_spot_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_kc_a_spot_emResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_spotApi(item: com.onectrm.akshare.api.generated.stock.stock_zh_a_spotRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_spotResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_histApi(item: com.onectrm.akshare.api.generated.stock.stock_zh_a_histRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_histResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_dailyApi(item: com.onectrm.akshare.api.generated.stock.stock_zh_a_dailyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_dailyResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_hist_163Api(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_hist_163Request
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_hist_163Response._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_hist_163Response]])
      .send(backend)
    resp
  }

  def stock_zh_a_minuteApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_minuteRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_minuteResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_minuteResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_hist_min_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_hist_min_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_hist_min_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_hist_min_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_zh_a_hist_pre_min_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_hist_pre_min_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_hist_pre_min_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_hist_pre_min_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_zh_a_tick_txApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_tick_txRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_tick_txResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_tick_txResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_tick_163Api(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_tick_163Request
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_tick_163Response._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_tick_163Response]])
      .send(backend)
    resp
  }

  def stock_zh_a_cdr_dailyApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_cdr_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_cdr_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_cdr_dailyResponse]])
      .send(backend)
    resp
  }

  def stock_zh_b_spot_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_b_spot_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_b_spot_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_b_spot_emResponse]])
      .send(backend)
    resp
  }

  def stock_zh_b_spotApi(item: com.onectrm.akshare.api.generated.stock.stock_zh_b_spotRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_b_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_b_spotResponse]])
      .send(backend)
    resp
  }

  def stock_zh_b_dailyApi(item: com.onectrm.akshare.api.generated.stock.stock_zh_b_dailyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_b_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_b_dailyResponse]])
      .send(backend)
    resp
  }

  def stock_zh_b_minuteApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_b_minuteRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_b_minuteResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_b_minuteResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_newApi(item: com.onectrm.akshare.api.generated.stock.stock_zh_a_newRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_newResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_newResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_st_emApi(item: com.onectrm.akshare.api.generated.stock.stock_zh_a_st_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_st_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_st_emResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_new_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_new_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_new_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_new_emResponse]])
      .send(backend)
    resp
  }

  def stock_ipo_benefit_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_ipo_benefit_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_ipo_benefit_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_ipo_benefit_thsResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_stop_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_stop_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_stop_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_stop_emResponse]])
      .send(backend)
    resp
  }

  def stock_zh_kcb_spotApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_kcb_spotRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_kcb_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_kcb_spotResponse]])
      .send(backend)
    resp
  }

  def stock_zh_kcb_dailyApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_kcb_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_kcb_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_kcb_dailyResponse]])
      .send(backend)
    resp
  }

  def stock_zh_kcb_report_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_kcb_report_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_kcb_report_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_kcb_report_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_zh_ah_spotApi(item: com.onectrm.akshare.api.generated.stock.stock_zh_ah_spotRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_ah_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_ah_spotResponse]])
      .send(backend)
    resp
  }

  def stock_zh_ah_dailyApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_ah_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_ah_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_ah_dailyResponse]])
      .send(backend)
    resp
  }

  def stock_zh_ah_nameApi(item: com.onectrm.akshare.api.generated.stock.stock_zh_ah_nameRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_ah_nameResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_ah_nameResponse]])
      .send(backend)
    resp
  }

  def stock_us_spot_emApi(item: com.onectrm.akshare.api.generated.stock.stock_us_spot_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_us_spot_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_us_spot_emResponse]])
      .send(backend)
    resp
  }

  def stock_us_spotApi(item: com.onectrm.akshare.api.generated.stock.stock_us_spotRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_us_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_us_spotResponse]])
      .send(backend)
    resp
  }

  def stock_us_histApi(item: com.onectrm.akshare.api.generated.stock.stock_us_histRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_us_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_us_histResponse]])
      .send(backend)
    resp
  }

  def stock_us_hist_fuApi(item: com.onectrm.akshare.api.generated.stock.stock_us_hist_fuRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_us_hist_fuResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_us_hist_fuResponse]])
      .send(backend)
    resp
  }

  def stock_us_hist_min_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_us_hist_min_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_us_hist_min_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_us_hist_min_emResponse]])
      .send(backend)
    resp
  }

  def stock_us_dailyApi(item: com.onectrm.akshare.api.generated.stock.stock_us_dailyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_us_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_us_dailyResponse]])
      .send(backend)
    resp
  }

  def stock_us_fundamentalApi(
    item: com.onectrm.akshare.api.generated.stock.stock_us_fundamentalRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_us_fundamentalResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_us_fundamentalResponse]])
      .send(backend)
    resp
  }

  def stock_us_pink_spot_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_us_pink_spot_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_us_pink_spot_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_us_pink_spot_emResponse]])
      .send(backend)
    resp
  }

  def stock_us_famous_spot_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_us_famous_spot_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_us_famous_spot_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_us_famous_spot_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_hk_spot_emApi(item: com.onectrm.akshare.api.generated.stock.stock_hk_spot_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hk_spot_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hk_spot_emResponse]])
      .send(backend)
    resp
  }

  def stock_hk_spotApi(item: com.onectrm.akshare.api.generated.stock.stock_hk_spotRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hk_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hk_spotResponse]])
      .send(backend)
    resp
  }

  def stock_hk_hist_min_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hk_hist_min_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hk_hist_min_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hk_hist_min_emResponse]])
      .send(backend)
    resp
  }

  def stock_hk_histApi(item: com.onectrm.akshare.api.generated.stock.stock_hk_histRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hk_histResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hk_histResponse]])
      .send(backend)
    resp
  }

  def stock_hk_dailyApi(item: com.onectrm.akshare.api.generated.stock.stock_hk_dailyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hk_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hk_dailyResponse]])
      .send(backend)
    resp
  }

  def stock_us_zh_spotApi(item: com.onectrm.akshare.api.generated.stock.stock_us_zh_spotRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_us_zh_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_us_zh_spotResponse]])
      .send(backend)
    resp
  }

  def stock_us_zh_dailyApi(
    item: com.onectrm.akshare.api.generated.stock.stock_us_zh_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_us_zh_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_us_zh_dailyResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_scr_reportApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_scr_reportRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_scr_reportResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_scr_reportResponse]])
      .send(backend)
    resp
  }

  def stock_jgdy_tj_emApi(item: com.onectrm.akshare.api.generated.stock.stock_jgdy_tj_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_jgdy_tj_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_jgdy_tj_emResponse]])
      .send(backend)
    resp
  }

  def stock_jgdy_detail_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_jgdy_detail_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_jgdy_detail_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_jgdy_detail_emResponse]])
      .send(backend)
    resp
  }

  def stock_zygc_ymApi(item: com.onectrm.akshare.api.generated.stock.stock_zygc_ymRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zygc_ymResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zygc_ymResponse]])
      .send(backend)
    resp
  }

  def stock_mda_ymApi(item: com.onectrm.akshare.api.generated.stock.stock_mda_ymRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_mda_ymResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_mda_ymResponse]])
      .send(backend)
    resp
  }

  def stock_gpzy_profile_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gpzy_profile_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gpzy_profile_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_gpzy_profile_emResponse]])
      .send(backend)
    resp
  }

  def stock_gpzy_pledge_ratio_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gpzy_pledge_ratio_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gpzy_pledge_ratio_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_gpzy_pledge_ratio_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_gpzy_pledge_ratio_detail_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gpzy_pledge_ratio_detail_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gpzy_pledge_ratio_detail_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_gpzy_pledge_ratio_detail_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_em_gpzy_distribute_statistics_companyApi(
    item: com.onectrm.akshare.api.generated.stock.stock_em_gpzy_distribute_statistics_companyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_em_gpzy_distribute_statistics_companyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_em_gpzy_distribute_statistics_companyResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_em_gpzy_distribute_statistics_bankApi(
    item: com.onectrm.akshare.api.generated.stock.stock_em_gpzy_distribute_statistics_bankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_em_gpzy_distribute_statistics_bankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_em_gpzy_distribute_statistics_bankResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_gpzy_industry_data_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gpzy_industry_data_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gpzy_industry_data_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_gpzy_industry_data_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_em_sy_profileApi(
    item: com.onectrm.akshare.api.generated.stock.stock_em_sy_profileRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_em_sy_profileResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_em_sy_profileResponse]])
      .send(backend)
    resp
  }

  def stock_em_sy_yq_listApi(
    item: com.onectrm.akshare.api.generated.stock.stock_em_sy_yq_listRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_em_sy_yq_listResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_em_sy_yq_listResponse]])
      .send(backend)
    resp
  }

  def stock_em_sy_jz_listApi(
    item: com.onectrm.akshare.api.generated.stock.stock_em_sy_jz_listRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_em_sy_jz_listResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_em_sy_jz_listResponse]])
      .send(backend)
    resp
  }

  def stock_em_sy_listApi(item: com.onectrm.akshare.api.generated.stock.stock_em_sy_listRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_em_sy_listResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_em_sy_listResponse]])
      .send(backend)
    resp
  }

  def stock_em_sy_hy_listApi(
    item: com.onectrm.akshare.api.generated.stock.stock_em_sy_hy_listRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_em_sy_hy_listResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_em_sy_hy_listResponse]])
      .send(backend)
    resp
  }

  def stock_account_statistics_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_account_statistics_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_account_statistics_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_account_statistics_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_analyst_rank_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_analyst_rank_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_analyst_rank_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_analyst_rank_emResponse]])
      .send(backend)
    resp
  }

  def stock_analyst_detail_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_analyst_detail_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_analyst_detail_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_analyst_detail_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_comment_emApi(item: com.onectrm.akshare.api.generated.stock.stock_comment_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_comment_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_comment_emResponse]])
      .send(backend)
    resp
  }

  def stock_comment_detail_zlkp_jgcyd_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_comment_detail_zlkp_jgcyd_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_comment_detail_zlkp_jgcyd_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_comment_detail_zlkp_jgcyd_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_comment_detail_zhpj_lspf_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_comment_detail_zhpj_lspf_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_comment_detail_zhpj_lspf_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_comment_detail_zhpj_lspf_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_comment_detail_scrd_focus_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_comment_detail_scrd_focus_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_comment_detail_scrd_focus_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_comment_detail_scrd_focus_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_comment_detail_scrd_desire_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_comment_detail_scrd_desire_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_comment_detail_scrd_desire_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_comment_detail_scrd_desire_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_comment_detail_scrd_desire_daily_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_comment_detail_scrd_desire_daily_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_comment_detail_scrd_desire_daily_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_comment_detail_scrd_desire_daily_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_comment_detail_scrd_cost_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_comment_detail_scrd_cost_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_comment_detail_scrd_cost_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_comment_detail_scrd_cost_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_hk_ggt_components_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hk_ggt_components_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hk_ggt_components_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hk_ggt_components_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_north_net_flow_in_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_north_net_flow_in_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_north_net_flow_in_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_hsgt_north_net_flow_in_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_north_cash_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_north_cash_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_north_cash_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hsgt_north_cash_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_north_acc_flow_in_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_north_acc_flow_in_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_north_acc_flow_in_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_hsgt_north_acc_flow_in_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_south_net_flow_in_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_south_net_flow_in_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_south_net_flow_in_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_hsgt_south_net_flow_in_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_south_cash_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_south_cash_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_south_cash_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hsgt_south_cash_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_south_acc_flow_in_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_south_acc_flow_in_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_south_acc_flow_in_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_hsgt_south_acc_flow_in_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_board_rank_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_board_rank_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_board_rank_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hsgt_board_rank_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_hold_stock_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_hold_stock_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_hold_stock_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hsgt_hold_stock_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_stock_statistics_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_stock_statistics_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_stock_statistics_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hsgt_stock_statistics_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_institution_statistics_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_institution_statistics_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_institution_statistics_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_hsgt_institution_statistics_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_hist_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_hist_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_hist_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hsgt_hist_emResponse]])
      .send(backend)
    resp
  }

  def stock_hsgt_individual_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_individual_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_individual_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hsgt_individual_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_hsgt_individual_detail_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hsgt_individual_detail_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hsgt_individual_detail_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_hsgt_individual_detail_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_tfp_emApi(item: com.onectrm.akshare.api.generated.stock.stock_tfp_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_tfp_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_tfp_emResponse]])
      .send(backend)
    resp
  }

  def news_trade_notify_suspend_baiduApi(
    item: com.onectrm.akshare.api.generated.stock.news_trade_notify_suspend_baiduRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_news_trade_notify_suspend_baiduResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.news_trade_notify_suspend_baiduResponse
        ]]
      )
      .send(backend)
    resp
  }

  def news_report_time_baiduApi(
    item: com.onectrm.akshare.api.generated.stock.news_report_time_baiduRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_news_report_time_baiduResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.news_report_time_baiduResponse]]
      )
      .send(backend)
    resp
  }

  def stock_dxsyl_emApi(item: com.onectrm.akshare.api.generated.stock.stock_dxsyl_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_dxsyl_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_dxsyl_emResponse]])
      .send(backend)
    resp
  }

  def stock_xgsglb_emApi(item: com.onectrm.akshare.api.generated.stock.stock_xgsglb_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_xgsglb_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_xgsglb_emResponse]])
      .send(backend)
    resp
  }

  def stock_yjbb_emApi(item: com.onectrm.akshare.api.generated.stock.stock_yjbb_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_yjbb_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_yjbb_emResponse]])
      .send(backend)
    resp
  }

  def stock_yjkb_emApi(item: com.onectrm.akshare.api.generated.stock.stock_yjkb_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_yjkb_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_yjkb_emResponse]])
      .send(backend)
    resp
  }

  def stock_yjyg_emApi(item: com.onectrm.akshare.api.generated.stock.stock_yjyg_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_yjyg_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_yjyg_emResponse]])
      .send(backend)
    resp
  }

  def stock_yysj_emApi(item: com.onectrm.akshare.api.generated.stock.stock_yysj_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_yysj_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_yysj_emResponse]])
      .send(backend)
    resp
  }

  def stock_report_disclosureApi(
    item: com.onectrm.akshare.api.generated.stock.stock_report_disclosureRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_report_disclosureResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_report_disclosureResponse]]
      )
      .send(backend)
    resp
  }

  def stock_industry_category_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_industry_category_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_industry_category_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_industry_category_cninfoResponse]]
      )
      .send(backend)
    resp
  }

  def stock_industry_change_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_industry_change_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_industry_change_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_industry_change_cninfoResponse]]
      )
      .send(backend)
    resp
  }

  def stock_share_change_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_share_change_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_share_change_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_share_change_cninfoResponse]]
      )
      .send(backend)
    resp
  }

  def stock_zcfz_emApi(item: com.onectrm.akshare.api.generated.stock.stock_zcfz_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zcfz_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zcfz_emResponse]])
      .send(backend)
    resp
  }

  def stock_lrb_emApi(item: com.onectrm.akshare.api.generated.stock.stock_lrb_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_lrb_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_lrb_emResponse]])
      .send(backend)
    resp
  }

  def stock_xjll_emApi(item: com.onectrm.akshare.api.generated.stock.stock_xjll_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_xjll_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_xjll_emResponse]])
      .send(backend)
    resp
  }

  def stock_ggcg_emApi(item: com.onectrm.akshare.api.generated.stock.stock_ggcg_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_ggcg_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_ggcg_emResponse]])
      .send(backend)
    resp
  }

  def stock_fhps_emApi(item: com.onectrm.akshare.api.generated.stock.stock_fhps_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_fhps_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_fhps_emResponse]])
      .send(backend)
    resp
  }

  def stock_fund_flow_individualApi(
    item: com.onectrm.akshare.api.generated.stock.stock_fund_flow_individualRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_fund_flow_individualResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_fund_flow_individualResponse]]
      )
      .send(backend)
    resp
  }

  def stock_fund_flow_conceptApi(
    item: com.onectrm.akshare.api.generated.stock.stock_fund_flow_conceptRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_fund_flow_conceptResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_fund_flow_conceptResponse]]
      )
      .send(backend)
    resp
  }

  def stock_fund_flow_industryApi(
    item: com.onectrm.akshare.api.generated.stock.stock_fund_flow_industryRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_fund_flow_industryResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_fund_flow_industryResponse]]
      )
      .send(backend)
    resp
  }

  def stock_fund_flow_big_dealApi(
    item: com.onectrm.akshare.api.generated.stock.stock_fund_flow_big_dealRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_fund_flow_big_dealResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_fund_flow_big_dealResponse]]
      )
      .send(backend)
    resp
  }

  def stock_individual_fund_flowApi(
    item: com.onectrm.akshare.api.generated.stock.stock_individual_fund_flowRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_individual_fund_flowResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_individual_fund_flowResponse]]
      )
      .send(backend)
    resp
  }

  def stock_individual_fund_flow_rankApi(
    item: com.onectrm.akshare.api.generated.stock.stock_individual_fund_flow_rankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_individual_fund_flow_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_individual_fund_flow_rankResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_market_fund_flowApi(
    item: com.onectrm.akshare.api.generated.stock.stock_market_fund_flowRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_market_fund_flowResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_market_fund_flowResponse]]
      )
      .send(backend)
    resp
  }

  def stock_sector_fund_flow_rankApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sector_fund_flow_rankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sector_fund_flow_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_sector_fund_flow_rankResponse]]
      )
      .send(backend)
    resp
  }

  def stock_notice_reportApi(
    item: com.onectrm.akshare.api.generated.stock.stock_notice_reportRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_notice_reportResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_notice_reportResponse]])
      .send(backend)
    resp
  }

  def stock_financial_report_sinaApi(
    item: com.onectrm.akshare.api.generated.stock.stock_financial_report_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_financial_report_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_financial_report_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def stock_balance_sheet_by_report_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_balance_sheet_by_report_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_balance_sheet_by_report_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_balance_sheet_by_report_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_balance_sheet_by_yearly_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_balance_sheet_by_yearly_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_balance_sheet_by_yearly_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_balance_sheet_by_yearly_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_profit_sheet_by_report_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_profit_sheet_by_report_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_profit_sheet_by_report_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_profit_sheet_by_report_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_profit_sheet_by_yearly_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_profit_sheet_by_yearly_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_profit_sheet_by_yearly_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_profit_sheet_by_yearly_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_profit_sheet_by_quarterly_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_profit_sheet_by_quarterly_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_profit_sheet_by_quarterly_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_profit_sheet_by_quarterly_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_cash_flow_sheet_by_report_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_cash_flow_sheet_by_report_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_cash_flow_sheet_by_report_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_cash_flow_sheet_by_report_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_cash_flow_sheet_by_yearly_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_cash_flow_sheet_by_yearly_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_cash_flow_sheet_by_yearly_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_cash_flow_sheet_by_yearly_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_cash_flow_sheet_by_quarterly_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_cash_flow_sheet_by_quarterly_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_cash_flow_sheet_by_quarterly_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_cash_flow_sheet_by_quarterly_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_financial_hk_report_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_financial_hk_report_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_financial_hk_report_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_financial_hk_report_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_financial_abstractApi(
    item: com.onectrm.akshare.api.generated.stock.stock_financial_abstractRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_financial_abstractResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_financial_abstractResponse]]
      )
      .send(backend)
    resp
  }

  def stock_financial_analysis_indicatorApi(
    item: com.onectrm.akshare.api.generated.stock.stock_financial_analysis_indicatorRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_financial_analysis_indicatorResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_financial_analysis_indicatorResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_financial_hk_analysis_indicator_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_financial_hk_analysis_indicator_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_financial_hk_analysis_indicator_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_financial_hk_analysis_indicator_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_history_dividendApi(
    item: com.onectrm.akshare.api.generated.stock.stock_history_dividendRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_history_dividendResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_history_dividendResponse]]
      )
      .send(backend)
    resp
  }

  def stock_gdfx_free_top_10_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_free_top_10_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_free_top_10_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_gdfx_free_top_10_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_gdfx_top_10_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_top_10_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_top_10_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_gdfx_top_10_emResponse]])
      .send(backend)
    resp
  }

  def stock_gdfx_free_holding_change_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_change_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_free_holding_change_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_change_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_gdfx_holding_change_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_change_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_holding_change_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_change_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_gdfx_free_holding_analyse_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_analyse_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_free_holding_analyse_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_analyse_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_gdfx_holding_analyse_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_analyse_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_holding_analyse_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_analyse_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_gdfx_free_holding_detail_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_detail_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_free_holding_detail_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_detail_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_gdfx_holding_detail_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_detail_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_holding_detail_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_detail_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_gdfx_free_holding_statistics_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_statistics_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_free_holding_statistics_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_statistics_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_gdfx_holding_statistics_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_statistics_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_holding_statistics_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_statistics_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_gdfx_free_holding_teamwork_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_teamwork_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_free_holding_teamwork_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_teamwork_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_gdfx_holding_teamwork_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_teamwork_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_gdfx_holding_teamwork_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_teamwork_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_zh_a_gdhsApi(item: com.onectrm.akshare.api.generated.stock.stock_zh_a_gdhsRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_gdhsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_gdhsResponse]])
      .send(backend)
    resp
  }

  def stock_zh_a_gdhs_detail_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zh_a_gdhs_detail_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zh_a_gdhs_detail_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_zh_a_gdhs_detail_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_history_dividend_detailApi(
    item: com.onectrm.akshare.api.generated.stock.stock_history_dividend_detailRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_history_dividend_detailResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_history_dividend_detailResponse]]
      )
      .send(backend)
    resp
  }

  def stock_dividents_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_dividents_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_dividents_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_dividents_cninfoResponse]]
      )
      .send(backend)
    resp
  }

  def stock_ipo_infoApi(item: com.onectrm.akshare.api.generated.stock.stock_ipo_infoRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_ipo_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_ipo_infoResponse]])
      .send(backend)
    resp
  }

  def stock_add_stockApi(item: com.onectrm.akshare.api.generated.stock.stock_add_stockRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_add_stockResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_add_stockResponse]])
      .send(backend)
    resp
  }

  def stock_restricted_sharesApi(
    item: com.onectrm.akshare.api.generated.stock.stock_restricted_sharesRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_restricted_sharesResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_restricted_sharesResponse]]
      )
      .send(backend)
    resp
  }

  def stock_circulate_stock_holderApi(
    item: com.onectrm.akshare.api.generated.stock.stock_circulate_stock_holderRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_circulate_stock_holderResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_circulate_stock_holderResponse]]
      )
      .send(backend)
    resp
  }

  def stock_sector_spotApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sector_spotRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sector_spotResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_sector_spotResponse]])
      .send(backend)
    resp
  }

  def stock_sector_detailApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sector_detailRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sector_detailResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_sector_detailResponse]])
      .send(backend)
    resp
  }

  def stock_info_a_code_nameApi(
    item: com.onectrm.akshare.api.generated.stock.stock_info_a_code_nameRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_info_a_code_nameResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_info_a_code_nameResponse]]
      )
      .send(backend)
    resp
  }

  def stock_info_sh_name_codeApi(
    item: com.onectrm.akshare.api.generated.stock.stock_info_sh_name_codeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_info_sh_name_codeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_info_sh_name_codeResponse]]
      )
      .send(backend)
    resp
  }

  def stock_info_sz_name_codeApi(
    item: com.onectrm.akshare.api.generated.stock.stock_info_sz_name_codeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_info_sz_name_codeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_info_sz_name_codeResponse]]
      )
      .send(backend)
    resp
  }

  def stock_info_bj_name_codeApi(
    item: com.onectrm.akshare.api.generated.stock.stock_info_bj_name_codeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_info_bj_name_codeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_info_bj_name_codeResponse]]
      )
      .send(backend)
    resp
  }

  def stock_info_sz_delistApi(
    item: com.onectrm.akshare.api.generated.stock.stock_info_sz_delistRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_info_sz_delistResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_info_sz_delistResponse]])
      .send(backend)
    resp
  }

  def stock_staq_net_stopApi(
    item: com.onectrm.akshare.api.generated.stock.stock_staq_net_stopRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_staq_net_stopResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_staq_net_stopResponse]])
      .send(backend)
    resp
  }

  def stock_info_sh_delistApi(
    item: com.onectrm.akshare.api.generated.stock.stock_info_sh_delistRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_info_sh_delistResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_info_sh_delistResponse]])
      .send(backend)
    resp
  }

  def stock_info_change_nameApi(
    item: com.onectrm.akshare.api.generated.stock.stock_info_change_nameRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_info_change_nameResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_info_change_nameResponse]]
      )
      .send(backend)
    resp
  }

  def stock_info_sz_change_nameApi(
    item: com.onectrm.akshare.api.generated.stock.stock_info_sz_change_nameRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_info_sz_change_nameResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_info_sz_change_nameResponse]]
      )
      .send(backend)
    resp
  }

  def stock_fund_stock_holderApi(
    item: com.onectrm.akshare.api.generated.stock.stock_fund_stock_holderRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_fund_stock_holderResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_fund_stock_holderResponse]]
      )
      .send(backend)
    resp
  }

  def stock_main_stock_holderApi(
    item: com.onectrm.akshare.api.generated.stock.stock_main_stock_holderRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_main_stock_holderResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_main_stock_holderResponse]]
      )
      .send(backend)
    resp
  }

  def stock_institute_holdApi(
    item: com.onectrm.akshare.api.generated.stock.stock_institute_holdRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_institute_holdResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_institute_holdResponse]])
      .send(backend)
    resp
  }

  def stock_institute_hold_detailApi(
    item: com.onectrm.akshare.api.generated.stock.stock_institute_hold_detailRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_institute_hold_detailResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_institute_hold_detailResponse]]
      )
      .send(backend)
    resp
  }

  def stock_institute_recommendApi(
    item: com.onectrm.akshare.api.generated.stock.stock_institute_recommendRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_institute_recommendResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_institute_recommendResponse]]
      )
      .send(backend)
    resp
  }

  def stock_institute_recommend_detailApi(
    item: com.onectrm.akshare.api.generated.stock.stock_institute_recommend_detailRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_institute_recommend_detailResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_institute_recommend_detailResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_rank_forecast_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_rank_forecast_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_rank_forecast_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_rank_forecast_cninfoResponse]]
      )
      .send(backend)
    resp
  }

  def stock_industry_pe_ratio_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_industry_pe_ratio_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_industry_pe_ratio_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_industry_pe_ratio_cninfoResponse]]
      )
      .send(backend)
    resp
  }

  def stock_new_gh_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_new_gh_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_new_gh_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_new_gh_cninfoResponse]])
      .send(backend)
    resp
  }

  def stock_new_ipo_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_new_ipo_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_new_ipo_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_new_ipo_cninfoResponse]])
      .send(backend)
    resp
  }

  def stock_hold_num_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hold_num_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hold_num_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hold_num_cninfoResponse]])
      .send(backend)
    resp
  }

  def stock_hold_control_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hold_control_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hold_control_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hold_control_cninfoResponse]]
      )
      .send(backend)
    resp
  }

  def stock_hold_management_detail_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hold_management_detail_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hold_management_detail_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_hold_management_detail_cninfoResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_cg_guarantee_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_cg_guarantee_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_cg_guarantee_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_cg_guarantee_cninfoResponse]]
      )
      .send(backend)
    resp
  }

  def stock_cg_lawsuit_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_cg_lawsuit_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_cg_lawsuit_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_cg_lawsuit_cninfoResponse]]
      )
      .send(backend)
    resp
  }

  def stock_cg_equity_mortgage_cninfoApi(
    item: com.onectrm.akshare.api.generated.stock.stock_cg_equity_mortgage_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_cg_equity_mortgage_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_cg_equity_mortgage_cninfoResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_price_jsApi(item: com.onectrm.akshare.api.generated.stock.stock_price_jsRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_price_jsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_price_jsResponse]])
      .send(backend)
    resp
  }

  def stock_em_qsjyApi(item: com.onectrm.akshare.api.generated.stock.stock_em_qsjyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_em_qsjyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_em_qsjyResponse]])
      .send(backend)
    resp
  }

  def stock_a_peApi(item: com.onectrm.akshare.api.generated.stock.stock_a_peRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_a_peResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_a_peResponse]])
      .send(backend)
    resp
  }

  def stock_a_pbApi(item: com.onectrm.akshare.api.generated.stock.stock_a_pbRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_a_pbResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_a_pbResponse]])
      .send(backend)
    resp
  }

  def stock_a_lg_indicatorApi(
    item: com.onectrm.akshare.api.generated.stock.stock_a_lg_indicatorRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_a_lg_indicatorResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_a_lg_indicatorResponse]])
      .send(backend)
    resp
  }

  def stock_a_ttm_lyrApi(item: com.onectrm.akshare.api.generated.stock.stock_a_ttm_lyrRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_a_ttm_lyrResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_a_ttm_lyrResponse]])
      .send(backend)
    resp
  }

  def stock_a_all_pbApi(item: com.onectrm.akshare.api.generated.stock.stock_a_all_pbRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_a_all_pbResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_a_all_pbResponse]])
      .send(backend)
    resp
  }

  def stock_a_pe_and_pbApi(
    item: com.onectrm.akshare.api.generated.stock.stock_a_pe_and_pbRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_a_pe_and_pbResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_a_pe_and_pbResponse]])
      .send(backend)
    resp
  }

  def stock_hk_eniu_indicatorApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hk_eniu_indicatorRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hk_eniu_indicatorResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hk_eniu_indicatorResponse]]
      )
      .send(backend)
    resp
  }

  def stock_a_high_low_statisticsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_a_high_low_statisticsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_a_high_low_statisticsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_a_high_low_statisticsResponse]]
      )
      .send(backend)
    resp
  }

  def stock_a_below_net_asset_statisticsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_a_below_net_asset_statisticsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_a_below_net_asset_statisticsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_a_below_net_asset_statisticsResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_report_fund_holdApi(
    item: com.onectrm.akshare.api.generated.stock.stock_report_fund_holdRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_report_fund_holdResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_report_fund_holdResponse]]
      )
      .send(backend)
    resp
  }

  def stock_report_fund_hold_detailApi(
    item: com.onectrm.akshare.api.generated.stock.stock_report_fund_hold_detailRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_report_fund_hold_detailResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_report_fund_hold_detailResponse]]
      )
      .send(backend)
    resp
  }

  def stock_lhb_detail_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_lhb_detail_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_lhb_detail_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_lhb_detail_emResponse]])
      .send(backend)
    resp
  }

  def stock_lhb_stock_statistic_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_lhb_stock_statistic_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_lhb_stock_statistic_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_lhb_stock_statistic_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_lhb_jgmmtj_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_lhb_jgmmtj_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_lhb_jgmmtj_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_lhb_jgmmtj_emResponse]])
      .send(backend)
    resp
  }

  def stock_lhb_hyyyb_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_lhb_hyyyb_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_lhb_hyyyb_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_lhb_hyyyb_emResponse]])
      .send(backend)
    resp
  }

  def stock_lhb_stock_detail_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_lhb_stock_detail_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_lhb_stock_detail_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_lhb_stock_detail_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_lh_yyb_mostApi(
    item: com.onectrm.akshare.api.generated.stock.stock_lh_yyb_mostRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_lh_yyb_mostResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_lh_yyb_mostResponse]])
      .send(backend)
    resp
  }

  def stock_lh_yyb_capitalApi(
    item: com.onectrm.akshare.api.generated.stock.stock_lh_yyb_capitalRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_lh_yyb_capitalResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_lh_yyb_capitalResponse]])
      .send(backend)
    resp
  }

  def stock_lh_yyb_controlApi(
    item: com.onectrm.akshare.api.generated.stock.stock_lh_yyb_controlRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_lh_yyb_controlResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_lh_yyb_controlResponse]])
      .send(backend)
    resp
  }

  def stock_sina_lhb_detail_dailyApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sina_lhb_detail_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sina_lhb_detail_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_sina_lhb_detail_dailyResponse]]
      )
      .send(backend)
    resp
  }

  def stock_sina_lhb_ggtjApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sina_lhb_ggtjRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sina_lhb_ggtjResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_sina_lhb_ggtjResponse]])
      .send(backend)
    resp
  }

  def stock_sina_lhb_yytjApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sina_lhb_yytjRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sina_lhb_yytjResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_sina_lhb_yytjResponse]])
      .send(backend)
    resp
  }

  def stock_sina_lhb_jgzzApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sina_lhb_jgzzRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sina_lhb_jgzzResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_sina_lhb_jgzzResponse]])
      .send(backend)
    resp
  }

  def stock_sina_lhb_jgmxApi(
    item: com.onectrm.akshare.api.generated.stock.stock_sina_lhb_jgmxRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_sina_lhb_jgmxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_sina_lhb_jgmxResponse]])
      .send(backend)
    resp
  }

  def stock_ipo_declareApi(
    item: com.onectrm.akshare.api.generated.stock.stock_ipo_declareRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_ipo_declareResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_ipo_declareResponse]])
      .send(backend)
    resp
  }

  def stock_register_kcbApi(
    item: com.onectrm.akshare.api.generated.stock.stock_register_kcbRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_register_kcbResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_register_kcbResponse]])
      .send(backend)
    resp
  }

  def stock_register_cybApi(
    item: com.onectrm.akshare.api.generated.stock.stock_register_cybRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_register_cybResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_register_cybResponse]])
      .send(backend)
    resp
  }

  def stock_register_dbApi(
    item: com.onectrm.akshare.api.generated.stock.stock_register_dbRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_register_dbResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_register_dbResponse]])
      .send(backend)
    resp
  }

  def stock_em_qbzfApi(item: com.onectrm.akshare.api.generated.stock.stock_em_qbzfRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_em_qbzfResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_em_qbzfResponse]])
      .send(backend)
    resp
  }

  def stock_em_pgApi(item: com.onectrm.akshare.api.generated.stock.stock_em_pgRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_em_pgResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_em_pgResponse]])
      .send(backend)
    resp
  }

  def stock_repurchase_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_repurchase_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_repurchase_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_repurchase_emResponse]])
      .send(backend)
    resp
  }

  def stock_dzjy_sctjApi(item: com.onectrm.akshare.api.generated.stock.stock_dzjy_sctjRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_dzjy_sctjResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_dzjy_sctjResponse]])
      .send(backend)
    resp
  }

  def stock_dzjy_mrmxApi(item: com.onectrm.akshare.api.generated.stock.stock_dzjy_mrmxRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_dzjy_mrmxResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_dzjy_mrmxResponse]])
      .send(backend)
    resp
  }

  def stock_dzjy_mrtjApi(item: com.onectrm.akshare.api.generated.stock.stock_dzjy_mrtjRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_dzjy_mrtjResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_dzjy_mrtjResponse]])
      .send(backend)
    resp
  }

  def stock_dzjy_hygtjApi(item: com.onectrm.akshare.api.generated.stock.stock_dzjy_hygtjRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_dzjy_hygtjResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_dzjy_hygtjResponse]])
      .send(backend)
    resp
  }

  def stock_dzjy_hyyybtjApi(
    item: com.onectrm.akshare.api.generated.stock.stock_dzjy_hyyybtjRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_dzjy_hyyybtjResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_dzjy_hyyybtjResponse]])
      .send(backend)
    resp
  }

  def stock_dzjy_yybphApi(item: com.onectrm.akshare.api.generated.stock.stock_dzjy_yybphRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_dzjy_yybphResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_dzjy_yybphResponse]])
      .send(backend)
    resp
  }

  def stock_yzxdr_emApi(item: com.onectrm.akshare.api.generated.stock.stock_yzxdr_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_yzxdr_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_yzxdr_emResponse]])
      .send(backend)
    resp
  }

  def stock_margin_sseApi(item: com.onectrm.akshare.api.generated.stock.stock_margin_sseRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_margin_sseResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_margin_sseResponse]])
      .send(backend)
    resp
  }

  def stock_margin_detail_sseApi(
    item: com.onectrm.akshare.api.generated.stock.stock_margin_detail_sseRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_margin_detail_sseResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_margin_detail_sseResponse]]
      )
      .send(backend)
    resp
  }

  def stock_margin_szseApi(
    item: com.onectrm.akshare.api.generated.stock.stock_margin_szseRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_margin_szseResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_margin_szseResponse]])
      .send(backend)
    resp
  }

  def stock_margin_detail_szseApi(
    item: com.onectrm.akshare.api.generated.stock.stock_margin_detail_szseRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_margin_detail_szseResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_margin_detail_szseResponse]]
      )
      .send(backend)
    resp
  }

  def stock_margin_underlying_info_szseApi(
    item: com.onectrm.akshare.api.generated.stock.stock_margin_underlying_info_szseRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_margin_underlying_info_szseResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_margin_underlying_info_szseResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_profit_forecastApi(
    item: com.onectrm.akshare.api.generated.stock.stock_profit_forecastRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_profit_forecastResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_profit_forecastResponse]])
      .send(backend)
    resp
  }

  def stock_board_concept_name_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_concept_name_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_concept_name_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_board_concept_name_thsResponse]]
      )
      .send(backend)
    resp
  }

  def stock_board_concept_cons_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_concept_cons_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_concept_cons_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_board_concept_cons_thsResponse]]
      )
      .send(backend)
    resp
  }

  def stock_board_concept_hist_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_concept_hist_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_concept_hist_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_board_concept_hist_thsResponse]]
      )
      .send(backend)
    resp
  }

  def stock_board_concept_name_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_concept_name_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_concept_name_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_board_concept_name_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_board_concept_cons_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_concept_cons_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_concept_cons_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_board_concept_cons_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_board_concept_hist_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_concept_hist_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_concept_hist_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_board_concept_hist_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_board_concept_hist_min_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_concept_hist_min_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_concept_hist_min_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_board_concept_hist_min_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_board_industry_cons_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_industry_cons_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_industry_cons_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_board_industry_cons_thsResponse]]
      )
      .send(backend)
    resp
  }

  def stock_board_industry_index_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_industry_index_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_industry_index_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_board_industry_index_thsResponse]]
      )
      .send(backend)
    resp
  }

  def stock_board_industry_name_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_industry_name_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_industry_name_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_board_industry_name_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_board_industry_cons_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_industry_cons_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_industry_cons_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_board_industry_cons_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_board_industry_hist_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_industry_hist_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_industry_hist_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_board_industry_hist_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_board_industry_hist_min_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_board_industry_hist_min_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_board_industry_hist_min_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_board_industry_hist_min_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_hot_follow_xqApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hot_follow_xqRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hot_follow_xqResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hot_follow_xqResponse]])
      .send(backend)
    resp
  }

  def stock_hot_tweet_xqApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hot_tweet_xqRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hot_tweet_xqResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hot_tweet_xqResponse]])
      .send(backend)
    resp
  }

  def stock_hot_deal_xqApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hot_deal_xqRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hot_deal_xqResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hot_deal_xqResponse]])
      .send(backend)
    resp
  }

  def stock_hot_rank_wcApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hot_rank_wcRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hot_rank_wcResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hot_rank_wcResponse]])
      .send(backend)
    resp
  }

  def stock_hot_rank_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hot_rank_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hot_rank_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hot_rank_emResponse]])
      .send(backend)
    resp
  }

  def stock_hot_tgbApi(item: com.onectrm.akshare.api.generated.stock.stock_hot_tgbRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hot_tgbResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hot_tgbResponse]])
      .send(backend)
    resp
  }

  def stock_hot_rank_detail_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hot_rank_detail_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hot_rank_detail_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hot_rank_detail_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_hot_rank_detail_realtime_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hot_rank_detail_realtime_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hot_rank_detail_realtime_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.stock_hot_rank_detail_realtime_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_hot_keyword_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hot_keyword_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hot_keyword_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_hot_keyword_emResponse]])
      .send(backend)
    resp
  }

  def stock_inner_trade_xqApi(
    item: com.onectrm.akshare.api.generated.stock.stock_inner_trade_xqRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_inner_trade_xqResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_inner_trade_xqResponse]])
      .send(backend)
    resp
  }

  def stock_hot_rank_latest_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hot_rank_latest_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hot_rank_latest_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hot_rank_latest_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_hot_rank_relate_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_hot_rank_relate_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_hot_rank_relate_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_hot_rank_relate_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_changes_emApi(item: com.onectrm.akshare.api.generated.stock.stock_changes_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_changes_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_changes_emResponse]])
      .send(backend)
    resp
  }

  def stock_zt_pool_emApi(item: com.onectrm.akshare.api.generated.stock.stock_zt_pool_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zt_pool_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zt_pool_emResponse]])
      .send(backend)
    resp
  }

  def stock_zt_pool_previous_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zt_pool_previous_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zt_pool_previous_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_zt_pool_previous_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_zt_pool_strong_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zt_pool_strong_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zt_pool_strong_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_zt_pool_strong_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_zt_pool_sub_new_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zt_pool_sub_new_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zt_pool_sub_new_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_zt_pool_sub_new_emResponse]]
      )
      .send(backend)
    resp
  }

  def stock_zt_pool_zbgc_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zt_pool_zbgc_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zt_pool_zbgc_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zt_pool_zbgc_emResponse]])
      .send(backend)
    resp
  }

  def stock_zt_pool_dtgc_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_zt_pool_dtgc_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_zt_pool_dtgc_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_zt_pool_dtgc_emResponse]])
      .send(backend)
    resp
  }

  def stock_market_activity_leguApi(
    item: com.onectrm.akshare.api.generated.stock.stock_market_activity_leguRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_market_activity_leguResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_market_activity_leguResponse]]
      )
      .send(backend)
    resp
  }

  def stock_average_position_leguApi(
    item: com.onectrm.akshare.api.generated.stock.stock_average_position_leguRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_average_position_leguResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.stock.stock_average_position_leguResponse]]
      )
      .send(backend)
    resp
  }

  def stock_rank_cxfl_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_rank_cxfl_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_rank_cxfl_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_rank_cxfl_thsResponse]])
      .send(backend)
    resp
  }

  def stock_rank_cxsl_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_rank_cxsl_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_rank_cxsl_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_rank_cxsl_thsResponse]])
      .send(backend)
    resp
  }

  def stock_rank_xstp_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_rank_xstp_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_rank_xstp_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_rank_xstp_thsResponse]])
      .send(backend)
    resp
  }

  def stock_rank_xxtp_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_rank_xxtp_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_rank_xxtp_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_rank_xxtp_thsResponse]])
      .send(backend)
    resp
  }

  def stock_rank_ljqs_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_rank_ljqs_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_rank_ljqs_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_rank_ljqs_thsResponse]])
      .send(backend)
    resp
  }

  def stock_rank_ljqd_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_rank_ljqd_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_rank_ljqd_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_rank_ljqd_thsResponse]])
      .send(backend)
    resp
  }

  def stock_rank_xzjp_thsApi(
    item: com.onectrm.akshare.api.generated.stock.stock_rank_xzjp_thsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_rank_xzjp_thsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.stock.stock_rank_xzjp_thsResponse]])
      .send(backend)
    resp
  }

  def covid_19_risk_areaApi(
    item: com.onectrm.akshare.api.generated.event.covid_19_risk_areaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_risk_areaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.event.covid_19_risk_areaResponse]])
      .send(backend)
    resp
  }

  def covid_19_163Api(item: com.onectrm.akshare.api.generated.event.covid_19_163Request) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_163Response._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.event.covid_19_163Response]])
      .send(backend)
    resp
  }

  def covid_19_dxyApi(item: com.onectrm.akshare.api.generated.event.covid_19_dxyRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_dxyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.event.covid_19_dxyResponse]])
      .send(backend)
    resp
  }

  def covid_19_baiduApi(item: com.onectrm.akshare.api.generated.event.covid_19_baiduRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_baiduResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.event.covid_19_baiduResponse]])
      .send(backend)
    resp
  }

  def migration_area_baiduApi(
    item: com.onectrm.akshare.api.generated.event.migration_area_baiduRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_migration_area_baiduResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.event.migration_area_baiduResponse]])
      .send(backend)
    resp
  }

  def migration_scale_baiduApi(
    item: com.onectrm.akshare.api.generated.event.migration_scale_baiduRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_migration_scale_baiduResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.event.migration_scale_baiduResponse]])
      .send(backend)
    resp
  }

  def covid_19_tripApi(item: com.onectrm.akshare.api.generated.event.covid_19_tripRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_tripResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.event.covid_19_tripResponse]])
      .send(backend)
    resp
  }

  def covid_19_traceApi(item: com.onectrm.akshare.api.generated.event.covid_19_traceRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_traceResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.event.covid_19_traceResponse]])
      .send(backend)
    resp
  }

  def covid_19_hist_cityApi(
    item: com.onectrm.akshare.api.generated.event.covid_19_hist_cityRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_hist_cityResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.event.covid_19_hist_cityResponse]])
      .send(backend)
    resp
  }

  def covid_19_csse_dailyApi(
    item: com.onectrm.akshare.api.generated.event.covid_19_csse_dailyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_csse_dailyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.event.covid_19_csse_dailyResponse]])
      .send(backend)
    resp
  }

  def covid_19_csse_us_confirmedApi(
    item: com.onectrm.akshare.api.generated.event.covid_19_csse_us_confirmedRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_csse_us_confirmedResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.event.covid_19_csse_us_confirmedResponse]]
      )
      .send(backend)
    resp
  }

  def covid_19_csse_us_deathApi(
    item: com.onectrm.akshare.api.generated.event.covid_19_csse_us_deathRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_csse_us_deathResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.event.covid_19_csse_us_deathResponse]]
      )
      .send(backend)
    resp
  }

  def covid_19_csse_global_confirmedApi(
    item: com.onectrm.akshare.api.generated.event.covid_19_csse_global_confirmedRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_csse_global_confirmedResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.event.covid_19_csse_global_confirmedResponse]]
      )
      .send(backend)
    resp
  }

  def covid_19_csse_global_deathApi(
    item: com.onectrm.akshare.api.generated.event.covid_19_csse_global_deathRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_csse_global_deathResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.event.covid_19_csse_global_deathResponse]]
      )
      .send(backend)
    resp
  }

  def covid_19_csse_global_recoveredApi(
    item: com.onectrm.akshare.api.generated.event.covid_19_csse_global_recoveredRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.event.JsonItem_covid_19_csse_global_recoveredResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.event.covid_19_csse_global_recoveredResponse]]
      )
      .send(backend)
    resp
  }

  def currency_latestApi(
    item: com.onectrm.akshare.api.generated.currency.currency_latestRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.currency.JsonItem_currency_latestResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.currency.currency_latestResponse]])
      .send(backend)
    resp
  }

  def currency_historyApi(
    item: com.onectrm.akshare.api.generated.currency.currency_historyRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.currency.JsonItem_currency_historyResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.currency.currency_historyResponse]])
      .send(backend)
    resp
  }

  def currency_time_seriesApi(
    item: com.onectrm.akshare.api.generated.currency.currency_time_seriesRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.currency.JsonItem_currency_time_seriesResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.currency.currency_time_seriesResponse]]
      )
      .send(backend)
    resp
  }

  def currency_currenciesApi(
    item: com.onectrm.akshare.api.generated.currency.currency_currenciesRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.currency.JsonItem_currency_currenciesResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.currency.currency_currenciesResponse]]
      )
      .send(backend)
    resp
  }

  def currency_convertApi(
    item: com.onectrm.akshare.api.generated.currency.currency_convertRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.currency.JsonItem_currency_convertResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.currency.currency_convertResponse]])
      .send(backend)
    resp
  }

  def tool_trade_date_hist_sinaApi(
    item: com.onectrm.akshare.api.generated.tool.tool_trade_date_hist_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.tool.JsonItem_tool_trade_date_hist_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.tool.tool_trade_date_hist_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def js_newsApi(item: com.onectrm.akshare.api.generated.ws.js_newsRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.ws.JsonItem_js_newsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.ws.js_newsResponse]])
      .send(backend)
    resp
  }

  def stock_news_emApi(item: com.onectrm.akshare.api.generated.ws.stock_news_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.ws.JsonItem_stock_news_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.ws.stock_news_emResponse]])
      .send(backend)
    resp
  }

  def fund_name_emApi(item: com.onectrm.akshare.api.generated.fund_public.fund_name_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_name_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_name_emResponse]])
      .send(backend)
    resp
  }

  def fund_info_index_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_info_index_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_info_index_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_info_index_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_purchase_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_purchase_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_purchase_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_purchase_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_open_fund_daily_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_open_fund_daily_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_open_fund_daily_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_open_fund_daily_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_open_fund_info_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_open_fund_info_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_open_fund_info_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_open_fund_info_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_money_fund_daily_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_money_fund_daily_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_money_fund_daily_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_money_fund_daily_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_money_fund_info_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_money_fund_info_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_money_fund_info_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_money_fund_info_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_financial_fund_daily_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_financial_fund_daily_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_financial_fund_daily_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_public.fund_financial_fund_daily_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def fund_financial_fund_info_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_financial_fund_info_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_financial_fund_info_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_public.fund_financial_fund_info_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def fund_graded_fund_daily_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_graded_fund_daily_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_graded_fund_daily_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_public.fund_graded_fund_daily_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def fund_graded_fund_info_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_graded_fund_info_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_graded_fund_info_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_graded_fund_info_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_etf_fund_daily_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_etf_fund_daily_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_etf_fund_daily_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_etf_fund_daily_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_etf_fund_info_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_etf_fund_info_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_etf_fund_info_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_etf_fund_info_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_hk_fund_hist_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_hk_fund_hist_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_hk_fund_hist_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_hk_fund_hist_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_fh_emApi(item: com.onectrm.akshare.api.generated.fund_public.fund_fh_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_fh_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_fh_emResponse]])
      .send(backend)
    resp
  }

  def fund_cf_emApi(item: com.onectrm.akshare.api.generated.fund_public.fund_cf_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_cf_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_cf_emResponse]])
      .send(backend)
    resp
  }

  def fund_fh_rank_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_fh_rank_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_fh_rank_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_fh_rank_emResponse]])
      .send(backend)
    resp
  }

  def fund_open_fund_rank_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_open_fund_rank_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_open_fund_rank_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_open_fund_rank_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_em_exchange_rankApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_em_exchange_rankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_em_exchange_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_em_exchange_rankResponse]]
      )
      .send(backend)
    resp
  }

  def fund_em_money_rankApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_em_money_rankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_em_money_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_em_money_rankResponse]]
      )
      .send(backend)
    resp
  }

  def fund_em_lcx_rankApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_em_lcx_rankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_em_lcx_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_em_lcx_rankResponse]]
      )
      .send(backend)
    resp
  }

  def fund_em_hk_rankApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_em_hk_rankRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_em_hk_rankResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_em_hk_rankResponse]])
      .send(backend)
    resp
  }

  def fund_value_estimation_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_value_estimation_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_value_estimation_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_value_estimation_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_etf_category_sinaApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_etf_category_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_etf_category_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_etf_category_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def fund_etf_hist_sinaApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_etf_hist_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_etf_hist_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_etf_hist_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def fund_portfolio_hold_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_portfolio_hold_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_portfolio_hold_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_portfolio_hold_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_portfolio_bond_hold_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_portfolio_bond_hold_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_portfolio_bond_hold_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_public.fund_portfolio_bond_hold_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def fund_portfolio_industry_allocation_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_portfolio_industry_allocation_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_portfolio_industry_allocation_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_public.fund_portfolio_industry_allocation_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def fund_portfolio_change_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_portfolio_change_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_portfolio_change_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_portfolio_change_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_rating_allApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_rating_allRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_rating_allResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_rating_allResponse]])
      .send(backend)
    resp
  }

  def fund_rating_shApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_rating_shRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_rating_shResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_rating_shResponse]])
      .send(backend)
    resp
  }

  def fund_rating_zsApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_rating_zsRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_rating_zsResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_rating_zsResponse]])
      .send(backend)
    resp
  }

  def fund_rating_jaApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_rating_jaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_rating_jaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_rating_jaResponse]])
      .send(backend)
    resp
  }

  def fund_managerApi(item: com.onectrm.akshare.api.generated.fund_public.fund_managerRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_managerResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_managerResponse]])
      .send(backend)
    resp
  }

  def fund_new_found_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_new_found_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_new_found_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_new_found_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_scale_open_sinaApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_scale_open_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_scale_open_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_scale_open_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def fund_scale_close_sinaApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_scale_close_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_scale_close_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_scale_close_sinaResponse]]
      )
      .send(backend)
    resp
  }

  def fund_scale_structured_sinaApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_scale_structured_sinaRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_scale_structured_sinaResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_public.fund_scale_structured_sinaResponse
        ]]
      )
      .send(backend)
    resp
  }

  def fund_aum_emApi(item: com.onectrm.akshare.api.generated.fund_public.fund_aum_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_aum_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_aum_emResponse]])
      .send(backend)
    resp
  }

  def fund_aum_trend_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_aum_trend_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_aum_trend_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_aum_trend_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_aum_hist_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_aum_hist_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_aum_hist_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_aum_hist_emResponse]]
      )
      .send(backend)
    resp
  }

  def reits_info_jslApi(
    item: com.onectrm.akshare.api.generated.fund_public.reits_info_jslRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_reits_info_jslResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_public.reits_info_jslResponse]])
      .send(backend)
    resp
  }

  def reits_realtime_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.reits_realtime_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_reits_realtime_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.reits_realtime_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_report_stock_cninfoApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_report_stock_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_report_stock_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_report_stock_cninfoResponse]]
      )
      .send(backend)
    resp
  }

  def fund_report_industry_allocation_cninfoApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_report_industry_allocation_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_report_industry_allocation_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_public.fund_report_industry_allocation_cninfoResponse
        ]]
      )
      .send(backend)
    resp
  }

  def fund_report_asset_allocation_cninfoApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_report_asset_allocation_cninfoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_report_asset_allocation_cninfoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_public.fund_report_asset_allocation_cninfoResponse
        ]]
      )
      .send(backend)
    resp
  }

  def fund_scale_change_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_scale_change_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_scale_change_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_scale_change_emResponse]]
      )
      .send(backend)
    resp
  }

  def fund_hold_structure_emApi(
    item: com.onectrm.akshare.api.generated.fund_public.fund_hold_structure_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_public.JsonItem_fund_hold_structure_emResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_public.fund_hold_structure_emResponse]]
      )
      .send(backend)
    resp
  }

  def amac_member_infoApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_member_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_member_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_private.amac_member_infoResponse]]
      )
      .send(backend)
    resp
  }

  def amac_person_fund_org_listApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_person_fund_org_listRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_person_fund_org_listResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_private.amac_person_fund_org_listResponse
        ]]
      )
      .send(backend)
    resp
  }

  def amac_person_bond_org_listApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_person_bond_org_listRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_person_bond_org_listResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_private.amac_person_bond_org_listResponse
        ]]
      )
      .send(backend)
    resp
  }

  def amac_manager_infoApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_manager_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_manager_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_private.amac_manager_infoResponse]]
      )
      .send(backend)
    resp
  }

  def amac_manager_classify_infoApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_manager_classify_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_manager_classify_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_private.amac_manager_classify_infoResponse
        ]]
      )
      .send(backend)
    resp
  }

  def amac_member_sub_infoApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_member_sub_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_member_sub_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_private.amac_member_sub_infoResponse]]
      )
      .send(backend)
    resp
  }

  def amac_fund_infoApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_fund_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_fund_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_private.amac_fund_infoResponse]])
      .send(backend)
    resp
  }

  def amac_securities_infoApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_securities_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_securities_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_private.amac_securities_infoResponse]]
      )
      .send(backend)
    resp
  }

  def amac_aoin_infoApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_aoin_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_aoin_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_private.amac_aoin_infoResponse]])
      .send(backend)
    resp
  }

  def amac_fund_sub_infoApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_fund_sub_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_fund_sub_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_private.amac_fund_sub_infoResponse]]
      )
      .send(backend)
    resp
  }

  def amac_fund_account_infoApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_fund_account_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_fund_account_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_private.amac_fund_account_infoResponse]]
      )
      .send(backend)
    resp
  }

  def amac_fund_absApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_fund_absRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_fund_absResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.fund_private.amac_fund_absResponse]])
      .send(backend)
    resp
  }

  def amac_futures_infoApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_futures_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_futures_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.fund_private.amac_futures_infoResponse]]
      )
      .send(backend)
    resp
  }

  def amac_manager_cancelled_infoApi(
    item: com.onectrm.akshare.api.generated.fund_private.amac_manager_cancelled_infoRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.fund_private.JsonItem_amac_manager_cancelled_infoResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.fund_private.amac_manager_cancelled_infoResponse
        ]]
      )
      .send(backend)
    resp
  }

  def spot_hist_sgeApi(item: com.onectrm.akshare.api.generated.spot.spot_hist_sgeRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.spot.JsonItem_spot_hist_sgeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[com.onectrm.akshare.api.generated.spot.spot_hist_sgeResponse]])
      .send(backend)
    resp
  }

  def spot_golden_benchmark_sgeApi(
    item: com.onectrm.akshare.api.generated.spot.spot_golden_benchmark_sgeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.spot.JsonItem_spot_golden_benchmark_sgeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.spot.spot_golden_benchmark_sgeResponse]]
      )
      .send(backend)
    resp
  }

  def spot_silver_benchmark_sgeApi(
    item: com.onectrm.akshare.api.generated.spot.spot_silver_benchmark_sgeRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    import com.onectrm.akshare.api.generated.spot.JsonItem_spot_silver_benchmark_sgeResponse._

    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[com.onectrm.akshare.api.generated.spot.spot_silver_benchmark_sgeResponse]]
      )
      .send(backend)
    resp
  }

}
