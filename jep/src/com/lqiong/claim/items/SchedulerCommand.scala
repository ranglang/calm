package com.lqiong.claim.items

import enumeratum.EnumEntry
import _root_.enumeratum._

sealed trait SchedulerCommand extends EnumEntry with EnumEntry.Lowercase

object SchedulerCommand extends Enum[SchedulerCommand] {
  case object fetchSpot extends SchedulerCommand
  case object sellNotice extends SchedulerCommand
  case object continue extends SchedulerCommand
  case object meadium extends SchedulerCommand
  case object sector extends SchedulerCommand
//  case object saveTrace extends SchedulerCommand
  case object tradeDay extends SchedulerCommand
  case object syncNotePrice extends SchedulerCommand

  case object factorData extends SchedulerCommand
  case object chaodie extends SchedulerCommand
  case object syncWasteTime extends SchedulerCommand
  case object syncOptions extends SchedulerCommand
  case object syncCodeName extends SchedulerCommand
  case object updateNotes extends SchedulerCommand

  case object syncVix extends SchedulerCommand
  case object retro extends SchedulerCommand
  case object notice extends SchedulerCommand
  case object panming extends SchedulerCommand
  case object syncUsedPrice extends SchedulerCommand
  case object syncContract extends SchedulerCommand
  case object syncPig extends SchedulerCommand
  case object strategy extends SchedulerCommand
//  case object syncbackend extends SchedulerCommand
//  case object temp extends SchedulerCommand
  val values = findValues
}
