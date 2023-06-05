package com.lqiong.jep
//
//import akka.actor.ActorSystem
//
//object DurableStateStore {
//
//  import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
//  import akka.persistence.state.DurableStateStoreRegistry
//
//  val store = DurableStateStoreRegistry
//    .get(ActorSystem())
//    .durableStateStoreFor[JdbcDurableStateStore[String]](
//      JdbcDurableStateStore.Identifier
//    )
//
//}
