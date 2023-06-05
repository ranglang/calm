package com.lqiong.jep.studys

import com.lqiong.jep.option.{StockStudyNote, StudyByDate}

//class S000545 {

object S000545 extends StockStudyNote {

  import com.lqiong.model.symbol.codesyntax._

  override val symbol = c"000545"
  override val contents: List[StudyByDate] = {
    List(
      StudyByDate(
        t"2021-08-04",
        "量很不错"
      )
    )
  }
}
