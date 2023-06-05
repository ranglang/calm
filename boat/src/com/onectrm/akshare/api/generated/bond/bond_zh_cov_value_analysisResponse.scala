package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_zh_cov_value_analysisResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_zh_cov_value_analysis 目标地址: https://data.eastmoney.com/kzz/detail/113527.html
  * 描述: 东方财富网-行情中心-新股数据-可转债数据-可转债溢价率分析 限量: 单次返回所有可转债溢价率分析数据
  */
case class Respbond_zh_cov_value_analysisResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2jia4`: Double,
  `p_chun2zhai4jia4zhi2`: Double,
  `p_zhuan3gu3jia4zhi2`: Double,
  `p_chun2zhai4yi4jia4lu4`: Double,
  `p_zhuan3gu3yi4jia4lu4`: Double
)

case class bond_zh_cov_value_analysisResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2jia4`: Double,
  `p_chun2zhai4jia4zhi2`: Double,
  `p_zhuan3gu3jia4zhi2`: Double,
  `p_chun2zhai4yi4jia4lu4`: Double,
  `p_zhuan3gu3yi4jia4lu4`: Double
)

trait Json_bond_zh_cov_value_analysisResponse {

  implicit val a_bond_zh_cov_value_analysisResponse =
    new Decoder[bond_zh_cov_value_analysisResponse] {
      final def apply(c: HCursor): Decoder.Result[bond_zh_cov_value_analysisResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

          p_chun2zhai4jia4zhi2 <- c.downField("纯债价值").as[Double]

          p_zhuan3gu3jia4zhi2 <- c.downField("转股价值").as[Double]

          p_chun2zhai4yi4jia4lu4 <- c.downField("纯债溢价率").as[Double]

          p_zhuan3gu3yi4jia4lu4 <- c.downField("转股溢价率").as[Double]

        } yield {
          bond_zh_cov_value_analysisResponse(
            p_ri4qi1,
            p_shou1pan2jia4,
            p_chun2zhai4jia4zhi2,
            p_zhuan3gu3jia4zhi2,
            p_chun2zhai4yi4jia4lu4,
            p_zhuan3gu3yi4jia4lu4
          )
        }
    }

}

object JsonItem_bond_zh_cov_value_analysisResponse extends Json_bond_zh_cov_value_analysisResponse
