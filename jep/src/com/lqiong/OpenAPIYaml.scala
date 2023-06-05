package com.lqiong

import akka.http.scaladsl.server.{Route, RouteConcatenation}
import com.lqiong.jep.TapirController
import sttp.tapir.AnyEndpoint
import sttp.tapir.docs.openapi.OpenAPIDocsInterpreter
import sttp.tapir.server.akkahttp.AkkaHttpServerInterpreter
import sttp.apispec.openapi.Info
import sttp.tapir.swagger.SwaggerUI

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object OpenAPIYaml extends RouteConcatenation {

  import sttp.apispec.openapi.circe.yaml._
  def getList(li1st: List[TapirController]) = {
    val a: Iterable[AnyEndpoint] = li1st.flatMap(r => r.opiList)
    val openAPIYaml: String = OpenAPIDocsInterpreter().toOpenAPI(a, Info("title", "1.0")).toYaml

//    OpenAPIDocsInterpreter
    val list: List[Route] = List(
      AkkaHttpServerInterpreter().toRoute(SwaggerUI[Future](openAPIYaml))
    ) ::: li1st.map(r => r.route)
    list.reduce((a, b) => a ~ b)
  }

}
