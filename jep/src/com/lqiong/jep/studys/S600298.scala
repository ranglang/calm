package com.lqiong.jep.studys

import com.lqiong.jep.option.{StockStudyNote, StudyByDate}

//class S600298 {

object S600298 extends StockStudyNote {

  import com.lqiong.model.symbol.codesyntax._

  override val symbol = c"600298"
  override val contents: List[StudyByDate] = {
    List(
      StudyByDate(
        t"2021-08-04",
        "放量"
      )
    )
  }
}
