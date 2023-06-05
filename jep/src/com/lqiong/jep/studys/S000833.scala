package com.lqiong.jep.studys

//class  {

import com.lqiong.jep.option.{StockStudyNote, StudyByDate}

object S000833 extends StockStudyNote {

  import com.lqiong.model.symbol.codesyntax._

  override val symbol = c"000833"
  override val contents: List[StudyByDate] = {
    List(
      StudyByDate(
        t"2021-07-04",
        "2021Q1的营收为5.98亿 ，同比增长-32.58%。"
      )
    )
  }
}
