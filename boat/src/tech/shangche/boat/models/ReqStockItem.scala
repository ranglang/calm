package tech.shangche.boat.models

import com.lqiong.jep.entry.DateFormat
import com.lqiong.jep.models.StockHotPrice1
import com.lqiong.model.StockSymbol
import io.circe.generic.JsonCodec
import org.joda.time.DateTime

@JsonCodec
case class ReqStockItem(
  symbol: String = "000001",
  adjust: String = "qfq",
  period: Option[String] = Option.empty[String],
  start_date: Option[String] = Option.empty[String],
  end_date: Option[String] = Option.empty[String]
)

case class ReqIndexItem(
  symbol: String = "000016",
  period: Int = 1
)

//symbol	str	symbol='603777'; 股票代码可以在 ak.stock_zh_a_spot_em() 中获取
//period	str	period='daily'; choice of {'daily', 'weekly', 'monthly'}
//start_date	str	start_date='20210301'; 开始查询的日期
//end_date	str	end_date='20210616'; 结束查询的日期
//adjust	str	默认返回不复权的数据; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据

case class ReqStockItemData(
  symbol: StockSymbol,
  adjust: String = "qfq",
  period: Option[String] = Option.empty[String],
  start_date: Option[DateTime] = Option.empty[DateTime],
  end_date: Option[DateTime] = Option.empty[DateTime]
) {

  import io.scalaland.chimney.dsl._

  def transform1: ReqStockItem = {
    this
      .into[ReqStockItem]
      .withFieldComputed(_.symbol, _.symbol.code)
      .withFieldComputed(_.start_date, _.start_date.map(DateFormat.getConnectedDate))
      .withFieldComputed(_.end_date, _.start_date.map(DateFormat.getConnectedDate))
      .transform
  }
}
