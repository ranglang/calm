package com.lqiong.jep

import com.ad.ABoatEgg
import com.lqiong.contact.ReturnMsg
import com.lqiong.jep.entry.{EnumInfoLevel, JsonDateTime, RetStock, WeatherStation1}
import com.lqiong.model.order.StockNote
import com.lqiong.model.{GenericDerivation, LSymbol, StockSymbol}
import io.circe.generic.{AutoDerivation, JsonCodec}
import org.joda.time.DateTime
import sttp.tapir.Schema
import sttp.tapir.SchemaType.{SNumber, SString}
import sttp.tapir.json.circe.{jsonBody, TapirJsonCirce}
import sttp.tapir.generic.auto._

@JsonCodec
case class EventStock(
  date: DateTime,
  info: WeatherStation1,
  chaodie: Option[Double],
//= Option.empty,
  event: Option[StockNote] = Option.empty[StockNote]
)
object EventStock extends JsonDateTime with AutoDerivation with GenericDerivation

@JsonCodec
case class RetListWithEventStock(records: List[EventStock], code: Int = 2001)

object RetListWithEventStock extends JsonDateTime with AutoDerivation with GenericDerivation

@JsonCodec
case class StockNoteStock(
  symbol: StockSymbol,
  dateTime: Option[DateTime] = Option.empty[DateTime],
  eventNameOpt: Option[String] = Option.empty[String],
  descriptionOpt: Option[String] = Option.empty[String],
  url: Option[String] = Option.empty[String],
  levelOpt: Option[EnumInfoLevel] = Option.empty[EnumInfoLevel]
)

object StockNoteStock extends JsonDateTime with AutoDerivation with GenericDerivation

trait JodaTimeSchemaTrait {
  implicit val schemaForDateTime: Schema[DateTime] = Schema(SNumber())
}

object JsonBody
    extends AutoDerivation
    with JsonDateTime
    with TapirJsonCirce
    with JodaTimeSchemaTrait {
//  import sttp.tapir.generic.auto._
  implicit val schemaForLSymbol: Schema[LSymbol] = Schema(SString())
  implicit val sEnumInfoLevel: Schema[EnumInfoLevel] = Schema(SString())

  implicit val schemaForLSymbol1: Schema[StockSymbol] = Schema(SString())
  implicit val retMsg = jsonBody[ReturnMsg]

  implicit val tetStock = jsonBody[RetStock]
  implicit val jsonBodyStockNoteStock = jsonBody[StockNoteStock]

  implicit val dRetListWithEventStock = jsonBody[RetListWithEventStock]
  implicit val dListIndexHistoryJoda = jsonBody[List[IndexHistoryJoda]]
  implicit val futures_pig_infoResponse1 =
    jsonBody[List[com.onectrm.akshare.api.generated.futures.futures_pig_infoResponse]]

  implicit val ABoatEgg1 =
    jsonBody[List[ABoatEgg]]

}
