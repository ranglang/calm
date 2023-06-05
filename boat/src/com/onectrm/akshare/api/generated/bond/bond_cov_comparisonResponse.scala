package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_cov_comparisonResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_cov_comparison 目标地址:
  * http://quote.eastmoney.com/center/fullscreenlist.html#convertible_comparison 描述:
  * 东方财富网-行情中心-债券市场-可转债比价表 限量: 单次返回当前交易时刻的所有可转债比价数据
  */
case class Respbond_cov_comparisonResponse(
  `p_xu4hao4`: Long,
  `p_zhuan3zhai4dai4ma3`: String,
  `p_zhuan3zhai4ming2cheng1`: String,
  `p_zhuan3zhai4zui4xin1jia4`: String,
  `p_zhuan3zhai4zhang3die1fu2`: String,
  `p_zheng4gu3dai4ma3`: String,
  `p_zheng4gu3ming2cheng1`: String,
  `p_zheng4gu3zui4xin1jia4`: String,
  `p_zheng4gu3zhang3die1fu2`: String,
  `p_zhuan3gu3jia4`: String,
  `p_zhuan3gu3jia4zhi2`: String,
  `p_zhuan3gu3yi4jia4lu4`: String,
  `p_chun2zhai4yi4jia4lu4`: String,
  `p_hui2shou4chu4fa1jia4`: String,
  `p_qiang2shu2chu4fa1jia4`: String,
  `p_dao4qi1shu2hui2jia4`: String,
  `p_chun2zhai4jia4zhi2`: Double,
  `p_kai1shi3zhuan3gu3ri4`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_shen1gou4ri4qi1`: String
)

case class bond_cov_comparisonResponse(
  `p_xu4hao4`: Long,
  `p_zhuan3zhai4dai4ma3`: String,
  `p_zhuan3zhai4ming2cheng1`: String,
  `p_zhuan3zhai4zui4xin1jia4`: String,
  `p_zhuan3zhai4zhang3die1fu2`: String,
  `p_zheng4gu3dai4ma3`: String,
  `p_zheng4gu3ming2cheng1`: String,
  `p_zheng4gu3zui4xin1jia4`: String,
  `p_zheng4gu3zhang3die1fu2`: String,
  `p_zhuan3gu3jia4`: String,
  `p_zhuan3gu3jia4zhi2`: String,
  `p_zhuan3gu3yi4jia4lu4`: String,
  `p_chun2zhai4yi4jia4lu4`: String,
  `p_hui2shou4chu4fa1jia4`: String,
  `p_qiang2shu2chu4fa1jia4`: String,
  `p_dao4qi1shu2hui2jia4`: String,
  `p_chun2zhai4jia4zhi2`: Double,
  `p_kai1shi3zhuan3gu3ri4`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_shen1gou4ri4qi1`: String
)

trait Json_bond_cov_comparisonResponse {

  implicit val a_bond_cov_comparisonResponse = new Decoder[bond_cov_comparisonResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_cov_comparisonResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_zhuan3zhai4dai4ma3 <- c.downField("转债代码").as[String]

        p_zhuan3zhai4ming2cheng1 <- c.downField("转债名称").as[String]

        p_zhuan3zhai4zui4xin1jia4 <- c.downField("转债最新价").as[String]

        p_zhuan3zhai4zhang3die1fu2 <- c.downField("转债涨跌幅").as[String]

        p_zheng4gu3dai4ma3 <- c.downField("正股代码").as[String]

        p_zheng4gu3ming2cheng1 <- c.downField("正股名称").as[String]

        p_zheng4gu3zui4xin1jia4 <- c.downField("正股最新价").as[String]

        p_zheng4gu3zhang3die1fu2 <- c.downField("正股涨跌幅").as[String]

        p_zhuan3gu3jia4 <- c.downField("转股价").as[String]

        p_zhuan3gu3jia4zhi2 <- c.downField("转股价值").as[String]

        p_zhuan3gu3yi4jia4lu4 <- c.downField("转股溢价率").as[String]

        p_chun2zhai4yi4jia4lu4 <- c.downField("纯债溢价率").as[String]

        p_hui2shou4chu4fa1jia4 <- c.downField("回售触发价").as[String]

        p_qiang2shu2chu4fa1jia4 <- c.downField("强赎触发价").as[String]

        p_dao4qi1shu2hui2jia4 <- c.downField("到期赎回价").as[String]

        p_chun2zhai4jia4zhi2 <- c.downField("纯债价值").as[Double]

        p_kai1shi3zhuan3gu3ri4 <- c.downField("开始转股日").as[String]

        p_shang4shi4ri4qi1 <- c.downField("上市日期").as[String]

        p_shen1gou4ri4qi1 <- c.downField("申购日期").as[String]

      } yield {
        bond_cov_comparisonResponse(
          p_xu4hao4,
          p_zhuan3zhai4dai4ma3,
          p_zhuan3zhai4ming2cheng1,
          p_zhuan3zhai4zui4xin1jia4,
          p_zhuan3zhai4zhang3die1fu2,
          p_zheng4gu3dai4ma3,
          p_zheng4gu3ming2cheng1,
          p_zheng4gu3zui4xin1jia4,
          p_zheng4gu3zhang3die1fu2,
          p_zhuan3gu3jia4,
          p_zhuan3gu3jia4zhi2,
          p_zhuan3gu3yi4jia4lu4,
          p_chun2zhai4yi4jia4lu4,
          p_hui2shou4chu4fa1jia4,
          p_qiang2shu2chu4fa1jia4,
          p_dao4qi1shu2hui2jia4,
          p_chun2zhai4jia4zhi2,
          p_kai1shi3zhuan3gu3ri4,
          p_shang4shi4ri4qi1,
          p_shen1gou4ri4qi1
        )
      }
  }

}

object JsonItem_bond_cov_comparisonResponse extends Json_bond_cov_comparisonResponse
