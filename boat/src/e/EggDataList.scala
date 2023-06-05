package e

import io.circe.generic.JsonCodec
@JsonCodec
case class EggDataList(
  columns: List[String] = List.empty,
  data: List[
    (String, Double, Double, Double, Double, Double, Double, Option[Double], Option[Double])
  ] = List.empty
)
