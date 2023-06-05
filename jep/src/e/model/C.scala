package e.model

//case class AResponse(
//                     errorCode: Int,
//                     data: List[SymbolData]
//                   )

case class AResponse(
//error_description: Option[String],
  data: List[SymbolData],
  error_code: Int
)
case class SymbolData(
  symbol: String,
//  trade_volume: Option[String],
//  volume_ext: Option[String],
//  trade_session: Option[String],
  avg_price: Double,
  `type`: Int,
  percent: Double,
//  offer_appl_seq_num: Option[String],
//  trade_type_v2: Option[String],
  current: Double,
//  amplitude: Option[String],
//  high: Option[String],
  current_year_percent: Double,
//  float_market_capital: Option[String],
//  low: Option[String],
//  market_capital: Option[String],
  timestamp: Long,
//  amount: Option[String],
//  side: Option[String],
  chg: Double,
//  bid_appl_seq_num: Option[String],
  level: Int,
//  traded_amount_ext: Option[String],
  last_close: Double,
//  volume: Option[String],
//  trade_unique_id: Option[String],
  is_trade: Boolean
//  turnover_rate: Option[String],
//  trade_type: Option[String],
//  open: Option[String]
)

case class StockData(
  symbol: String,
//                      trade_volume: Option[Double],
//                      volume_ext: Option[Double],
//                      trade_session: Option[String],
  avg_price: Double,
  `type`: Int,
  percent: Double,
//                      offer_appl_seq_num: Option[String],
//                      trade_type_v2: Option[String],
  current: Double,
  amplitude: Double,
  high: Double,
//                      current_year_percent: Double,
//                      float_market_capital: Option[Double],
  low: Double,
//                      market_capital: Option[Double],
  timestamp: Long,
  amount: Double,
//                      side: Option[String],
  chg: Double,
//                      bid_appl_seq_num: Option[String],
  level: Int,
//                      traded_amount_ext: Option[Double],
  last_close: Double,
  volume: Long,
//                      trade_unique_id: Option[String],
  is_trade: Boolean,
  turnover_rate: Double,
//                      trade_type: Option[String],
  open: Double
)

object AB {

  // Example usage
  val map1 = Map(
    "symbol"             -> "SH000016",
    "trade_volume"       -> null,
    "volume_ext"         -> null,
    "trade_session"      -> null,
    "avg_price"          -> 2658.75,
    "type"               -> 12,
    "percent"            -> 0.35,
    "offer_appl_seq_num" -> null,
    "trade_type_v2"      -> null,
    "current"            -> 2658.75,
    "amplitude"          -> 0.66,
    "high"               -> 266
  )

  def convertMapToStockData(map: Map[String, Any]): StockData = {
    StockData(
      symbol = map("symbol").asInstanceOf[String],
//      trade_volume = Option(map("trade_volume").asInstanceOf[Double]),
//      volume_ext = Option(map("volume_ext").asInstanceOf[Double]),
//      trade_session = Option(map("trade_session").asInstanceOf[String]),
      avg_price = map("avg_price").asInstanceOf[Double],
      `type` = map("type").toString.toInt,
      percent = map("percent").asInstanceOf[Double],
//      offer_appl_seq_num = Option(map("offer_appl_seq_num").asInstanceOf[String]),
//      trade_type_v2 = Option(map("trade_type_v2").asInstanceOf[String]),
      current = map("current").asInstanceOf[Double],
      amplitude = map("amplitude").asInstanceOf[Double],
      high = map("high").toString.toDouble,
//      current_year_percent = map("current_year_percent").asInstanceOf[Double],
//      float_market_capital = Option(map("float_market_capital").asInstanceOf[Double]),
      low = map("low").asInstanceOf[Double],
//      market_capital = Option(map("market_capital").asInstanceOf[Double]),
      timestamp = map("timestamp").asInstanceOf[Long],
      amount = map("amount").asInstanceOf[Double],
//      side = Option(map("side").asInstanceOf[String]),
      chg = map("chg").asInstanceOf[Double],
//      bid_appl_seq_num = Option(map("bid_appl_seq_num").asInstanceOf[String]),
      level = map("level").toString.toInt,
//      traded_amount_ext = Option(map("traded_amount_ext").asInstanceOf[Double]),
      last_close = map("last_close").asInstanceOf[Double],
      volume = map("volume").asInstanceOf[Long],
//      trade_unique_id = Option(map("trade_unique_id").asInstanceOf[String]),
      is_trade = map("is_trade").asInstanceOf[Boolean],
      turnover_rate = map("turnover_rate").asInstanceOf[Double],
//      trade_type = Option(map("trade_type").asInstanceOf[String]),
      open = map("open").asInstanceOf[Double]
    )
  }
  def a(value: java.util.HashMap[String, Any]) = {
    import scala.collection.JavaConverters._
    val f1: Map[String, Any] = value.asScala.toMap
    val f = convertMapToStockData(f1)

    println(f);
    f
//
//    f1
  }
}
