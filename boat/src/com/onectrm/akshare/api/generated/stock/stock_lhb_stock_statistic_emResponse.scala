package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_lhb_stock_statistic_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_lhb_stock_statistic_em 目标地址:
  * https://data.eastmoney.com/stock/tradedetail.html 描述: 东方财富网-数据中心-龙虎榜单-个股上榜统计 限量: 单次返回所有历史数据
  */
case class Respstock_lhb_stock_statistic_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4jin4shang4bang3ri4`: String,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_shang4bang3ci4shu4`: Double,
  `p_long2hu3bang3jing4mai3e2`: Double,
  `p_long2hu3bang3mai3ru4e2`: Double,
  `p_long2hu3bang3mai4chu1e2`: Double,
  `p_long2hu3bang3zong3cheng2jiao1e2`: Double,
  `p_mai3fang1ji1gou4ci4shu4`: Double,
  `p_mai4fang1ji1gou4ci4shu4`: Double,
  `p_ji1gou4mai3ru4jing4e2`: Double,
  `p_ji1gou4mai3ru4zong3e2`: Double,
  `p_ji1gou4mai4chu1zong3e2`: Double,
  `p_jin41ge4yue4zhang3die1fu2`: Double,
  `p_jin43ge4yue4zhang3die1fu2`: Double,
  `p_jin46ge4yue4zhang3die1fu2`: Double,
  `p_jin41nian2zhang3die1fu2`: Double
)

case class stock_lhb_stock_statistic_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4jin4shang4bang3ri4`: String,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_shang4bang3ci4shu4`: Double,
  `p_long2hu3bang3jing4mai3e2`: Double,
  `p_long2hu3bang3mai3ru4e2`: Double,
  `p_long2hu3bang3mai4chu1e2`: Double,
  `p_long2hu3bang3zong3cheng2jiao1e2`: Double,
  `p_mai3fang1ji1gou4ci4shu4`: Double,
  `p_mai4fang1ji1gou4ci4shu4`: Double,
  `p_ji1gou4mai3ru4jing4e2`: Double,
  `p_ji1gou4mai3ru4zong3e2`: Double,
  `p_ji1gou4mai4chu1zong3e2`: Double,
  `p_jin41ge4yue4zhang3die1fu2`: Double,
  `p_jin43ge4yue4zhang3die1fu2`: Double,
  `p_jin46ge4yue4zhang3die1fu2`: Double,
  `p_jin41nian2zhang3die1fu2`: Double
)

trait Json_stock_lhb_stock_statistic_emResponse {

  implicit val a_stock_lhb_stock_statistic_emResponse =
    new Decoder[stock_lhb_stock_statistic_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_lhb_stock_statistic_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_dai4ma3 <- c.downField("代码").as[String]

          p_ming2cheng1 <- c.downField("名称").as[String]

          p_zui4jin4shang4bang3ri4 <- c.downField("最近上榜日").as[String]

          p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

          p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

          p_shang4bang3ci4shu4 <- c.downField("上榜次数").as[Double]

          p_long2hu3bang3jing4mai3e2 <- c.downField("龙虎榜净买额").as[Double]

          p_long2hu3bang3mai3ru4e2 <- c.downField("龙虎榜买入额").as[Double]

          p_long2hu3bang3mai4chu1e2 <- c.downField("龙虎榜卖出额").as[Double]

          p_long2hu3bang3zong3cheng2jiao1e2 <- c.downField("龙虎榜总成交额").as[Double]

          p_mai3fang1ji1gou4ci4shu4 <- c.downField("买方机构次数").as[Double]

          p_mai4fang1ji1gou4ci4shu4 <- c.downField("卖方机构次数").as[Double]

          p_ji1gou4mai3ru4jing4e2 <- c.downField("机构买入净额").as[Double]

          p_ji1gou4mai3ru4zong3e2 <- c.downField("机构买入总额").as[Double]

          p_ji1gou4mai4chu1zong3e2 <- c.downField("机构卖出总额").as[Double]

          p_jin41ge4yue4zhang3die1fu2 <- c.downField("近1个月涨跌幅").as[Double]

          p_jin43ge4yue4zhang3die1fu2 <- c.downField("近3个月涨跌幅").as[Double]

          p_jin46ge4yue4zhang3die1fu2 <- c.downField("近6个月涨跌幅").as[Double]

          p_jin41nian2zhang3die1fu2 <- c.downField("近1年涨跌幅").as[Double]

        } yield {
          stock_lhb_stock_statistic_emResponse(
            p_xu4hao4,
            p_dai4ma3,
            p_ming2cheng1,
            p_zui4jin4shang4bang3ri4,
            p_shou1pan2jia4,
            p_zhang3die1fu2,
            p_shang4bang3ci4shu4,
            p_long2hu3bang3jing4mai3e2,
            p_long2hu3bang3mai3ru4e2,
            p_long2hu3bang3mai4chu1e2,
            p_long2hu3bang3zong3cheng2jiao1e2,
            p_mai3fang1ji1gou4ci4shu4,
            p_mai4fang1ji1gou4ci4shu4,
            p_ji1gou4mai3ru4jing4e2,
            p_ji1gou4mai3ru4zong3e2,
            p_ji1gou4mai4chu1zong3e2,
            p_jin41ge4yue4zhang3die1fu2,
            p_jin43ge4yue4zhang3die1fu2,
            p_jin46ge4yue4zhang3die1fu2,
            p_jin41nian2zhang3die1fu2
          )
        }
    }

}

object JsonItem_stock_lhb_stock_statistic_emResponse
    extends Json_stock_lhb_stock_statistic_emResponse
