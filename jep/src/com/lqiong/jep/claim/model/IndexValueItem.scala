package com.lqiong.jep.claim.model

import java.util.Date

case class IndexValueItem(
  date: Date,
  average: Option[Double],
//                            rate of
  dividendrate: Option[Double],
  low30: Option[Double],
  high30: Option[Double]
)
