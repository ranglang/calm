package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_industry_change_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_industry_change_cninfo 目标地址: http://webapi.cninfo.com.cn/#/apiDoc 描述:
  * 巨潮资讯-数据-上市公司行业归属的变动情况 限量: 单次获取指定 symbol 在 start_date 和 end_date 之间的上市公司行业归属的变动情况数据
  */
case class Respstock_industry_change_cninfoResponse(
  `p_xin1zheng4quan4jian3cheng1`: String,
  `p_xing2ye4zhong1lei4`: String,
  `p_xing2ye4da4lei4`: String,
  `p_xing2ye4ci4lei4`: String,
  `p_xing2ye4men2lei4`: String,
  `p_ji1gou4ming2cheng1`: String,
  `p_xing2ye4bian1ma3`: String,
  `p_fen1lei4biao1zhun3`: String,
  `p_fen1lei4biao1zhun3bian1ma3`: String,
  `p_zheng4quan4dai4ma3`: String,
  `p_bian4geng4ri4qi1`: String
)

case class stock_industry_change_cninfoResponse(
  `p_xin1zheng4quan4jian3cheng1`: String,
  `p_xing2ye4zhong1lei4`: String,
  `p_xing2ye4da4lei4`: String,
  `p_xing2ye4ci4lei4`: String,
  `p_xing2ye4men2lei4`: String,
  `p_ji1gou4ming2cheng1`: String,
  `p_xing2ye4bian1ma3`: String,
  `p_fen1lei4biao1zhun3`: String,
  `p_fen1lei4biao1zhun3bian1ma3`: String,
  `p_zheng4quan4dai4ma3`: String,
  `p_bian4geng4ri4qi1`: String
)

trait Json_stock_industry_change_cninfoResponse {

  implicit val a_stock_industry_change_cninfoResponse =
    new Decoder[stock_industry_change_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_industry_change_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xin1zheng4quan4jian3cheng1 <- c.downField("新证券简称").as[String]

          p_xing2ye4zhong1lei4 <- c.downField("行业中类").as[String]

          p_xing2ye4da4lei4 <- c.downField("行业大类").as[String]

          p_xing2ye4ci4lei4 <- c.downField("行业次类").as[String]

          p_xing2ye4men2lei4 <- c.downField("行业门类").as[String]

          p_ji1gou4ming2cheng1 <- c.downField("机构名称").as[String]

          p_xing2ye4bian1ma3 <- c.downField("行业编码").as[String]

          p_fen1lei4biao1zhun3 <- c.downField("分类标准").as[String]

          p_fen1lei4biao1zhun3bian1ma3 <- c.downField("分类标准编码").as[String]

          p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

          p_bian4geng4ri4qi1 <- c.downField("变更日期").as[String]

        } yield {
          stock_industry_change_cninfoResponse(
            p_xin1zheng4quan4jian3cheng1,
            p_xing2ye4zhong1lei4,
            p_xing2ye4da4lei4,
            p_xing2ye4ci4lei4,
            p_xing2ye4men2lei4,
            p_ji1gou4ming2cheng1,
            p_xing2ye4bian1ma3,
            p_fen1lei4biao1zhun3,
            p_fen1lei4biao1zhun3bian1ma3,
            p_zheng4quan4dai4ma3,
            p_bian4geng4ri4qi1
          )
        }
    }

}

object JsonItem_stock_industry_change_cninfoResponse
    extends Json_stock_industry_change_cninfoResponse
