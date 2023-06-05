package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_lhb_detail_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_lhb_detail_em 目标地址: https://data.eastmoney.com/stock/tradedetail.html 描述:
  * 东方财富网-数据中心-龙虎榜单-龙虎榜详情 限量: 单次返回所有历史数据
  */
case class Respstock_lhb_detail_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_jie3du2`: String,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_long2hu3bang3jing4mai3e2`: Double,
  `p_long2hu3bang3mai3ru4e2`: Double,
  `p_long2hu3bang3mai4chu1e2`: Double,
  `p_long2hu3bang3cheng2jiao1e2`: Double,
  `p_shi4chang3zong3cheng2jiao1e2`: Double,
  `p_jing4mai3e2zhan4zong3cheng2jiao1bi3`: Double,
  `p_cheng2jiao1e2zhan4zong3cheng2jiao1bi3`: Double,
  `p_huan4shou3lu4`: Double,
  `p_liu2tong1shi4zhi2`: Double,
  `p_shang4bang3yuan2yin1`: String
)

case class stock_lhb_detail_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_jie3du2`: String,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_long2hu3bang3jing4mai3e2`: Double,
  `p_long2hu3bang3mai3ru4e2`: Double,
  `p_long2hu3bang3mai4chu1e2`: Double,
  `p_long2hu3bang3cheng2jiao1e2`: Double,
  `p_shi4chang3zong3cheng2jiao1e2`: Double,
  `p_jing4mai3e2zhan4zong3cheng2jiao1bi3`: Double,
  `p_cheng2jiao1e2zhan4zong3cheng2jiao1bi3`: Double,
  `p_huan4shou3lu4`: Double,
  `p_liu2tong1shi4zhi2`: Double,
  `p_shang4bang3yuan2yin1`: String
)

trait Json_stock_lhb_detail_emResponse {

  implicit val a_stock_lhb_detail_emResponse = new Decoder[stock_lhb_detail_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_lhb_detail_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_jie3du2 <- c.downField("解读").as[String]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_long2hu3bang3jing4mai3e2 <- c.downField("龙虎榜净买额").as[Double]

        p_long2hu3bang3mai3ru4e2 <- c.downField("龙虎榜买入额").as[Double]

        p_long2hu3bang3mai4chu1e2 <- c.downField("龙虎榜卖出额").as[Double]

        p_long2hu3bang3cheng2jiao1e2 <- c.downField("龙虎榜成交额").as[Double]

        p_shi4chang3zong3cheng2jiao1e2 <- c.downField("市场总成交额").as[Double]

        p_jing4mai3e2zhan4zong3cheng2jiao1bi3 <- c.downField("净买额占总成交比").as[Double]

        p_cheng2jiao1e2zhan4zong3cheng2jiao1bi3 <- c.downField("成交额占总成交比").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

        p_liu2tong1shi4zhi2 <- c.downField("流通市值").as[Double]

        p_shang4bang3yuan2yin1 <- c.downField("上榜原因").as[String]

      } yield {
        stock_lhb_detail_emResponse(
          p_xu4hao4,
          p_dai4ma3,
          p_ming2cheng1,
          p_jie3du2,
          p_shou1pan2jia4,
          p_zhang3die1fu2,
          p_long2hu3bang3jing4mai3e2,
          p_long2hu3bang3mai3ru4e2,
          p_long2hu3bang3mai4chu1e2,
          p_long2hu3bang3cheng2jiao1e2,
          p_shi4chang3zong3cheng2jiao1e2,
          p_jing4mai3e2zhan4zong3cheng2jiao1bi3,
          p_cheng2jiao1e2zhan4zong3cheng2jiao1bi3,
          p_huan4shou3lu4,
          p_liu2tong1shi4zhi2,
          p_shang4bang3yuan2yin1
        )
      }
  }

}

object JsonItem_stock_lhb_detail_emResponse extends Json_stock_lhb_detail_emResponse
