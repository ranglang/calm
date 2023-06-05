package tech.shangche.boat

import com.lqiong.model.StockSymbol
import com.onectrm.akshare.api.generated.stock.{stock_financial_analysis_indicatorRequest, stock_individual_info_emRequest, stock_profit_sheet_by_report_emRequest, stock_yjbb_emRequest}
import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import tech.shangche.boat.query.BoatQuery
import tech.shangche.boat.service.{AService, BoatService}

import scala.language.postfixOps

class AServiceSpec() extends AsyncFlatSpec  with Matchers {
//  val a1 = new AService()
//  val boatService =new BoatService()
//
//  it should "should fetch stock_info_a_code_nameReq1" in {
//    a1.stock_yjbb_emApi(stock_yjbb_emRequest.of(
//      "20200331",
//    )).map{r => {
//      r.body.isRight shouldBe true
//    }}
//  }
//
//  it should "should fetch stock_info_a_code_nameReq4" in {
//    a1.stock_financial_analysis_indicatorApi(stock_financial_analysis_indicatorRequest.of(
//      "002241",
//    )).map {r => {
//      r.body.isRight shouldBe true
//    }}
//  }
//
//  it should "should fetch stock_individual_info_emApi" in {
//    boatService.stock_individual_info_emApi(stock_individual_info_emRequest.of(
//      "002241",
//    )).map {r => {
//      r.body.isRight shouldBe true
//    }}
//  }
//
//  it should "should fetch stock_individual_info_emApi" in {
//    BoatQuery.stock.stock_individual_info_emApi(StockSymbol("002241")).map(r => {
//      r.isDefined shouldBe true
//    })
//  }
}
