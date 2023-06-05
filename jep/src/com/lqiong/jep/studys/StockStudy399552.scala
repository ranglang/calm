package com.lqiong.jep.studys

import com.lqiong.jep.option.{StockStudyNote, StudyByDate}

object StockStudy399552 extends StockStudyNote {
  import com.lqiong.model.symbol.codesyntax._
  override val symbol = i"399552"
  override val contents: List[StudyByDate] = {
    import com.lqiong.model.symbol.codesyntax._
    List(
      StudyByDate(
        t"2021-07-04",
        "ddd"
      )
    )
  }
}
