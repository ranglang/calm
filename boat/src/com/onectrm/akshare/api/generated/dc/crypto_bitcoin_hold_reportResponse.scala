package com.onectrm.akshare.api.generated.dc;

import com.onectrm.akshare.api.generated.dc.crypto_bitcoin_hold_reportResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: dc 接口: crypto_bitcoin_hold_report 目标地址:
  * https://datacenter.jin10.com/dc_report?name=bitcoint 描述: 获取比特币持仓报告 限量: 单次返回当前时点的比特币持仓报告数据
  */
case class Respcrypto_bitcoin_hold_reportResponse(
  `p_dai4ma3`: String,
  `p_gong1si1ming2cheng1ying1wen2`: Double,
  `p_gong1si1ming2cheng1zhong1wen2`: String,
  `p_guo2jia1di4qu1`: Double,
  `p_shi4zhi2`: String,
  `p_bi3te4bi4zhan4shi4zhi2bi3zhong4`: Double,
  `p_chi2cang1cheng2ben3`: String,
  `p_chi2cang1zhan4bi3`: Double,
  `p_chi2cang1liang4`: String,
  `p_dang1ri4chi2cang1shi4zhi2`: String,
  `p_cha2xun2ri4qi1`: String,
  `p_gong1gao4lian4jie1`: String,
  `p_fen1lei4`: String,
  `p_bei4shu4`: String
)

case class crypto_bitcoin_hold_reportResponse(
  `p_dai4ma3`: String,
  `p_gong1si1ming2cheng1ying1wen2`: Double,
  `p_gong1si1ming2cheng1zhong1wen2`: String,
  `p_guo2jia1di4qu1`: Double,
  `p_shi4zhi2`: String,
  `p_bi3te4bi4zhan4shi4zhi2bi3zhong4`: Double,
  `p_chi2cang1cheng2ben3`: String,
  `p_chi2cang1zhan4bi3`: Double,
  `p_chi2cang1liang4`: String,
  `p_dang1ri4chi2cang1shi4zhi2`: String,
  `p_cha2xun2ri4qi1`: String,
  `p_gong1gao4lian4jie1`: String,
  `p_fen1lei4`: String,
  `p_bei4shu4`: String
)

trait Json_crypto_bitcoin_hold_reportResponse {

  implicit val a_crypto_bitcoin_hold_reportResponse =
    new Decoder[crypto_bitcoin_hold_reportResponse] {
      final def apply(c: HCursor): Decoder.Result[crypto_bitcoin_hold_reportResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_dai4ma3 <- c.downField("代码").as[String]

          p_gong1si1ming2cheng1ying1wen2 <- c.downField("公司名称-英文").as[Double]

          p_gong1si1ming2cheng1zhong1wen2 <- c.downField("公司名称-中文").as[String]

          p_guo2jia1di4qu1 <- c.downField("国家/地区").as[Double]

          p_shi4zhi2 <- c.downField("市值").as[String]

          p_bi3te4bi4zhan4shi4zhi2bi3zhong4 <- c.downField("比特币占市值比重").as[Double]

          p_chi2cang1cheng2ben3 <- c.downField("持仓成本").as[String]

          p_chi2cang1zhan4bi3 <- c.downField("持仓占比").as[Double]

          p_chi2cang1liang4 <- c.downField("持仓量").as[String]

          p_dang1ri4chi2cang1shi4zhi2 <- c.downField("当日持仓市值").as[String]

          p_cha2xun2ri4qi1 <- c.downField("查询日期").as[String]

          p_gong1gao4lian4jie1 <- c.downField("公告链接").as[String]

          p_fen1lei4 <- c.downField("分类").as[String]

          p_bei4shu4 <- c.downField("倍数").as[String]

        } yield {
          crypto_bitcoin_hold_reportResponse(
            p_dai4ma3,
            p_gong1si1ming2cheng1ying1wen2,
            p_gong1si1ming2cheng1zhong1wen2,
            p_guo2jia1di4qu1,
            p_shi4zhi2,
            p_bi3te4bi4zhan4shi4zhi2bi3zhong4,
            p_chi2cang1cheng2ben3,
            p_chi2cang1zhan4bi3,
            p_chi2cang1liang4,
            p_dang1ri4chi2cang1shi4zhi2,
            p_cha2xun2ri4qi1,
            p_gong1gao4lian4jie1,
            p_fen1lei4,
            p_bei4shu4
          )
        }
    }

}

object JsonItem_crypto_bitcoin_hold_reportResponse extends Json_crypto_bitcoin_hold_reportResponse
