package com.lqiong.jep.checker.model

import com.lqiong.model.order.NoticeMe
import org.joda.time.DateTime

case class CheckResult(
  title: String,
  content: String,
  category: String = "category",
  updateAt: Option[DateTime] = Option.empty[DateTime],
  notice: NoticeMe,
  current: Option[Double] = Option.empty
)
