package com.lqiong.jep.entry

import com.lqiong.model.StockSymbol
import org.joda.time.DateTime

import java.time.{Instant, LocalDateTime}
case class TodayStockPrice(
  code: String,
  open: Double,
  close: Double,
  high: Double,
  low: Double,
  volume: Double
)

case class LastStockPrice(
  date: DateTime,
  stick: List[TodayStockPrice]
)

trait HotPriceCommand

case class LastStockPriceSingle(
  stock: StockSymbol,
  date: DateTime,
  stick: TodayStockPrice
) extends HotPriceCommand

case object CompleteA1 extends HotPriceCommand
case object RichEnd extends HotPriceCommand
case object StreamEnd extends HotPriceCommand

case class RichFailureOccured(ex: Exception) extends HotPriceCommand

case class WeatherStation3(
  date: Instant, //
  open: String,
  close: String,
  high: String,
  low: String,
  volume: String,
  turnover: String,
  outstanding_share: String
)

case class WeatherStation2(
  open: String,
  close: String,
  high: String,
  low: String,
  volume: String,
  turnover: String,
  outstanding_share: String
)

case class WeatherStationLocalDateTime(
  date: LocalDateTime,
  open: Double,
  close: Double,
  high: Double,
  low: Double,
  volume: Double,
  turnover: Double,
  outstanding_share: Double
)

case class LStockItemContinueTimeStamp(
  //                       date: java.sql.Timestamp,
  date: java.sql.Timestamp,
  count: Int
)

case class LStockItemContinue1(
  date: java.sql.Date,
  count: Int
)

case class LStockItemDate(
  date: java.util.Date,
  open: Double,
  close: Double,
  high: Double,
  low: Double,
  volume: Double,
  turnover: Double,
  outstanding_share: Double
)

case class LStockItem(
  date: java.sql.Timestamp,
  open: Double,
  close: Double,
  high: Double,
  low: Double,
  volume: Double,
  turnover: Double,
  outstanding_share: Double
)


