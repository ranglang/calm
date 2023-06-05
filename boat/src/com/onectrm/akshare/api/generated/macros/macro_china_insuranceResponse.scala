package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_insuranceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_insurance 目标地址: http://finance.sina.com.cn/mac/#fininfo-19-0-31-3 描述:
  * 国家统计局-保险业经营情况 限量: 单次返回所有历史数据
  */
case class Respmacro_china_insuranceResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_sheng3shi4di4qu1`: Double,
  `p_yuan2bao3xian3bao3fei4shou1ru4`: Double,
  `p_cai2chan3xian3bao3fei4shou1ru4`: Double,
  `p_ren2shen1xian3bao3fei4shou1ru4`: Double,
  `p_ren2shen1xian3shou4xian3bao3fei4shou1ru4`: Double,
  `p_ren2shen1xian3jian4kang1xian3bao3fei4shou1ru4`: Double,
  `p_ren2shen1xian3yi4wai4xian3bao3fei4shou1ru4`: Double,
  `p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1jiao3fei4`: Double,
  `p_yuan2bao3xian3pei2fu4zhi1chu1`: Double,
  `p_cai2chan3xian3bao3fei4pei2fu4zhi1chu1`: Double,
  `p_ren2shen1xian3bao3fei4pei2fu4zhi1chu1`: Double,
  `p_ren2shen1xian3shou4xian3pei2fu4zhi1chu1`: Double,
  `p_ren2shen1xian3jian4kang1xian3pei2fu4zhi1chu1`: Double,
  `p_ren2shen1xian3yi4wai4xian3pei2fu4zhi1chu1`: Double,
  `p_ye4wu4ji2guan3li3fei4`: Double,
  `p_yin2xing2cun2kuan3`: Double,
  `p_tou2zi1`: Double,
  `p_zi1chan3zong3e2`: Double,
  `p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1shou4tuo1guan3li3zi1chan3`: Double,
  `p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1tou2zi1guan3li3zi1chan3`: Double
)

case class macro_china_insuranceResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_sheng3shi4di4qu1`: Double,
  `p_yuan2bao3xian3bao3fei4shou1ru4`: Double,
  `p_cai2chan3xian3bao3fei4shou1ru4`: Double,
  `p_ren2shen1xian3bao3fei4shou1ru4`: Double,
  `p_ren2shen1xian3shou4xian3bao3fei4shou1ru4`: Double,
  `p_ren2shen1xian3jian4kang1xian3bao3fei4shou1ru4`: Double,
  `p_ren2shen1xian3yi4wai4xian3bao3fei4shou1ru4`: Double,
  `p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1jiao3fei4`: Double,
  `p_yuan2bao3xian3pei2fu4zhi1chu1`: Double,
  `p_cai2chan3xian3bao3fei4pei2fu4zhi1chu1`: Double,
  `p_ren2shen1xian3bao3fei4pei2fu4zhi1chu1`: Double,
  `p_ren2shen1xian3shou4xian3pei2fu4zhi1chu1`: Double,
  `p_ren2shen1xian3jian4kang1xian3pei2fu4zhi1chu1`: Double,
  `p_ren2shen1xian3yi4wai4xian3pei2fu4zhi1chu1`: Double,
  `p_ye4wu4ji2guan3li3fei4`: Double,
  `p_yin2xing2cun2kuan3`: Double,
  `p_tou2zi1`: Double,
  `p_zi1chan3zong3e2`: Double,
  `p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1shou4tuo1guan3li3zi1chan3`: Double,
  `p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1tou2zi1guan3li3zi1chan3`: Double
)

trait Json_macro_china_insuranceResponse {

