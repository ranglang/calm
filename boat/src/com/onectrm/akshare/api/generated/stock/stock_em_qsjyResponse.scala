package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_em_qsjyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_em_qsjy 目标地址: http://data.eastmoney.com/other/qsjy.html 描述:
  * 东方财富网-数据中心-特色数据-券商业绩月报 限量: 单次获取所有数据, 数据从 20100601-至今, 月频率
  */
case class Respstock_em_qsjyResponse(
  `p_kai1shi3ri4qi1`: String,
  `p_jie2shu4ri4qi1`: String,
  `p_jian3cheng1`: String,
  `p_dai4ma3`: String,
  `p_dang1yue4jing4li4run4jing4li4run4`: String,
  `p_dang1yue4jing4li4run4tong2bi3zeng1zhang3`: String,
  `p_dang1yue4jing4li4run4huan2bi3zeng1zhang3`: String,
  `p_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4`: String,
  `p_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3`: Double,
  `p_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4`: String,
  `p_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3`: Double,
  `p_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3`: Double,
  `p_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4`: Double,
  `p_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3`: Double,
  `p_jing4zi1chan3jing4zi1chan3`: Double,
  `p_jing4zi1chan3tong2bi3zeng1zhang3`: Double
)

case class stock_em_qsjyResponse(
  `p_kai1shi3ri4qi1`: String,
  `p_jie2shu4ri4qi1`: String,
  `p_jian3cheng1`: String,
  `p_dai4ma3`: String,
  `p_dang1yue4jing4li4run4jing4li4run4`: String,
  `p_dang1yue4jing4li4run4tong2bi3zeng1zhang3`: String,
  `p_dang1yue4jing4li4run4huan2bi3zeng1zhang3`: String,
  `p_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4`: String,
  `p_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3`: Double,
  `p_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4`: String,
  `p_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3`: Double,
  `p_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3`: Double,
  `p_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4`: Double,
  `p_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3`: Double,
  `p_jing4zi1chan3jing4zi1chan3`: Double,
  `p_jing4zi1chan3tong2bi3zeng1zhang3`: Double
)

trait Json_stock_em_qsjyResponse {

  implicit val a_stock_em_qsjyResponse = new Decoder[stock_em_qsjyResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_em_qsjyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_kai1shi3ri4qi1 <- c.downField("开始日期").as[String]

        p_jie2shu4ri4qi1 <- c.downField("结束日期").as[String]

        p_jian3cheng1 <- c.downField("简称").as[String]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_dang1yue4jing4li4run4jing4li4run4 <- c.downField("当月净利润_净利润").as[String]

        p_dang1yue4jing4li4run4tong2bi3zeng1zhang3 <- c.downField("当月净利润_同比增长").as[String]

        p_dang1yue4jing4li4run4huan2bi3zeng1zhang3 <- c.downField("当月净利润_环比增长").as[String]

        p_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4 <- c
          .downField("当年累计净利润_累计净利润")
          .as[String]

        p_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3 <- c.downField("当年累计净利润_同比增长").as[Double]

        p_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4 <- c.downField("当月营业收入_营业收入").as[String]

        p_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3 <- c.downField("当月营业收入_环比增长").as[Double]

        p_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3 <- c.downField("当月营业收入_同比增长").as[Double]

        p_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4 <- c
          .downField("当年累计营业收入_累计营业收入")
          .as[Double]

        p_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3 <- c
          .downField("当年累计营业收入_同比增长")
          .as[Double]

        p_jing4zi1chan3jing4zi1chan3 <- c.downField("净资产_净资产").as[Double]

        p_jing4zi1chan3tong2bi3zeng1zhang3 <- c.downField("净资产_同比增长").as[Double]

      } yield {
        stock_em_qsjyResponse(
          p_kai1shi3ri4qi1,
          p_jie2shu4ri4qi1,
          p_jian3cheng1,
          p_dai4ma3,
          p_dang1yue4jing4li4run4jing4li4run4,
          p_dang1yue4jing4li4run4tong2bi3zeng1zhang3,
          p_dang1yue4jing4li4run4huan2bi3zeng1zhang3,
          p_dang1nian2lei3ji4jing4li4run4lei3ji4jing4li4run4,
          p_dang1nian2lei3ji4jing4li4run4tong2bi3zeng1zhang3,
          p_dang1yue4ying2ye4shou1ru4ying2ye4shou1ru4,
          p_dang1yue4ying2ye4shou1ru4huan2bi3zeng1zhang3,
          p_dang1yue4ying2ye4shou1ru4tong2bi3zeng1zhang3,
          p_dang1nian2lei3ji4ying2ye4shou1ru4lei3ji4ying2ye4shou1ru4,
          p_dang1nian2lei3ji4ying2ye4shou1ru4tong2bi3zeng1zhang3,
          p_jing4zi1chan3jing4zi1chan3,
          p_jing4zi1chan3tong2bi3zeng1zhang3
        )
      }
  }

}

object JsonItem_stock_em_qsjyResponse extends Json_stock_em_qsjyResponse
