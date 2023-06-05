package com.lqiong.contact

import io.circe.generic.JsonCodec

@JsonCodec
case class ReturnMsg(code: Int, message: String = "")
