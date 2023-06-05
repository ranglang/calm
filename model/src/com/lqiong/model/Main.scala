package com.lqiong.model

import scala.language.postfixOps
import com.lqiong.model.order.noticesGroups._

object Main {

  import com.lqiong.model.symbol.codesyntax._

  val a = noticesGroup name "group1" members List(
    c"000001"
  )

  import com.lqiong.model.order.notes._

  val a1 = note code c"00001" event "扩产" date "2021-06-12 13:03:00"

  println(a)
}
