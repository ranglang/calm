package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_freight_indexResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_freight_index 目标地址:
  * http://finance.sina.com.cn/mac/#industry-22-0-31-2 描述: 国家统计局-航贸运价指数 限量: 单次返回所有历史数据
  */
case class Respmacro_china_freight_indexResponse(
  `p_jie2zhi3ri4qi1`: String,
  `p_bo1luo2de5hai3hao3wang4jiao3xing2chuan2yun4jia4zhi3shu4BCI`: Double,
  `p_ling2bian4xing2chuan2zong1he2yun4jia4zhi3shu4BHMI`: Double,
  `p_bo1luo2de5hai3chao1ji2da4ling2bian4xing2chuan2BSIzhi3shu4`: Double,
  `p_bo1luo2de5hai3zong1he2yun4jia4zhi3shu4BDI`: Double,
  `p_HRCIguo2ji4ji2zhuang1xiang1zu1chuan2zhi3shu4`: Double,
  `p_you2lun2yun4jia4zhi3shu4cheng2pin3you2yun4jia4zhi3shu4BCTI`: Double,
  `p_you2lun2yun4jia4zhi3shu4yuan2you2yun4jia4zhi3shu4BDTI`: Double
)

case class macro_china_freight_indexResponse(
  `p_jie2zhi3ri4qi1`: String,
  `p_bo1luo2de5hai3hao3wang4jiao3xing2chuan2yun4jia4zhi3shu4BCI`: Double,
  `p_ling2bian4xing2chuan2zong1he2yun4jia4zhi3shu4BHMI`: Double,
  `p_bo1luo2de5hai3chao1ji2da4ling2bian4xing2chuan2BSIzhi3shu4`: Double,
  `p_bo1luo2de5hai3zong1he2yun4jia4zhi3shu4BDI`: Double,
  `p_HRCIguo2ji4ji2zhuang1xiang1zu1chuan2zhi3shu4`: Double,
  `p_you2lun2yun4jia4zhi3shu4cheng2pin3you2yun4jia4zhi3shu4BCTI`: Double,
  `p_you2lun2yun4jia4zhi3shu4yuan2you2yun4jia4zhi3shu4BDTI`: Double
)

trait Json_macro_china_freight_indexResponse {

  implicit val a_macro_china_freight_indexResponse =
    new Decoder[macro_china_freight_indexResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_freight_indexResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_jie2zhi3ri4qi1 <- c.downField("截止日期").as[String]

          p_bo1luo2de5hai3hao3wang4jiao3xing2chuan2yun4jia4zhi3shu4BCI <- c
            .downField("波罗的海好望角型船运价指数BCI")
            .as[Double]

          p_ling2bian4xing2chuan2zong1he2yun4jia4zhi3shu4BHMI <- c
            .downField("灵便型船综合运价指数BHMI")
            .as[Double]

          p_bo1luo2de5hai3chao1ji2da4ling2bian4xing2chuan2BSIzhi3shu4 <- c
            .downField("波罗的海超级大灵便型船BSI指数")
            .as[Double]

          p_bo1luo2de5hai3zong1he2yun4jia4zhi3shu4BDI <- c.downField("波罗的海综合运价指数BDI").as[Double]

          p_HRCIguo2ji4ji2zhuang1xiang1zu1chuan2zhi3shu4 <- c.downField("HRCI国际集装箱租船指数").as[Double]

          p_you2lun2yun4jia4zhi3shu4cheng2pin3you2yun4jia4zhi3shu4BCTI <- c
            .downField("油轮运价指数成品油运价指数BCTI")
            .as[Double]

          p_you2lun2yun4jia4zhi3shu4yuan2you2yun4jia4zhi3shu4BDTI <- c
            .downField("油轮运价指数原油运价指数BDTI")
            .as[Double]

        } yield {
          macro_china_freight_indexResponse(
            p_jie2zhi3ri4qi1,
            p_bo1luo2de5hai3hao3wang4jiao3xing2chuan2yun4jia4zhi3shu4BCI,
            p_ling2bian4xing2chuan2zong1he2yun4jia4zhi3shu4BHMI,
            p_bo1luo2de5hai3chao1ji2da4ling2bian4xing2chuan2BSIzhi3shu4,
            p_bo1luo2de5hai3zong1he2yun4jia4zhi3shu4BDI,
            p_HRCIguo2ji4ji2zhuang1xiang1zu1chuan2zhi3shu4,
            p_you2lun2yun4jia4zhi3shu4cheng2pin3you2yun4jia4zhi3shu4BCTI,
            p_you2lun2yun4jia4zhi3shu4yuan2you2yun4jia4zhi3shu4BDTI
          )
        }
    }

}

object JsonItem_macro_china_freight_indexResponse extends Json_macro_china_freight_indexResponse
