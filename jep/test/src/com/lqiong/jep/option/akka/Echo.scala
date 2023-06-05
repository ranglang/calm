//package com.lqiong.jep.option.akka
//
//import akka.actor.ActorSystem
//import akka.testkit.{ ImplicitSender, TestActors, TestKit }
//import org.scalatest.BeforeAndAfterAll
//import org.scalatest.matchers.should.Matchers
//import org.scalatest.wordspec.AnyWordSpecLike
//
//class Echo()
//  extends TestKit(ActorSystem("MySpec"))
//    with ImplicitSender
//    with AnyWordSpecLike
//    with Matchers
//    with BeforeAndAfterAll {
//
//  override def afterAll(): Unit = {
//    TestKit.shutdownActorSystem(system)
//  }
//
//  "An Echo actor" must {
//
//    "send back messages unchanged" in {
//      val echo = system.actorOf(TestActors.echoActorProps)
//      echo ! "hello world"
//      expectMsg("hello world")
//    }
//
//  }
//}
//
