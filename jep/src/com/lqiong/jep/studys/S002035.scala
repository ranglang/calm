package com.lqiong.jep.studys

import com.lqiong.jep.option.{StockStudyNote, StudyByDate}

object S002035 extends StockStudyNote {

  import com.lqiong.model.symbol.codesyntax._

  override val symbol = c"002035"
  override val contents: List[StudyByDate] = {
    List(
      StudyByDate(
        t"2021-07-04",
        "连续7天上涨"
      )
    )
  }
}
