package com.lqiong.jep

import com.lqiong.jep.entry.{IndexDailyPriceJodata, JsonDateTime}
import com.lqiong.model.GenericDerivation
import com.lqiong.model.order.StockNote
import io.circe.generic.{AutoDerivation, JsonCodec}
import org.joda.time.DateTime

@JsonCodec
case class IndexHistoryJoda(
  date: DateTime,
  info: IndexDailyPriceJodata,
  chaodie: Option[Double],
  event: Option[StockNote]
)
object IndexHistoryJoda extends JsonDateTime with AutoDerivation with GenericDerivation
