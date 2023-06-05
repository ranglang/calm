package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_zh_covResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_zh_cov 目标地址: http://data.eastmoney.com/kzz/default.html 描述:
  * 东方财富网-数据中心-新股数据-可转债数据一览表 限量: 单次返回当前交易时刻的所有可转债数据
  */
case class Respbond_zh_covResponse(
  `p_zhai4quan4dai4ma3`: String,
  `p_zhai4quan4jian3cheng1`: String,
  `p_shen1gou4ri4qi1`: String,
  `p_shen1gou4dai4ma3`: String,
  `p_shen1gou4shang4xian4`: Double,
  `p_zheng4gu3dai4ma3`: String,
  `p_zheng4gu3jian3cheng1`: String,
  `p_zheng4gu3jia4`: Double,
  `p_zhuan3gu3jia4`: Double,
  `p_zhuan3gu3jia4zhi2`: Double,
  `p_zhai4xian4jia4`: Double,
  `p_zhuan3gu3yi4jia4lu4`: Double,
  `p_yuan2gu3dong1pei4shou4gu3quan2deng1ji4ri4`: Double,
  `p_yuan2gu3dong1pei4shou4mei3gu3pei4shou4e2`: String,
  `p_fa1xing2gui1mo2`: Double,
  `p_zhong1qian1hao4fa1bu4ri4`: String,
  `p_zhong1qian1lu4`: Double,
  `p_shang4shi4shi2jian1`: String
)

case class bond_zh_covResponse(
  `p_zhai4quan4dai4ma3`: String,
  `p_zhai4quan4jian3cheng1`: String,
  `p_shen1gou4ri4qi1`: String,
  `p_shen1gou4dai4ma3`: String,
  `p_shen1gou4shang4xian4`: Double,
  `p_zheng4gu3dai4ma3`: String,
  `p_zheng4gu3jian3cheng1`: String,
  `p_zheng4gu3jia4`: Double,
  `p_zhuan3gu3jia4`: Double,
  `p_zhuan3gu3jia4zhi2`: Double,
  `p_zhai4xian4jia4`: Double,
  `p_zhuan3gu3yi4jia4lu4`: Double,
  `p_yuan2gu3dong1pei4shou4gu3quan2deng1ji4ri4`: Double,
  `p_yuan2gu3dong1pei4shou4mei3gu3pei4shou4e2`: String,
  `p_fa1xing2gui1mo2`: Double,
  `p_zhong1qian1hao4fa1bu4ri4`: String,
  `p_zhong1qian1lu4`: Double,
  `p_shang4shi4shi2jian1`: String
)

trait Json_bond_zh_covResponse {

  implicit val a_bond_zh_covResponse = new Decoder[bond_zh_covResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_zh_covResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zhai4quan4dai4ma3 <- c.downField("债券代码").as[String]

        p_zhai4quan4jian3cheng1 <- c.downField("债券简称").as[String]

        p_shen1gou4ri4qi1 <- c.downField("申购日期").as[String]

        p_shen1gou4dai4ma3 <- c.downField("申购代码").as[String]

        p_shen1gou4shang4xian4 <- c.downField("申购上限").as[Double]

        p_zheng4gu3dai4ma3 <- c.downField("正股代码").as[String]

        p_zheng4gu3jian3cheng1 <- c.downField("正股简称").as[String]

        p_zheng4gu3jia4 <- c.downField("正股价").as[Double]

        p_zhuan3gu3jia4 <- c.downField("转股价").as[Double]

        p_zhuan3gu3jia4zhi2 <- c.downField("转股价值").as[Double]

        p_zhai4xian4jia4 <- c.downField("债现价").as[Double]

        p_zhuan3gu3yi4jia4lu4 <- c.downField("转股溢价率").as[Double]

        p_yuan2gu3dong1pei4shou4gu3quan2deng1ji4ri4 <- c.downField("原股东配售-股权登记日").as[Double]

        p_yuan2gu3dong1pei4shou4mei3gu3pei4shou4e2 <- c.downField("原股东配售-每股配售额").as[String]

        p_fa1xing2gui1mo2 <- c.downField("发行规模").as[Double]

        p_zhong1qian1hao4fa1bu4ri4 <- c.downField("中签号发布日").as[String]

        p_zhong1qian1lu4 <- c.downField("中签率").as[Double]

        p_shang4shi4shi2jian1 <- c.downField("上市时间").as[String]

      } yield {
        bond_zh_covResponse(
          p_zhai4quan4dai4ma3,
          p_zhai4quan4jian3cheng1,
          p_shen1gou4ri4qi1,
          p_shen1gou4dai4ma3,
          p_shen1gou4shang4xian4,
          p_zheng4gu3dai4ma3,
          p_zheng4gu3jian3cheng1,
          p_zheng4gu3jia4,
          p_zhuan3gu3jia4,
          p_zhuan3gu3jia4zhi2,
          p_zhai4xian4jia4,
          p_zhuan3gu3yi4jia4lu4,
          p_yuan2gu3dong1pei4shou4gu3quan2deng1ji4ri4,
          p_yuan2gu3dong1pei4shou4mei3gu3pei4shou4e2,
          p_fa1xing2gui1mo2,
          p_zhong1qian1hao4fa1bu4ri4,
          p_zhong1qian1lu4,
          p_shang4shi4shi2jian1
        )
      }
  }

}

object JsonItem_bond_zh_covResponse extends Json_bond_zh_covResponse
