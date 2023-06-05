package com.onectrm.akshare.api.generated.dc;

import com.onectrm.akshare.api.generated.dc.crypto_bitcoin_cmeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: dc 接口: crypto_bitcoin_cme 目标地址: https://datacenter.jin10.com/reportType/dc_cme_btc_report
  * 描述: 获取芝加哥商业交易所-比特币成交量报告 限量: 单次返回指定交易日的比特币成交量报告数据
  */
case class Respcrypto_bitcoin_cmeResponse(
  `p_shang1pin3`: String,
  `p_lei4xing2`: String,
  `p_dian4zi5jiao1yi4he2yue1`: Integer,
  `p_chang3nei4cheng2jiao1he2yue1`: Integer,
  `p_chang3wai4cheng2jiao1he2yue1`: Integer,
  `p_cheng2jiao1liang4`: Integer,
  `p_wei4ping2cang1he2yue1`: Integer,
  `p_chi2cang1bian4hua4`: Integer
)

case class crypto_bitcoin_cmeResponse(
  `p_shang1pin3`: String,
  `p_lei4xing2`: String,
  `p_dian4zi5jiao1yi4he2yue1`: Integer,
  `p_chang3nei4cheng2jiao1he2yue1`: Integer,
  `p_chang3wai4cheng2jiao1he2yue1`: Integer,
  `p_cheng2jiao1liang4`: Integer,
  `p_wei4ping2cang1he2yue1`: Integer,
  `p_chi2cang1bian4hua4`: Integer
)

trait Json_crypto_bitcoin_cmeResponse {

  implicit val a_crypto_bitcoin_cmeResponse = new Decoder[crypto_bitcoin_cmeResponse] {
    final def apply(c: HCursor): Decoder.Result[crypto_bitcoin_cmeResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shang1pin3 <- c.downField("商品").as[String]

        p_lei4xing2 <- c.downField("类型").as[String]

        p_dian4zi5jiao1yi4he2yue1 <- c.downField("电子交易合约").as[Integer]

        p_chang3nei4cheng2jiao1he2yue1 <- c.downField("场内成交合约").as[Integer]

        p_chang3wai4cheng2jiao1he2yue1 <- c.downField("场外成交合约").as[Integer]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Integer]

        p_wei4ping2cang1he2yue1 <- c.downField("未平仓合约").as[Integer]

        p_chi2cang1bian4hua4 <- c.downField("持仓变化").as[Integer]

      } yield {
        crypto_bitcoin_cmeResponse(
          p_shang1pin3,
          p_lei4xing2,
          p_dian4zi5jiao1yi4he2yue1,
          p_chang3nei4cheng2jiao1he2yue1,
          p_chang3wai4cheng2jiao1he2yue1,
          p_cheng2jiao1liang4,
          p_wei4ping2cang1he2yue1,
          p_chi2cang1bian4hua4
        )
      }
  }

}

object JsonItem_crypto_bitcoin_cmeResponse extends Json_crypto_bitcoin_cmeResponse
