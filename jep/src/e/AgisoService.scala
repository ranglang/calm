package e

import akka.event.LoggingAdapter
import akka.util.Timeout
import sttp.client3._
import sttp.client3.asynchttpclient.future.AsyncHttpClientFutureBackend

import scala.concurrent.ExecutionContext
import scala.concurrent.duration.DurationInt

class AgisoService(
  val logger: LoggingAdapter,
  implicit val ex: ExecutionContext
) {

  val backend = AsyncHttpClientFutureBackend(
    options = SttpBackendOptions.connectionTimeout(1.minute)
  )
  val url = "http://175.24.206.163:30007"

//  def stock_zh_a_spot_em()
//  : Future[Either[ResponseException[String, circe.Error], List[StocKItem1]]] = {
//    implicit val timeout: Timeout = 60.seconds
//    val resp = basicRequest
//      .get(uri"${url}/api/public/stock_zh_a_spot_em")
//      .readTimeout(5.minutes)
//      .response(asJson[List[StocKItem1]])
//      .send(backend)
//    resp.map(r => r.body)
//  }
//
//  //  "日期":"2017-03-03",
//  //  "开盘":8.57,
//  //  "收盘":8.56,
//  //  "最高":8.59,
//  //  "最低":8.52,
//  //  "成交量":342655,
//  //  "成交额":321952544,
//  //  "振幅":0.81,
//  //  "涨跌幅":-0.35,
//  //  "涨跌额":-0.03,
//  //  "换手率":
//
//  //  http://175.24.206.163:30006/api/public/stock_zh_a_hist?adjust=qfq&symbol=000001
//
  import io.circe.generic.auto._
  import io.circe.parser._
  import io.circe.syntax._
  def batchSave(
    list: List[String]
  ) = {
    implicit val timeout: Timeout = 60.seconds
    logger.info(list.asJson.noSpaces)
    val resp = basicRequest
      .post(uri"${url}/hi/save-batch")
      .body(list.asJson.noSpaces)
      .readTimeout(5.minutes)
      .send(backend)
    resp.map(r => r.body)
  }

}
