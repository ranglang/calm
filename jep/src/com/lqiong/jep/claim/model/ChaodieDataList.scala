package com.lqiong.jep.claim.model

import akka.actor.typed.scaladsl.adapter.ClassicActorSystemOps
import akka.actor.{typed, ActorSystem}
import akka.cluster.sharding.typed.scaladsl.{ClusterSharding, EntityRef}
import akka.event.LoggingAdapter
import akka.util.Timeout
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.{Inject, Injector}
import com.lqiong.claim.actor.ShardedJepQueryActor.JepShardedTypeKey
import com.lqiong.claim.actor.{RunJepRet, ShardedJepQueryActor}
import com.lqiong.jep.entry.{QueryTable, QuillEncoder, StockChaoDie}
import com.lqiong.jep.option.DataFrameDao
import com.lqiong.model.{LSymbol, StockSymbol}
import org.apache.spark.sql.SparkSession
import org.joda.time.DateTime

import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.control.NonFatal

object ChaodieDataList {
  def getTableName(name: LSymbol) = {
    val name1 = s"cdstock${name.code}"
    name1
  }
}

class ChaodieDataList @Inject() (
  val injector: Injector,
  val actorSystem: ActorSystem,
  implicit val dataFrameDao: DataFrameDao,
  logger: LoggingAdapter,
  implicit val queryTable: QueryTable,
  implicit val spark: SparkSession,
  implicit val executionContext: ExecutionContext,
  val sharding: ClusterSharding,
  implicit val system: ActorSystem,
  implicit val retryProxy: RetryPolicy
) extends AbsctractFactor[StockChaoDie]
    with QuillEncoder {

  override val name: String = "cd"

  implicit val actorSystemTyped: typed.ActorSystem[Nothing] = actorSystem.toTyped

  private def getShardedActor(symbol: LSymbol) = {
    val jepSharedActor: EntityRef[ShardedJepQueryActor.SharedJepQueryCommand] = {
      sharding.entityRefFor(JepShardedTypeKey, symbol.code)
    }
    jepSharedActor
  }

  override def fetchData(symbol: LSymbol): Unit = {
    Await.result(fetchDataAsync(symbol), 5.minutes)
  }
  implicit val timeout1: Timeout = 2.hours

  override def fetchDataAsync(symbol: LSymbol): Future[Unit] = {
    val f1: EntityRef[ShardedJepQueryActor.SharedJepQueryCommand] = getShardedActor(symbol)
    val f: Future[RunJepRet.RunJepRetMsg] = {
      f1.ask(ref => ShardedJepQueryActor.UpdateChaodieInfo(symbol, ref))
    }

    f.map(r => ())
  }

  override def getByDate(symbol: LSymbol, date1: DateTime): Future[Option[StockChaoDie]] = {
    symbol match {
      case index: StockSymbol =>
        import queryTable.db._
        val s = ChaodieDataList.getTableName(index)
        val r1 = {
          dynamicQuerySchema[StockChaoDie](s).filter(r => r.date == lift(date1.toDate()))
        }
        val result = queryTable.db.run(r1)
        result
          .map(r => {
            r.headOption
          })
          .recover { case NonFatal(x) =>
            logger.error("chaodie list {}", x)
            Option.empty[StockChaoDie]
          }
      case _ =>
        Future.successful(Option.empty[StockChaoDie])
    }
  }

  override def getList(symbol: LSymbol): Future[List[StockChaoDie]] = {
    logger.info("getDayChaodieList {}", symbol)
    symbol match {
      case index: StockSymbol =>
        import queryTable.db._
        val s = ChaodieDataList.getTableName(index)
        val r1 = {
          dynamicQuerySchema[StockChaoDie](s)
        }
        val result = queryTable.db.run(r1)
        result
          .map(r => {
            r
          })
          .recover { case NonFatal(x) =>
            logger.error("chaodie list {}", x)
            List.empty[StockChaoDie]
          }
      case _ => Future.successful(List.empty[StockChaoDie])
    }
  }
}
