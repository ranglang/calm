package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_cb_jslResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_cb_jsl 目标地址: https://app.jisilu.cn/data/cbnew/#cb 描述:
  * 集思录可转债实时数据，包含行情数据（涨跌幅，成交量和换手率等）及可转债基本信息（转股价，溢价率和到期收益率等） 限量: 单次返回当前交易时刻的所有数据
  */
case class Respbond_cb_jslResponse(
  `p_dai4ma3`: String,
  `p_zhuan3zhai4ming2cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zheng4gu3dai4ma3`: String,
  `p_zheng4gu3ming2cheng1`: String,
  `p_zheng4gu3jia4`: Double,
  `p_zheng4gu3zhang3die1`: Double,
  `p_zheng4gu3PB`: Double,
  `p_zhuan3gu3jia4`: Double,
  `p_zhuan3gu3jia4zhi2`: Double,
  `p_zhuan3gu3yi4jia4lu4`: Double,
  `p_shuang1di1`: Double,
  `p_xia4xiu1tiao2jian4`: String,
  `p_ping2ji2`: String,
  `p_hui2shou4chu4fa1jia4`: Double,
  `p_qiang2shu2chu4fa1jia4`: Double,
  `p_zhuan3zhai4liu2tong1shi4zhi2zhan4bi3`: Double,
  `p_dao4qi1shi2jian1`: String,
  `p_sheng4yu2nian2xian4`: Double,
  `p_sheng4yu2gui1mo2`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_dao4qi1shui4qian2shou1yi4`: Double
)

case class bond_cb_jslResponse(
  `p_dai4ma3`: String,
  `p_zhuan3zhai4ming2cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zheng4gu3dai4ma3`: String,
  `p_zheng4gu3ming2cheng1`: String,
  `p_zheng4gu3jia4`: Double,
  `p_zheng4gu3zhang3die1`: Double,
  `p_zheng4gu3PB`: Double,
  `p_zhuan3gu3jia4`: Double,
  `p_zhuan3gu3jia4zhi2`: Double,
  `p_zhuan3gu3yi4jia4lu4`: Double,
  `p_shuang1di1`: Double,
  `p_xia4xiu1tiao2jian4`: String,
  `p_ping2ji2`: String,
  `p_hui2shou4chu4fa1jia4`: Double,
  `p_qiang2shu2chu4fa1jia4`: Double,
  `p_zhuan3zhai4liu2tong1shi4zhi2zhan4bi3`: Double,
  `p_dao4qi1shi2jian1`: String,
  `p_sheng4yu2nian2xian4`: Double,
  `p_sheng4yu2gui1mo2`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_dao4qi1shui4qian2shou1yi4`: Double
)

trait Json_bond_cb_jslResponse {

  implicit val a_bond_cb_jslResponse = new Decoder[bond_cb_jslResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_cb_jslResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_zhuan3zhai4ming2cheng1 <- c.downField("转债名称").as[String]

        p_xian4jia4 <- c.downField("现价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_zheng4gu3dai4ma3 <- c.downField("正股代码").as[String]

        p_zheng4gu3ming2cheng1 <- c.downField("正股名称").as[String]

        p_zheng4gu3jia4 <- c.downField("正股价").as[Double]

        p_zheng4gu3zhang3die1 <- c.downField("正股涨跌").as[Double]

        p_zheng4gu3PB <- c.downField("正股PB").as[Double]

        p_zhuan3gu3jia4 <- c.downField("转股价").as[Double]

        p_zhuan3gu3jia4zhi2 <- c.downField("转股价值").as[Double]

        p_zhuan3gu3yi4jia4lu4 <- c.downField("转股溢价率").as[Double]

        p_shuang1di1 <- c.downField("双低").as[Double]

        p_xia4xiu1tiao2jian4 <- c.downField("下修条件").as[String]

        p_ping2ji2 <- c.downField("评级").as[String]

        p_hui2shou4chu4fa1jia4 <- c.downField("回售触发价").as[Double]

        p_qiang2shu2chu4fa1jia4 <- c.downField("强赎触发价").as[Double]

        p_zhuan3zhai4liu2tong1shi4zhi2zhan4bi3 <- c.downField("转债流通市值占比").as[Double]

        p_dao4qi1shi2jian1 <- c.downField("到期时间").as[String]

        p_sheng4yu2nian2xian4 <- c.downField("剩余年限").as[Double]

        p_sheng4yu2gui1mo2 <- c.downField("剩余规模").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

        p_dao4qi1shui4qian2shou1yi4 <- c.downField("到期税前收益").as[Double]

      } yield {
        bond_cb_jslResponse(
          p_dai4ma3,
          p_zhuan3zhai4ming2cheng1,
          p_xian4jia4,
          p_zhang3die1fu2,
          p_zheng4gu3dai4ma3,
          p_zheng4gu3ming2cheng1,
          p_zheng4gu3jia4,
          p_zheng4gu3zhang3die1,
          p_zheng4gu3PB,
          p_zhuan3gu3jia4,
          p_zhuan3gu3jia4zhi2,
          p_zhuan3gu3yi4jia4lu4,
          p_shuang1di1,
          p_xia4xiu1tiao2jian4,
          p_ping2ji2,
          p_hui2shou4chu4fa1jia4,
          p_qiang2shu2chu4fa1jia4,
          p_zhuan3zhai4liu2tong1shi4zhi2zhan4bi3,
          p_dao4qi1shi2jian1,
          p_sheng4yu2nian2xian4,
          p_sheng4yu2gui1mo2,
          p_cheng2jiao1e2,
          p_huan4shou3lu4,
          p_dao4qi1shui4qian2shou1yi4
        )
      }
  }

}

object JsonItem_bond_cb_jslResponse extends Json_bond_cb_jslResponse
