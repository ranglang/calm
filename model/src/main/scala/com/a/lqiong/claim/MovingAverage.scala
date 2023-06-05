package com.lqiong.claim

import carldata.series.TimeSeries
import java.time.Instant
import java.util.Date
import scala.collection.immutable.TreeMap
import scala.collection.{immutable, SortedMap}

import scala.language.postfixOps

object MovingAverage {

  /** Returns daily logger return for given period.
    *
    * @return
    *   array of size n-1 containing ln(Xn / Xn-1)
    */
  def calculate(values: Array[Double], nbDays: Int): Array[Double] = {
    (nbDays to values.size)
      .map(i => ((i - nbDays) to (i - 1)).map(j => values(j)).sum / nbDays)
      .toArray
  }

  /** Returns daily logger return for given period.
    *
    * @return
    *   array of size n-1 containing ln(Xn / Xn-1)
    */
  def calculateLastMA(values: Array[Double], nbDays: Int): Double = {
    if (values.length < nbDays) {
      val size = values.length
      (0 until size).map(j => values(j)).sum / size
    } else {
      val list1: Int = values.length - nbDays
      (list1 - 1).until(values.length - 1).map(j => values(j)).sum / nbDays
    }
  }

  def calculateValuesList(
    values: TimeSeries[Double],
    nbDays: Int
  ): TimeSeries[Double] = {
    val L: immutable.Seq[(Instant, Double)] =
      (nbDays to values.length) map (i => {
        val index = i - nbDays + 1
        (
          values.index(index),
          ((i - nbDays) to (i - 1)).map(j => values.values(j)).sum / nbDays
        )
      })

    TimeSeries[Double](
      L.map(v => v._1).toVector,
      L.map(v => v._2).toVector
    )
  }

  /** Returns daily logger return for given period.
    *
    * @return
    *   array of size n-1 containing ln(Xn / Xn-1)
    */
  def calculate(
    values: SortedMap[Date, Double],
    nbDays: Int
  ): SortedMap[Date, Double] = {
    val keys = values.keySet.toIndexedSeq
    TreeMap(
      (nbDays to values.size) map (i =>
        (
          keys(i - 1),
          ((i - nbDays) to (i - 1)).map(j => values(keys(j))).sum / nbDays
        )
      ): _*
    )
  }

}
