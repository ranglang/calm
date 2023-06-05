package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_money_supplyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_money_supply 目标地址: http://data.eastmoney.com/cjsj/hbgyl.html 描述:
  * 东方财富-经济数据-中国宏观-中国货币供应量; 数据区间从 200801 至今, 月度数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_money_supplyResponse(
  `p_yue4fen4`: String,
  `p_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2`: Double,
  `p_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3`: Double,
  `p_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3`: Double,
  `p_huo4bi4M1shu4liang4yi4yuan2`: Double,
  `p_huo4bi4M1tong2bi3zeng1zhang3`: Double,
  `p_huo4bi4M1huan2bi3zeng1zhang3`: Double,
  `p_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2`: Double,
  `p_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3`: Double,
  `p_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3`: Double
)

case class macro_china_money_supplyResponse(
  `p_yue4fen4`: String,
  `p_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2`: Double,
  `p_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3`: Double,
  `p_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3`: Double,
  `p_huo4bi4M1shu4liang4yi4yuan2`: Double,
  `p_huo4bi4M1tong2bi3zeng1zhang3`: Double,
  `p_huo4bi4M1huan2bi3zeng1zhang3`: Double,
  `p_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2`: Double,
  `p_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3`: Double,
  `p_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3`: Double
)

trait Json_macro_china_money_supplyResponse {

  implicit val a_macro_china_money_supplyResponse = new Decoder[macro_china_money_supplyResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_money_supplyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2 <- c.downField("货币和准货币(M2)数量(亿元)").as[Double]

        p_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3 <- c.downField("货币和准货币(M2)同比增长").as[Double]

        p_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3 <- c.downField("货币和准货币(M2)环比增长").as[Double]

        p_huo4bi4M1shu4liang4yi4yuan2 <- c.downField("货币(M1)数量(亿元)").as[Double]

        p_huo4bi4M1tong2bi3zeng1zhang3 <- c.downField("货币(M1)同比增长").as[Double]

        p_huo4bi4M1huan2bi3zeng1zhang3 <- c.downField("货币(M1)环比增长").as[Double]

        p_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2 <- c
          .downField("流通中的现金(M0)数量(亿元)")
          .as[Double]

        p_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3 <- c
          .downField("流通中的现金(M0)同比增长")
          .as[Double]

        p_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3 <- c
          .downField("流通中的现金(M0)环比增长")
          .as[Double]

      } yield {
        macro_china_money_supplyResponse(
          p_yue4fen4,
          p_huo4bi4he2zhun3huo4bi4M2shu4liang4yi4yuan2,
          p_huo4bi4he2zhun3huo4bi4M2tong2bi3zeng1zhang3,
          p_huo4bi4he2zhun3huo4bi4M2huan2bi3zeng1zhang3,
          p_huo4bi4M1shu4liang4yi4yuan2,
          p_huo4bi4M1tong2bi3zeng1zhang3,
          p_huo4bi4M1huan2bi3zeng1zhang3,
          p_liu2tong1zhong1de5xian4jin1M0shu4liang4yi4yuan2,
          p_liu2tong1zhong1de5xian4jin1M0tong2bi3zeng1zhang3,
          p_liu2tong1zhong1de5xian4jin1M0huan2bi3zeng1zhang3
        )
      }
  }

}

object JsonItem_macro_china_money_supplyResponse extends Json_macro_china_money_supplyResponse
