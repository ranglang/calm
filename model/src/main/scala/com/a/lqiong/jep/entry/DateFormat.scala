package com.lqiong.jep.entry

import org.joda.time.{DateTime, DateTimeZone, MutableDateTime}
import org.joda.time.format.{DateTimeFormat, DateTimeFormatterBuilder}

import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.Date
import scala.util.Try
import scala.util.control.NonFatal

object DateFormat {
  private val dateFormat = DateTimeFormat.forPattern("yyyy-MM-dd");
  private val noGapMonthFormat = DateTimeFormat.forPattern("yyyyMM");

  private val time1 = DateTimeFormat.forPattern(" HH:mm:ss");
  private val hourFormat = DateTimeFormat.forPattern("HH:mm")
  private val monthFormat = DateTimeFormat.forPattern("yyyyMM")
  val dataFormat = DateTimeFormat.forPattern("yyyyMMdd");
  lazy final val sdf = new SimpleDateFormat("yyyy-MM-dd")

  private val dateSlash = DateTimeFormat.forPattern("yyyy/M/d");
  private val dateSlash1 = DateTimeFormat.forPattern("yyyy/M.d");
  private val dateSlash3 = DateTimeFormat.forPattern("yyyy/MM/d");

  private val dayHourFormat = DateTimeFormat.forPattern("yyyyMMdd HH:mm");
  private val SecondsFormat = DateTimeFormat.forPattern("yyyyMMdd HH:mm:ss");

  val shangHaiZone = DateTimeZone.forID("Asia/Shanghai")

  def getSecondsFormat(dateTime: DateTime): String = {
    SecondsFormat.print(dateTime)
  }

  def getDayHourFormat(dateTime: DateTime): String = {
    dayHourFormat.print(dateTime)
  }

  def getDay(dateTime: DateTime): String = {
    println("dateTime {}", dateTime)
    dateFormat.print(dateTime)
  }

  def getSafeDay(dateTime: MutableDateTime): String = {
    println("dateTime {}", dateTime)
    dateFormat.print(dateTime)
  }

  def getMonth_yyyyMM(dateTime: DateTime): String = {
    monthFormat.print(dateTime)
  }

  def fromString(dateTime: String): DateTime = {
    DateTime.parse(dateTime, dateFormat)

  }

  def formatYYMM(dateTime: DateTime): String = {
    DateTimeFormat.forPattern("yyMM").print(dateTime);
  }

  def formatHour(data: DateTime) =
    hourFormat.print(data)

  def parseyyyyMM(date: String): DateTime = {
    DateTimeFormat.forPattern("yyyyMM").parseDateTime(date)
  }

  def parseyyyy_MM(date: String): DateTime = {
    DateTimeFormat.forPattern("yyyy-MM").parseDateTime(date)
  }

  def parseNoGapTime(date: String): DateTime = {
    DateTimeFormat.forPattern("yyMM").parseDateTime(date)
  }

  def parseTxt(date: String) = {
    DateFormat.getTimeOrDayFormat().parseDateTime(date)
  }

  def getTimeSlashFormat(dateTime: String): DateTime = {
    val f = Try {
      dateSlash.parseDateTime(dateTime)
    } recover {
      case NonFatal(r) => {
        val r = Try {
          dateSlash1.parseDateTime(dateTime)
        } recover {
          case NonFatal(x) => {
            dateSlash3.parseDateTime(dateTime)
          }
        }
        r.get
      }
    }
    f.get
  }

  def getTimeOrDayFormat() = {
    val a1 = new DateTimeFormatterBuilder()
      .appendOptional(dateFormat.getParser)
      .appendOptional(time1.getParser)

    a1.toFormatter
  }

  def getConnectedDate(dateTime: DateTime): String = {
    dataFormat.print(dateTime)
  }
}
