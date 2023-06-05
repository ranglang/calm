package com.lqiong.jep.modules

import akka.actor.ActorSystem
import akka.event.LoggingAdapter
import akka.stream.Materializer
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.{AbstractModule, Provides, Singleton}
import com.lqiong.jep.entry.{EnterReason, QuantConfig, QueryTable}
import com.lqiong.model.QueryTableInter
import net.codingwell.scalaguice.ScalaModule
import net.spy.memcached.MemcachedClient

import scala.concurrent.ExecutionContext

class QueryTableModule extends AbstractModule with ScalaModule {

  @Singleton
  @Provides
  def quantConfig(
    enterReason: EnterReason,
    ex: ExecutionContext,
    logger: LoggingAdapter,
    system: ActorSystem,
    materializer: Materializer,
    retryPolicy: RetryPolicy
  ): QuantConfig = {
    new QuantConfig(enterReason, ex, logger, system, materializer, retryPolicy)
  }

  @Singleton
  @Provides
  def queryTableItem(
    ex: ExecutionContext,
    retryPolicy: RetryPolicy,
    memcachedClient: MemcachedClient
  ): QueryTableInter = {
    new QueryTable()(ex, retryPolicy, memcachedClient)
  }
}
