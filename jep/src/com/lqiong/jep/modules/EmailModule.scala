package com.lqiong.jep.modules

import com.google.inject.{AbstractModule, Provides, Singleton}
import com.lqiong.email.EmailServiceTrait
import com.lqiong.jep.EmailService
import com.typesafe.config.Config
import net.codingwell.scalaguice.ScalaModule
import net.spy.memcached.{AddrUtil, BinaryConnectionFactory, MemcachedClient}

class MemcachedClientModule extends AbstractModule with ScalaModule {

  @Provides
  @Singleton
  def getMemcache(config: Config) = {
    val memcachedcache = config.getString("memcachedcache")
    val memcachedClient = new MemcachedClient(
      new BinaryConnectionFactory(),
      AddrUtil.getAddresses(memcachedcache)
    )
    memcachedClient
  }
}

class EmailModule extends AbstractModule with ScalaModule {

  override def configure(): Unit = {
    bind[EmailServiceTrait].to[EmailService].in[Singleton]
  }
}
