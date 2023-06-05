package com.lqiong.claim.actor

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior}
import com.lqiong.claim.actor.StockHistoryCacheActor.{RetCacheHistory, StockHistoryActorCommand}
import com.lqiong.jep.entry.{IndexDailyPriceJodata, QueryTable}
import com.lqiong.model.IndexSymbol
import com.typesafe.config.Config
import org.slf4j.LoggerFactory
import scalacache.Cache
import scalacache.memcached.MemcachedCache

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success

object StockHistoryCacheActor {

  sealed trait StockHistoryActorCommand

  case object Ok extends StockHistoryActorCommand
  case class FetchStockHistoryCommand(
    indexSymbol: IndexSymbol,
    replyTo: ActorRef[RetCacheHistory]
  ) extends StockHistoryActorCommand

  case class FetchListFromCache(
    indexSymbol: IndexSymbol,
    list: List[IndexDailyPriceJodata],
    replyTo: ActorRef[RetCacheHistory]
  ) extends StockHistoryActorCommand

  case class UpdateCacheActor(indexSymbol: IndexSymbol) extends StockHistoryActorCommand

  sealed trait CacheHistoryCommand
  case class RetCacheHistory(records: List[IndexDailyPriceJodata], ret: Int = 0)
      extends CacheHistoryCommand

  def apply(
    queryTable: QueryTable,
    config: Config
//      indexSymbol: IndexSymbol
  ): Behavior[StockHistoryActorCommand] = {
    (new StockHistoryCacheActor(
      queryTable,
      config
    )).behavior(false)
  }

}

class StockHistoryCacheActor(
  val queryTable: QueryTable,
  val config: Config
) {

  val memcached = config.getString("cache.memcached")

  val logger = LoggerFactory.getLogger(getClass.getName);

  import scalacache.serialization.circe._

  implicit val catsCache: Cache[List[IndexDailyPriceJodata]] =
    MemcachedCache[List[IndexDailyPriceJodata]](memcached)

  import scalacache.modes.scalaFuture._
  import scalacache.serialization.circe._

  def behavior(
    idRunning: Boolean
  ): Behavior[StockHistoryActorCommand] = {
    Behaviors.setup[StockHistoryActorCommand] { context =>
      Behaviors.receiveMessage[StockHistoryActorCommand] {
        case StockHistoryCacheActor.FetchListFromCache(
              indexSymbol,
              data,
              replyTo
            ) =>
          context.log.info(
            "FetchListFromCache FetchListFromCache reply To  {} {}",
            replyTo,
            data.size
          )
          replyTo ! RetCacheHistory(records = data)
          Behaviors.same
        case StockHistoryCacheActor.FetchStockHistoryCommand(
              indexSymbol,
              replyTo
            ) =>
          context.log.info("FetchStockHistoryCommand")
          context.pipeToSelf(
            catsCache.get(indexSymbol.getName)
          ) {
            case Success(data) if data.isDefined =>
              context.log.info("FetchStockHistoryCommand Success")
              logger.info("FetchStockHistoryCommand Success")
              StockHistoryCacheActor.FetchListFromCache(
                indexSymbol,
                data.get,
                replyTo
              )
            case _ =>
              logger.info("FetchStockHistoryCommand Fail")
              context.log.info("FetchStockHistoryCommand Fail")
              if (!idRunning) {
                context.self ! StockHistoryCacheActor.UpdateCacheActor(
                  indexSymbol
                )
              }
              StockHistoryCacheActor.FetchListFromCache(
                indexSymbol,
                List.empty[IndexDailyPriceJodata],
                replyTo
              )
          }
          Behaviors.same
        case StockHistoryCacheActor.Ok =>
          behavior(false)
        case StockHistoryCacheActor.UpdateCacheActor(indexSymbol) =>
          val f = queryTable
            .getIndexHistory(indexSymbol)
            .flatMap(r => {
              catsCache.put(indexSymbol.getName)(r)
            })
          // TODO to do
          context.pipeToSelf(f) {
            case Success(x) =>
              context.log.info("FetchStockHistoryCommand ok {}", x)
              StockHistoryCacheActor.Ok
            case x =>
              context.log.error(s"xxxxxx {}", x)
              StockHistoryCacheActor.Ok
          }
          behavior(true)
        case _ =>
          Behaviors.same
      }

    }
  }
}
