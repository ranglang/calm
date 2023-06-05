package com.lqiong.jep.studys

import com.lqiong.jep.option.{StockStudyNote, StudyByDate}

object StockStudy000513 extends StockStudyNote {
  import com.lqiong.model.symbol.codesyntax._
  override val symbol = i"000513"
  override val contents: List[StudyByDate] = {
    List(
      StudyByDate(
        t"2021-07-04",
        "中医药龙头之一"
      )
    )
  }
}
