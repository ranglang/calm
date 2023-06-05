package com.lqiong.e

import org.joda.time.{DateTime, DateTimeZone}

import java.time.ZonedDateTime
import java.util.TimeZone

object JDateTime {

  def get(zonedDateTime: ZonedDateTime) = {
    new DateTime(
      zonedDateTime.toInstant().toEpochMilli(),
      DateTimeZone.forTimeZone(TimeZone.getTimeZone(zonedDateTime.getZone()))
    );
  }
}
