//
///*
// * Copyright (C) 2021 Lightbend Inc. <https://www.lightbend.com>
// */
//
//package akka.persistence.r2dbc.query
//
//import akka.Done
//import akka.actor.testkit.typed.scaladsl.{LogCapturing, ScalaTestWithActorTestKit}
//import akka.actor.typed.ActorSystem
//import akka.persistence.query.PersistenceQuery
//import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal
//import akka.persistence.typed.PersistenceId
//import akka.stream.scaladsl.Sink
//import com.lqiong.claim.test.TestActors
//import com.lqiong.claim.test.TestActors.Persister
//import com.typesafe.config.ConfigFactory
//import org.scalatest.BeforeAndAfterAll
//import org.scalatest.wordspec.AnyWordSpecLike
//
//import scala.concurrent.duration._
//
//class CurrentPersistenceIdsQuerySpec
//  extends ScalaTestWithActorTestKit(ConfigFactory.load())
//    with AnyWordSpecLike
//    with LogCapturing with BeforeAndAfterAll {
//
//  def typedSystem: ActorSystem[_] = system
//
//  override def afterAll: Unit = {
//    typedSystem.terminate()
//  }
//
//  private val query = PersistenceQuery(testKit.system).readJournalFor[R2dbcReadJournal](R2dbcReadJournal.Identifier)
//
//  private val zeros = "0000"
//  private val entityType = "rtest1"
////  extEntityType()
//  private val numberOfPids = 2
//  private val pids =
//    (0 to numberOfPids).map(n => PersistenceId(entityType, "p" + zeros.drop(n.toString.length) + n))
//
//  override protected def beforeAll(): Unit = {
//    super.beforeAll()
//
//    val probe = createTestProbe[Done]
//    pids.foreach { pid =>
//      val persister = spawn(TestActors.Persister(pid))
//      persister ! Persister.PersistWithAck("e-1", probe.ref)
//      persister ! Persister.PersistWithAck("e-2", probe.ref)
//      persister ! Persister.Stop(probe.ref)
//    }
//
//    probe.receiveMessages(numberOfPids * 3, 10.seconds) // 2 acks + stop done
//  }
//
//  "Event Sourced currentPersistenceIds" should {
//    "retrieve all ids" in {
//      val result = query.currentPersistenceIds().runWith(Sink.seq).futureValue
//      result shouldBe pids.map(_.id)
//    }
//
//    "retrieve ids afterId" in {
//      val result = query.currentPersistenceIds(afterId = Some(pids(9).id), limit = 7).runWith(Sink.seq).futureValue
//      result shouldBe pids.slice(10, 17).map(_.id)
//    }
//
//  }
//
//}
