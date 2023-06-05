package com.lqiong.jep
import akka.http.scaladsl.server.Directives._
import com.lqiong.jep.entry._
//
//class QuantEngineController @Inject() (
//  val queryTable: QueryTable,
//  implicit val ex: ExecutionContext,
//  val quantConfig: QuantConfig,
//  val logger: LoggingAdapter,
//  val quantEngine: QuantEngine,
//  getSparkTable: GetSparkTable,
//  val dataSource: ClaimDataSource,
//  implicit val timeout: Timeout,
//  implicit val system: ActorSystem,
//  implicit val actorMaterializer: Materializer,
//  implicit val lqScheduler: LqScheduler,
//  val sharding: ClusterSharding,
//  val singletonManager: ClusterSingleton,
//  val a: SearchTapirController,
//  val b: BoatTapirController
//) extends FailFastCirceSupport
//    with BaseCirceSupport
//    with AutoDerivation
//    with GenericDerivation {
//
//  import akka.actor.typed.scaladsl.adapter._
//  import akka.cluster.sharding.typed.scaladsl.EntityTypeKey
//
//  val TypeKey: EntityTypeKey[ShardedActorCounter.ShardedHotPriceCommand] =
//    EntityTypeKey[ShardedActorCounter.ShardedHotPriceCommand]("Counter")
//
//  import akka.cluster.typed.SingletonActor
//
//  val spotManager: ActorRef[SpotActor.SpotMsg] = system.toTyped.systemActorOf(
//    SpotActor(sharding, TypeKey, logger),
//    "spot-manage"
//  )
//
//  val shardRegion: ActorRef[ShardingEnvelope[ShardedActorCounter.ShardedHotPriceCommand]] =
//    sharding.init(
//      Entity(TypeKey)(createBehavior =
//        entityContext => ShardedActorCounter(entityContext.entityId, logger, getSparkTable)
//      )
//    )
//
//  val singletonScheduler: ActorRef[SingletonRunScheduler.SingletonCommand] =
//    singletonManager.init(
//      SingletonActor(
//        Behaviors
//          .supervise(SingletonRunScheduler(logger, lqScheduler, spotManager))
//          .onFailure[Exception](
//            SupervisorStrategy.restartWithBackoff(1.second, 10.seconds, 0.2)
//          ),
//        "GlobalCounter"
//      )
//    )
//
//  val schedulerStarter = system.toTyped.systemActorOf(
//    SchedulerBuncherWithTimer(logger, singletonScheduler),
//    "BuncherEntry"
//  )
//
//  println("akka start")
//  AkkaManagement(system).start()
//  println("cluster start")
//  ClusterBootstrap(system).start()
//
//  def runServer() = {
//    val route = {
//      pathPrefix("quant") {
//        path("buyPreview") {
//          get {
//            val f2 = quantEngine.getOrderPreview().recover {
//              case NonFatal(x) => {
//                logger.error("buyPreview {}", x)
//                List.empty[BuyPreviewStock]
//              }
//            }
//
//            val f3: Future[ToResponseMarshallable] = f2.map(r => r)
//            complete(f3)
//          }
//        } ~
//          path("trigger") {
//            get {
//              val f =
//                Future(quantEngine.updateContractState())
//                  .map(r => "synced")
//                  .recover { case NonFatal(x) =>
//                    x.printStackTrace();
//                    logger.error("xxx {} ", x)
//                    s"erro ${x.toString}r"
//                  }
//              complete(f)
//            }
//          } ~
//          path("important") {
//            get {
//              val f: Future[ToResponseMarshallable] =
//                Future(quantEngine.fetchImportantSellNotes())
//                  .map(r => r)
//              complete(f)
//            }
//          } ~
//          path("ls") {
//            get {
//              val f: Future[ToResponseMarshallable] =
//                Future(quantEngine.fetchContractState())
//                  .map(r => r)
////                  .recover {
////                    case NonFatal(x) => {
////                      logger.error("xxx ", x)
////                      s"erro ${x.toString}r"
////                    }
////                  }
//              complete(f)
//            }
//          } ~
//          path("sell_option") {
//            complete("")
//          } ~
//          path("command") {
//            get {
//              parameter("c") { command =>
//                complete {
//                  Future(
//                    quantEngine.handleCommand1(
//                      SchedulerCommand.withName(command),
//                      spotManager
//                    )
//                  ).map(_ => "ok").recover {
//                    case NonFatal(x) => {
//                      x.printStackTrace()
//                      logger.error("xxxxx {}", x)
//                      s"failed ${x.toString}"
//                    }
//                  }
//                }
//              }
//            }
//          } ~
//          path("update") {
//            get {
//              complete {
//                val a = quantEngine.fetchAStockSpot()
//                spotManager ! SpotActor.SaveLastStockPrice(a)
//                "OKKKK"
//              }
//            }
//          } ~
//          pathPrefix("index") {
//            path("history") {
//              get {
//                parameter("code") { code =>
//                  encodeResponseWith(Coders.Gzip) {
//                    complete {
//                      val a: Future[ToResponseMarshallable] = {
//                        quantEngine
//                          .fetchIndexHistory(IndexSymbol(code))
//                          .map(r => RetIndexPrice(records = r.records))
//                          .map(r => r)
//                      }
//                      a
//                    }
//                  }
//                }
//              }
//            } ~
//              path("panming") {
//                parameter("code".?) { code =>
//                  get {
//                    complete {
//                      code match {
//                        case Some(x) =>
//                          val a: Future[ToResponseMarshallable] = {
//                            quantEngine
//                              .fetchPanmingDataList(IndexSymbol(x))
//                              .map(r => r)
//                          }
//                          a
//                        case _ =>
//                          val a: Future[ToResponseMarshallable] = {
//                            val f = Future.successful(
//                              List.empty[PanMingChaoDieItem2]
//                            )
//                            f.map(r => r)
//                          }
//                          a
//                      }
//                    }
//                  }
//                }
//              } ~
//              path("events") {
//                parameter("code".?) { code =>
//                  get {
//                    complete {
//                      code match {
//                        case Some(x) =>
//                          val a: Future[ToResponseMarshallable] = {
//                            quantConfig
//                              .getEventsBySymbol(IndexSymbol(x))
//                              .map(l => {
//                                val l1 = l
//                                  .filter(r => r.symbol.getName == IndexSymbol(x).getName)
//                                  .sortWith((a, b) => a.dateTime.get.isAfter(b.dateTime.get))
//                                RetStockNotes(
//                                  l1
//                                )
//                              })
//                              .recover { case _ =>
//                                RetStockNotes(List.empty[StockNote])
//                              }
//                              .map(r => r)
//                          }
//                          a
//                        case _ =>
//                          val a: Future[ToResponseMarshallable] = {
//                            val f = Future.successful(
//                              RetStockNotes(List.empty[StockNote])
//                            )
//                            f.map(r => r)
//                          }
//                          a
//                      }
//                    }
//                  }
//                }
//              }
//          } ~
//          path("events") {
//            parameter("code".?) { code =>
//              get {
//                complete {
//                  code match {
//                    case Some(x) =>
//                      val a: Future[ToResponseMarshallable] = {
//                        quantConfig
//                          .getEventsBySymbol(StockSymbol(x))
//                          .map(l => {
//                            val l1 = l
//                              .filter(r => r.symbol.getName == StockSymbol(x).getName)
//                              .sortWith((a, b) => a.dateTime.get.isAfter(b.dateTime.get))
//                            RetStockNotes(
//                              l1
//                            )
//                          })
//                          .recover { case _ =>
//                            RetStockNotes(List.empty[StockNote])
//                          }
//                          .map(r => r)
//                      }
//                      a
//                    case _ =>
//                      val a: Future[ToResponseMarshallable] = {
//                        val f = Future.successful(
//                          RetStockNotes(List.empty[StockNote])
//                        )
//                        f.map(r => r)
//                      }
//                      a
//                  }
//                }
//              }
//            }
//          } ~ path("quant_quantConfig") {
//            get {
//              complete {
//                val a: Future[ToResponseMarshallable] =
//                  quantEngine.getQuantList().map(r => r)
//                a
//              }
//            }
//          } ~ path("index_history") {
//            get {
//              parameter("code") { code =>
//                encodeResponseWith(Coders.Gzip) {
//                  complete {
//                    val a: Future[ToResponseMarshallable] =
//                      queryTable.getIndex(IndexSymbol(code)).map(r => r)
//                    a
//                  }
//                }
//              }
//            }
//          } ~ path("contracts") {
//            get {
//              encodeResponseWith(Coders.Gzip) {
//                complete {
//                  val a: Future[ToResponseMarshallable] =
//                    quantEngine.getContractInfo().map(r => r)
//                  a
//                }
//              }
//            }
//          } ~ path("history") {
//            get {
//              parameter("code") { code =>
//                encodeResponseWith(Coders.Gzip) {
//                  complete {
//                    val a: Future[ToResponseMarshallable] =
//                      queryTable.getStock(StockSymbol(code.replaceAll("s_", ""))).map(r => r)
//                    a
//                  }
//                }
//              }
//            }
//          } ~ path("chaodie_index") {
//            get {
//              parameter("code") { code =>
//                encodeResponseWith(Coders.Gzip) {
//                  complete {
//                    val a: Future[ToResponseMarshallable] =
//                      queryTable
//                        .getSymbolChaodieCache(StockSymbol(code))
//                        .recover { case _ =>
//                          RetStockChaoDie(records = List.empty[StockChaoDieJoda])
//                        }
//                        .map(r => r)
//                    a
//                  }
//                }
//              }
//            }
//          } ~ path("chaodie") {
//            get {
//              parameter("code") { code =>
//                encodeResponseWith(Coders.Gzip) {
//                  complete {
//                    val a: Future[ToResponseMarshallable] =
//                      queryTable
//                        .getSymbolChaodieCache(StockSymbol(code))
//                        .recover { case _ =>
//                          logger.error("fetch chaodie error {}", code)
//                          RetStockChaoDie(records = List.empty[StockChaoDieJoda])
//                        }
//                        .map(r => r)
//                    a
//                  }
//                }
//              }
//            }
//          }
//      }
//    }
//
//    import ch.megard.akka.http.cors.scaladsl.CorsDirectives._
//
//    val newRoute = cors() {
//      route ~ pathPrefix("quant") {
//        pathPrefix("v2") {
//          OpenAPIYaml.getList(List(a, b))
//        }
//      }
//    }
//
//    val bindingFuture = Http()
//      .newServerAt("0.0.0.0", 8080)
//      .bindFlow(
//        newRoute
//      )
////    StdIn.readLine() // let it run until user presses return
////    bindingFuture
////      .flatMap(_.unbind()) // trigger unbinding from the port
////      .onComplete(_ => system.terminate()) // and shutdown when done
//  }
//}
