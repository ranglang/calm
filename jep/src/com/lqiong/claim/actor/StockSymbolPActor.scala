package com.lqiong.claim.actor

import akka.actor.typed._
import akka.actor.typed.receptionist.{Receptionist, ServiceKey}
import akka.actor.typed.scaladsl.{ActorContext, Behaviors}
import akka.persistence.typed.PersistenceId
import akka.persistence.typed.scaladsl.{
  Effect,
  EventSourcedBehavior,
  ReplyEffect,
  RetentionCriteria
}
import com.lqiong.claim.actor.CodeNameActor.CodeNameResponse
import com.lqiong.claim.actor.StockSymbolPActor._
import com.lqiong.jep.entry.{DateFormat, JsonDateTime}
import com.lqiong.model.LSymbol
import io.circe.generic.{AutoDerivation, JsonCodec}
import org.joda.time.{DateTime, DateTimeZone}
import org.slf4j.Logger
import scala.concurrent.duration.DurationInt

sealed trait PStockCommand

sealed trait PStockEvent

@JsonCodec
case class StockPStateTxt(
  price: Double,
  code: String = "",
  name: Option[String] = Option.empty[String],
  currentPrice: Option[Double],
  priceUpdateAt: Option[DateTime],
  priceUpdateAtTxt: Option[String],
  chaodie: Option[Double]
)

object StockPStateTxt extends JsonDateTime with AutoDerivation

/** The current state held by the persistent entity.
  */
@JsonCodec
case class StockPState(
  price: Double,
  code: String = "",
  name: Option[String] = Option.empty[String],
  currentPrice: Option[Double],
  priceUpdateAt: Option[DateTime],
  chaodie: Option[Double]
) {

  override def toString: String = {
    val t =
      if (priceUpdateAt.isDefined)
        DateFormat.getSecondsFormat(
          priceUpdateAt.get.withZone(DateTimeZone.forID("Asia/Shanghai"))
        )
      else "undefined"
    s"$code $name a millis ${priceUpdateAt.map(r => r.getMillis).getOrElse(0)} currentPrice: $currentPrice priceUpdateAt $t chaodie: $chaodie  "
  }

  def applyCommand(
    context: ActorContext[PStockCommand],
    cmd: PStockCommand
  ): ReplyEffect[PStockEvent, StockPState] = {
    cmd match {
      case StockSymbolPActor.CodeNameResponseWapper(codeName) =>
        context.log.info(
          "CodeNameResponseWapper CodeNameResponseWapper applyCommand {} {}",
          NetUtils.getHostName,
          codeName
        )
        Effect
          .persist(UpdateStockNamed(codeName.name))
          .thenNoReply()
//        Effect.noReply
//        Effect.reply(replyTo)(Accepted)
      case StockSymbolPActor.UpdateStockChaodieFactor(price, replyTo) =>
        context.log.info(
          "StockSymbolPActor UpdateStockStatePrice chaodie UpdateStockChaodieFactor  {} {}",
          NetUtils.getHostName,
          price
        )
//        Effect
//          .persist(UpdateStockChaodiePriceEvent(price))
//          .thenReply(replyTo) { _ =>
//            Accepted
//          }
        Effect.reply(replyTo)(Accepted)
      case StockSymbolPActor.UpdateStockStatePrice(
            price,
            priceUpdateAt,
            replyTo
          ) =>
        context.log.info(
          "StockSymbolPActor UpdateStockStatePrice price UpdateStockPriceEvent {} {} {}",
          NetUtils.getHostName,
          price,
          priceUpdateAt
        )
        Effect
          .persist(UpdateStockPriceEvent(price, priceUpdateAt))
          .thenReply(replyTo) { _ =>
            Accepted
          }
//        Effect.reply(replyTo)(Accepted)
      case GetPActorState(replyTo) =>
        context.log.info(
          "replyTo GetPActorState code {} {} {}",
          NetUtils.getHostName,
          code,
          name
        )
        val a = copy()
        Effect.reply(replyTo)(a)
      case _ =>
        context.log.info(
          "replyTo GetPActorState applyCommand Effect.unhandled.thenNoReply {} {} {}",
          NetUtils.getHostName,
          code,
          name
        )
        Effect.unhandled.thenNoReply()
    }
  }

  def applyEvent(evt: PStockEvent, logger: org.slf4j.Logger): StockPState = {
    val f = evt match {
      case UpdateStockNamed(amount) =>
        logger.info("apply eventUpdateStockNamed {}", amount)
        copy(name = Some(amount))
      case UpdateStockPriceEvent(amount, priceUpdateAt) =>
        logger.info("apply UpdateStockPriceEvent {}", amount, priceUpdateAt)
        copy(currentPrice = Some(amount), priceUpdateAt = Some(priceUpdateAt))
      case UpdateStockChaodiePriceEvent(am) =>
        logger.info("apply UpdateStockChaodiePriceEvent {}", am)
        copy(chaodie = Some(am))
      case SaveSnapShop =>
        logger.info("saved snapshot {}", code)
        copy()
      case _ =>
        copy()
    }
    f
  }

}
object StockPState extends JsonDateTime

