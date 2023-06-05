package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_dzjy_yybphResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_dzjy_yybph 目标地址: http://data.eastmoney.com/dzjy/dzjy_yybph.aspx 描述:
  * 东方财富网-数据中心-大宗交易-营业部排行 限量: 单次返回所有历史数据
  */
case class Respstock_dzjy_yybphResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_shang4bang3hou41tian1mai3ru4ci4shu4`: Double,
  `p_shang4bang3hou41tian1ping2jun1zhang3fu2`: Double,
  `p_shang4bang3hou41tian1shang4zhang3gai4lu4`: Double,
  `p_shang4bang3hou45tian1mai3ru4ci4shu4`: Double,
  `p_shang4bang3hou45tian1ping2jun1zhang3fu2`: Double,
  `p_shang4bang3hou45tian1shang4zhang3gai4lu4`: Double,
  `p_shang4bang3hou410tian1mai3ru4ci4shu4`: Double,
  `p_shang4bang3hou410tian1ping2jun1zhang3fu2`: Double,
  `p_shang4bang3hou410tian1shang4zhang3gai4lu4`: Double,
  `p_shang4bang3hou420tian1mai3ru4ci4shu4`: Double,
  `p_shang4bang3hou420tian1ping2jun1zhang3fu2`: Double,
  `p_shang4bang3hou420tian1shang4zhang3gai4lu4`: Double
)

case class stock_dzjy_yybphResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_shang4bang3hou41tian1mai3ru4ci4shu4`: Double,
  `p_shang4bang3hou41tian1ping2jun1zhang3fu2`: Double,
  `p_shang4bang3hou41tian1shang4zhang3gai4lu4`: Double,
  `p_shang4bang3hou45tian1mai3ru4ci4shu4`: Double,
  `p_shang4bang3hou45tian1ping2jun1zhang3fu2`: Double,
  `p_shang4bang3hou45tian1shang4zhang3gai4lu4`: Double,
  `p_shang4bang3hou410tian1mai3ru4ci4shu4`: Double,
  `p_shang4bang3hou410tian1ping2jun1zhang3fu2`: Double,
  `p_shang4bang3hou410tian1shang4zhang3gai4lu4`: Double,
  `p_shang4bang3hou420tian1mai3ru4ci4shu4`: Double,
  `p_shang4bang3hou420tian1ping2jun1zhang3fu2`: Double,
  `p_shang4bang3hou420tian1shang4zhang3gai4lu4`: Double
)

trait Json_stock_dzjy_yybphResponse {

  implicit val a_stock_dzjy_yybphResponse = new Decoder[stock_dzjy_yybphResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_dzjy_yybphResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ying2ye4bu4ming2cheng1 <- c.downField("营业部名称").as[String]

        p_shang4bang3hou41tian1mai3ru4ci4shu4 <- c.downField("上榜后1天-买入次数").as[Double]

        p_shang4bang3hou41tian1ping2jun1zhang3fu2 <- c.downField("上榜后1天-平均涨幅").as[Double]

        p_shang4bang3hou41tian1shang4zhang3gai4lu4 <- c.downField("上榜后1天-上涨概率").as[Double]

        p_shang4bang3hou45tian1mai3ru4ci4shu4 <- c.downField("上榜后5天-买入次数").as[Double]

        p_shang4bang3hou45tian1ping2jun1zhang3fu2 <- c.downField("上榜后5天-平均涨幅").as[Double]

        p_shang4bang3hou45tian1shang4zhang3gai4lu4 <- c.downField("上榜后5天-上涨概率").as[Double]

        p_shang4bang3hou410tian1mai3ru4ci4shu4 <- c.downField("上榜后10天-买入次数").as[Double]

        p_shang4bang3hou410tian1ping2jun1zhang3fu2 <- c.downField("上榜后10天-平均涨幅").as[Double]

        p_shang4bang3hou410tian1shang4zhang3gai4lu4 <- c.downField("上榜后10天-上涨概率").as[Double]

        p_shang4bang3hou420tian1mai3ru4ci4shu4 <- c.downField("上榜后20天-买入次数").as[Double]

        p_shang4bang3hou420tian1ping2jun1zhang3fu2 <- c.downField("上榜后20天-平均涨幅").as[Double]

        p_shang4bang3hou420tian1shang4zhang3gai4lu4 <- c.downField("上榜后20天-上涨概率").as[Double]

      } yield {
        stock_dzjy_yybphResponse(
          p_xu4hao4,
          p_ying2ye4bu4ming2cheng1,
          p_shang4bang3hou41tian1mai3ru4ci4shu4,
          p_shang4bang3hou41tian1ping2jun1zhang3fu2,
          p_shang4bang3hou41tian1shang4zhang3gai4lu4,
          p_shang4bang3hou45tian1mai3ru4ci4shu4,
          p_shang4bang3hou45tian1ping2jun1zhang3fu2,
          p_shang4bang3hou45tian1shang4zhang3gai4lu4,
          p_shang4bang3hou410tian1mai3ru4ci4shu4,
          p_shang4bang3hou410tian1ping2jun1zhang3fu2,
          p_shang4bang3hou410tian1shang4zhang3gai4lu4,
          p_shang4bang3hou420tian1mai3ru4ci4shu4,
          p_shang4bang3hou420tian1ping2jun1zhang3fu2,
          p_shang4bang3hou420tian1shang4zhang3gai4lu4
        )
      }
  }

}

object JsonItem_stock_dzjy_yybphResponse extends Json_stock_dzjy_yybphResponse
