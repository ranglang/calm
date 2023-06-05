package tech.shangche.boat


//  package tech.shangche.boat

  import com.lqiong.model.StockSymbol
  import e.SnowballService
  import org.scalatest.flatspec.AsyncFlatSpec
  import org.scalatest.matchers.must.Matchers
  import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
  import tech.shangche.boat.models.{ReqIndexItem, ReqStockItemData}
  import tech.shangche.boat.query.BoatQuery

  import scala.concurrent.ExecutionContext.global
  import scala.language.postfixOps

  class PriceSpec() extends AsyncFlatSpec  with Matchers   {

    val s = new SnowballService()(global)

      it should "should fetch query object" in {
       s.fetchStockHotPrice("300662").map(r => {
         r shouldBe 1
       })
      }
  }
