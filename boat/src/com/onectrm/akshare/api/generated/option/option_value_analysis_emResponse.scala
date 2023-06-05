package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_value_analysis_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_value_analysis_em 目标地址: https://data.eastmoney.com/other/valueAnal.html
  * 描述: 东方财富网-数据中心-特色数据-期权价值分析 限量: 单次返回所有数据
  */
case class Respoption_value_analysis_emResponse(
  `p_qi1quan2dai4ma3`: String,
  `p_qi1quan2ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_shi2jian1jia4zhi2`: Double,
  `p_nei4zai4jia4zhi2`: Double,
  `p_yin3han2bo1dong4lu4`: Double,
  `p_li3lun4jia4ge2`: Double,
  `p_biao1de5ming2cheng1`: String,
  `p_biao1de5zui4xin1jia4`: Double,
  `p_biao1de5jin4yi1nian2bo1dong4lu4`: Double,
  `p_dao4qi1ri4`: String
)

case class option_value_analysis_emResponse(
  `p_qi1quan2dai4ma3`: String,
  `p_qi1quan2ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_shi2jian1jia4zhi2`: Double,
  `p_nei4zai4jia4zhi2`: Double,
  `p_yin3han2bo1dong4lu4`: Double,
  `p_li3lun4jia4ge2`: Double,
  `p_biao1de5ming2cheng1`: String,
  `p_biao1de5zui4xin1jia4`: Double,
  `p_biao1de5jin4yi1nian2bo1dong4lu4`: Double,
  `p_dao4qi1ri4`: String
)

trait Json_option_value_analysis_emResponse {

  implicit val a_option_value_analysis_emResponse = new Decoder[option_value_analysis_emResponse] {
    final def apply(c: HCursor): Decoder.Result[option_value_analysis_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_qi1quan2dai4ma3 <- c.downField("期权代码").as[String]

        p_qi1quan2ming2cheng1 <- c.downField("期权名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_shi2jian1jia4zhi2 <- c.downField("时间价值").as[Double]

        p_nei4zai4jia4zhi2 <- c.downField("内在价值").as[Double]

        p_yin3han2bo1dong4lu4 <- c.downField("隐含波动率").as[Double]

        p_li3lun4jia4ge2 <- c.downField("理论价格").as[Double]

        p_biao1de5ming2cheng1 <- c.downField("标的名称").as[String]

        p_biao1de5zui4xin1jia4 <- c.downField("标的最新价").as[Double]

        p_biao1de5jin4yi1nian2bo1dong4lu4 <- c.downField("标的近一年波动率").as[Double]

        p_dao4qi1ri4 <- c.downField("到期日").as[String]

      } yield {
        option_value_analysis_emResponse(
          p_qi1quan2dai4ma3,
          p_qi1quan2ming2cheng1,
          p_zui4xin1jia4,
          p_shi2jian1jia4zhi2,
          p_nei4zai4jia4zhi2,
          p_yin3han2bo1dong4lu4,
          p_li3lun4jia4ge2,
          p_biao1de5ming2cheng1,
          p_biao1de5zui4xin1jia4,
          p_biao1de5jin4yi1nian2bo1dong4lu4,
          p_dao4qi1ri4
        )
      }
  }

}

object JsonItem_option_value_analysis_emResponse extends Json_option_value_analysis_emResponse
