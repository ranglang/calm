package com.lqiong.claim.test

/*
 * Copyright (C) 2021 Lightbend Inc. <https://www.lightbend.com>
 */

import akka.Done
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior}
import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal
import akka.persistence.typed.PersistenceId
import akka.persistence.typed.ReplicaId
import akka.persistence.typed.ReplicationId
import akka.persistence.typed.scaladsl.EventSourcedBehavior
import akka.persistence.typed.scaladsl.ReplicatedEventSourcing
import akka.persistence.typed.state.scaladsl.DurableStateBehavior

object TestActors {
  object Persister {

    import akka.persistence.typed.scaladsl.Effect

    sealed trait Command
    final case class Persist(payload: Any) extends Command
    final case class PersistWithAck(payload: Any, replyTo: ActorRef[Done]) extends Command
    final case class PersistAll(payloads: List[Any]) extends Command
    final case class Ping(replyTo: ActorRef[Done]) extends Command
    final case class GetState(replyTo: ActorRef[String]) extends Command
    final case class Stop(replyTo: ActorRef[Done]) extends Command

    def apply(pid: String): Behavior[Command] =
      apply(PersistenceId.ofUniqueId(pid))

    def apply(pid: PersistenceId): Behavior[Command] = {
      apply(pid, "", "")
    }

    def apply(
      pid: PersistenceId,
      journalPluginId: String,
      snapshotPluginId: String
    ): Behavior[Command] = {
      Behaviors.setup { context =>
        eventSourcedBehavior(pid, context)
          .withJournalPluginId(journalPluginId)
          .withSnapshotPluginId(snapshotPluginId)
          .snapshotWhen { case (_, event, _) =>
            event.toString.contains("snap")
          }
      }
    }

    def eventSourcedBehavior(
      pid: PersistenceId,
      context: ActorContext[Command]
    ): EventSourcedBehavior[Command, Any, String] = {
      EventSourcedBehavior[Command, Any, String](
        persistenceId = pid,
        "",
        { (state, command) =>
          command match {
            case command: Persist =>
              context.log.info(
                "Persist [{}], pid [{}], seqNr [{}]",
                command.payload,
                pid.id,
                EventSourcedBehavior.lastSequenceNumber(context) + 1
              )
              Effect.persist(command.payload)
            case command: PersistWithAck =>
              context.log.info(
                "Persist [{}], pid [{}], seqNr [{}]",
                command.payload,
                pid.id,
                EventSourcedBehavior.lastSequenceNumber(context) + 1
              )
              Effect
                .persist(command.payload)
                .thenRun(_ => command.replyTo ! Done)
            case command: PersistAll =>
              if (context.log.isDebugEnabled)
                context.log.info(
                  "PersistAll [{}], pid [{}], seqNr [{}]",
                  command.payloads.mkString(","),
                  pid.id,
                  EventSourcedBehavior.lastSequenceNumber(context) + 1
                )
              Effect.persist(command.payloads)
            case Ping(replyTo) =>
              replyTo ! Done
              Effect.none
            case GetState(replyTo) =>
              replyTo ! state
              Effect.none
            case Stop(replyTo) =>
              replyTo ! Done
              Effect.stop()
          }
        },
        (state, event) => if (state == "") event.toString else s"$state|$event"
      )
    }
  }

  object DurableStatePersister {
    import akka.persistence.typed.state.scaladsl.Effect

    sealed trait Command
    final case class Persist(payload: Any) extends Command
    final case class PersistWithAck(payload: Any, replyTo: ActorRef[Done]) extends Command
    final case class Ping(replyTo: ActorRef[Done]) extends Command
    final case class Stop(replyTo: ActorRef[Done]) extends Command

    def apply(pid: String): Behavior[Command] =
      apply(PersistenceId.ofUniqueId(pid))

    def apply(pid: PersistenceId): Behavior[Command] = {
      Behaviors.setup { context =>
        DurableStateBehavior[Command, Any](
          persistenceId = pid,
          "",
          { (_, command) =>
            command match {
              case command: Persist =>
                context.log.info(
                  "Persist [{}], pid [{}], seqNr [{}]",
                  command.payload,
                  pid.id,
                  "???" /* FIXME Akka issue #30833 DurableStateBehavior.lastSequenceNumber(context) + 1 */
                )
                Effect.persist(command.payload)
              case command: PersistWithAck =>
                context.log.info(
                  "Persist [{}], pid [{}], seqNr [{}]",
                  command.payload,
                  pid.id,
                  "???" /* FIXME Akka issue #30833 DurableStateBehavior.lastSequenceNumber(context) + 1 */
                )
                Effect
                  .persist(command.payload)
                  .thenRun(_ => command.replyTo ! Done)
              case Ping(replyTo) =>
                replyTo ! Done
                Effect.none
              case Stop(replyTo) =>
                replyTo ! Done
                Effect.stop()
            }
          }
        )
      }
    }
  }

  def replicatedEventSourcedPersister(
    entityType: String,
    entityId: String
  ): Behavior[Persister.Command] = {
    Behaviors.setup[Persister.Command] { context =>
      ReplicatedEventSourcing.commonJournalConfig(
        ReplicationId(entityType, entityId, ReplicaId("dc-1")),
        Set(ReplicaId("dc-1")),
        R2dbcReadJournal.Identifier
      ) { replicationContext =>
        Persister.eventSourcedBehavior(
          PersistenceId(entityType, entityId),
          context
        )
      }
    }
  }
}
