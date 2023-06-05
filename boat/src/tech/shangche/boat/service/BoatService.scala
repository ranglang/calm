package tech.shangche.boat.service

import akka.actor.typed.ActorSystem
import com.ad.{ABoatEgg, EggListConverter}
import com.com.onectrm.akshare.api.generated.stock.Bstock_individual_info_emResponse
import com.onectrm.akshare.api.generated.stock._
import com.typesafe.config.ConfigFactory
import e.EggDataList
import sttp.client3._
import sttp.client3.asynchttpclient.future.AsyncHttpClientFutureBackend
import sttp.client3.circe.asJson

import scala.concurrent.{ExecutionContext, Future}
import scala.concurrent.duration.{DurationInt, FiniteDuration}
import scala.util.control.NonFatal

class BoatService(implicit private val ex: ExecutionContext) {

  private val backend = AsyncHttpClientFutureBackend(
    options = SttpBackendOptions.connectionTimeout(3.minute)
  )

  private lazy val akShareBackend = ConfigFactory.load().getString("AK_SHARE_BACKEND")
  private lazy val eggBackend = ConfigFactory.load().getString("EGG_BACKEND")

  def eggApi(): Future[List[ABoatEgg]] = {
    val url = s"${eggBackend}"
    implicit val timeout: FiniteDuration = 60.seconds
    val resp = basicRequest
      .get(uri"${url}")
      .readTimeout(5.minutes)
      .response(asJson[EggDataList])
      .send(backend)

    resp
      .map(r => {
        if (r.body.isRight) {
          EggListConverter.getA(r.body.right.get)
        } else {
          List.empty[ABoatEgg]
        }
      })
      .recover { case NonFatal(x) =>
        x.printStackTrace()
        List.empty[ABoatEgg]
      }
  }

  def stock_profit_sheet_by_report_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_profit_sheet_by_report_emRequest
  ) = {
    println("xxxxxx");
    println("xxxxxx");
    println("xxxxxx");
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    println(s"item ${myScalaMap.keys.mkString(",")}")
    println(s"item ${myScalaMap.keys.mkString(",")}")
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(
        asJson[List[
          com.onectrm.akshare.api.generated.stock.B_Stock_profit_sheet_by_report_emResponse
        ]]
      )
      .send(backend)
    resp
  }

  def stock_individual_info_emApi(
    item: com.onectrm.akshare.api.generated.stock.stock_individual_info_emRequest
  ) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[Bstock_individual_info_emResponse]])
      .send(backend)
    resp
  }

  def stock_yjbb_em(item: stock_yjbb_emRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_yjbb_emResponse._

    import scala.collection.JavaConverters._
    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[stock_yjbb_emResponse]])
      .send(backend)
    resp
  }

  def stock_industry_change_cninfo(item: stock_industry_change_cninfoRequest) = {
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_industry_change_cninfoResponse._
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import scala.collection.JavaConverters._
    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[stock_industry_change_cninfoResponse]])
      .send(backend)
    resp
  }
  def stock_info_a_code_nameRequest(item: stock_info_a_code_nameRequest) = {
    val url = s"${akShareBackend}/api/public/${item.getName}"
    implicit val timeout: FiniteDuration = 60.seconds
    import com.onectrm.akshare.api.generated.stock.JsonItem_stock_info_a_code_nameResponse._

    import scala.collection.JavaConverters._
    val myScalaMap: Map[String, String] = item.getOther.asScala.toMap
    val resp = basicRequest
      .get(uri"${url}?${myScalaMap}")
      .readTimeout(5.minutes)
      .response(asJson[List[stock_info_a_code_nameResponse]])
      .send(backend)
    resp
  }

}
