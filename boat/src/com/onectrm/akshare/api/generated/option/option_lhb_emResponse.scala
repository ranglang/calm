package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_lhb_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_lhb_em 目标地址: https://data.eastmoney.com/other/qqlhb.html 描述:
  * 东方财富网-数据中心-特色数据-期权龙虎榜单-金融期权 限量: 单次返回指定 symbol, indicator 和 trade_date 的所有数据
  */
case class Respoption_lhb_emResponse(
  `p_jiao1yi4lei4xing2`: String,
  `p_jiao1yi4ri4qi1`: String,
  `p_zheng4quan4dai4ma3`: String,
  `p_biao1de5ming2cheng1`: String,
  `p_ming2ci4`: Double,
  `p_ji1gou4`: String,
  `p_XXliang4`: Double,
  `p_zeng1jian3`: Double,
  `p_jing4XXliang4`: Double,
  `p_zhan4zong3jiao1yi4liang4bi3li4`: Double
)

case class option_lhb_emResponse(
  `p_jiao1yi4lei4xing2`: String,
  `p_jiao1yi4ri4qi1`: String,
  `p_zheng4quan4dai4ma3`: String,
  `p_biao1de5ming2cheng1`: String,
  `p_ming2ci4`: Double,
  `p_ji1gou4`: String,
  `p_XXliang4`: Double,
  `p_zeng1jian3`: Double,
  `p_jing4XXliang4`: Double,
  `p_zhan4zong3jiao1yi4liang4bi3li4`: Double
)

trait Json_option_lhb_emResponse {

  implicit val a_option_lhb_emResponse = new Decoder[option_lhb_emResponse] {
    final def apply(c: HCursor): Decoder.Result[option_lhb_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jiao1yi4lei4xing2 <- c.downField("交易类型").as[String]

        p_jiao1yi4ri4qi1 <- c.downField("交易日期").as[String]

        p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

        p_biao1de5ming2cheng1 <- c.downField("标的名称").as[String]

        p_ming2ci4 <- c.downField("名次").as[Double]

        p_ji1gou4 <- c.downField("机构").as[String]

        p_XXliang4 <- c.downField("XX量").as[Double]

        p_zeng1jian3 <- c.downField("增减").as[Double]

        p_jing4XXliang4 <- c.downField("净XX量").as[Double]

        p_zhan4zong3jiao1yi4liang4bi3li4 <- c.downField("占总交易量比例").as[Double]

      } yield {
        option_lhb_emResponse(
          p_jiao1yi4lei4xing2,
          p_jiao1yi4ri4qi1,
          p_zheng4quan4dai4ma3,
          p_biao1de5ming2cheng1,
          p_ming2ci4,
          p_ji1gou4,
          p_XXliang4,
          p_zeng1jian3,
          p_jing4XXliang4,
          p_zhan4zong3jiao1yi4liang4bi3li4
        )
      }
  }

}

object JsonItem_option_lhb_emResponse extends Json_option_lhb_emResponse
