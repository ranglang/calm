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
//    import courier._, Defaults._
//    val mailer = Mailer(config.mailHost, config.mailPort.toInt)
//      .auth(true)
//      .as(config.mailUserName, config.mailPassword)
//      .ssl(true)()
//
//    val part = files.foldLeft(Multipart())((p, c) => {
//      if (c.exists) {
//        p.attach(c)
//      } else {
//        p
//      }
//    })
//
//    import java.net.InetAddress;
//    import java.net.UnknownHostException;
//
//    val ip = InetAddress.getLocalHost();
//    val hostname = ip.getHostName();
//
//    val future1 = mailer(
//      Envelope
//        .from("lanzw" `@` "wintercoming.xyz")
//        .to("lanziwem" `@` "qq.com")
//        .to("lanziwen" `@` "outlook.com")
//        .subject(subject)
//        .content(
//          part.html(s"${text}${LqSegment.separator}${hostname}")
//        )
//    )
//    import scala.concurrent.Await
//    import scala.concurrent.duration._
//    Await.result(future1, 10.seconds)
  }

}
