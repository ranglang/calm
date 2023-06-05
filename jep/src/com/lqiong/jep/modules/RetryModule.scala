package com.lqiong.jep.modules

import com.github.takezoe.retry.{LinerBackOff, RetryPolicy}
import com.google.inject.{AbstractModule, Provides, Singleton}
import net.codingwell.scalaguice.ScalaModule

class RetryModule extends AbstractModule with ScalaModule {

  @Singleton
  @Provides
  def getRe(): RetryPolicy = {
    import scala.concurrent.duration._
    RetryPolicy(
      maxAttempts = 3,
      retryDuration = 3.second,
      backOff = LinerBackOff, // default is FixedBackOff
      jitter = 3.second // default is no jitter
    )
  }
}
