package com.lqiong.jep

import akka.event.LoggingAdapter
import com.google.inject.Inject
import com.typesafe.config.Config
import scalacache.{put, Cache}

import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, ExecutionContext}

class MCache @Inject() (val config: Config, implicit val ex: ExecutionContext) {

  import scalacache.memcached._

  final case class Cat(id: Int, name: String, colour: String)
//  cache {
//    memcached = ${?MEMCACHED}
//  }
  import io.circe._
  import io.circe.generic.semiauto._
  implicit val catEncoder: Encoder[Cat] = deriveEncoder[Cat]
  implicit val catDecoder: Decoder[Cat] = deriveDecoder[Cat]

  def run(logger: LoggingAdapter) = {

    // TODO memcached
    val memcached = config.getString("cache.memcached")

    // We'll use the binary serialization codec - more on that later
    import scalacache.serialization.circe._

    implicit val catsCache: Cache[Cat] = MemcachedCache[Cat](memcached)

    import scalacache.modes.scalaFuture._

    val ericTheCat = Cat(1, "Eric", "tuxedo")

    val f = put("eric")(ericTheCat)

    import scalacache._

    Await.result(f, 5.seconds)
    val f2 = get("eric")
    val f1 = Await.result(f2, 5.seconds)
    logger.info(f1.toString)
    println(f1)

    // 000603
    // 002571
    // 003020

  }

}
