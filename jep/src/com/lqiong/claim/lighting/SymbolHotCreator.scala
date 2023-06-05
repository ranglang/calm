package com.lqiong.claim.lighting

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior}
import akka.event.LoggingAdapter
import com.lqiong.claim.actor
import com.lqiong.claim.actor.CodeNameActor
import com.lqiong.claim.lighting.SymbolHotCreator.FixInputMessage
import com.lqiong.jep.option.ClaimDataSource
import com.lqiong.model.LSymbol

import java.net.InetAddress

object SymbolHotCreator {

  trait FixInputMessage
  case class CreateA(symbol: LSymbol) extends FixInputMessage

  def apply(
    lookup: ActorRef[LookupLightningActor.LookupLightningMessage],
    dataSource: ClaimDataSource,
    logger: LoggingAdapter
  ): Behavior[FixInputMessage] = Behaviors.setup { ctx =>
    val a2: ActorRef[CodeNameActor.CodenameCommand] =
      ctx.spawnAnonymous(actor.CodeNameActor(dataSource, logger))
    new SymbolHotCreator(dataSource).become(lookup, a2)
  }
}

class SymbolHotCreator(
  dataSource: ClaimDataSource
) {
  def become(
    lookup: ActorRef[LookupLightningActor.LookupLightningMessage],
    a2: ActorRef[CodeNameActor.CodenameCommand]
  ): Behavior[FixInputMessage] = Behaviors.setup { ctx =>
    val ip = InetAddress.getLocalHost();
    val hostname = ip.getHostName();
    Behaviors.receiveMessage[FixInputMessage] {
      case msg: SymbolHotCreator.CreateA =>
        ctx.log.info(
          "SymbolHotCreator.CreateA crate msg {} {}",
          msg.symbol,
          hostname
        )
        ctx.spawn(
          LightningStcokActor(dataSource, msg.symbol, a2),
          s"Create_${msg.symbol.getName}"
        )
        lookup ! LookupLightningActor.SubscribeStock(msg.symbol)
        Behaviors.same
      case _ => Behaviors.same
    }
  }
}
