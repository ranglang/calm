package com.lqiong.claim.lighting

import akka.actor.typed.receptionist.{Receptionist, ServiceKey}
import akka.actor.typed.scaladsl.{ActorContext, Behaviors}
import akka.actor.typed.{ActorRef, Behavior}
import com.lqiong.claim.lighting.LookupLightningActor.{ListingRespons, ListingResponsA}
import com.lqiong.model.{LSymbol, StockSymbol}

object LookupLightningActor {

  trait LookupLightningMessage

//  case class GetNameFor(
//      l: StockSymbol,
//      replyTo: ActorRef[LightningStcokActor.GetSymbolName]
//  ) extends LookupLightningMessage

  case class SubscribeStock(l: LSymbol) extends LookupLightningMessage

//  case class L1(list: Receptionist.Listing) extends LookupLightningMessage

  case class LookupProcyCmd(
    l: StockSymbol,
    cmd: LightningStcokActor.LightningStcokMessage
  ) extends LookupLightningMessage

  case class ListingResponsA(
    a: Receptionist.Listing
  ) extends LookupLightningMessage

  case class ListingRespons(
    listing: Receptionist.Listing
  ) extends LookupLightningMessage

//  case class ListingResponSubs(
//                             l: StockSymbol,
//                             listing: Receptionist.Listing,
//                             cmd: LightningStcokActor.LightningStcokMessage
//                           ) extends LookupLightningMessage

//  val set

  def apply(): Behavior[LookupLightningActor.LookupLightningMessage] = {
    new LookupLightningActor().become(
      Map.empty[String, List[LightningStcokActor.LightningStcokMessage]]
    )
  }
//    Behaviors.setup {
//      context: ActorContext[LookupLightningActor.LookupLightningMessage] =>
//
//        val listingAdapter2: ActorRef[Receptionist.Listing] = {
//          context.messageAdapter { listing =>
//            println(s"listingAdapter:listing: ${listing.toString}")
//            LookupLightningActor.ListingRespons(listing)
//          }
//        }
//
////        val subcribeStock: ActorRef[Receptionist.Listing] =
////          context.messageAdapter { listing =>
////            LookupLightningActor.ListingRespons(listing)
////          }
//        Behaviors.receiveMessage {
//          case LookupLightningActor.SubscribeStock(l) =>
//            context.log.info("LookupLightningActor.SubscribeStock(l) {}", l)
//
//            context.system.receptionist !
//              Receptionist.Subscribe(
//                LightningStcokActor.getServiceKey(l),
//                listingAdapter2
//              )
//
//            Behaviors.same
//          case LookupLightningActor.LookupProcyCmd(lSymbol, cmd) =>
//            context.log.info("lookup plocy {}", lSymbol);
//            context.system.receptionist !
//              Receptionist.Find(
//                LightningStcokActor.getServiceKey(lSymbol),
//                listingAdapter2
//              )
//            Behaviors.same
//          case listingRespons: ListingRespons =>
////            context.log.info(s"ListingRespons cmd {}", listingRespons.l)
//            context.log.info(s"ListingRespons cmd {}", listingRespons.listing)
//            val a: ServiceKey[_] = listingRespons.listing.key
//            context.log.info("aaaaaaaaa {}", a);
//            context.log.info("ServiceKey id {}", a.id);
//
//
////            listingAdapter:listing: Listing(ServiceKey[com.lqiong.claim.lighting.LightningStcokActor$LightningStcokMessage](symbol_stock000002)
//            //  Set(Actor[akka://Supervisor/user/$b/stock000002#503923728]),Set(Actor[akka://Supervisor/user/$b/stock000002#503923728]),true)
//
//              // cmd  cmd
//             // map action
//
////            try {
////              val set1 = listingRespons.listing
////                .serviceInstances(LightningStcokActor.getServiceKey(listingRespons.l))
////                          set1.foreach(ref => {
////                            context.log.info("foreach cmd {}", listingRespons.cmd)
////                            ref ! listingRespons.cmd
////                          })
////            } catch {
////              case NonFatal(x) =>
////                x.printStackTrace()
////            }
//
////            context.log.info("set1 {}", set1.size)
////
//            Behaviors.same
//          case x @ _ => {
//            context.log.info("ignore  below ")
//            context.log.info("ignore  {}", x)
//
//            Behaviors.same
//          }
//        }
//    }
}

