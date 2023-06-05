package com.lqiong.claim.actor.a

import akka.actor.typed.SupervisorStrategy
import akka.actor.typed.scaladsl.ActorContext
import akka.persistence.typed.scaladsl.{Effect, ReplyEffect}
import com.lqiong.claim.actor.a.ContractStateActor1.{ContractStateEvent, UpdatedContractEvent}
import com.lqiong.contact.ContractDetailStockList
import io.circe.generic.JsonCodec

object ContractStateState {
  def empty = {
    ContractStateState(List.empty[ContractDetailStockList])
  }
}

@JsonCodec
case class ContractStateState(
  contracts: List[ContractDetailStockList]
) {

  def applyEvent(
    evt: ContractStateEvent,
    logger: org.slf4j.Logger
  ): ContractStateState = {
    val f = evt match {
      case UpdatedContractEvent(amount) => copy(amount)
      case _ =>
        copy()
    }
    f
  }

  def applyCommand(
    context: ActorContext[ContractStateActor1.PContractStateCommand],
    cmd: ContractStateActor1.PContractStateCommand
  ): ReplyEffect[ContractStateActor1.ContractStateEvent, ContractStateState] = {
    cmd match {
      case ContractStateActor1.UpdateContractInfo(codeName) =>
        Effect
          .persist(ContractStateActor1.UpdatedContractEvent(codeName))
          .thenNoReply()
      case ContractStateActor1.UpdateContractInfo1(replyTo, list) =>
        Effect
          .persist(ContractStateActor1.UpdatedContractEvent(list))
          .thenReply(replyTo)(_ => ConfirmationContractObject())
//        Effect
//          .persist(ContractStateActor1.UpdatedContractEvent(list))
//          .thenReply(replyTo)(_ => ConfirmationContractState(List.empty[ContractDetailStockList]))
      case ContractStateActor1.GetContractState(replyTo) =>
        Effect.reply(replyTo)(ConfirmationContractState(contracts))
    }
  }

}

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior}
import akka.persistence.typed.PersistenceId
import akka.persistence.typed.scaladsl.EventSourcedBehavior

object ContractStateActor1 {
  sealed trait PContractStateCommand
  case class UpdateContractInfo(contracts: List[ContractDetailStockList])
      extends PContractStateCommand
  case class UpdateContractInfo1(
    contracts: ActorRef[ConfirmationContractObject],
    list: List[ContractDetailStockList]
  ) extends PContractStateCommand
  case class GetContractState(contracts: ActorRef[ConfirmationContractState])
      extends PContractStateCommand

  sealed trait ContractStateEvent

  final case class UpdatedContractEvent(
    contracts: List[ContractDetailStockList]
  ) extends ContractStateEvent

  def behavior(): Behavior[PContractStateCommand] =
    Behaviors.setup { context =>
      EventSourcedBehavior
        .withEnforcedReplies[
          PContractStateCommand,
          ContractStateEvent,
          ContractStateState
        ](
          persistenceId = PersistenceId("contddddddddddractState", "1"),
          emptyState = ContractStateState.empty,
          commandHandler = (account, cmd) => {
            account.applyCommand(context, cmd)
          },
          eventHandler = (account, evt) => {
            account.applyEvent(evt, context.log)
          }
        )
    }

  def apply(): Behavior[PContractStateCommand] = {
    Behaviors
      .supervise(
        behavior()
      )
      .onFailure(SupervisorStrategy.restart)
  }

}
