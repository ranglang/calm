package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_lhb_jgmmtj_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_lhb_jgmmtj_em 目标地址: https://data.eastmoney.com/stock/jgmmtj.html 描述:
  * 东方财富网-数据中心-龙虎榜单-机构买卖每日统计 限量: 单次返回所有历史数据
  */
case class Respstock_lhb_jgmmtj_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_shang4bang3ri4qi1`: String,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_mai3fang1ji1gou4shu4`: Double,
  `p_mai4fang1ji1gou4shu4`: Double,
  `p_ji1gou4mai3ru4zong3e2`: Double,
  `p_ji1gou4mai4chu1zong3e2`: Double,
  `p_ji1gou4mai3ru4jing4e2`: Double,
  `p_shi4chang3zong3cheng2jiao1e2`: Double,
  `p_ji1gou4jing4mai3e2zhan4zong3cheng2jiao1e2bi3`: Double,
  `p_huan4shou3lu4`: Double,
  `p_shang4bang3yuan2yin1`: String,
  `p_shang4bang3hou41ri4`: Double,
  `p_shang4bang3hou42ri4`: Double,
  `p_shang4bang3hou45ri4`: Double,
  `p_shang4bang3hou410ri4`: Double
)

case class stock_lhb_jgmmtj_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_shang4bang3ri4qi1`: String,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_mai3fang1ji1gou4shu4`: Double,
  `p_mai4fang1ji1gou4shu4`: Double,
  `p_ji1gou4mai3ru4zong3e2`: Double,
  `p_ji1gou4mai4chu1zong3e2`: Double,
  `p_ji1gou4mai3ru4jing4e2`: Double,
  `p_shi4chang3zong3cheng2jiao1e2`: Double,
  `p_ji1gou4jing4mai3e2zhan4zong3cheng2jiao1e2bi3`: Double,
  `p_huan4shou3lu4`: Double,
  `p_shang4bang3yuan2yin1`: String,
  `p_shang4bang3hou41ri4`: Double,
  `p_shang4bang3hou42ri4`: Double,
  `p_shang4bang3hou45ri4`: Double,
  `p_shang4bang3hou410ri4`: Double
)

trait Json_stock_lhb_jgmmtj_emResponse {

  implicit val a_stock_lhb_jgmmtj_emResponse = new Decoder[stock_lhb_jgmmtj_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_lhb_jgmmtj_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_shang4bang3ri4qi1 <- c.downField("上榜日期").as[String]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_mai3fang1ji1gou4shu4 <- c.downField("买方机构数").as[Double]

        p_mai4fang1ji1gou4shu4 <- c.downField("卖方机构数").as[Double]

        p_ji1gou4mai3ru4zong3e2 <- c.downField("机构买入总额").as[Double]

        p_ji1gou4mai4chu1zong3e2 <- c.downField("机构卖出总额").as[Double]

        p_ji1gou4mai3ru4jing4e2 <- c.downField("机构买入净额").as[Double]

        p_shi4chang3zong3cheng2jiao1e2 <- c.downField("市场总成交额").as[Double]

        p_ji1gou4jing4mai3e2zhan4zong3cheng2jiao1e2bi3 <- c.downField("机构净买额占总成交额比").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

        p_shang4bang3yuan2yin1 <- c.downField("上榜原因").as[String]

        p_shang4bang3hou41ri4 <- c.downField("上榜后1日").as[Double]

        p_shang4bang3hou42ri4 <- c.downField("上榜后2日").as[Double]

        p_shang4bang3hou45ri4 <- c.downField("上榜后5日").as[Double]

        p_shang4bang3hou410ri4 <- c.downField("上榜后10日").as[Double]

      } yield {
        stock_lhb_jgmmtj_emResponse(
          p_xu4hao4,
          p_dai4ma3,
          p_ming2cheng1,
          p_shang4bang3ri4qi1,
          p_shou1pan2jia4,
          p_zhang3die1fu2,
          p_mai3fang1ji1gou4shu4,
          p_mai4fang1ji1gou4shu4,
          p_ji1gou4mai3ru4zong3e2,
          p_ji1gou4mai4chu1zong3e2,
          p_ji1gou4mai3ru4jing4e2,
          p_shi4chang3zong3cheng2jiao1e2,
          p_ji1gou4jing4mai3e2zhan4zong3cheng2jiao1e2bi3,
          p_huan4shou3lu4,
          p_shang4bang3yuan2yin1,
          p_shang4bang3hou41ri4,
          p_shang4bang3hou42ri4,
          p_shang4bang3hou45ri4,
          p_shang4bang3hou410ri4
        )
      }
  }

}

object JsonItem_stock_lhb_jgmmtj_emResponse extends Json_stock_lhb_jgmmtj_emResponse
