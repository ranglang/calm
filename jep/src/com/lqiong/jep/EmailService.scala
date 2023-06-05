package com.lqiong.jep

import com.google.inject.Inject
import com.lqiong.email.EmailServiceTrait
import com.lqiong.shared.email.EmailConfig

import java.io.File

class EmailService @Inject() (val config: EmailConfig) extends EmailServiceTrait {

  def sendEmail(
    subject: String,
    text: String,
    files: List[File] = List.empty[File]
  ): Unit = {
    // TODO implement
  }

}
