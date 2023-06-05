package com.onectrm.akshare.api.generated.bank;

import com.onectrm.akshare.api.generated.bank.bank_fjcf_table_detailResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bank 接口: bank_fjcf_table_detail 目标地址:
  * http://www.cbirc.gov.cn/cn/view/pages/ItemDetail.html?docId=881574&amp;itemId=4115&amp;generaltype=9
  * 描述: 首页-政务信息-行政处罚-银保监分局本级-XXXX行政处罚信息公开表, 是信息公开表不是处罚决定书书 限量: 单次返回银保监分局本级行政处罚中的指定页数的所有表格数据
  */
case class Respbank_fjcf_table_detailResponse(
  `p_xing2zheng4chu3fa2jue2ding4shu1wen2hao4`: String,
  `p_xing4ming2`: String,
  `p_dan1wei4`: String,
  `p_ming2cheng1`: String,
  `p_zhu3yao4fu4ze2ren2xing4ming2`: String,
  `p_zhu3yao4wei2fa3wei2gui1shi4shi2an4you2`: String,
  `p_xing2zheng4chu3fa2yi1ju4`: String,
  `p_xing2zheng4chu3fa2jue2ding4`: String,
  `p_zuo4chu1chu3fa2jue2ding4de5ji1guan1ming2cheng1`: String,
  `p_zuo4chu1chu3fa2jue2ding4de5ri4qi1`: String
)

case class bank_fjcf_table_detailResponse(
  `p_xing2zheng4chu3fa2jue2ding4shu1wen2hao4`: String,
  `p_xing4ming2`: String,
  `p_dan1wei4`: String,
  `p_ming2cheng1`: String,
  `p_zhu3yao4fu4ze2ren2xing4ming2`: String,
  `p_zhu3yao4wei2fa3wei2gui1shi4shi2an4you2`: String,
  `p_xing2zheng4chu3fa2yi1ju4`: String,
  `p_xing2zheng4chu3fa2jue2ding4`: String,
  `p_zuo4chu1chu3fa2jue2ding4de5ji1guan1ming2cheng1`: String,
  `p_zuo4chu1chu3fa2jue2ding4de5ri4qi1`: String
)

trait Json_bank_fjcf_table_detailResponse {

  implicit val a_bank_fjcf_table_detailResponse = new Decoder[bank_fjcf_table_detailResponse] {
    final def apply(c: HCursor): Decoder.Result[bank_fjcf_table_detailResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xing2zheng4chu3fa2jue2ding4shu1wen2hao4 <- c.downField("行政处罚决定书文号").as[String]

        p_xing4ming2 <- c.downField("姓名").as[String]

        p_dan1wei4 <- c.downField("单位").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zhu3yao4fu4ze2ren2xing4ming2 <- c.downField("主要负责人姓名").as[String]

        p_zhu3yao4wei2fa3wei2gui1shi4shi2an4you2 <- c.downField("主要违法违规事实（案由）").as[String]

        p_xing2zheng4chu3fa2yi1ju4 <- c.downField("行政处罚依据").as[String]

        p_xing2zheng4chu3fa2jue2ding4 <- c.downField("行政处罚决定").as[String]

        p_zuo4chu1chu3fa2jue2ding4de5ji1guan1ming2cheng1 <- c.downField("作出处罚决定的机关名称").as[String]

        p_zuo4chu1chu3fa2jue2ding4de5ri4qi1 <- c.downField("作出处罚决定的日期").as[String]

      } yield {
        bank_fjcf_table_detailResponse(
          p_xing2zheng4chu3fa2jue2ding4shu1wen2hao4,
          p_xing4ming2,
          p_dan1wei4,
          p_ming2cheng1,
          p_zhu3yao4fu4ze2ren2xing4ming2,
          p_zhu3yao4wei2fa3wei2gui1shi4shi2an4you2,
          p_xing2zheng4chu3fa2yi1ju4,
          p_xing2zheng4chu3fa2jue2ding4,
          p_zuo4chu1chu3fa2jue2ding4de5ji1guan1ming2cheng1,
          p_zuo4chu1chu3fa2jue2ding4de5ri4qi1
        )
      }
  }

}

object JsonItem_bank_fjcf_table_detailResponse extends Json_bank_fjcf_table_detailResponse
