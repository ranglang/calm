package com.lqiong.jep.entry

import io.getquill.MappedEncoding

trait QuillEncoder {
  implicit val encodeDate =
    MappedEncoding[java.sql.Timestamp, java.util.Date](r => new java.util.Date(r.getTime))
  implicit val decoderDate =
    MappedEncoding[java.util.Date, java.sql.Timestamp](r => new java.sql.Timestamp(r.getTime))

}
