package com.lqiong.jep

//class BoatTapirController {

import akka.actor.ActorSystem
import akka.actor.typed.scaladsl.adapter.ClassicActorSystemOps
import akka.event.LoggingAdapter
import akka.http.scaladsl.server.{Route, RouteConcatenation}
import com.google.inject.Inject
import com.lqiong.a.PigSymbol
//import com.lqiong.contact.ReturnMsg
import com.lqiong.jep.entry._
import com.lqiong.jep.option.{CacheFactorService, QuantEngine}
import com.typesafe.config.{Config, ConfigFactory}
import io.circe.generic.AutoDerivation
import sttp.tapir.server.akkahttp.AkkaHttpServerInterpreter
import tech.shangche.boat.service.{AService, BoatService}

import scala.concurrent.ExecutionContext

//  trait LqiongErrorHandler {
//    implicit val ex: ExecutionContext
//
//    def handleErrors[T](f: Future[T]): Future[Either[ReturnMsg, T]] =
//      f.transform {
//        case Success(v) => Success(Right(v))
//        case Failure(e: Throwable) =>
//          println(s"Exception when running endpoint logic: $e")
//          Success(Left(ReturnMsg(code = 1, "server error")))
//      }
//  }
//
//  trait TapirController {
//
//    val route: Route
//    val opiList: Iterable[AnyEndpoint]
//  }

class BoatTapirController @Inject() (
  val config: Config,
  val quantConfig: QuantConfig,
  val logger: LoggingAdapter,
  implicit val system: ActorSystem,
  implicit val ex: ExecutionContext,
  val queryTable: QueryTable,
  val quantEngine: QuantEngine,
  val cacheFactorService: CacheFactorService
) extends RouteConcatenation
    with AutoDerivation
    with LqiongErrorHandler
    with TapirController
    with JodaTimeSchemaTrait {

  val aService = new AService()

  val boatService = new BoatService()(ex)

  import sttp.tapir._

  import scala.concurrent.Future

  private lazy val eggBackend = ConfigFactory.load().getString("EGG_BACKEND")

  private def getHistoryEndPointEggApi(
  ) = {
    logger.info("eggBackend {}", eggBackend)
    val createEndPoit = {
      endpoint.get
        .in("quant" / "boat" / "egg")
        .description("鸡蛋api")
        .prependIn("quant" / "v2")
        .out(
          JsonBody.ABoatEgg1
        )
        .errorOut(JsonBody.retMsg)
    }
    createEndPoit
  }

  private def getHistoryEndPointPig(
  ) = {
    val createEndPoit = {
      endpoint.get
        .in("quant" / "boat" / "pig")
        .in(
          query[PigSymbol]("symbol")
        )
        .description("这是个api")
        .prependIn("quant" / "v2")
        .out(
          JsonBody.futures_pig_infoResponse1
        )
        .errorOut(JsonBody.retMsg)
    }
    createEndPoit
  }

  implicit val d = system.toTyped

  override val route: Route =
    AkkaHttpServerInterpreter().toRoute(
      List(
        getHistoryEndPointEggApi().serverLogic[Future] { _ =>
          handleErrors(
            boatService.eggApi()
          )
        },
        getHistoryEndPointPig().serverLogic[Future] { input =>
          handleErrors(
            aService
              .futures_pig_infoApi(
                com.onectrm.akshare.api.generated.futures.futures_pig_infoRequest
                  .of(input.entryName)
              )
              .map(r => r.body.getOrElse(List.empty))
          )
        }
      )
    )

  override val opiList = List(
    getHistoryEndPointEggApi(),
    getHistoryEndPointPig()
  )
}
