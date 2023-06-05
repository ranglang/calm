package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_supply_of_moneyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_supply_of_money 目标地址:
  * http://finance.sina.com.cn/mac/#fininfo-1-0-31-1 描述: 国家统计局-货币供应量 限量: 单次返回所有历史数据
  */
case class Respmacro_china_supply_of_moneyResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_huo4bi4he2zhun3huo4bi4guang3yi4huo4bi4M2`: Double,
  `p_huo4bi4he2zhun3huo4bi4guang3yi4huo4bi4M2tong2bi3zeng1zhang3`: Double,
  `p_huo4bi4xia2yi4huo4bi4M1`: Double,
  `p_huo4bi4xia2yi4huo4bi4M1tong2bi3zeng1zhang3`: Double,
  `p_liu2tong1zhong1xian4jin1M0`: Double,
  `p_liu2tong1zhong1xian4jin1M0tong2bi3zeng1zhang3`: Double,
  `p_huo2qi1cun2kuan3`: Double,
  `p_huo2qi1cun2kuan3tong2bi3zeng1zhang3`: Double,
  `p_zhun3huo4bi4`: Double,
  `p_zhun3huo4bi4tong2bi3zeng1zhang3`: Double,
  `p_ding4qi1cun2kuan3`: Double,
  `p_ding4qi1cun2kuan3tong2bi3zeng1zhang3`: Double,
  `p_chu3xu4cun2kuan3chu1`: Double,
  `p_chu3xu4cun2kuan3tong2bi3zeng1zhang3`: Double,
  `p_qi2ta1cun2kuan3`: Double,
  `p_qi2ta1cun2kuan3tong2bi3zeng1zhang3`: Double
)

case class macro_china_supply_of_moneyResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_huo4bi4he2zhun3huo4bi4guang3yi4huo4bi4M2`: Double,
  `p_huo4bi4he2zhun3huo4bi4guang3yi4huo4bi4M2tong2bi3zeng1zhang3`: Double,
  `p_huo4bi4xia2yi4huo4bi4M1`: Double,
  `p_huo4bi4xia2yi4huo4bi4M1tong2bi3zeng1zhang3`: Double,
  `p_liu2tong1zhong1xian4jin1M0`: Double,
  `p_liu2tong1zhong1xian4jin1M0tong2bi3zeng1zhang3`: Double,
  `p_huo2qi1cun2kuan3`: Double,
  `p_huo2qi1cun2kuan3tong2bi3zeng1zhang3`: Double,
  `p_zhun3huo4bi4`: Double,
  `p_zhun3huo4bi4tong2bi3zeng1zhang3`: Double,
  `p_ding4qi1cun2kuan3`: Double,
  `p_ding4qi1cun2kuan3tong2bi3zeng1zhang3`: Double,
  `p_chu3xu4cun2kuan3chu1`: Double,
  `p_chu3xu4cun2kuan3tong2bi3zeng1zhang3`: Double,
  `p_qi2ta1cun2kuan3`: Double,
  `p_qi2ta1cun2kuan3tong2bi3zeng1zhang3`: Double
)

trait Json_macro_china_supply_of_moneyResponse {

  implicit val a_macro_china_supply_of_moneyResponse =
    new Decoder[macro_china_supply_of_moneyResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_supply_of_moneyResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_tong3ji4shi2jian1 <- c.downField("统计时间").as[String]

          p_huo4bi4he2zhun3huo4bi4guang3yi4huo4bi4M2 <- c.downField("货币和准货币（广义货币M2）").as[Double]

          p_huo4bi4he2zhun3huo4bi4guang3yi4huo4bi4M2tong2bi3zeng1zhang3 <- c
            .downField("货币和准货币（广义货币M2）同比增长")
            .as[Double]

          p_huo4bi4xia2yi4huo4bi4M1 <- c.downField("货币(狭义货币M1)").as[Double]

          p_huo4bi4xia2yi4huo4bi4M1tong2bi3zeng1zhang3 <- c.downField("货币(狭义货币M1)同比增长").as[Double]

          p_liu2tong1zhong1xian4jin1M0 <- c.downField("流通中现金(M0)").as[Double]

          p_liu2tong1zhong1xian4jin1M0tong2bi3zeng1zhang3 <- c.downField("流通中现金(M0)同比增长").as[Double]

          p_huo2qi1cun2kuan3 <- c.downField("活期存款").as[Double]

          p_huo2qi1cun2kuan3tong2bi3zeng1zhang3 <- c.downField("活期存款同比增长").as[Double]

          p_zhun3huo4bi4 <- c.downField("准货币").as[Double]

          p_zhun3huo4bi4tong2bi3zeng1zhang3 <- c.downField("准货币同比增长").as[Double]

          p_ding4qi1cun2kuan3 <- c.downField("定期存款").as[Double]

          p_ding4qi1cun2kuan3tong2bi3zeng1zhang3 <- c.downField("定期存款同比增长").as[Double]

          p_chu3xu4cun2kuan3chu1 <- c.downField("储蓄存款出").as[Double]

          p_chu3xu4cun2kuan3tong2bi3zeng1zhang3 <- c.downField("储蓄存款同比增长").as[Double]

          p_qi2ta1cun2kuan3 <- c.downField("其他存款").as[Double]

          p_qi2ta1cun2kuan3tong2bi3zeng1zhang3 <- c.downField("其他存款同比增长").as[Double]

        } yield {
          macro_china_supply_of_moneyResponse(
            p_tong3ji4shi2jian1,
            p_huo4bi4he2zhun3huo4bi4guang3yi4huo4bi4M2,
            p_huo4bi4he2zhun3huo4bi4guang3yi4huo4bi4M2tong2bi3zeng1zhang3,
            p_huo4bi4xia2yi4huo4bi4M1,
            p_huo4bi4xia2yi4huo4bi4M1tong2bi3zeng1zhang3,
            p_liu2tong1zhong1xian4jin1M0,
            p_liu2tong1zhong1xian4jin1M0tong2bi3zeng1zhang3,
            p_huo2qi1cun2kuan3,
            p_huo2qi1cun2kuan3tong2bi3zeng1zhang3,
            p_zhun3huo4bi4,
            p_zhun3huo4bi4tong2bi3zeng1zhang3,
            p_ding4qi1cun2kuan3,
            p_ding4qi1cun2kuan3tong2bi3zeng1zhang3,
            p_chu3xu4cun2kuan3chu1,
            p_chu3xu4cun2kuan3tong2bi3zeng1zhang3,
            p_qi2ta1cun2kuan3,
            p_qi2ta1cun2kuan3tong2bi3zeng1zhang3
          )
        }
    }

}

object JsonItem_macro_china_supply_of_moneyResponse extends Json_macro_china_supply_of_moneyResponse
