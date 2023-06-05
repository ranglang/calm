package com.lqiong.model.order

import com.lqiong.jep.entry.{DateFormat, EnumInfoLevel}
import com.lqiong.model.{LSymbol, StockSymbol}

object notes {

  implicit class StockNoteOps(duration: StockNote) {

    def code(other: LSymbol): StockNote = {
      duration.copy(symbol = other)
    }

    def event(other: String): StockNote = {
      duration.copy(eventNameOpt = Some(other))
    }

    def level(other: EnumInfoLevel): StockNote = {
      duration.copy(levelOpt = Some(other))
    }

    def date(other: String): StockNote = {
      duration.copy(dateTime = Some(DateFormat.getTimeOrDayFormat().parseDateTime(other)))
    }

    def url(other: String): StockNote = {
      duration.copy(url = Some(other))
    }
    def description(other: String): StockNote = {
      duration.copy(descriptionOpt = Some(other))
    }
  }

  def note: StockNote = StockNote(StockSymbol(""))
}
