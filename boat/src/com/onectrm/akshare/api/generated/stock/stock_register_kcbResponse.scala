package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_register_kcbResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_register_kcb 目标地址: https://data.eastmoney.com/zcz/ 描述:
  * 东方财富网-数据中心-新股数据-注册制审核-科创板 限量: 单次返回所有历史数据
  */
case class Respstock_register_kcbResponse(
  `p_xu4hao4`: Integer,
  `p_fa1xing2ren2quan2cheng1`: String,
  `p_shen3he2zhuang4tai4`: String,
  `p_zhu4ce4di4`: String,
  `p_zheng4jian1hui4xing2ye4`: String,
  `p_bao3jian4ji1gou4`: String,
  `p_lu4shi1shi4wu4suo3`: String,
  `p_hui4ji4shi1shi4wu4suo3`: String,
  `p_geng4xin1ri4qi1`: String,
  `p_shou4li3ri4qi1`: String,
  `p_ni3shang4shi4di4dian3`: String
)

case class stock_register_kcbResponse(
  `p_xu4hao4`: Integer,
  `p_fa1xing2ren2quan2cheng1`: String,
  `p_shen3he2zhuang4tai4`: String,
  `p_zhu4ce4di4`: String,
  `p_zheng4jian1hui4xing2ye4`: String,
  `p_bao3jian4ji1gou4`: String,
  `p_lu4shi1shi4wu4suo3`: String,
  `p_hui4ji4shi1shi4wu4suo3`: String,
  `p_geng4xin1ri4qi1`: String,
  `p_shou4li3ri4qi1`: String,
  `p_ni3shang4shi4di4dian3`: String
)

trait Json_stock_register_kcbResponse {

  implicit val a_stock_register_kcbResponse = new Decoder[stock_register_kcbResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_register_kcbResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_fa1xing2ren2quan2cheng1 <- c.downField("发行人全称").as[String]

        p_shen3he2zhuang4tai4 <- c.downField("审核状态").as[String]

        p_zhu4ce4di4 <- c.downField("注册地").as[String]

        p_zheng4jian1hui4xing2ye4 <- c.downField("证监会行业").as[String]

        p_bao3jian4ji1gou4 <- c.downField("保荐机构").as[String]

        p_lu4shi1shi4wu4suo3 <- c.downField("律师事务所").as[String]

        p_hui4ji4shi1shi4wu4suo3 <- c.downField("会计师事务所").as[String]

        p_geng4xin1ri4qi1 <- c.downField("更新日期").as[String]

        p_shou4li3ri4qi1 <- c.downField("受理日期").as[String]

        p_ni3shang4shi4di4dian3 <- c.downField("拟上市地点").as[String]

      } yield {
        stock_register_kcbResponse(
          p_xu4hao4,
          p_fa1xing2ren2quan2cheng1,
          p_shen3he2zhuang4tai4,
          p_zhu4ce4di4,
          p_zheng4jian1hui4xing2ye4,
          p_bao3jian4ji1gou4,
          p_lu4shi1shi4wu4suo3,
          p_hui4ji4shi1shi4wu4suo3,
          p_geng4xin1ri4qi1,
          p_shou4li3ri4qi1,
          p_ni3shang4shi4di4dian3
        )
      }
  }

}

object JsonItem_stock_register_kcbResponse extends Json_stock_register_kcbResponse
