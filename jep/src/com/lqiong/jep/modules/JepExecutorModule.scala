package com.lqiong.jep.modules

import akka.event.LoggingAdapter
import akka.util.Timeout
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.name.Named
import com.google.inject.{AbstractModule, Provides, Singleton}
import com.lqiong.jep.option.JepExecutor
import com.typesafe.config.Config
import net.codingwell.scalaguice.ScalaModule
import org.apache.spark.sql.SparkSession

import scala.concurrent.duration.DurationInt

class JepExecutorModule extends AbstractModule with ScalaModule {

  @Provides
  @Singleton
  def timeout1(config: Config): Timeout = {
    120.seconds
  }

  @Singleton
  @Provides
  def getJepExecutor(
    spark: SparkSession,
    retry1: RetryPolicy,
    @Named("isDevelopment") isDevelopment: Boolean,
    logger: LoggingAdapter
  ): JepExecutor = {
    logger.info("get jep executor")
    new JepExecutor()(spark, retry1, logger, isDevelopment)
  }
}
