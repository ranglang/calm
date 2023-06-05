package com.lqiong.jep.modules

import akka.actor.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.typed.ClusterSingleton
import akka.event.LoggingAdapter
import akka.stream.Materializer
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.{AbstractModule, Injector, Provides, Singleton}
import com.lqiong.email.EmailServiceTrait
import com.lqiong.jep.claim.model._
import com.lqiong.jep.entry._
import com.lqiong.jep.option.cassandra.GetSparkTable
import com.lqiong.jep.option.{ClaimDataSource, DataFrameDao, QuantEngine}
import com.lqiong.jep.selector.A.TimeSeriesSelect
import com.lqiong.model.{QueryTableInter, StockTrait}
//import com.lqiong.option.OptionContract
import com.typesafe.config.Config
import net.codingwell.scalaguice.ScalaModule
import org.apache.spark.sql.SparkSession
import tech.shangche.boat.service.BoatService

import scala.concurrent.ExecutionContext

class QuantEngineModule extends AbstractModule with ScalaModule {

//  @Singleton
//  @Provides
//  def quantTradeUrl(
//    quantConfig: QuantConfig
//  ): TradeUrl = {
//    new ATradeUrl(quantConfig.fetchBackendUrl())
//  }

  @Singleton
  @Provides
  def quantEngine(
    system: ActorSystem,
    mat: Materializer,
    spark: SparkSession,
    handleChecker: HandleChecker,
    dataSource: ClaimDataSource,
    dataFrameDao: DataFrameDao,
    getSparkTable: GetSparkTable,
    quantConfig: QuantConfig,
//    bankService: BankService,
    queryTable: QueryTable,
    enterReason: EnterReason,
    config: Config,
    tradeStrategy: TradeStrategy,
    emailService: EmailServiceTrait,
    stockImpl: StockTrait,
    policy: RetryPolicy,
    queryTableInter: QueryTableInter,
    ex: ExecutionContext,
    pig: PigDataList,
    egg: EggDataList,
    logger: LoggingAdapter,
    timeSeries: TimeSeriesSelect,
//    optionContract: OptionContract,
    polyty: PolytyPrinter,
//    skunkService: SkunkService,
    panMingFactor: PanmingFactor,
    dynamicAStockPrice: DynamicAStockPrice,
    continuesDataList: ContinuesDataList,
    volumeIndicator: VolumeIndicator,
    sharding: ClusterSharding,
    indexContinuesDataList: IndexContinuesDataList,
    singletonManager: ClusterSingleton,
    cdDataList: ChaodieDataList,
    injector: Injector
//    contractLogin: ContractLogin
//  lazy val checkLoginRef: SafeActorRef[LoginKunTypedActor.KunLoginMsg] = injector.getInstance(
//    Key.get(scalaguice.typeLiteral[SafeActorRef[LoginKunTypedActor.KunLoginMsg]])
//  )
  ): QuantEngine = {

    val boatService = new BoatService()(ex)
    new QuantEngine(
      injector,
      system,
      mat,
      spark,
      handleChecker,
      dataSource,
      dataFrameDao,
      getSparkTable,
      quantConfig,
//      bankService,
      queryTable,
      enterReason,
      config,
      tradeStrategy,
      emailService,
      stockImpl,
      policy,
      queryTableInter,
      ex,
      pig,
      egg,
      logger,
      timeSeries,
//      optionContract,
      polyty,
//      skunkService,
      panMingFactor,
      dynamicAStockPrice,
      continuesDataList,
      volumeIndicator,
      sharding,
      indexContinuesDataList,
      cdDataList,
      singletonManager,
//      contractLogin,
      boatService
//    val contractLogin: ContractLogin,
    )
  }

}
