package com.onectrm.akshare.api.generated.tool;

import com.onectrm.akshare.api.generated.tool.tool_trade_date_hist_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: tool 接口: tool_trade_date_hist_sina 目标地址:
  * https://finance.sina.com.cn/realstock/company/klc_td_sh.txt 描述: 新浪财经的股票交易日历数据 限量: 单次返回从
  * 1990-12-19 到 2021-12-31 之间的股票交易日历数据, 这里补充 1992-05-04 进入交易日
  */
case class Resptool_trade_date_hist_sinaResponse(
  `p_tradedate`: String
)

case class tool_trade_date_hist_sinaResponse(
  `p_tradedate`: String
)

trait Json_tool_trade_date_hist_sinaResponse {

  implicit val a_tool_trade_date_hist_sinaResponse =
    new Decoder[tool_trade_date_hist_sinaResponse] {
      final def apply(c: HCursor): Decoder.Result[tool_trade_date_hist_sinaResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_tradedate <- c.downField("trade_date").as[String]

        } yield {
          tool_trade_date_hist_sinaResponse(
            p_tradedate
          )
        }
    }

}

object JsonItem_tool_trade_date_hist_sinaResponse extends Json_tool_trade_date_hist_sinaResponse
