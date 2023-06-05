package tech.shangche.boat

  import akka.actor.typed.ActorSystem
  import akka.actor.typed.scaladsl.Behaviors
  import com.ad.EggListConverter
  import org.scalatest.flatspec.AsyncFlatSpec
  import org.scalatest.matchers.must.Matchers
  import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
  import tech.shangche.boat.service.BoatService

  import scala.concurrent.{Await, ExecutionContext}
  import scala.concurrent.duration.DurationInt
  import scala.language.postfixOps

  class EggSpec() extends AsyncFlatSpec  with Matchers {
    implicit val ec = ExecutionContext.global
    implicit val system: ActorSystem[Nothing] = ActorSystem(Behaviors.empty, "SingleRequest")
    val boatService =new BoatService()


    it should "should fetch EggSpec" in {
      val a = Await.result(boatService.eggApi(), 60.seconds)

      a.nonEmpty shouldBe true
    }
  }
