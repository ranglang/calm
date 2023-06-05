package com.lqiong.jep.studys

//class  {

import com.lqiong.jep.option.{StockStudyNote, StudyByDate}

object S000012 extends StockStudyNote {

  import com.lqiong.model.symbol.codesyntax._

  override val symbol = c"000012"
  override val contents: List[StudyByDate] = {
    List(
      StudyByDate(
        t"2021-07-04",
        "AK"
      )
    )
  }
}
