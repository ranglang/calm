package com.onectrm.akshare.api.generated.dc;

import com.onectrm.akshare.api.generated.dc.crypto_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: dc 接口: crypto_hist 目标地址: https://cn.investing.com/crypto/ethereum/historical-data 描述:
  * 加密货币的历史数据主要是日频, 周频和月频的数据; 该接口需要通过代理访问 限量: 单次返回指定加密货币, 频率和时间周期的数据
  */
case class Respcrypto_histResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_jiao1yi4liang4`: Double,
  `p_zhang3die1fu2`: Double
)

case class crypto_histResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_jiao1yi4liang4`: Double,
  `p_zhang3die1fu2`: Double
)

trait Json_crypto_histResponse {

  implicit val a_crypto_histResponse = new Decoder[crypto_histResponse] {
    final def apply(c: HCursor): Decoder.Result[crypto_histResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_shou1pan2 <- c.downField("收盘").as[Double]

        p_kai1pan2 <- c.downField("开盘").as[Double]

        p_gao1 <- c.downField("高").as[Double]

        p_di1 <- c.downField("低").as[Double]

        p_jiao1yi4liang4 <- c.downField("交易量").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

      } yield {
        crypto_histResponse(
          p_ri4qi1,
          p_shou1pan2,
          p_kai1pan2,
          p_gao1,
          p_di1,
          p_jiao1yi4liang4,
          p_zhang3die1fu2
        )
      }
  }

}

object JsonItem_crypto_histResponse extends Json_crypto_histResponse
