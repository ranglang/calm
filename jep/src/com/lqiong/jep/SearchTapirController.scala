package com.lqiong.jep

import akka.actor.ActorSystem
import akka.event.LoggingAdapter
import akka.http.scaladsl.server.{Route, RouteConcatenation}
import com.google.inject.Inject
import com.lqiong.contact.ReturnMsg
import com.lqiong.jep.entry._
import com.lqiong.jep.option.{CacheFactorService, PanMingChaoDieItem2, QuantEngine}
import com.lqiong.model.{IndexSymbol, StockSymbol}
import com.onectrm.akshare.api.generated.stock.Respstock_financial_analysis_indicatorResponse
import com.typesafe.config.Config
import io.circe.generic.AutoDerivation
import org.joda.time.DateTime
import sttp.tapir.AnyEndpoint
import sttp.tapir.json.circe.jsonBody
import sttp.tapir.server.akkahttp.AkkaHttpServerInterpreter
import tech.shangche.boat.StockInfo
import tech.shangche.boat.query.BoatQuery

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Either, Failure, Left, Right, Success}

trait LqiongErrorHandler {
  implicit val ex: ExecutionContext
  def handleErrors[T](f: Future[T]): Future[Either[ReturnMsg, T]] =
    f.transform {
      case Success(v) => Success(Right(v))
      case Failure(e: Throwable) =>
        println(s"Exception when running endpoint logic: $e")
        Success(Left(ReturnMsg(code = 1, "server error")))
    }
}

trait TapirController {

  val route: Route
  val opiList: Iterable[AnyEndpoint]
}

