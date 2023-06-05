package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_dxsyl_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_dxsyl_em 目标地址: http://data.eastmoney.com/xg/xg/dxsyl.html 描述:
  * 东方财富网-数据中心-新股申购-打新收益率 限量: 单次获取所有打新收益率数据
  */
case class Respstock_dxsyl_emResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_fa1xing2jia4`: Double,
  `p_zui4xin1jia4`: Double,
  `p_wang3shang4fa1xing2zhong1qian1lu4`: Double,
  `p_wang3shang4you3xiao4shen1gou4gu3shu4`: Integer,
  `p_wang3shang4you3xiao4shen1gou4hu4shu4`: Integer,
  `p_wang3shang4chao1e2ren4gou4bei4shu4`: Double,
  `p_wang3xia4pei4shou4zhong1qian1lu4`: Double,
  `p_wang3xia4you3xiao4shen1gou4gu3shu4`: Integer,
  `p_wang3xia4you3xiao4shen1gou4hu4shu4`: Integer,
  `p_wang3xia4pei4shou4ren4gou4bei4shu4`: Double,
  `p_zong3fa1xing2shu4liang4`: Integer,
  `p_kai1pan2yi4jia4`: Double,
  `p_shou3ri4zhang3fu2`: Double,
  `p_da3xin1shou1yi4`: Double,
  `p_shang4shi4ri4qi1`: String
)

case class stock_dxsyl_emResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_fa1xing2jia4`: Double,
  `p_zui4xin1jia4`: Double,
  `p_wang3shang4fa1xing2zhong1qian1lu4`: Double,
  `p_wang3shang4you3xiao4shen1gou4gu3shu4`: Integer,
  `p_wang3shang4you3xiao4shen1gou4hu4shu4`: Integer,
  `p_wang3shang4chao1e2ren4gou4bei4shu4`: Double,
  `p_wang3xia4pei4shou4zhong1qian1lu4`: Double,
  `p_wang3xia4you3xiao4shen1gou4gu3shu4`: Integer,
  `p_wang3xia4you3xiao4shen1gou4hu4shu4`: Integer,
  `p_wang3xia4pei4shou4ren4gou4bei4shu4`: Double,
  `p_zong3fa1xing2shu4liang4`: Integer,
  `p_kai1pan2yi4jia4`: Double,
  `p_shou3ri4zhang3fu2`: Double,
  `p_da3xin1shou1yi4`: Double,
  `p_shang4shi4ri4qi1`: String
)

trait Json_stock_dxsyl_emResponse {

  implicit val a_stock_dxsyl_emResponse = new Decoder[stock_dxsyl_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_dxsyl_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_fa1xing2jia4 <- c.downField("发行价").as[Double]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_wang3shang4fa1xing2zhong1qian1lu4 <- c.downField("网上发行中签率").as[Double]

        p_wang3shang4you3xiao4shen1gou4gu3shu4 <- c.downField("网上有效申购股数").as[Integer]

        p_wang3shang4you3xiao4shen1gou4hu4shu4 <- c.downField("网上有效申购户数").as[Integer]

        p_wang3shang4chao1e2ren4gou4bei4shu4 <- c.downField("网上超额认购倍数").as[Double]

        p_wang3xia4pei4shou4zhong1qian1lu4 <- c.downField("网下配售中签率").as[Double]

        p_wang3xia4you3xiao4shen1gou4gu3shu4 <- c.downField("网下有效申购股数").as[Integer]

        p_wang3xia4you3xiao4shen1gou4hu4shu4 <- c.downField("网下有效申购户数").as[Integer]

        p_wang3xia4pei4shou4ren4gou4bei4shu4 <- c.downField("网下配售认购倍数").as[Double]

        p_zong3fa1xing2shu4liang4 <- c.downField("总发行数量").as[Integer]

        p_kai1pan2yi4jia4 <- c.downField("开盘溢价").as[Double]

        p_shou3ri4zhang3fu2 <- c.downField("首日涨幅").as[Double]

        p_da3xin1shou1yi4 <- c.downField("打新收益").as[Double]

        p_shang4shi4ri4qi1 <- c.downField("上市日期").as[String]

      } yield {
        stock_dxsyl_emResponse(
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_fa1xing2jia4,
          p_zui4xin1jia4,
          p_wang3shang4fa1xing2zhong1qian1lu4,
          p_wang3shang4you3xiao4shen1gou4gu3shu4,
          p_wang3shang4you3xiao4shen1gou4hu4shu4,
          p_wang3shang4chao1e2ren4gou4bei4shu4,
          p_wang3xia4pei4shou4zhong1qian1lu4,
          p_wang3xia4you3xiao4shen1gou4gu3shu4,
          p_wang3xia4you3xiao4shen1gou4hu4shu4,
          p_wang3xia4pei4shou4ren4gou4bei4shu4,
          p_zong3fa1xing2shu4liang4,
          p_kai1pan2yi4jia4,
          p_shou3ri4zhang3fu2,
          p_da3xin1shou1yi4,
          p_shang4shi4ri4qi1
        )
      }
  }

}

object JsonItem_stock_dxsyl_emResponse extends Json_stock_dxsyl_emResponse
