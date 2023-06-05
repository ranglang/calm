package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_risk_analysis_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_risk_analysis_em 目标地址: https://data.eastmoney.com/other/riskanal.html 描述:
  * 东方财富网-数据中心-特色数据-期权风险分析 限量: 单次返回所有数据
  */
case class Respoption_risk_analysis_emResponse(
  `p_qi1quan2dai4ma3`: String,
  `p_qi1quan2ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_gang1gan1bi3lu4`: Double,
  `p_shi2ji4gang1gan1bi3lu4`: Double,
  `p_Delta`: Double,
  `p_Gamma`: Double,
  `p_Vega`: Double,
  `p_Rho`: Double,
  `p_Theta`: Double,
  `p_dao4qi1ri4`: String
)

case class option_risk_analysis_emResponse(
  `p_qi1quan2dai4ma3`: String,
  `p_qi1quan2ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_gang1gan1bi3lu4`: Double,
  `p_shi2ji4gang1gan1bi3lu4`: Double,
  `p_Delta`: Double,
  `p_Gamma`: Double,
  `p_Vega`: Double,
  `p_Rho`: Double,
  `p_Theta`: Double,
  `p_dao4qi1ri4`: String
)

trait Json_option_risk_analysis_emResponse {

  implicit val a_option_risk_analysis_emResponse = new Decoder[option_risk_analysis_emResponse] {
    final def apply(c: HCursor): Decoder.Result[option_risk_analysis_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_qi1quan2dai4ma3 <- c.downField("期权代码").as[String]

        p_qi1quan2ming2cheng1 <- c.downField("期权名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_gang1gan1bi3lu4 <- c.downField("杠杆比率").as[Double]

        p_shi2ji4gang1gan1bi3lu4 <- c.downField("实际杠杆比率").as[Double]

        p_Delta <- c.downField("Delta").as[Double]

        p_Gamma <- c.downField("Gamma").as[Double]

        p_Vega <- c.downField("Vega").as[Double]

        p_Rho <- c.downField("Rho").as[Double]

        p_Theta <- c.downField("Theta").as[Double]

        p_dao4qi1ri4 <- c.downField("到期日").as[String]

      } yield {
        option_risk_analysis_emResponse(
          p_qi1quan2dai4ma3,
          p_qi1quan2ming2cheng1,
          p_zui4xin1jia4,
          p_zhang3die1fu2,
          p_gang1gan1bi3lu4,
          p_shi2ji4gang1gan1bi3lu4,
          p_Delta,
          p_Gamma,
          p_Vega,
          p_Rho,
          p_Theta,
          p_dao4qi1ri4
        )
      }
  }

}

object JsonItem_option_risk_analysis_emResponse extends Json_option_risk_analysis_emResponse
