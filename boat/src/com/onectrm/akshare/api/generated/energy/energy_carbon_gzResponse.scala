package com.onectrm.akshare.api.generated.energy;

import com.onectrm.akshare.api.generated.energy.energy_carbon_gzResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: energy 接口: energy_carbon_gz 目标地址: http://www.cnemission.com/article/hqxx/ 描述:
  * 广州碳排放权交易中心-行情信息 限量: 该接口返回从 2013-12-19 至今的所有历史数据
  */
case class Respenergy_carbon_gzResponse(
  `p_ri4qi1`: String,
  `p_pin3zhong3`: String,
  `p_kai1pan2jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3die1fu2`: Double,
  `p_cheng2jiao1shu4liang4`: Integer,
  `p_cheng2jiao1jin1e2`: Double
)

case class energy_carbon_gzResponse(
  `p_ri4qi1`: String,
  `p_pin3zhong3`: String,
  `p_kai1pan2jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3die1fu2`: Double,
  `p_cheng2jiao1shu4liang4`: Integer,
  `p_cheng2jiao1jin1e2`: Double
)

trait Json_energy_carbon_gzResponse {

  implicit val a_energy_carbon_gzResponse = new Decoder[energy_carbon_gzResponse] {
    final def apply(c: HCursor): Decoder.Result[energy_carbon_gzResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_pin3zhong3 <- c.downField("品种").as[String]

        p_kai1pan2jia4 <- c.downField("开盘价").as[Double]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

        p_zui4gao1jia4 <- c.downField("最高价").as[Double]

        p_zui4di1jia4 <- c.downField("最低价").as[Double]

        p_zhang3die1 <- c.downField("涨跌").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_cheng2jiao1shu4liang4 <- c.downField("成交数量").as[Integer]

        p_cheng2jiao1jin1e2 <- c.downField("成交金额").as[Double]

      } yield {
        energy_carbon_gzResponse(
          p_ri4qi1,
          p_pin3zhong3,
          p_kai1pan2jia4,
          p_shou1pan2jia4,
          p_zui4gao1jia4,
          p_zui4di1jia4,
          p_zhang3die1,
          p_zhang3die1fu2,
          p_cheng2jiao1shu4liang4,
          p_cheng2jiao1jin1e2
        )
      }
  }

}

object JsonItem_energy_carbon_gzResponse extends Json_energy_carbon_gzResponse
