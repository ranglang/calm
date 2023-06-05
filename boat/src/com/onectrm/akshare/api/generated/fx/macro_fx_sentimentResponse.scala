package com.onectrm.akshare.api.generated.fx;

import com.onectrm.akshare.api.generated.fx.macro_fx_sentimentResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fx 接口: macro_fx_sentiment 目标地址: https://datacenter.jin10.com/reportType/dc_ssi_trends 描述:
  * 获取货币对-投机情绪报告 限量: 单次返回指定日期所有品种的数据(所指定的日期必须在当前交易日之前的30个交易日内)
  */
case class Respmacro_fx_sentimentResponse(
  `p_ri4qi1suo3yin3`: String,
  `p_AUDJPY`: String,
  `p_AUDUSD`: String,
  `p_EURAUD`: String,
  `p_EURJPY`: String,
  `p_EURUSD`: String,
  `p_GBPJPY`: String,
  `p_GBPUSD`: String,
  `p_NZDUSD`: String,
  `p_USDCAD`: String,
  `p_USDCHF`: String,
  `p_USDJPY`: String,
  `p_USDX`: String,
  `p_XAUUSD`: String
)

case class macro_fx_sentimentResponse(
  `p_ri4qi1suo3yin3`: String,
  `p_AUDJPY`: String,
  `p_AUDUSD`: String,
  `p_EURAUD`: String,
  `p_EURJPY`: String,
  `p_EURUSD`: String,
  `p_GBPJPY`: String,
  `p_GBPUSD`: String,
  `p_NZDUSD`: String,
  `p_USDCAD`: String,
  `p_USDCHF`: String,
  `p_USDJPY`: String,
  `p_USDX`: String,
  `p_XAUUSD`: String
)

trait Json_macro_fx_sentimentResponse {

  implicit val a_macro_fx_sentimentResponse = new Decoder[macro_fx_sentimentResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_fx_sentimentResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1suo3yin3 <- c.downField("日期索引").as[String]

        p_AUDJPY <- c.downField("AUDJPY").as[String]

        p_AUDUSD <- c.downField("AUDUSD").as[String]

        p_EURAUD <- c.downField("EURAUD").as[String]

        p_EURJPY <- c.downField("EURJPY").as[String]

        p_EURUSD <- c.downField("EURUSD").as[String]

        p_GBPJPY <- c.downField("GBPJPY").as[String]

        p_GBPUSD <- c.downField("GBPUSD").as[String]

        p_NZDUSD <- c.downField("NZDUSD").as[String]

        p_USDCAD <- c.downField("USDCAD").as[String]

        p_USDCHF <- c.downField("USDCHF").as[String]

        p_USDJPY <- c.downField("USDJPY").as[String]

        p_USDX <- c.downField("USDX").as[String]

        p_XAUUSD <- c.downField("XAUUSD").as[String]

      } yield {
        macro_fx_sentimentResponse(
          p_ri4qi1suo3yin3,
          p_AUDJPY,
          p_AUDUSD,
          p_EURAUD,
          p_EURJPY,
          p_EURUSD,
          p_GBPJPY,
          p_GBPUSD,
          p_NZDUSD,
          p_USDCAD,
          p_USDCHF,
          p_USDJPY,
          p_USDX,
          p_XAUUSD
        )
      }
  }

}

object JsonItem_macro_fx_sentimentResponse extends Json_macro_fx_sentimentResponse
