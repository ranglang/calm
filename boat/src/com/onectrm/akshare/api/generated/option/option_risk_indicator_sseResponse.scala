package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_risk_indicator_sseResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_risk_indicator_sse 目标地址: http://www.sse.com.cn/assortment/options/risk/
  * 描述: 上海证券交易所-产品-股票期权-期权风险指标数据 限量: 单次返回指定 date 的数据
  */
case class Respoption_risk_indicator_sseResponse(
  `p_TRADEDATE`: String,
  `p_SECURITYID`: String,
  `p_CONTRACTID`: String,
  `p_CONTRACTSYMBOL`: String,
  `p_DELTAVALUE`: Double,
  `p_THETAVALUE`: Double,
  `p_GAMMAVALUE`: Double,
  `p_VEGAVALUE`: Double,
  `p_RHOVALUE`: Double,
  `p_IMPLCVOLATLTY`: Double
)

case class option_risk_indicator_sseResponse(
  `p_TRADEDATE`: String,
  `p_SECURITYID`: String,
  `p_CONTRACTID`: String,
  `p_CONTRACTSYMBOL`: String,
  `p_DELTAVALUE`: Double,
  `p_THETAVALUE`: Double,
  `p_GAMMAVALUE`: Double,
  `p_VEGAVALUE`: Double,
  `p_RHOVALUE`: Double,
  `p_IMPLCVOLATLTY`: Double
)

trait Json_option_risk_indicator_sseResponse {

  implicit val a_option_risk_indicator_sseResponse =
    new Decoder[option_risk_indicator_sseResponse] {
      final def apply(c: HCursor): Decoder.Result[option_risk_indicator_sseResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_TRADEDATE <- c.downField("TRADE_DATE").as[String]

          p_SECURITYID <- c.downField("SECURITY_ID").as[String]

          p_CONTRACTID <- c.downField("CONTRACT_ID").as[String]

          p_CONTRACTSYMBOL <- c.downField("CONTRACT_SYMBOL").as[String]

          p_DELTAVALUE <- c.downField("DELTA_VALUE").as[Double]

          p_THETAVALUE <- c.downField("THETA_VALUE").as[Double]

          p_GAMMAVALUE <- c.downField("GAMMA_VALUE").as[Double]

          p_VEGAVALUE <- c.downField("VEGA_VALUE").as[Double]

          p_RHOVALUE <- c.downField("RHO_VALUE").as[Double]

          p_IMPLCVOLATLTY <- c.downField("IMPLC_VOLATLTY").as[Double]

        } yield {
          option_risk_indicator_sseResponse(
            p_TRADEDATE,
            p_SECURITYID,
            p_CONTRACTID,
            p_CONTRACTSYMBOL,
            p_DELTAVALUE,
            p_THETAVALUE,
            p_GAMMAVALUE,
            p_VEGAVALUE,
            p_RHOVALUE,
            p_IMPLCVOLATLTY
          )
        }
    }

}

object JsonItem_option_risk_indicator_sseResponse extends Json_option_risk_indicator_sseResponse