  implicit val a_macro_china_insuranceResponse = new Decoder[macro_china_insuranceResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_insuranceResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_tong3ji4shi2jian1 <- c.downField("统计时间").as[String]

        p_sheng3shi4di4qu1 <- c.downField("省市地区").as[Double]

        p_yuan2bao3xian3bao3fei4shou1ru4 <- c.downField("原保险保费收入").as[Double]

        p_cai2chan3xian3bao3fei4shou1ru4 <- c.downField("财产险保费收入").as[Double]

        p_ren2shen1xian3bao3fei4shou1ru4 <- c.downField("人身险保费收入").as[Double]

        p_ren2shen1xian3shou4xian3bao3fei4shou1ru4 <- c.downField("人身险-寿险保费收入").as[Double]

        p_ren2shen1xian3jian4kang1xian3bao3fei4shou1ru4 <- c.downField("人身险-健康险保费收入").as[Double]

        p_ren2shen1xian3yi4wai4xian3bao3fei4shou1ru4 <- c.downField("人身险-意外险保费收入").as[Double]

        p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1jiao3fei4 <- c
          .downField("养老保险公司企业年金缴费")
          .as[Double]

        p_yuan2bao3xian3pei2fu4zhi1chu1 <- c.downField("原保险赔付支出").as[Double]

        p_cai2chan3xian3bao3fei4pei2fu4zhi1chu1 <- c.downField("财产险保费赔付支出").as[Double]

        p_ren2shen1xian3bao3fei4pei2fu4zhi1chu1 <- c.downField("人身险保费赔付支出").as[Double]

        p_ren2shen1xian3shou4xian3pei2fu4zhi1chu1 <- c.downField("人身险-寿险赔付支出").as[Double]

        p_ren2shen1xian3jian4kang1xian3pei2fu4zhi1chu1 <- c.downField("人身险-健康险赔付支出").as[Double]

        p_ren2shen1xian3yi4wai4xian3pei2fu4zhi1chu1 <- c.downField("人身险-意外险赔付支出").as[Double]

        p_ye4wu4ji2guan3li3fei4 <- c.downField("业务及管理费").as[Double]

        p_yin2xing2cun2kuan3 <- c.downField("银行存款").as[Double]

        p_tou2zi1 <- c.downField("投资").as[Double]

        p_zi1chan3zong3e2 <- c.downField("资产总额").as[Double]

        p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1shou4tuo1guan3li3zi1chan3 <- c
          .downField("养老保险公司企业年金受托管理资产")
          .as[Double]

        p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1tou2zi1guan3li3zi1chan3 <- c
          .downField("养老保险公司企业年金投资管理资产")
          .as[Double]

      } yield {
        macro_china_insuranceResponse(
          p_tong3ji4shi2jian1,
          p_sheng3shi4di4qu1,
          p_yuan2bao3xian3bao3fei4shou1ru4,
          p_cai2chan3xian3bao3fei4shou1ru4,
          p_ren2shen1xian3bao3fei4shou1ru4,
          p_ren2shen1xian3shou4xian3bao3fei4shou1ru4,
          p_ren2shen1xian3jian4kang1xian3bao3fei4shou1ru4,
          p_ren2shen1xian3yi4wai4xian3bao3fei4shou1ru4,
          p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1jiao3fei4,
          p_yuan2bao3xian3pei2fu4zhi1chu1,
          p_cai2chan3xian3bao3fei4pei2fu4zhi1chu1,
          p_ren2shen1xian3bao3fei4pei2fu4zhi1chu1,
          p_ren2shen1xian3shou4xian3pei2fu4zhi1chu1,
          p_ren2shen1xian3jian4kang1xian3pei2fu4zhi1chu1,
          p_ren2shen1xian3yi4wai4xian3pei2fu4zhi1chu1,
          p_ye4wu4ji2guan3li3fei4,
          p_yin2xing2cun2kuan3,
          p_tou2zi1,
          p_zi1chan3zong3e2,
          p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1shou4tuo1guan3li3zi1chan3,
          p_yang3lao3bao3xian3gong1si1qi3ye4nian2jin1tou2zi1guan3li3zi1chan3
        )
      }
  }

}

object JsonItem_macro_china_insuranceResponse extends Json_macro_china_insuranceResponse
