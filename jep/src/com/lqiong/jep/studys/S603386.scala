package com.lqiong.jep.studys

import com.lqiong.jep.option.{StockStudyNote, StudyByDate}

object S603386 extends StockStudyNote {
  import com.lqiong.model.symbol.codesyntax._
  override val symbol = i"603386"
  override val contents: List[StudyByDate] = {
    List(
      StudyByDate(
        t"2021-07-04",
        "电价上升"
      )
    )
  }
}
