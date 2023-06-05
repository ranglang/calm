package tech.shangche.boat

import com.lqiong.model.StockSymbol
import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import tech.shangche.boat.models.{ReqIndexItem, ReqStockItemData}
import tech.shangche.boat.query.BoatQuery

import scala.language.postfixOps

class StockPriceSpec() extends AsyncFlatSpec  with Matchers   {


//  it should "should fetch query object" in {
//    BoatQuery.stock.stockData.stock_zh_a_hist(ReqStockItemData(
//      symbol = StockSymbol("000001"),
//    )).map(r => {
//      r.nonEmpty shouldBe true
//    })
//  }
//
//  it should "should fetch query index" in {
//    BoatQuery.index.indexData.index_zh_a_hist_min_em(ReqIndexItem(
//      symbol = "000016",
//    )).map(r => {
//      r.nonEmpty shouldBe true
//    })
//  }
//
//  it should "should fetch query index price" in {
//    BoatQuery.index.indexData.getPrice(ReqIndexItem(
//      symbol = "000016",
//    )).map(r => {
//      r shouldNot equal(1)
//    })
//  }

}
