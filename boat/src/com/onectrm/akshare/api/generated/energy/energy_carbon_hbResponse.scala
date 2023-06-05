package com.onectrm.akshare.api.generated.energy;

import com.onectrm.akshare.api.generated.energy.energy_carbon_hbResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: energy 接口: energy_carbon_hb 目标地址: http://www.cerx.cn/dailynewsOuter/index.htm 描述:
  * 湖北碳排放权交易中心-现货交易数据-配额-每日概况 限量: 返回从 2017-04-05 至今的所有历史数据
  */
case class Respenergy_carbon_hbResponse(
  `p_ri4qi1`: String,
  `p_jiao1yi4pin3zhong3`: String,
  `p_zui4xin1`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_zuo2shou1pan2jia4`: Double
)

case class energy_carbon_hbResponse(
  `p_ri4qi1`: String,
  `p_jiao1yi4pin3zhong3`: String,
  `p_zui4xin1`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_zuo2shou1pan2jia4`: Double
)

trait Json_energy_carbon_hbResponse {

  implicit val a_energy_carbon_hbResponse = new Decoder[energy_carbon_hbResponse] {
    final def apply(c: HCursor): Decoder.Result[energy_carbon_hbResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_jiao1yi4pin3zhong3 <- c.downField("交易品种").as[String]

        p_zui4xin1 <- c.downField("最新").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_zuo2shou1pan2jia4 <- c.downField("昨收盘价").as[Double]

      } yield {
        energy_carbon_hbResponse(
          p_ri4qi1,
          p_jiao1yi4pin3zhong3,
          p_zui4xin1,
          p_zhang3die1fu2,
          p_zui4gao1,
          p_zui4di1,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_zuo2shou1pan2jia4
        )
      }
  }

}

object JsonItem_energy_carbon_hbResponse extends Json_energy_carbon_hbResponse
