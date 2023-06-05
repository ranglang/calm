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
  // TODO fetch from env
  val url = ""

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
