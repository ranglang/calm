package com.lqiong.udata

import io.circe.generic.JsonCodec

@JsonCodec
case class Uprice(
  val open_price: Double
)
//
//@JsonCodec
//case class RetUprice(
//  data: List[Uprice]
//)

@JsonCodec
case class A(
  en_prod_code: String,
  trading_date: String = "2021-12-21"
)

//class UdataService {
//
//  import io.circe.parser._
//  import sttp.client.HttpURLConnectionBackend
//
//  implicit val backend = HttpURLConnectionBackend()
//
//  def getEn(en: String) = {
//    val resp1 = quickRequest
//      .headers(
//        Map(
//          "Application-Token" -> "wWRQoJlquTbTNdbMKgHoGZonb2gcwwLHg_Jo520Xx4QSdto4cpOVRLB8h6Z6fy28",
//          "token"             -> "wWRQoJlquTbTNdbMKgHoGZonb2gcwwLHg_Jo520Xx4QSdto4cpOVRLB8h6Z6fy28"
////          "Content-Type" -> "application/json",
//        )
//      )
//      .post(
//        uri"https://udata.hs.net/udata/business/v1/app_services/market_info/stock_quote_daily?trading_date=2021-12-21&en_prod_code=002139.SH"
//      )
//      .body(
//      )
//      .send() // uses the proxy
//    println("body {}", resp1.body)
//    println("body {}", resp1.body)
//
//    val r = decode[RetUprice](resp1.body)
//
//    println("decode 1{}", r.left)
//
//  }
//
//}
