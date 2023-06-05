package com.ad

import com.lqiong.jep.entry.a.JsonDateTime
import e.EggDataList
import io.circe.generic.JsonCodec
import org.joda.time.DateTime

@JsonCodec
case class ABoatEgg(
  date: DateTime,
  value: Double
)
object ABoatEgg extends JsonDateTime

object EggListConverter {

  def getA(d: EggDataList): List[ABoatEgg] = {

    val d1 = d.columns;

    val a: Seq[(ABoatEgg, ABoatEgg, ABoatEgg, ABoatEgg, ABoatEgg, ABoatEgg, ABoatEgg, ABoatEgg)] =
      d.data.zipWithIndex.map(item1 => {
        val item = item1._1
        val year1 = d1(1).take(4).toInt
        val year2 = d1(2).take(4).toInt
        val year3 = d1(3).take(4).toInt
        val year4 = d1(4).take(4).toInt
        val year5 = d1(5).take(4).toInt
        val year6 = d1(6).take(4).toInt
        val year7 = d1(7).take(4).toInt
        val year8 = d1(8).take(4).toInt

        (
          ABoatEgg(DateTime.now().withYear(year1).withDayOfYear(item1._2 + 1), item._2),
          ABoatEgg(DateTime.now().withYear(year2).withDayOfYear(item1._2 + 1), item._3),
          ABoatEgg(DateTime.now().withYear(year3).withDayOfYear(item1._2 + 1), item._4),
          ABoatEgg(DateTime.now().withYear(year4).withDayOfYear(item1._2 + 1), item._5),
          ABoatEgg(DateTime.now().withYear(year5).withDayOfYear(item1._2 + 1), item._6),
          ABoatEgg(DateTime.now().withYear(year6).withDayOfYear(item1._2 + 1), item._7),
          ABoatEgg(
            DateTime.now().withYear(year7).withDayOfYear(item1._2 + 1),
            item._8.getOrElse(0d)
          ),
          ABoatEgg(
            DateTime.now().withYear(year8).withDayOfYear(item1._2 + 1),
            item._9.getOrElse(0d)
          )
        )
      });

    val lst: List[ABoatEgg] = a.toList.foldLeft(List.empty[ABoatEgg])((p, c) => {
      p.:::(
        List(
          c._1,
          c._2,
          c._3,
          c._4,
          c._5,
          c._6,
          c._7,
          c._8
        )
      )
    })

    val no = DateTime.now.withHourOfDay(0)
    lst
      .filter(r => r.date.isBefore(no))
      .sortBy(_.date)
  }
}
