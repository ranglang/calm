package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_dzjy_sctjResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_dzjy_sctj 目标地址: http://data.eastmoney.com/dzjy/dzjy_sctj.aspx 描述:
  * 东方财富网-数据中心-大宗交易-市场统计 限量: 单次返回所有历史数据
  */
case class Respstock_dzjy_sctjResponse(
  `p_xu4hao4`: Integer,
  `p_jiao1yi4ri4qi1`: String,
  `p_shang4zheng4zhi3shu4`: Double,
  `p_shang4zheng4zhi3shu4zhang3die1fu2`: Double,
  `p_da4zong1jiao1yi4cheng2jiao1zong3e2`: Double,
  `p_yi4jia4cheng2jiao1zong3e2`: Double,
  `p_yi4jia4cheng2jiao1zong3e2zhan4bi3`: Double,
  `p_zhe2jia4cheng2jiao1zong3e2`: Double,
  `p_zhe2jia4cheng2jiao1zong3e2zhan4bi3`: Double
)

case class stock_dzjy_sctjResponse(
  `p_xu4hao4`: Integer,
  `p_jiao1yi4ri4qi1`: String,
  `p_shang4zheng4zhi3shu4`: Double,
  `p_shang4zheng4zhi3shu4zhang3die1fu2`: Double,
  `p_da4zong1jiao1yi4cheng2jiao1zong3e2`: Double,
  `p_yi4jia4cheng2jiao1zong3e2`: Double,
  `p_yi4jia4cheng2jiao1zong3e2zhan4bi3`: Double,
  `p_zhe2jia4cheng2jiao1zong3e2`: Double,
  `p_zhe2jia4cheng2jiao1zong3e2zhan4bi3`: Double
)

trait Json_stock_dzjy_sctjResponse {

  implicit val a_stock_dzjy_sctjResponse = new Decoder[stock_dzjy_sctjResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_dzjy_sctjResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_jiao1yi4ri4qi1 <- c.downField("交易日期").as[String]

        p_shang4zheng4zhi3shu4 <- c.downField("上证指数").as[Double]

        p_shang4zheng4zhi3shu4zhang3die1fu2 <- c.downField("上证指数涨跌幅").as[Double]

        p_da4zong1jiao1yi4cheng2jiao1zong3e2 <- c.downField("大宗交易成交总额").as[Double]

        p_yi4jia4cheng2jiao1zong3e2 <- c.downField("溢价成交总额").as[Double]

        p_yi4jia4cheng2jiao1zong3e2zhan4bi3 <- c.downField("溢价成交总额占比").as[Double]

        p_zhe2jia4cheng2jiao1zong3e2 <- c.downField("折价成交总额").as[Double]

        p_zhe2jia4cheng2jiao1zong3e2zhan4bi3 <- c.downField("折价成交总额占比").as[Double]

      } yield {
        stock_dzjy_sctjResponse(
          p_xu4hao4,
          p_jiao1yi4ri4qi1,
          p_shang4zheng4zhi3shu4,
          p_shang4zheng4zhi3shu4zhang3die1fu2,
          p_da4zong1jiao1yi4cheng2jiao1zong3e2,
          p_yi4jia4cheng2jiao1zong3e2,
          p_yi4jia4cheng2jiao1zong3e2zhan4bi3,
          p_zhe2jia4cheng2jiao1zong3e2,
          p_zhe2jia4cheng2jiao1zong3e2zhan4bi3
        )
      }
  }

}

object JsonItem_stock_dzjy_sctjResponse extends Json_stock_dzjy_sctjResponse
