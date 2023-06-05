package com.lqiong.jep.A1

import akka.Done
import akka.actor.typed.{ActorRef, Behavior}
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey
import akka.pattern.StatusReply
import akka.persistence.typed.PersistenceId
import akka.persistence.typed.state.scaladsl.{DurableStateBehavior, Effect}

object AccountEntity {
  // Command
  sealed trait Command
  final case class CreateAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Deposit(
    amount: BigDecimal,
    replyTo: ActorRef[StatusReply[Done]]
  ) extends Command
  final case class Withdraw(
    amount: BigDecimal,
    replyTo: ActorRef[StatusReply[Done]]
  ) extends Command
  final case class GetBalance(replyTo: ActorRef[CurrentBalance]) extends Command
  final case class CloseAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command

  // Reply
  final case class CurrentBalance(balance: BigDecimal)

  val Zero = BigDecimal(0)

  // type alias to reduce boilerplate
  type ReplyEffect = akka.persistence.typed.state.scaladsl.ReplyEffect[Account]

  // State
  sealed trait Account {
    def applyCommand(cmd: Command): ReplyEffect
  }
  case object EmptyAccount extends Account {
    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case CreateAccount(replyTo) =>
          Effect
            .persist(OpenedAccount(Zero))
            .thenReply(replyTo)(_ => StatusReply.Ack)
        case _ =>
          // CreateAccount before handling any other commands
          Effect.unhandled.thenNoReply()
      }
  }
  case class OpenedAccount(balance: BigDecimal) extends Account {
    require(balance >= Zero, "Account balance can't be negative")

    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case cmd @ Deposit(_, _) => deposit(cmd)

        case cmd @ Withdraw(_, _) => withdraw(cmd)

        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(balance))

        case CloseAccount(replyTo) =>
          if (balance == Zero)
            Effect
              .persist(ClosedAccount)
              .thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(
              StatusReply.Error("Can't close account with non-zero balance")
            )

        case CreateAccount(replyTo) =>
          Effect.reply(replyTo)(StatusReply.Error("Account is already created"))

      }

    private def canWithdraw(amount: BigDecimal): Boolean = {
      balance - amount >= Zero
    }

    private def deposit(cmd: Deposit) = {
      Effect
        .persist(copy(balance = balance + cmd.amount))
        .thenReply(cmd.replyTo)(_ => StatusReply.Ack)
    }

    private def withdraw(cmd: Withdraw) = {
      if (canWithdraw(cmd.amount))
        Effect
          .persist(copy(balance = balance - cmd.amount))
          .thenReply(cmd.replyTo)(_ => StatusReply.Ack)
      else
        Effect.reply(cmd.replyTo)(
          StatusReply.Error(
            s"Insufficient balance ${balance} to be able to withdraw ${cmd.amount}"
          )
        )
    }

  }
  case object ClosedAccount extends Account {
    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case c: Deposit =>
          replyClosed(c.replyTo)
        case c: Withdraw =>
          replyClosed(c.replyTo)
        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(Zero))
        case CloseAccount(replyTo) =>
          replyClosed(replyTo)
        case CreateAccount(replyTo) =>
          replyClosed(replyTo)
      }

    private def replyClosed(replyTo: ActorRef[StatusReply[Done]]): ReplyEffect =
      Effect.reply(replyTo)(StatusReply.Error(s"Account is closed"))
  }

  // when used with sharding, this TypeKey can be used in `sharding.init` and `sharding.entityRefFor`:
  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("Account")

  def apply(persistenceId: PersistenceId): Behavior[Command] = {
    DurableStateBehavior
      .withEnforcedReplies[Command, Account](
        persistenceId,
        EmptyAccount,
        (state, cmd) => state.applyCommand(cmd)
      )
  }
}
