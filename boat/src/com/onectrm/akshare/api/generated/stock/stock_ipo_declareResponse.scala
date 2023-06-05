package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_ipo_declareResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_ipo_declare 目标地址: https://data.eastmoney.com/xg/xg/sbqy.html 描述:
  * 东方财富网-数据中心-新股申购-首发申报信息-首发申报企业信息 限量: 单次返回所有历史数据
  */
case class Respstock_ipo_declareResponse(
  `p_xu4hao4`: Integer,
  `p_shen1bao4qi3ye4`: String,
  `p_ni3shang4shi4di4`: String,
  `p_bao3jian4ji1gou4`: String,
  `p_hui4ji4shi1shi4wu4suo3`: String,
  `p_lu4shi1shi4wu4suo3`: String,
  `p_bei4zhu4`: String
)

case class stock_ipo_declareResponse(
  `p_xu4hao4`: Integer,
  `p_shen1bao4qi3ye4`: String,
  `p_ni3shang4shi4di4`: String,
  `p_bao3jian4ji1gou4`: String,
  `p_hui4ji4shi1shi4wu4suo3`: String,
  `p_lu4shi1shi4wu4suo3`: String,
  `p_bei4zhu4`: String
)

trait Json_stock_ipo_declareResponse {

  implicit val a_stock_ipo_declareResponse = new Decoder[stock_ipo_declareResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_ipo_declareResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_shen1bao4qi3ye4 <- c.downField("申报企业").as[String]

        p_ni3shang4shi4di4 <- c.downField("拟上市地").as[String]

        p_bao3jian4ji1gou4 <- c.downField("保荐机构").as[String]

        p_hui4ji4shi1shi4wu4suo3 <- c.downField("会计师事务所").as[String]

        p_lu4shi1shi4wu4suo3 <- c.downField("律师事务所").as[String]

        p_bei4zhu4 <- c.downField("备注").as[String]

      } yield {
        stock_ipo_declareResponse(
          p_xu4hao4,
          p_shen1bao4qi3ye4,
          p_ni3shang4shi4di4,
          p_bao3jian4ji1gou4,
          p_hui4ji4shi1shi4wu4suo3,
          p_lu4shi1shi4wu4suo3,
          p_bei4zhu4
        )
      }
  }

}

object JsonItem_stock_ipo_declareResponse extends Json_stock_ipo_declareResponse
