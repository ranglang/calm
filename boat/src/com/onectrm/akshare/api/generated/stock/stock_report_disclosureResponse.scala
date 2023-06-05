package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_report_disclosureResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_report_disclosure 目标地址:
  * http://www.cninfo.com.cn/new/commonUrl?url=data/yypl 描述: 巨潮资讯-数据-预约披露的数据 限量: 单次获取指定 market 和
  * period 的预约披露数据
  */
case class Respstock_report_disclosureResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_shou3ci4yu4yue1`: String,
  `p_chu1ci4bian4geng4`: String,
  `p_er4ci4bian4geng4`: String,
  `p_san1ci4bian4geng4`: String,
  `p_shi2ji4pi1lu4`: String
)

case class stock_report_disclosureResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_shou3ci4yu4yue1`: String,
  `p_chu1ci4bian4geng4`: String,
  `p_er4ci4bian4geng4`: String,
  `p_san1ci4bian4geng4`: String,
  `p_shi2ji4pi1lu4`: String
)

trait Json_stock_report_disclosureResponse {

  implicit val a_stock_report_disclosureResponse = new Decoder[stock_report_disclosureResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_report_disclosureResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_shou3ci4yu4yue1 <- c.downField("首次预约").as[String]

        p_chu1ci4bian4geng4 <- c.downField("初次变更").as[String]

        p_er4ci4bian4geng4 <- c.downField("二次变更").as[String]

        p_san1ci4bian4geng4 <- c.downField("三次变更").as[String]

        p_shi2ji4pi1lu4 <- c.downField("实际披露").as[String]

      } yield {
        stock_report_disclosureResponse(
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_shou3ci4yu4yue1,
          p_chu1ci4bian4geng4,
          p_er4ci4bian4geng4,
          p_san1ci4bian4geng4,
          p_shi2ji4pi1lu4
        )
      }
  }

}

object JsonItem_stock_report_disclosureResponse extends Json_stock_report_disclosureResponse