class LookupLightningActor {

  def become(
    map: Map[String, List[LightningStcokActor.LightningStcokMessage]]
  ): Behavior[LookupLightningActor.LookupLightningMessage] =
    Behaviors.setup { context: ActorContext[LookupLightningActor.LookupLightningMessage] =>
      val listingAdapter1: ActorRef[Receptionist.Listing] = {
        context.messageAdapter { listing =>
          LookupLightningActor.ListingResponsA(listing)
        }
      }
      val listingAdapter2: ActorRef[Receptionist.Listing] = {
        context.messageAdapter { listing =>
          LookupLightningActor.ListingRespons(listing)
        }
      }

      //        val subcribeStock: ActorRef[Receptionist.Listing] =
      //          context.messageAdapter { listing =>
      //            LookupLightningActor.ListingRespons(listing)
      //          }
      Behaviors.receiveMessage {
        case LookupLightningActor.SubscribeStock(l) =>
          context.log.info("LookupLightningActor.SubscribeStock(l) {}", l)

          context.system.receptionist !
            Receptionist.Subscribe(
              LightningStcokActor.getServiceKey(l),
              listingAdapter1
            )

          Behaviors.same
        case LookupLightningActor.LookupProcyCmd(lSymbol, cmd) =>
          context.log.info("lookup plocy {} cmd {}", lSymbol, cmd)
          val key = LightningStcokActor.getServiceKey(lSymbol)
          val newMap = map.updatedWith(key.id) {
            case Some(money) => Some(money ::: List(cmd))
            case None        => Some(List(cmd))
          }

          context.system.receptionist !
            Receptionist.Find(
              key,
              listingAdapter2
            )
          become(newMap)
        case listingRespons: ListingResponsA =>
          context.log.info("ListingResponsA")
          Behaviors.same
        case listingRespons: ListingRespons =>
          //            context.log.info(s"ListingRespons cmd {}", listingRespons.l)
          context.log.info(s"ListingRespons cmd {}", listingRespons.listing)
          val a: ServiceKey[_] = listingRespons.listing.key
          context.log.info("aaaaaaaaa {}", a)
          context.log.info("ServiceKey id {}", a.id)

          val a1 = map.get(a.id).flatMap(r => r.headOption)

          if (a1.isEmpty) {

            context.log.info("ListingRespons cmd get head empty {}", a.id)
            Behaviors.same
          } else {
            val hd :: tail = map(a.id)
            context.log.info("ListingRespons cmd get head {} {}", a.id, hd)
            val newMap = map.updatedWith(a.id) {
              case Some(_) => Some(tail)
              case None    => None
            }

            val set1 = listingRespons.listing
              .serviceInstances(
                LightningStcokActor.getServiceKeyFromString(a.id)
              )
            set1.foreach(ref => {
              ref ! hd
            })

            become(newMap)
          }

        //            listingAdapter:listing: Listing(ServiceKey[com.lqiong.claim.lighting.LightningStcokActor$LightningStcokMessage](symbol_stock000002)
        //  Set(Actor[akka://Supervisor/user/$b/stock000002#503923728]),Set(Actor[akka://Supervisor/user/$b/stock000002#503923728]),true)

        // cmd  cmd
        // map action

        //            try {
        //              val set1 = listingRespons.listing
        //                .serviceInstances(LightningStcokActor.getServiceKey(listingRespons.l))
        //                          set1.foreach(ref => {
        //                            context.log.info("foreach cmd {}", listingRespons.cmd)
        //                            ref ! listingRespons.cmd
        //                          })
        //            } catch {
        //              case NonFatal(x) =>
        //                x.printStackTrace()
        //                context.log.error("xxxxxxxxx {}", x)
        //            }

        //            context.log.info("set1 {}", set1.size)
        //
//            Behaviors.same
        case x @ _ =>
          context.log.info("ignore  below ")
          context.log.info("ignore  {}", x)

          Behaviors.same
      }
    }

}