object StockSymbolPActor {

  def getServiceKey(symbol: LSymbol) = {
    ServiceKey[PStockCommand](
      s"StockSymbolPActorState${symbol.getName}"
    )
  }
  def getServiceKeyFromString(id: String) = {
    ServiceKey[PStockCommand](id)
  }

  object StockPState1 {

    def empty: StockPState =
      StockPState(
        price = 0,
        currentPrice = Option.empty[Double],
        chaodie = Option.empty[Double],
        priceUpdateAt = Option.empty[DateTime]
      )

    def onFirstCommand(
      lSymbol: LSymbol,
      cmd: PStockCommand,
      context: ActorContext[PStockCommand]
    ): ReplyEffect[PStockEvent, StockPState] = {
      context.log.info(
        " StockPState onFirstCommand {} {}",
        NetUtils.getHostName,
        cmd
      );
      cmd match {
        case StockSymbolPActor.CodeNameResponseWapper(codeName) =>
          context.log.info(
            "CodeNameResponseWapper CodeNameResponseWapper {} {}",
            NetUtils.getHostName,
            codeName
          )
          Effect
            .persist(UpdateStockNamed(codeName.name))
            .thenNoReply()
        case UpdateStockNameErrorWrapper(error) =>
          context.log.error(
            s"UpdateStockNameErrorWrapper error {} {}",
            NetUtils.getHostName,
            error
          )
          Effect.unhandled.thenNoReply()
        case _ =>
          context.log.info("StockPState xxxxxx onFirstCommand unhandled")
          // CreateAccount before handling any other commands
          Effect.unhandled.thenNoReply()
      }
    }

    def behavior(
      id: LSymbol,
      context: ActorContext[PStockCommand]
    ): EventSourcedBehavior[PStockCommand, PStockEvent, StockPState] = {
      EventSourcedBehavior
        .withEnforcedReplies[PStockCommand, PStockEvent, StockPState](
          persistenceId = PersistenceId("Stock_Symbol_13", id.code),
          emptyState = StockPState1.empty,
          commandHandler = (account, cmd) => {
            context.log.info("stock p actor behavior id {}, ", id)
            Effect.noReply
            account.name match {
              case Some(name) =>
                context.log
                  .info(
                    "StockSymbolPActor account name applyCommand {} {} {}",
                    id.code,
                    account,
                    cmd
                  )
                account.applyCommand(context, cmd)
              case None =>
                context.log
                  .info(
                    "StockSymbolPActor account name onFirstCommand {} {} {} {}",
                    NetUtils.getHostName,
                    id.code,
                    account,
                    cmd
                  )
                onFirstCommand(id, cmd, context)
            }
          },
          eventHandler = (account, evt) => {
            context.log
              .info(
                "StockSymbolPActor eventhandler {} {}",
                NetUtils.getHostName,
                id
              )
            account.applyEvent(evt, context.log)
          }
        )
        .onPersistFailure(
          SupervisorStrategy.restartWithBackoff(
            minBackoff = 1000.milliseconds,
            maxBackoff = 6.minutes,
            randomFactor = 0.01
          )
        )
        .withRetention(
          RetentionCriteria.disabled
        )
        // .snapshotEvery(numberOfEvents = 3, keepNSnapshots = 1)
        .snapshotWhen {
          case (_, SaveSnapShop, _) => true
          // case (_, evt: UpdateStockNamed, _)      => true
          case _ => false
        }
    }

  }

