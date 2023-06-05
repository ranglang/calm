package tech.shangche.boat.traits

import com.lqiong.jep.models.StockHotPrice1
import com.lqiong.model.StockSymbol
import com.onectrm.akshare.api.generated.stock.B_Stock_profit_sheet_by_report_emResponse
import tech.shangche.boat.models.{ReqIndexItem, ReqStockItemData}

import scala.concurrent.Future

trait StockDataServiceInter {
  def stock_zh_a_hist(code: ReqStockItemData): Future[List[StockHotPrice1]]
  def stock_profit_sheet_by_report_emApi(
    code: StockSymbol
  ): Future[Option[List[B_Stock_profit_sheet_by_report_emResponse]]]
}

trait IndexStockDataServiceInter {
  def index_zh_a_hist_min_em(code: ReqIndexItem): Future[List[StockHotPrice1]]
  def getPrice(code: ReqIndexItem): Future[StockHotPrice1]
}
