package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_a_tick_txResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_a_tick_tx 目标地址: http://gu.qq.com/sz300494/gp/detail(示例) 描述: A
  * 股数据是从腾讯财经获取的数据, 历史数据按日频率更新, 该接口自 20210611 起, 暂时无法获取数据, 等腾讯修复后再使用 限量: 单次返回具体某个 A 上市公司的近 2
  * 年历史分笔行情数据
  */
case class Respstock_zh_a_tick_txResponse(
  `p_cheng2jiao1shi2jian1`: String,
  `p_cheng2jiao1jia4ge2`: Double,
  `p_jia4ge2bian4dong4`: Double,
  `p_cheng2jiao1liang4`: Long,
  `p_cheng2jiao1e2`: Long,
  `p_xing4zhi4`: String
)

case class stock_zh_a_tick_txResponse(
  `p_cheng2jiao1shi2jian1`: String,
  `p_cheng2jiao1jia4ge2`: Double,
  `p_jia4ge2bian4dong4`: Double,
  `p_cheng2jiao1liang4`: Long,
  `p_cheng2jiao1e2`: Long,
  `p_xing4zhi4`: String
)

trait Json_stock_zh_a_tick_txResponse {

  implicit val a_stock_zh_a_tick_txResponse = new Decoder[stock_zh_a_tick_txResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_a_tick_txResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_cheng2jiao1shi2jian1 <- c.downField("成交时间").as[String]

        p_cheng2jiao1jia4ge2 <- c.downField("成交价格").as[Double]

        p_jia4ge2bian4dong4 <- c.downField("价格变动").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Long]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Long]

        p_xing4zhi4 <- c.downField("性质").as[String]

      } yield {
        stock_zh_a_tick_txResponse(
          p_cheng2jiao1shi2jian1,
          p_cheng2jiao1jia4ge2,
          p_jia4ge2bian4dong4,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_xing4zhi4
        )
      }
  }

}

object JsonItem_stock_zh_a_tick_txResponse extends Json_stock_zh_a_tick_txResponse