  def apply(
    id: LSymbol,
    logger: Logger,
    stockCodeNameRef: ActorRef[CodeNameActor.CodenameCommand]
  ): Behavior[PStockCommand] = {
    Behaviors
      .supervise(
        behavior(
          id,
          logger,
          stockCodeNameRef
        )
      )
      .onFailure(SupervisorStrategy.restart)
  }

  def behavior(
    id: LSymbol,
    logger: Logger,
    stockCodeNameRef: ActorRef[CodeNameActor.CodenameCommand]
  ) = {
    Behaviors.setup[PStockCommand] { context: ActorContext[PStockCommand] =>
      {
        context.log
          .info("setup for StockPState {} {}", NetUtils.getHostName, id.code)
        val replyAdapter: ActorRef[CodeNameActor.CodeNameResponse] =
          context.messageAdapter[CodeNameActor.CodeNameResponse](
            CodeNameResponseWapper
          )
        context.system.receptionist ! Receptionist.Register(
          StockSymbolPActor.getServiceKey(id),
          context.self
        )

        stockCodeNameRef ! CodeNameActor.GetCodeName(id.code, replyAdapter)
        // TODO  get code name for replay adapter

        StockPState1.behavior(id, context).receiveSignal {
          case (_, Terminated(ref)) =>
            logger.error(
              "StockSymbolPActor restart Terminated {} {}",
              ref.path.name,
              id.code
            )
            Behaviors.same
          case (_, signal) if signal == PreRestart =>
            logger.error("StockSymbolPActor restart PreRestart {}", id.code)
            Behaviors.same
          case (_, signal) if signal == PostStop =>
            logger.error("StockSymbolPActor restart PostStop {}", id.code)
            Behaviors.same
        }
      }
    }
  }

  final case class UpdateStockNamed(name: String) extends PStockEvent
  final case object SaveSnapShop extends PStockEvent
  final case class UpdateStockPriceEvent(
    newPrice: Double,
    priceUpdateAt: DateTime
  ) extends PStockEvent {
    override def toString = {
      s"UpdateStockPriceEvent $newPrice priceUpdateAt: ${DateFormat.getSecondsFormat(priceUpdateAt)}"
    }
  }
  final case class UpdateStockChaodiePriceEvent(value: Double) extends PStockEvent

  final case class UpdateStockChaodieFactor(
    newPrice: Double,
    replyTo: ActorRef[Accepted]
  ) extends PStockCommand

  final case class UpdateStockStatePrice(
    newPrice: Double,
    priceUpdateAt: DateTime,
    replyTo: ActorRef[Accepted]
  ) extends PStockCommand

  final case class UpdateStockStateName(
    name: String,
    replyTo: ActorRef[Accepted]
  ) extends PStockCommand

  final case class CodeNameResponseWapper(data: CodeNameResponse) extends PStockCommand

  final case class UpdateStockNameErrorWrapper(error: Throwable) extends PStockCommand
  case class GetPActorState(replyTo: ActorRef[StockPState]) extends PStockCommand

  sealed trait AccountReply
  case class Balance(amount: Double) extends AccountReply

  sealed trait Confirmation extends AccountReply
  sealed trait Accepted extends Confirmation
  case object Accepted extends Accepted
  case class Rejected(reason: String) extends Confirmation
}
