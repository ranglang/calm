package com.lqiong.claim.lighting

import akka.actor.typed.receptionist.{Receptionist, ServiceKey}
import akka.actor.typed.scaladsl.{ActorContext, Behaviors}
import akka.actor.typed.{ActorRef, Behavior}
import com.lqiong.claim.actor.CodeNameActor
import com.lqiong.claim.actor.CodeNameActor.{CodeNameResponse, GetCodeName}
import com.lqiong.jep.option.ClaimDataSource
import com.lqiong.model.LSymbol

object LightningStcokActor {

  sealed trait LightningStcokMessage

  case class GetSymbolName(resp: ActorRef[LightningStockName]) extends LightningStcokMessage

//  case class FetchCodename(symbol: LSymbol) extends LightningStcokMessage

  sealed trait FetchCodeResult extends LightningStcokMessage
  case class CodeNameWrapper(name: String) extends FetchCodeResult
  case class Fail(name: String) extends FetchCodeResult

  case class GetA(c: CodeNameResponse) extends FetchCodeResult

  sealed trait LightningStcokRet

  case class LightningStockName(name: String) extends LightningStcokRet

  def getServiceKey(symbol: LSymbol) = {
    ServiceKey[LightningStcokMessage](s"symbol_${symbol.getName}")
  }
  def getServiceKeyFromString(id: String) = {
    ServiceKey[LightningStcokMessage](id)
  }

  def apply(
    dataSource: ClaimDataSource,
    stockSymbol: LSymbol,
    ac: ActorRef[CodeNameActor.CodenameCommand]
  ) = {
    Behaviors.setup[LightningStcokActor.LightningStcokMessage] { context =>
      {
        val ref = context.messageAdapter(GetA)
        ac ! GetCodeName(stockSymbol.code, ref)

        context.system.receptionist ! Receptionist.Register(
          LightningStcokActor.getServiceKey(stockSymbol),
          context.self
        )

        (new LightningStcokActor(dataSource)).become(stockSymbol, "")
      }
    }
  }

}

class LightningStcokActor(dataSource: ClaimDataSource) {

  def become(
    stockSymbol: LSymbol,
    name: String
  ): Behavior[LightningStcokActor.LightningStcokMessage] = Behaviors.setup {
    context: ActorContext[LightningStcokActor.LightningStcokMessage] =>
      context.log.info("LightningStcokActor create {}", stockSymbol)
      Behaviors.receiveMessage {
        case LightningStcokActor.GetA(d) =>
          context.log.info(
            "getting result GetA {}, {}",
            stockSymbol.code,
            d.name
          )
          become(stockSymbol, d.name)
        case LightningStcokActor.CodeNameWrapper(name) =>
          become(stockSymbol, name)
//        case LightningStcokActor.FetchCodename(stockSymbol) =>
//          context.pipeToSelf(
//            dataSource
//              .getCodeNamesAsync()
//              .map(r =>
//                r.find(r => r.code == stockSymbol.code).map(r => r.name)
//              )
//          ) {
//            case Success(data) => CodeNameWrapper(data.getOrElse(""))
//            case Failure(x) =>
//              context.log.error("xx {}", x)
//              Fail(s"xxx${x.toString}")
//          }
//          Behaviors.same
        case a: LightningStcokActor.GetSymbolName =>
          context.log.info("LightningStcokActor GetSymbolName {} {}", a, name)
          a.resp ! LightningStcokActor.LightningStockName(name)
          Behaviors.same
        case a @ _ =>
          context.log.info(s"xxx{}", a)
          println(s"empty ${a}");
          Behaviors.same
      }
  }
}
