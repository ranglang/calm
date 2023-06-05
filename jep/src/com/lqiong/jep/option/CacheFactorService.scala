package com.lqiong.jep.option

import akka.actor.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.typed.ClusterSingleton
import com.google.inject.Inject
import com.lqiong.jep.claim.model._
import com.lqiong.jep.entry.{QueryTable, RetStockChaoDie}
import com.lqiong.model.{IndexSymbol, LSymbol}
//import com.lqiong.selenium.entry.ContractLogin
import net.spy.memcached.MemcachedClient
import tech.shangche.boat.service.BoatService

import scala.concurrent.duration.DurationInt
import scala.concurrent.{ExecutionContext, Future}

class CacheFactorService @Inject() (
  system: ActorSystem,
  val panMingFactor: PanmingFactor,
  val dynamicAStockPrice: DynamicAStockPrice,
  val continuesDataList: ContinuesDataList,
  val volumeIndicator: VolumeIndicator,
  val sharding: ClusterSharding,
  val indexContinuesDataList: IndexContinuesDataList,
  val chaodieDataList: ChaodieDataList,
  val singletonManager: ClusterSingleton,
//  val contractLogin: ContractLogin,
  implicit val ex: ExecutionContext,
  val queryTable: QueryTable,
  val memcachedClient: MemcachedClient
) {

  val boatService: BoatService = new BoatService()(ex)
  import net.spy.memcached._
  import scalacache._
  import scalacache.memcached._
  import scalacache.memoization.{memoize, memoizeF}
  import scalacache.modes.scalaFuture._
  import scalacache.serialization.circe._

  private def fetchPanmingDataList(
    indexSymbol: IndexSymbol
  ) = {

    panMingFactor.getList(indexSymbol)
  }

  def getSymbolChaodie(stockSymbol: LSymbol): Future[RetStockChaoDie] = {
    import io.circe.generic.auto._
    implicit val RetStockChaoDieImpl: Cache[RetStockChaoDie] = MemcachedCache(memcachedClient)
    memoizeF[Future, RetStockChaoDie](Some(1.hour)) {
      queryTable.getSymbolChaodie(stockSymbol)
    }
  }

  def fetchPanmingDataListCache(stockSymbol: IndexSymbol): Future[List[PanMingChaoDieItem2]] = {
    import io.circe.generic.auto._
    implicit val RetStockChaoDieImpl: Cache[List[PanMingChaoDieItem2]] = MemcachedCache(
      memcachedClient
    )
    memoizeF[Future, List[PanMingChaoDieItem2]](Some(1.hour)) {
      fetchPanmingDataList(stockSymbol)
    }
  }
}
