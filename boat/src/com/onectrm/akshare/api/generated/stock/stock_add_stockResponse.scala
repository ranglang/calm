package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_add_stockResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_add_stock 目标地址:
  * https://vip.stock.finance.sina.com.cn/corp/go.php/vISSUE_AddStock/stockid/600004.phtml 描述:
  * 获取新浪财经-发行与分配-增发 限量: 单次获取股票增发详情数据
  */
case class Respstock_add_stockResponse(
  `p_fa1xing2fang1shi4`: String,
  `p_fa1xing2jia4ge2`: String,
  `p_shi2ji4gong1si1mu4ji2zi1jin1zong3e2`: String,
  `p_fa1xing2fei4yong4zong3e2`: String,
  `p_shi2ji4fa1xing2shu4liang4`: String
)

case class stock_add_stockResponse(
  `p_fa1xing2fang1shi4`: String,
  `p_fa1xing2jia4ge2`: String,
  `p_shi2ji4gong1si1mu4ji2zi1jin1zong3e2`: String,
  `p_fa1xing2fei4yong4zong3e2`: String,
  `p_shi2ji4fa1xing2shu4liang4`: String
)

trait Json_stock_add_stockResponse {

  implicit val a_stock_add_stockResponse = new Decoder[stock_add_stockResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_add_stockResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_fa1xing2fang1shi4 <- c.downField("发行方式").as[String]

        p_fa1xing2jia4ge2 <- c.downField("发行价格").as[String]

        p_shi2ji4gong1si1mu4ji2zi1jin1zong3e2 <- c.downField("实际公司募集资金总额").as[String]

        p_fa1xing2fei4yong4zong3e2 <- c.downField("发行费用总额").as[String]

        p_shi2ji4fa1xing2shu4liang4 <- c.downField("实际发行数量").as[String]

      } yield {
        stock_add_stockResponse(
          p_fa1xing2fang1shi4,
          p_fa1xing2jia4ge2,
          p_shi2ji4gong1si1mu4ji2zi1jin1zong3e2,
          p_fa1xing2fei4yong4zong3e2,
          p_shi2ji4fa1xing2shu4liang4
        )
      }
  }

}

object JsonItem_stock_add_stockResponse extends Json_stock_add_stockResponse
