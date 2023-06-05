package model

import io.circe.generic.JsonCodec

@JsonCodec
case class Data(
  amount: Double,
  amplitude: Double,
  avg_price: Double,
  bid_appl_seq_num: Option[String],
  chg: Double,
  current: Double,
  current_year_percent: Double,
  float_market_capital: Double,
  high: Double,
  is_trade: Boolean,
  last_close: Double,
  level: Int,
  low: Double,
  market_capital: Double,
  offer_appl_seq_num: Option[String],
  open: Double,
  percent: Double,
  side: Option[Int],
  symbol: String,
  timestamp: Long,
  trade_session: Option[String],
  trade_type: Option[String],
  trade_type_v2: Option[String],
  trade_unique_id: Option[String],
  trade_volume: Option[Long],
  traded_amount_ext: Option[Double],
  turnover_rate: Double,
  `type`: Int,
  volume: Int
)

@JsonCodec
case class RootInterfaceScala(
  data: Seq[Data],
  error_code: Int,
  error_description: Option[String]
)
