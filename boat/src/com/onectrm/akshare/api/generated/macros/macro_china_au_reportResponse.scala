package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_au_reportResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_au_report 目标地址: https://datacenter.jin10.com/reportType/dc_sge_report
  * 描述: 获取上海黄金交易所报告, 数据区间从20140905-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_china_au_reportResponse(
  `p_ri4qi1`: String,
  `p_shang1pin3`: Double,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3die1fu2`: Double,
  `p_jia1quan2ping2jun1jia4`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1jin1e2`: Double,
  `p_chi2cang1liang4`: Double,
  `p_jiao1shou1fang1xiang4`: Double,
  `p_jiao1shou1liang4`: Double
)

case class macro_china_au_reportResponse(
  `p_ri4qi1`: String,
  `p_shang1pin3`: Double,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3die1fu2`: Double,
  `p_jia1quan2ping2jun1jia4`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1jin1e2`: Double,
  `p_chi2cang1liang4`: Double,
  `p_jiao1shou1fang1xiang4`: Double,
  `p_jiao1shou1liang4`: Double
)

trait Json_macro_china_au_reportResponse {

  implicit val a_macro_china_au_reportResponse = new Decoder[macro_china_au_reportResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_au_reportResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_shang1pin3 <- c.downField("商品").as[Double]

        p_kai1pan2jia4 <- c.downField("开盘价").as[Double]

        p_zui4gao1jia4 <- c.downField("最高价").as[Double]

        p_zui4di1jia4 <- c.downField("最低价").as[Double]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

        p_zhang3die1 <- c.downField("涨跌").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_jia1quan2ping2jun1jia4 <- c.downField("加权平均价").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_cheng2jiao1jin1e2 <- c.downField("成交金额").as[Double]

        p_chi2cang1liang4 <- c.downField("持仓量").as[Double]

        p_jiao1shou1fang1xiang4 <- c.downField("交收方向").as[Double]

        p_jiao1shou1liang4 <- c.downField("交收量").as[Double]

      } yield {
        macro_china_au_reportResponse(
          p_ri4qi1,
          p_shang1pin3,
          p_kai1pan2jia4,
          p_zui4gao1jia4,
          p_zui4di1jia4,
          p_shou1pan2jia4,
          p_zhang3die1,
          p_zhang3die1fu2,
          p_jia1quan2ping2jun1jia4,
          p_cheng2jiao1liang4,
          p_cheng2jiao1jin1e2,
          p_chi2cang1liang4,
          p_jiao1shou1fang1xiang4,
          p_jiao1shou1liang4
        )
      }
  }

}

object JsonItem_macro_china_au_reportResponse extends Json_macro_china_au_reportResponse
