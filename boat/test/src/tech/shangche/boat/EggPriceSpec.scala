package tech.shangche.boat

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import com.onectrm.akshare.api.generated.futures.futures_pig_infoRequest
import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import tech.shangche.boat.service.{AService, BoatService}

import scala.concurrent.{Await, ExecutionContext, Future}
import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

class EggPriceSpec() extends AsyncFlatSpec with Matchers {
  implicit val ec = ExecutionContext.global
  val a1 = new AService()
  implicit val system: ActorSystem[Nothing] = ActorSystem(Behaviors.empty, "SingleRequest1")

  it should "should fetch EggPriceSpec" in {
    val b = Await.result(a1.futures_pig_infoApi(futures_pig_infoRequest.of("猪肉批发价")), 60.seconds)
    b.body.isRight shouldBe true
  }

}
