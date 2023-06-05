package com.lqiong.email

import java.io.File

trait EmailServiceTrait {

  def sendEmail(
      subject: String,
      text: String,
      image: List[File] = List.empty[File]
  ): Unit
}