case class AINput(
  code: String,
  `type`: String,
  period: String
)
class SearchTapirController @Inject() (
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

  import sttp.tapir._

  import scala.concurrent.Future

  private def getStockInfoApi(): Endpoint[Unit, String, ReturnMsg, Option[StockInfo], Any] = {
    val createEndPoit = {
      import sttp.tapir.generic.auto._
      endpoint.get
        .in("security" / "info" / "stock")
        .in(query[String]("code"))
        .description("这是个api")
        .prependIn("quant" / "v2")
        .out(
          jsonBody[Option[StockInfo]]
        )
        .errorOut(JsonBody.retMsg)
    }
    createEndPoit
  }

  private def getCaiwuInfoApi(): Endpoint[Unit, String, ReturnMsg, Option[
    List[Respstock_financial_analysis_indicatorResponse]
  ], Any] = {
    val createEndPoit = {
      import sttp.tapir.generic.auto._
      endpoint.get
        .in("security" / "data" / "caiwu")
        .in(query[String]("code"))
        .description("这是个api")
        .prependIn("quant" / "v2")
        .out(
          jsonBody[Option[List[Respstock_financial_analysis_indicatorResponse]]]
        )
        .errorOut(JsonBody.retMsg)
    }
    createEndPoit
  }

  private def getIndicatorPanmingApi()
    : Endpoint[Unit, String, ReturnMsg, List[PanMingChaoDieItem2], Any] = {
    val createEndPoit = {
      import sttp.tapir.generic.auto._
      endpoint.get
        .in("security" / "indicator" / "panming")
        .in(query[String]("code"))
        .description("这是个api")
        .prependIn("quant" / "v2")
        .out(
          jsonBody[List[PanMingChaoDieItem2]]
        )
        .errorOut(JsonBody.retMsg)
    }
    createEndPoit
  }

  private def getIndicatorItemApi(): Endpoint[Unit, String, ReturnMsg, RetStockChaoDie, Any] = {
    val createEndPoit = {
      import sttp.tapir.generic.auto._
      endpoint.get
        .in("security" / "indicator" / "chaodie")
        .in(query[String]("code"))
        .description("这是个api")
        .prependIn("quant" / "v2")
        .out(
          jsonBody[RetStockChaoDie]
        )
        .errorOut(JsonBody.retMsg)
    }
    createEndPoit
  }

  private def getIndexHistorysEventsAndChaodieEndPointApi(
  ) = {
    val createEndPoit = {
      endpoint.get
        .in("history" / "index" / "daily" / "chaodie-events")
        .in(
          query[String]("code")
            .and(
              query[String]("type")
                .and(query[String]("period"))
            )
            .mapTo[AINput]
        )
        .description("这是个api")
        .prependIn("quant" / "v2")
        .out(
          JsonBody.dListIndexHistoryJoda
        )
        .errorOut(JsonBody.retMsg)
    }
    createEndPoit
  }

  private def getHistorysEventsAndChaodieEndPointApi(
  ) = {
    val createEndPoit = {
      endpoint.get
        .in("history" / "stock" / "daily" / "chaodie-events")
        .in(
          query[String]("code")
            .and(
              query[String]("type")
                .and(query[String]("period"))
            )
            .mapTo[AINput]
        )
        .description("这是个api")
        .prependIn("quant" / "v2")
        .out(
          JsonBody.dRetListWithEventStock
        )
        .errorOut(JsonBody.retMsg)
    }
    createEndPoit
  }

//  private def getHistorysEventsEndPointApi(
//  ) = {
//    val createEndPoit = {
//      endpoint.get
//        .in("history" / "stock" / "daily" / "with-events")
//        .in(
//          query[String]("code")
//            .and(
//              query[String]("type")
//                .and(query[String]("period"))
//            )
//            .mapTo[AINput]
//        )
//        .description("这是个api")
//        .prependIn("quant" / "v2")
//        .out(
//          JsonBody.dRetListWithEventStock
//        )
//        .errorOut(JsonBody.retMsg)
//    }
//    createEndPoit
//  }

  private def getHistoryEndPoint(
  ): Endpoint[Unit, AINput, ReturnMsg, RetStock, Any] = {
    val createEndPoit = {
      endpoint.get
        .in("history" / "stock" / "daily")
        .in(
          query[String]("code")
            .and(
              query[String]("type")
                .and(query[String]("period"))
            )
            .mapTo[AINput]
        )
        .description("这是个api")
        .prependIn("quant" / "v2")
        .out(
          JsonBody.tetStock
        )
        .errorOut(JsonBody.retMsg)
    }
    createEndPoit
  }

  def imple1(code: AINput): Future[RetStock] = {
    queryTable.getStock(StockSymbol(code.code.replaceAll("s_", "")))
  }

//  implicit val d = system.toTyped

  def info(code: String) = {
    BoatQuery.stock.stock_individual_info_emApi(StockSymbol(code))
  }

  def chaodie(code: String): Future[RetStockChaoDie] = {
    cacheFactorService.getSymbolChaodie(StockSymbol(code)).recover { case _ =>
      RetStockChaoDie(records = List.empty[StockChaoDieJoda])
    }
  }

  def panming(code: String) = {
    cacheFactorService.fetchPanmingDataListCache(IndexSymbol(code))
  }

  def queryIndexDataList(symbol: IndexSymbol): Future[List[IndexHistoryJoda]] = {
    for {
      indexHistory    <- queryTable.getIndex(symbol)
      panmingDataList <- cacheFactorService.fetchPanmingDataListCache(symbol)
      eventsList <-
        quantConfig
          .getEventsBySymbol(symbol)
    } yield {
      val eventList = eventsList.filter(r => r.dateTime.isDefined)
      val eventMap = eventList.map(a => a.dateTime.get -> a).toMap
      //      DateFormat.getDay(r.date)
      val chaodieMap = panmingDataList.map(r => new DateTime(r.date) -> r.value).toMap
      indexHistory.records.map(r =>
        IndexHistoryJoda(
          date = r.date,
          info = r,
          chaodie = chaodieMap.get(r.date),
          event = eventMap.get(r.date)
        )
      )
    }
  }

  def caiwu(code: String): Future[Option[List[Respstock_financial_analysis_indicatorResponse]]] = {
    val n = BoatQuery.stock.stock_financial_analysis_indicatorApi(StockSymbol(code))
    n
  }

  override val route: Route =
    AkkaHttpServerInterpreter().toRoute(
      List(
        getHistoryEndPoint().serverLogic[Future] { input =>
          handleErrors(imple1(input))
        },
        getHistorysEventsAndChaodieEndPointApi().serverLogic[Future] { input =>
          handleErrors(quantEngine.fetchStockItems(input))
        },
        getIndicatorItemApi().serverLogic[Future] { input =>
          handleErrors(chaodie(input))
        },
        // TODO panming
//        getIndicatorPanmingApi().serverLogic[Future] { input =>
//          handleErrors(panming(input))
//        },
        getCaiwuInfoApi().serverLogic[Future] { input =>
          handleErrors(caiwu(input))
        },
        getStockInfoApi().serverLogic[Future] { input =>
          handleErrors(info(input))
        },
        getIndexHistorysEventsAndChaodieEndPointApi().serverLogic[Future] { input =>
          handleErrors(queryIndexDataList(IndexSymbol(input.code)))
        }
      )
    )

  override val opiList = List(
    getHistoryEndPoint(),
    getIndicatorItemApi(),
    getIndicatorPanmingApi(),
    getCaiwuInfoApi(),
    getStockInfoApi(),
    getHistorysEventsAndChaodieEndPointApi(),
    getIndexHistorysEventsAndChaodieEndPointApi()
  )
}
