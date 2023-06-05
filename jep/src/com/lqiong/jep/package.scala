package com.lqiong

import com.lqiong.jep.entry.RetStock
import io.circe.generic.AutoDerivation
import sttp.tapir.json.circe.jsonBody

object Codec1 extends AutoDerivation {
  import sttp.tapir.generic.auto._
//  implicit val d = jsonBody[RetStock]
}
