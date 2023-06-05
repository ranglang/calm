package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_dzjy_hyyybtjResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_dzjy_hyyybtj 目标地址: http://data.eastmoney.com/dzjy/dzjy_hyyybtj.aspx 描述:
  * 东方财富网-数据中心-大宗交易-活跃营业部统计 限量: 单次返回所有历史数据
  */
case class Respstock_dzjy_hyyybtjResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_zui4jin4shang4bang3ri4`: String,
  `p_ci4shu4zong3ji4mai3ru4`: Double,
  `p_ci4shu4zong3ji4mai4chu1`: Double,
  `p_cheng2jiao1jin1e2tong3ji4mai3ru4`: Double,
  `p_cheng2jiao1jin1e2tong3ji4mai4chu1`: Double,
  `p_cheng2jiao1jin1e2tong3ji4jing4mai3ru4e2`: Double,
  `p_mai3ru4de5gu3piao4`: String
)

case class stock_dzjy_hyyybtjResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_zui4jin4shang4bang3ri4`: String,
  `p_ci4shu4zong3ji4mai3ru4`: Double,
  `p_ci4shu4zong3ji4mai4chu1`: Double,
  `p_cheng2jiao1jin1e2tong3ji4mai3ru4`: Double,
  `p_cheng2jiao1jin1e2tong3ji4mai4chu1`: Double,
  `p_cheng2jiao1jin1e2tong3ji4jing4mai3ru4e2`: Double,
  `p_mai3ru4de5gu3piao4`: String
)

trait Json_stock_dzjy_hyyybtjResponse {

  implicit val a_stock_dzjy_hyyybtjResponse = new Decoder[stock_dzjy_hyyybtjResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_dzjy_hyyybtjResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ying2ye4bu4ming2cheng1 <- c.downField("营业部名称").as[String]

        p_zui4jin4shang4bang3ri4 <- c.downField("最近上榜日").as[String]

        p_ci4shu4zong3ji4mai3ru4 <- c.downField("次数总计-买入").as[Double]

        p_ci4shu4zong3ji4mai4chu1 <- c.downField("次数总计-卖出").as[Double]

        p_cheng2jiao1jin1e2tong3ji4mai3ru4 <- c.downField("成交金额统计-买入").as[Double]

        p_cheng2jiao1jin1e2tong3ji4mai4chu1 <- c.downField("成交金额统计-卖出").as[Double]

        p_cheng2jiao1jin1e2tong3ji4jing4mai3ru4e2 <- c.downField("成交金额统计-净买入额").as[Double]

        p_mai3ru4de5gu3piao4 <- c.downField("买入的股票").as[String]

      } yield {
        stock_dzjy_hyyybtjResponse(
          p_xu4hao4,
          p_ying2ye4bu4ming2cheng1,
          p_zui4jin4shang4bang3ri4,
          p_ci4shu4zong3ji4mai3ru4,
          p_ci4shu4zong3ji4mai4chu1,
          p_cheng2jiao1jin1e2tong3ji4mai3ru4,
          p_cheng2jiao1jin1e2tong3ji4mai4chu1,
          p_cheng2jiao1jin1e2tong3ji4jing4mai3ru4e2,
          p_mai3ru4de5gu3piao4
        )
      }
  }

}

object JsonItem_stock_dzjy_hyyybtjResponse extends Json_stock_dzjy_hyyybtjResponse
