package com.lqiong.jep.receptionist
import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
import akka.actor.typed.scaladsl.{AbstractBehavior, ActorContext, Behaviors}
import akka.actor.typed.receptionist.{Receptionist, ServiceKey}
import com.lqiong.jep.receptionist.Mouth.MessageToMouth
import levsha.dsl.html.b

object Brain {

  sealed trait MessageToBrain
  final case object FindTheMouth extends MessageToBrain
  final case class OKDonw() extends MessageToBrain
  final case class FindTheMouthItem(name: String, action: String) extends MessageToBrain
  private case class ListingResponse(listing: Receptionist.Listing) extends MessageToBrain

  private case class ListingResponseWithAction(
    listing: Receptionist.Listing,
    name: String
  ) extends MessageToBrain

  val FinalMouthKeyA: ServiceKey[MessageToMouth] = ServiceKey("Mouth")
  val MouthKeyA: ServiceKey[MessageToMouth] = ServiceKey(s"Moutha")
  val MouthKeyB: ServiceKey[MessageToMouth] = ServiceKey(s"Mouthb")

  // this line of code is long, so i wrapped it onto two lines
  def apply(): Behavior[MessageToBrain] = Behaviors.setup { context: ActorContext[MessageToBrain] =>
    // (1) we can’t initially get a reference to the Mouth actor, so
    // declare this variable as a var field, and using Option/None
    var mouth: Option[ActorRef[Mouth.MessageToMouth]] = None

    // (2) create an ActorRef that can be thought of as a Receptionist
    // Listing “adapter.” this will be used in the next line of code.
    // the Brain.ListingResponse(listing) part of the code tells the
    // Receptionist how to get back in touch with us after we contact
    // it in Step 4 below.
    // also, this line of code is long, so i wrapped it onto two lines.
    val listingAdapter: ActorRef[Receptionist.Listing] =
      context.messageAdapter { listing =>
        println(s"listingAdapter:listing: ${listing.toString}")
        Brain.ListingResponse(listing)
      }

//      val MouthKeyA: ServiceKey[MessageToMouth] = ServiceKey(s"Moutha")
//      val MouthKeyB: ServiceKey[MessageToMouth] = ServiceKey(s"Mouthb")

    // (3) send a message to the Receptionist saying that we want
    // to subscribe to events related to MouthKeyA, which
    // represents the Mouth actor.
    context.system.receptionist !
      Receptionist.Subscribe(MouthKeyB, listingAdapter)

    context.system.receptionist !
      Receptionist.Subscribe(MouthKeyA, listingAdapter)

    Behaviors.receiveMessage { message =>
      message match {
        case data: OKDonw => {
          println(s"data Ok Down ${data}");
//            Behaviors.stopped
          Behaviors.same
        }
        case FindTheMouthItem(name, action) =>
          val mKey: ServiceKey[MessageToMouth] = ServiceKey(s"Mouth${name}")
          val listingAdapter1: ActorRef[Receptionist.Listing] =
            context.messageAdapter { listing =>
              println(s"listingAdapter:listing: ${listing.toString}")
              Brain.ListingResponseWithAction(listing, action)
            }
          context.system.receptionist !
            Receptionist.Find(mKey, listingAdapter1)
          Behaviors.same
        case FindTheMouth =>
          // (4) send a Find message to the Receptionist, saying
          // that we want to find any/all listings related to
          // MouthKeyA, i.e., the Mouth actor.
          println(s"Brain: got a FindTheMouth message")
          context.system.receptionist !
            Receptionist.Find(MouthKeyA, listingAdapter)
          context.system.receptionist !
            Receptionist.Find(MouthKeyB, listingAdapter)
          Behaviors.same
//            //            val a: Receptionist.Listing = listings
//            // (5) after Step 4, the Receptionist sends us this
//            // ListingResponse message. the `listings` variable is
//            // a Set of ActorRef of type Mouth.MessageToMouth, which
//            // you can interpret as “a set of Mouth ActorRefs.” for
//            // this example i know that there will be at most one
//            // Mouth actor, but in other cases there may be more
//            // than one actor in this set.
//            println(s"Brain: got a ListingResponse message")
//            println(s" list ${listings.size}")
//            println(s" list ${listings.size}")
//            // i add this line just to be clear about `listings` type
//            //            val xs: Set[ActorRef[Mouth.MessageToMouth]] = listings
//            // loop through all of the ActorRefs
//            for (x <- listings) {
//              // there should be only one ActorRef, so i assign it
//              // to the `mouth` variable i created earlier
//              mouth = Some(x)
//              // send a SpeakText message to the Mouth actor
//              mouth.foreach { m =>
//                m ! Mouth.SpeakText("Brain says hello to Mouth")
//              }
//            }
//            Behaviors.same
        case ListingResponseWithAction(a, action) => {
          val b = ServiceKey[MessageToMouth]("Moutha")
          val set =
            if (a.isForKey(b)) Some(a.serviceInstances[MessageToMouth](b))
            else Option.empty[Set[ActorRef[MessageToMouth]]]

          for (x <- set) {
            // there should be only one ActorRef, so i assign it
            // to the `mouth` variable i created earlier
            // send a SpeakText message to the Mouth actor
            x.foreach { m =>
              val d1 = m.asInstanceOf[ActorRef[MessageToMouth]]
              d1 ! Mouth.SpeakText(
                s"Brain says hello to Mouthx${action}",
                context.self
              )
            }
          }
          // //            MouthKeyB.Listing(listings)
          //            val b = a.asInstanceOf[MouthKeyB.Listing[]]
          //
          Behaviors.same
        }
        case ListingResponse(a) => {

          val b = ServiceKey[MessageToMouth]("Moutha")
          val set =
            if (a.isForKey(b)) Some(a.serviceInstances(b))
            else Option.empty[Set[ActorRef[MessageToMouth]]]

          for (x <- set) {
            // there should be only one ActorRef, so i assign it
            // to the `mouth` variable i created earlier
            // send a SpeakText message to the Mouth actor
            x.foreach { m =>
              val d1 = m.asInstanceOf[ActorRef[MessageToMouth]]
              d1 ! Mouth.SpeakText(
                "Brain says hello to Mouthxxx",
                context.self
              )
            }
          }
////            MouthKeyB.Listing(listings)
//            val b = a.asInstanceOf[MouthKeyB.Listing[]]
//
          Behaviors.same
        }
        case ListingResponse(MouthKeyB.Listing(listings)) =>
          //            val a: Receptionist.Listing = listings
          // (5) after Step 4, the Receptionist sends us this
          // ListingResponse message. the `listings` variable is
          // a Set of ActorRef of type Mouth.MessageToMouth, which
          // you can interpret as “a set of Mouth ActorRefs.” for
          // this example i know that there will be at most one
          // Mouth actor, but in other cases there may be more
          // than one actor in this set.
          println(s"Brain: got a ListingResponse message")
          println(s" list ${listings.size}")
          println(s" list ${listings.size}")
          // i add this line just to be clear about `listings` type
          //            val xs: Set[ActorRef[Mouth.MessageToMouth]] = listings
          // loop through all of the ActorRefs
          for (x <- listings) {
            // there should be only one ActorRef, so i assign it
            // to the `mouth` variable i created earlier
            mouth = Some(x)
            // send a SpeakText message to the Mouth actor
            mouth.foreach { m =>
              m ! Mouth.SpeakText("Brain says hello to Mouth", context.self)
            }
          }
          Behaviors.same
        case ListingResponse(MouthKeyA.Listing(listings)) =>
          //            val a: Receptionist.Listing = listings
          // (5) after Step 4, the Receptionist sends us this
          // ListingResponse message. the `listings` variable is
          // a Set of ActorRef of type Mouth.MessageToMouth, which
          // you can interpret as “a set of Mouth ActorRefs.” for
          // this example i know that there will be at most one
          // Mouth actor, but in other cases there may be more
          // than one actor in this set.
          println(s"Brain: got a ListingResponse message")
          // i add this line just to be clear about `listings` type
          //            val xs: Set[ActorRef[Mouth.MessageToMouth]] = listings
          // loop through all of the ActorRefs
          println(s" list ${listings.size}")
          println(s" list ${listings.size}")

          for (x <- listings) {
            // there should be only one ActorRef, so i assign it
            // to the `mouth` variable i created earlier
            mouth = Some(x)
            // send a SpeakText message to the Mouth actor
            mouth.foreach { m =>
              m ! Mouth.SpeakText("Brain says hello to Mouth", context.self)
            }
          }
          Behaviors.same
      }
    }
  }
}
