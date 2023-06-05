package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_dzjy_hygtjResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_dzjy_hygtj 目标地址: http://data.eastmoney.com/dzjy/dzjy_hygtj.aspx 描述:
  * 东方财富网-数据中心-大宗交易-活跃 A 股统计 限量: 单次返回所有历史数据
  */
case class Respstock_dzjy_hygtjResponse(
  `p_xu4hao4`: Integer,
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zui4jin4shang4bang3ri4`: String,
  `p_shang4bang3ci4shu4zong3ji4`: Integer,
  `p_shang4bang3ci4shu4yi4jia4`: Integer,
  `p_shang4bang3ci4shu4zhe2jia4`: Integer,
  `p_zong3cheng2jiao1e2`: Double,
  `p_zhe2yi4lu4`: Double,
  `p_cheng2jiao1zong3e2liu2tong1shi4zhi2`: Double,
  `p_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4`: Double,
  `p_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4`: Double,
  `p_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4`: Double,
  `p_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4`: Double
)

case class stock_dzjy_hygtjResponse(
  `p_xu4hao4`: Integer,
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zui4jin4shang4bang3ri4`: String,
  `p_shang4bang3ci4shu4zong3ji4`: Integer,
  `p_shang4bang3ci4shu4yi4jia4`: Integer,
  `p_shang4bang3ci4shu4zhe2jia4`: Integer,
  `p_zong3cheng2jiao1e2`: Double,
  `p_zhe2yi4lu4`: Double,
  `p_cheng2jiao1zong3e2liu2tong1shi4zhi2`: Double,
  `p_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4`: Double,
  `p_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4`: Double,
  `p_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4`: Double,
  `p_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4`: Double
)

trait Json_stock_dzjy_hygtjResponse {

  implicit val a_stock_dzjy_hygtjResponse = new Decoder[stock_dzjy_hygtjResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_dzjy_hygtjResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

        p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_zui4jin4shang4bang3ri4 <- c.downField("最近上榜日").as[String]

        p_shang4bang3ci4shu4zong3ji4 <- c.downField("上榜次数-总计").as[Integer]

        p_shang4bang3ci4shu4yi4jia4 <- c.downField("上榜次数-溢价").as[Integer]

        p_shang4bang3ci4shu4zhe2jia4 <- c.downField("上榜次数-折价").as[Integer]

        p_zong3cheng2jiao1e2 <- c.downField("总成交额").as[Double]

        p_zhe2yi4lu4 <- c.downField("折溢率").as[Double]

        p_cheng2jiao1zong3e2liu2tong1shi4zhi2 <- c.downField("成交总额/流通市值").as[Double]

        p_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4 <- c.downField("上榜日后平均涨跌幅-1日").as[Double]

        p_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4 <- c.downField("上榜日后平均涨跌幅-5日").as[Double]

        p_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4 <- c.downField("上榜日后平均涨跌幅-10日").as[Double]

        p_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4 <- c.downField("上榜日后平均涨跌幅-20日").as[Double]

      } yield {
        stock_dzjy_hygtjResponse(
          p_xu4hao4,
          p_zheng4quan4dai4ma3,
          p_zheng4quan4jian3cheng1,
          p_zui4xin1jia4,
          p_zhang3die1fu2,
          p_zui4jin4shang4bang3ri4,
          p_shang4bang3ci4shu4zong3ji4,
          p_shang4bang3ci4shu4yi4jia4,
          p_shang4bang3ci4shu4zhe2jia4,
          p_zong3cheng2jiao1e2,
          p_zhe2yi4lu4,
          p_cheng2jiao1zong3e2liu2tong1shi4zhi2,
          p_shang4bang3ri4hou4ping2jun1zhang3die1fu21ri4,
          p_shang4bang3ri4hou4ping2jun1zhang3die1fu25ri4,
          p_shang4bang3ri4hou4ping2jun1zhang3die1fu210ri4,
          p_shang4bang3ri4hou4ping2jun1zhang3die1fu220ri4
        )
      }
  }

}

object JsonItem_stock_dzjy_hygtjResponse extends Json_stock_dzjy_hygtjResponse
