package com.onectrm.akshare.api.generated.dc;

import com.onectrm.akshare.api.generated.dc.crypto_js_spotResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: dc 接口: crypto_js_spot 目标地址: https://datacenter.jin10.com/reportType/dc_bitcoin_current 描述:
  * 加密货币实时行情 限量: 单次返回主流加密货币当前时点行情数据
  */
case class Respcrypto_js_spotResponse(
  `p_shi4chang3`: String,
  `p_jiao1yi4pin3zhong3`: String,
  `p_zui4jin4bao4jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_24xiao3shi2zui4gao1`: Double,
  `p_24xiao3shi2zui4di1`: Double,
  `p_24xiao3shi2cheng2jiao1liang4`: Double,
  `p_geng4xin1shi2jian1`: Double
)

case class crypto_js_spotResponse(
  `p_shi4chang3`: String,
  `p_jiao1yi4pin3zhong3`: String,
  `p_zui4jin4bao4jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_24xiao3shi2zui4gao1`: Double,
  `p_24xiao3shi2zui4di1`: Double,
  `p_24xiao3shi2cheng2jiao1liang4`: Double,
  `p_geng4xin1shi2jian1`: Double
)

trait Json_crypto_js_spotResponse {

  implicit val a_crypto_js_spotResponse = new Decoder[crypto_js_spotResponse] {
    final def apply(c: HCursor): Decoder.Result[crypto_js_spotResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi4chang3 <- c.downField("市场").as[String]

        p_jiao1yi4pin3zhong3 <- c.downField("交易品种").as[String]

        p_zui4jin4bao4jia4 <- c.downField("最近报价").as[Double]

        p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_24xiao3shi2zui4gao1 <- c.downField("24小时最高").as[Double]

        p_24xiao3shi2zui4di1 <- c.downField("24小时最低").as[Double]

        p_24xiao3shi2cheng2jiao1liang4 <- c.downField("24小时成交量").as[Double]

        p_geng4xin1shi2jian1 <- c.downField("更新时间").as[Double]

      } yield {
        crypto_js_spotResponse(
          p_shi4chang3,
          p_jiao1yi4pin3zhong3,
          p_zui4jin4bao4jia4,
          p_zhang3die1e2,
          p_zhang3die1fu2,
          p_24xiao3shi2zui4gao1,
          p_24xiao3shi2zui4di1,
          p_24xiao3shi2cheng2jiao1liang4,
          p_geng4xin1shi2jian1
        )
      }
  }

}

object JsonItem_crypto_js_spotResponse extends Json_crypto_js_spotResponse
