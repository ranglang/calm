package com.lqiong.jep.option

import com.typesafe.config.Config
import io.circe.generic.JsonCodec
import org.slf4j.LoggerFactory
import scalacache.Cache
import scalacache.memcached.MemcachedCache

import scala.concurrent.{ExecutionContext, Future}

@JsonCodec
case class StocKItem1(`代码`: String, `名称`: String, `最新价`: Double)

class CacheService1(config: Config)( implicit val ex: ExecutionContext) {

  val memcachedcache = config.getString("memcachedcache")

  val logger = LoggerFactory.getLogger(getClass.getName);

  import scalacache.serialization.circe._

  implicit val catsCache: Cache[StocKItem1] =
    MemcachedCache[StocKItem1](memcachedcache)

  def putStock(stock: StocKItem1) = {
    import scalacache.modes.scalaFuture._
    logger.info(s"update stock {}", stock.`代码`)
    println(s"update stock {}", stock.`代码`)
    catsCache.put(s"stock_state_${stock.`代码`}")(stock)
  }

  def getStock(stock: String = "301175"): Future[Option[StocKItem1]] = {
    import scalacache.modes.scalaFuture._
    catsCache.get(s"stock_state_${stock}")
  }

}
