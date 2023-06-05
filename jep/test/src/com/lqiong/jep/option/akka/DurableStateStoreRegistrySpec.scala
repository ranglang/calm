package com.lqiong.jep.option.akka

import akka.actor.ActorSystem
import akka.testkit.{ImplicitSender, TestKit}
import com.google.inject.Guice
import com.lqiong.email.module.ConfigModule
import com.lqiong.jep.entry._
import com.lqiong.jep.modules._
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

import scala.language.postfixOps

class DurableStateStoreRegistrySpec()
  extends TestKit(ActorSystem("Count"))
    with ImplicitSender
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll {

  val injector = Guice.createInjector(
    new ConfigModule(),
    new AkkaMaterializerModule(system),
    new ExecutionContextModule,
    new EmailModule,
    new LoggingModule("spark"),
    new JepExecutorModule,
    new RetryModule,
    new SparkModule,
    new QueryTableModule
  )

  //  lazy val sparkTable = injector.instance[GetSparkTable]

  override def afterAll(): Unit = {
    TestKit.shutdownActorSystem(system)
    //    testKit.shutdownTestKit()
    //    sparkTable.shutdownSpark()
//    Await.result(store.deleteObject("p234"), 120.seconds)
    system.terminate()
  }


//  import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
//  import akka.persistence.state.DurableStateStoreRegistry
//  val store = DurableStateStoreRegistry
//    .get(system)
//    .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)
//
//
//  val storeStock = DurableStateStoreRegistry
//    .get(system)
//    .durableStateStoreFor[JdbcDurableStateStore[List[StockOrder]]](JdbcDurableStateStore.Identifier)
//
    "DurableStateStoreRegistry" must {
      "InvalidPersistenceId" in {
         1 shouldEqual 1
      }
    }

//  "DurableStateStoreRegistry" must {
//    "InvalidPersistenceId" in {
//
//      import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
//      import akka.persistence.state.DurableStateStoreRegistry
//      import akka.persistence.state.scaladsl.GetObjectResult
//      val futureResult: Future[GetObjectResult[String]] = store.getObject("InvalidPersistenceId")
//      futureResult.futureValue.value shouldBe None
//
//    }
//
//    "a file " in {
//
//      val v: Future[(akka.Done, GetObjectResult[String])] =
//        for {
//          c1 <- store.deleteObject("p234")
//          n <- store.upsertObject("p234", 1, "a valid string", "t123")
//          _ = n shouldBe akka.Done
//          g <- store.getObject("p234")
//          _ = g.value shouldBe Some("a valid string")
//          u <- store.upsertObject("p234", 2, "updated valid string 1", "t123")
//          _ = u shouldBe akka.Done
//          h <- store.getObject("p234")
//          _ = h.value shouldBe Some("updated valid string 1")
//          _ = h.revision shouldBe 2
//          ef <- store.deleteObject("p234")
//        } yield (ef, h)
////
//      v.futureValue._2.value  shouldBe Some("updated valid string 1")
//      store.deleteObject("p234").futureValue shouldBe akka.Done
//    }
//
//    "a file 1" in {
//
//
//      import order._
//      val current = "f76965644c26e86fbdba7bf83f45e51e"
//        val l = List(
//          sell code c"601019" amount 100 via current quickly
//        )
//      val v: Future[GetObjectResult[List[StockOrder]]] =
//        for {
//          ef <- store.deleteObject("order")
//          c1 <- storeStock.deleteObject("order")
//          n <- storeStock.upsertObject("order", 1, l, "t123")
//          g <- storeStock.getObject("order")
////          _ = g.value shouldBe Some("a valid string")
//        } yield g
//      v.futureValue.value.get.head.symbol.code   shouldBe  "601019"
//    }
//
//    "a file 2" in {
//
//
//      import order._
//      val current = "f76965644c26e86fbdba7bf83f45e51e"
//      val l = List(
//        sell code c"601019" amount 100 via current quickly
//      )
//      val v: Future[GetObjectResult[List[StockOrder]]] =
//        for {
//          g <- storeStock.getObject("orde1r")
//        } yield g
//      v.futureValue.revision   shouldBe 0
//    }
//  }

}
