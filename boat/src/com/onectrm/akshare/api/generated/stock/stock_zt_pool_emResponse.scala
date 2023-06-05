package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zt_pool_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zt_pool_em 目标地址: http://quote.eastmoney.com/ztb/detail#type=ztgc 描述:
  * 东方财富网-行情中心-涨停板行情-涨停股池 限量: 单次返回所有涨停股池数据
  */
case class Respstock_zt_pool_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zhang3die1fu2`: Double,
  `p_zui4xin1jia4`: Double,
  `p_cheng2jiao1e2`: Integer,
  `p_liu2tong1shi4zhi2`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_feng1ban3zi1jin1`: Integer,
  `p_shou3ci4feng1ban3shi2jian1`: String,
  `p_zui4hou4feng1ban3shi2jian1`: String,
  `p_zha4ban3ci4shu4`: Integer,
  `p_zhang3ting2tong3ji4`: String,
  `p_lian2ban3shu4`: Integer,
  `p_suo3shu3xing2ye4`: String
)

case class stock_zt_pool_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zhang3die1fu2`: Double,
  `p_zui4xin1jia4`: Double,
  `p_cheng2jiao1e2`: Integer,
  `p_liu2tong1shi4zhi2`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_feng1ban3zi1jin1`: Integer,
  `p_shou3ci4feng1ban3shi2jian1`: String,
  `p_zui4hou4feng1ban3shi2jian1`: String,
  `p_zha4ban3ci4shu4`: Integer,
  `p_zhang3ting2tong3ji4`: String,
  `p_lian2ban3shu4`: Integer,
  `p_suo3shu3xing2ye4`: String
)

trait Json_stock_zt_pool_emResponse {

  implicit val a_stock_zt_pool_emResponse = new Decoder[stock_zt_pool_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zt_pool_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Integer]

        p_liu2tong1shi4zhi2 <- c.downField("流通市值").as[Double]

        p_zong3shi4zhi2 <- c.downField("总市值").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

        p_feng1ban3zi1jin1 <- c.downField("封板资金").as[Integer]

        p_shou3ci4feng1ban3shi2jian1 <- c.downField("首次封板时间").as[String]

        p_zui4hou4feng1ban3shi2jian1 <- c.downField("最后封板时间").as[String]

        p_zha4ban3ci4shu4 <- c.downField("炸板次数").as[Integer]

        p_zhang3ting2tong3ji4 <- c.downField("涨停统计").as[String]

        p_lian2ban3shu4 <- c.downField("连板数").as[Integer]

        p_suo3shu3xing2ye4 <- c.downField("所属行业").as[String]

      } yield {
        stock_zt_pool_emResponse(
          p_xu4hao4,
          p_dai4ma3,
          p_ming2cheng1,
          p_zhang3die1fu2,
          p_zui4xin1jia4,
          p_cheng2jiao1e2,
          p_liu2tong1shi4zhi2,
          p_zong3shi4zhi2,
          p_huan4shou3lu4,
          p_feng1ban3zi1jin1,
          p_shou3ci4feng1ban3shi2jian1,
          p_zui4hou4feng1ban3shi2jian1,
          p_zha4ban3ci4shu4,
          p_zhang3ting2tong3ji4,
          p_lian2ban3shu4,
          p_suo3shu3xing2ye4
        )
      }
  }

}

object JsonItem_stock_zt_pool_emResponse extends Json_stock_zt_pool_emResponse
