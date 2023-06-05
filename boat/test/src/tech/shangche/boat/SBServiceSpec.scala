package tech.shangche.boat

//bloop test boat.test -o tech.shangche.boat.SBServiceSpec

  import com.lqiong.model.order.ObjectConvert
  import com.onectrm.akshare.api.generated.stock.{stock_profit_sheet_by_report_emRequest, stock_yjbb_emRequest}
  import org.scalatest.flatspec.AsyncFlatSpec
  import org.scalatest.matchers.must.Matchers
  import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
  import tech.shangche.boat.service.BoatService

  import scala.language.postfixOps

  class SBServiceSpec() extends AsyncFlatSpec  with Matchers {
//    it should "should fetch stock_info_a_code_nameReq3" in {
//      stock_profit_sheet_by_report_emRequest.of(
//        "SZ002241",
//      ).getOther.toString shouldNot equal()
//    }
//
//    val boatService =new BoatService()
//    it should "should fetch stock_info_a_code_nameReq2" in {
//      boatService.stock_profit_sheet_by_report_emApi(stock_profit_sheet_by_report_emRequest.of(
//          ObjectConvert.getSimple("603896")
//      )).map {r => {
//        r.body.isRight shouldBe true
//      }}
//    }
  }
