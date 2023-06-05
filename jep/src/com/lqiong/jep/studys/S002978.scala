package com.lqiong.jep.studys

import com.lqiong.jep.option.{StockStudyNote, StudyByDate}

object S002978 extends StockStudyNote {

  import com.lqiong.model.symbol.codesyntax._

  override val symbol = c"002978"
  override val contents: List[StudyByDate] = {
    List(
      StudyByDate(
        t"2021-08-04",
        "量很不错"
      )
    )
  }
}
