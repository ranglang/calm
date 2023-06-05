//package com.lqiong.claim.actor
//
//import akka.actor.typed.receptionist.{Receptionist, ServiceKey}
//import akka.actor.typed.scaladsl.{ActorContext, Behaviors}
//import akka.actor.typed.{ActorRef, Behavior}
//import com.lqiong.model.{LSymbol, StockSymbol}
//
//object LookupSymbolActor {
//  trait LookupSymbolCommand
//
//  case class SubscribeSymbol(l: LSymbol) extends LookupSymbolCommand
//
//  case class LookupSymbolProxyCommand(
//    l: StockSymbol,
//    cmd: PStockCommand
//  ) extends LookupSymbolCommand
//
//  case class ListingResponsSubscribe(
//    listing: Receptionist.Listing
//  ) extends LookupSymbolCommand
//
//  case class ListingResponsFoundCommand(
//    listing: Receptionist.Listing
//  ) extends LookupSymbolCommand
//
//  def apply() = {
//    new LookupSymbolActor().behavior(
//      Map.empty[String, List[PStockCommand]]
//    )
//
//  }
//}
//
//// **
//class LookupSymbolActor {
//
//  def behavior(
//    map: Map[String, List[PStockCommand]]
//  ): Behavior[LookupSymbolActor.LookupSymbolCommand] =
//    Behaviors.setup { context: ActorContext[LookupSymbolActor.LookupSymbolCommand] =>
//      val listingAdapterSubscribe: ActorRef[Receptionist.Listing] = {
//        context.messageAdapter { listing =>
//          LookupSymbolActor.ListingResponsSubscribe(listing)
//        }
//      }
//      val listingAdapterFoundCommand: ActorRef[Receptionist.Listing] = {
//        context.messageAdapter { listing =>
//          LookupSymbolActor.ListingResponsFoundCommand(listing)
//        }
//      }
//      Behaviors.receiveMessage {
//        case LookupSymbolActor.SubscribeSymbol(l) =>
//          context.log.info("LookupSymbolActor SubscribeStock(l) {}", l)
//
//          context.system.receptionist !
//            Receptionist.Subscribe(
//              StockSymbolPActor.getServiceKey(l),
//              listingAdapterSubscribe
//            )
//
//          Behaviors.same
//        case LookupSymbolActor.LookupSymbolProxyCommand(lSymbol, cmd) =>
//          context.log.info(
//            "LookupSymbolActor lookup LookupSymbolProxyCommand {} cmd {}",
//            lSymbol,
//            cmd
//          )
//          val key = StockSymbolPActor.getServiceKey(lSymbol)
//          val newMap = map.updatedWith(key.id) {
//            case Some(money) => Some(money ::: List(cmd))
//            case None        => Some(List(cmd))
//          }
//          context.system.receptionist !
//            Receptionist.Find(
//              key,
//              listingAdapterFoundCommand
//            )
//          behavior(newMap)
//        case listingResponsSubscribe: LookupSymbolActor.ListingResponsSubscribe =>
//          context.log.info(
//            "LookupSymbolActor listingResponsSubscribe(l) {}",
//            listingResponsSubscribe
//          )
//          Behaviors.same
//        case listingRespons: LookupSymbolActor.ListingResponsFoundCommand =>
////            context.log.info(
////              s"LookupLightningActor ListingRespons cmd {}",
////              map.keys
////            )
////            context.log.info(
////              s"LookupLightningActor ListingRespons cmd {}",
////              listingRespons.listing
////            )
//          val a: ServiceKey[_] = listingRespons.listing.key
//          context.log.info("aaaaaaaaa {}", a)
//          context.log.info("ServiceKey id {}", a.id)
//
//          val a1 = map.get(a.id).flatMap(r => r.headOption)
//
//          context.log.info(s"LookupLightningActor headOption cmd {}", a.id)
//
//          if (a1.isEmpty) {
//
//            context.log.info("ListingRespons cmd get head empty {}", a.id)
//            Behaviors.same
//          } else {
//            val hd :: tail = map(a.id)
//            context.log.info(
//              "ListingRespons cmd get head command {} {}",
//              a.id,
//              hd
//            )
//            val newMap = map.updatedWith(a.id) {
//              case Some(_) => Some(tail)
//              case None    => None
//            }
//
//            val targetInstance = listingRespons.listing
//              .serviceInstances(
//                StockSymbolPActor.getServiceKeyFromString(a.id)
//              )
//            if (targetInstance.isEmpty) {
//              context.log.info(
//                s"LookupLightningActor target Instance is Empty for {} {} {} {}",
//                a.id,
//                NetUtils.getHostName,
//                targetInstance,
//                hd
//              )
//            } else {
//              targetInstance.foreach(ref => {
//                ref ! hd
//              })
//              context.log.info(
//                s"LookupLightningActor newMap hd {} {} {}",
//                a.id,
//                NetUtils.getHostName,
//                hd
//              )
//            }
//            behavior(newMap)
//          }
//
//        case x @ _ =>
//          context.log.info("LookupLightningActor ignore  {}", x)
//
//          Behaviors.same
//      }
//    }
//
//}
