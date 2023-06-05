//package tech.shangche.boat
//
//  import akka.actor.typed.ActorSystem
//  import akka.actor.typed.scaladsl.Behaviors
//  import com.onectrm.akshare.api.generated.index.stock_zh_index_daily_emRequest
//  import org.scalatest.flatspec.AsyncFlatSpec
//  import org.scalatest.matchers.must.Matchers
//  import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
//  import tech.shangche.boat.service.{AService, BoatService}
//
//  import scala.concurrent.Await
//  import scala.concurrent.duration.DurationInt
//  import scala.language.postfixOps
//
//  class IndexHistorySpec1() extends AsyncFlatSpec  with Matchers {
//    val a1 = new AService()
//    val boatService =new BoatService()
//
//    implicit val system: ActorSystem[Nothing] = ActorSystem(Behaviors.empty, "SingleRequest")
//
//    it should "should fetch stock_zh_index_daily_emApi" in {
//      val a = Await.result(boatService.stock_zh_index_daily_emApi(stock_zh_index_daily_emRequest.of(
//        "sz399552"
//      )), 60.seconds)
////      a.body shouldBe 2
//      1 shouldBe 2
//    }
//  }
