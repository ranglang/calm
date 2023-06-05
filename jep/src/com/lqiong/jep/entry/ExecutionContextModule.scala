package com.lqiong.jep.entry

import akka.actor.ActorSystem
import akka.actor.typed.scaladsl.adapter.ClassicActorSystemOps
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.typed.ClusterSingleton
import akka.event.LoggingAdapter
import akka.stream.Materializer
import com.google.inject.name.Named
import com.google.inject.{AbstractModule, Provides, Singleton}
import com.typesafe.config.Config
import net.codingwell.scalaguice.ScalaModule

import scala.concurrent.ExecutionContext

class ExecutionContextModule extends AbstractModule with ScalaModule {

  override def configure(): Unit = {
//    val ec = ExecutionContext.fromExecutor(Executors.newFixedThreadPool(4))

    bind[ExecutionContext].toInstance(ExecutionContext.global)
  }

}

class AkkaSharedClusterModule(
) extends AbstractModule
    with ScalaModule {

  @Singleton
  @Provides
  def getClusterSharding(actorSystem: ActorSystem): ClusterSharding = {
    val sharding: ClusterSharding = ClusterSharding(actorSystem.toTyped)
    sharding
  }

  @Singleton
  @Provides
  def getClusterSingleton(system: ActorSystem): ClusterSingleton = {
    val singletonManager = ClusterSingleton(system.toTyped)
    singletonManager
  }

}

class AkkaMaterializerModule(
  val s: ActorSystem
) extends AbstractModule
    with ScalaModule {

  @Singleton
  @Provides
  def getActor(): ActorSystem = {
    sys.addShutdownHook(() => {
      s.terminate();
    })
    s
  }

  @Singleton
  @Provides
  def getActorMaterializer(actorSystem: ActorSystem): Materializer = {
    Materializer(actorSystem)
//    new ActorMaterializer()(actorSystem)
  }
}

class LoggingModule(name: String) extends AbstractModule with ScalaModule {

  @Singleton
  @Provides
  def getSpark(akka: ActorSystem): LoggingAdapter = {
    akka.log.info(s"xxxx get akka actor ${name}")
    akka.log
  }

  @Provides
  @Singleton
  @Named("isDevelopment")
  def horseChannel(config: Config): Boolean = {
    config.getString("env") == "development"
  }

}
