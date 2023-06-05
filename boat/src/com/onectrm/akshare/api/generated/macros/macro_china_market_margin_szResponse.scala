package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_market_margin_szResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_market_margin_sz 目标地址:
  * https://datacenter.jin10.com/reportType/dc_market_margin_sz 描述: 获取深圳融资融券报告, 数据区间从20100331-至今 限量:
  * 单次返回所有历史数据
  */
case class Respmacro_china_market_margin_szResponse(
  `p_ri4qi1`: String,
  `p_rong2zi1mai3ru4e2yuan2`: Double,
  `p_rong2zi1yu2e2yuan2`: Double,
  `p_rong2quan4mai4chu1liang4gu3`: Double,
  `p_rong2quan4yu2liang4gu3`: Double,
  `p_rong2quan4yu2e2yuan2`: Double,
  `p_rong2zi1rong2quan4yu2e2yuan2`: Double
)

case class macro_china_market_margin_szResponse(
  `p_ri4qi1`: String,
  `p_rong2zi1mai3ru4e2yuan2`: Double,
  `p_rong2zi1yu2e2yuan2`: Double,
  `p_rong2quan4mai4chu1liang4gu3`: Double,
  `p_rong2quan4yu2liang4gu3`: Double,
  `p_rong2quan4yu2e2yuan2`: Double,
  `p_rong2zi1rong2quan4yu2e2yuan2`: Double
)

trait Json_macro_china_market_margin_szResponse {

  implicit val a_macro_china_market_margin_szResponse =
    new Decoder[macro_china_market_margin_szResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_market_margin_szResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_rong2zi1mai3ru4e2yuan2 <- c.downField("融资买入额(元)").as[Double]

          p_rong2zi1yu2e2yuan2 <- c.downField("融资余额(元)").as[Double]

          p_rong2quan4mai4chu1liang4gu3 <- c.downField("融券卖出量(股)").as[Double]

          p_rong2quan4yu2liang4gu3 <- c.downField("融券余量(股)").as[Double]

          p_rong2quan4yu2e2yuan2 <- c.downField("融券余额(元)").as[Double]

          p_rong2zi1rong2quan4yu2e2yuan2 <- c.downField("融资融券余额(元)").as[Double]

        } yield {
          macro_china_market_margin_szResponse(
            p_ri4qi1,
            p_rong2zi1mai3ru4e2yuan2,
            p_rong2zi1yu2e2yuan2,
            p_rong2quan4mai4chu1liang4gu3,
            p_rong2quan4yu2liang4gu3,
            p_rong2quan4yu2e2yuan2,
            p_rong2zi1rong2quan4yu2e2yuan2
          )
        }
    }

}

object JsonItem_macro_china_market_margin_szResponse
    extends Json_macro_china_market_margin_szResponse
