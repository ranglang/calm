package com.lqiong.jep.entry.a

object UUIDUtil {

  def insertDashUUID(uuid: String): String = {
    var sb = new StringBuilder(uuid)
    sb.insert(8, "-")
    sb = new StringBuilder(sb.toString)
    sb.insert(13, "-")
    sb = new StringBuilder(sb.toString)
    sb.insert(18, "-")
    sb = new StringBuilder(sb.toString)
    sb.insert(23, "-")
    sb.toString
  }
}
