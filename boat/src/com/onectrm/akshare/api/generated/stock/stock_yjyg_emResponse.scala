package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_yjyg_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_yjyg_em 目标地址: http://data.eastmoney.com/bbsj/202003/yjyg.html 描述:
  * 东方财富-数据中心-年报季报-业绩预告 限量: 单次获取指定 date 的业绩预告数据
  */
case class Respstock_yjyg_emResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_yu4ce4zhi3biao1`: Double,
  `p_ye4ji4bian4dong4`: Double,
  `p_yu4ce4shu4zhi2`: Double,
  `p_ye4ji4bian4dong4fu2du4`: Double,
  `p_ye4ji4bian4dong4yuan2yin1`: Double,
  `p_yu4gao4lei4xing2`: Double,
  `p_shang4nian2tong2qi1zhi2`: Double,
  `p_gong1gao4ri4qi1`: String
)

case class stock_yjyg_emResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_yu4ce4zhi3biao1`: Double,
  `p_ye4ji4bian4dong4`: Double,
  `p_yu4ce4shu4zhi2`: Double,
  `p_ye4ji4bian4dong4fu2du4`: Double,
  `p_ye4ji4bian4dong4yuan2yin1`: Double,
  `p_yu4gao4lei4xing2`: Double,
  `p_shang4nian2tong2qi1zhi2`: Double,
  `p_gong1gao4ri4qi1`: String
)

trait Json_stock_yjyg_emResponse {

  implicit val a_stock_yjyg_emResponse = new Decoder[stock_yjyg_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_yjyg_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_yu4ce4zhi3biao1 <- c.downField("预测指标").as[Double]

        p_ye4ji4bian4dong4 <- c.downField("业绩变动").as[Double]

        p_yu4ce4shu4zhi2 <- c.downField("预测数值").as[Double]

        p_ye4ji4bian4dong4fu2du4 <- c.downField("业绩变动幅度").as[Double]

        p_ye4ji4bian4dong4yuan2yin1 <- c.downField("业绩变动原因").as[Double]

        p_yu4gao4lei4xing2 <- c.downField("预告类型").as[Double]

        p_shang4nian2tong2qi1zhi2 <- c.downField("上年同期值").as[Double]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

      } yield {
        stock_yjyg_emResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_yu4ce4zhi3biao1,
          p_ye4ji4bian4dong4,
          p_yu4ce4shu4zhi2,
          p_ye4ji4bian4dong4fu2du4,
          p_ye4ji4bian4dong4yuan2yin1,
          p_yu4gao4lei4xing2,
          p_shang4nian2tong2qi1zhi2,
          p_gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_yjyg_emResponse extends Json_stock_yjyg_emResponse
