package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_a_tick_163Response
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_a_tick_163 目标地址:
  * http://quotes.money.163.com/trade/cjmx_000001.html#01b05(示例) 描述: A 股 Tick 数据是从网易财经获取,
  * 历史数据按日频率更新, 晚上 10 更新数据; 可以调用 **ak.stock_zh_a_tick_163_now(symbol=&quot;000001&quot;)** 接口获取 限量:
  * 单次返回具体某个 A 上市公司的近 5 个交易日的历史分笔行情数据; 该接口目前还不支持北交所的股票; 该接口目前不能返回 上交所 数据
  */
case class Respstock_zh_a_tick_163Response(
  `p_shi2jian1`: String,
  `p_cheng2jiao1jia4`: Double,
  `p_jia4ge2bian4dong4`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double,
  `p_xing4zhi4`: String
)

case class stock_zh_a_tick_163Response(
  `p_shi2jian1`: String,
  `p_cheng2jiao1jia4`: Double,
  `p_jia4ge2bian4dong4`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double,
  `p_xing4zhi4`: String
)

trait Json_stock_zh_a_tick_163Response {

  implicit val a_stock_zh_a_tick_163Response = new Decoder[stock_zh_a_tick_163Response] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_a_tick_163Response] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_cheng2jiao1jia4 <- c.downField("成交价").as[Double]

        p_jia4ge2bian4dong4 <- c.downField("价格变动").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Integer]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_xing4zhi4 <- c.downField("性质").as[String]

      } yield {
        stock_zh_a_tick_163Response(
          p_shi2jian1,
          p_cheng2jiao1jia4,
          p_jia4ge2bian4dong4,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_xing4zhi4
        )
      }
  }

}

object JsonItem_stock_zh_a_tick_163Response extends Json_stock_zh_a_tick_163Response
