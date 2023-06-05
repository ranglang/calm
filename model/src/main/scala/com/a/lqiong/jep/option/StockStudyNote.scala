package com.lqiong.jep.option

import com.lqiong.model.LSymbol
import org.joda.time.DateTime

case class StudyByDate(
  date: DateTime,
  content: String
)
trait StockStudyNote {
  val symbol: LSymbol
  val contents: List[StudyByDate]
}
