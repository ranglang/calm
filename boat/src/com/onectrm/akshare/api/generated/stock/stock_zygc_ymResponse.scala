package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zygc_ymResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zygc_ym 目标地址: http://f10.emoney.cn/f10/zbyz/1000001 描述: 益盟-F10-主营构成 限量:
  * 单次返回所有历史数据
  */
case class Respstock_zygc_ymResponse(
  `p_bao4gao4qi1`: String,
  `p_fen1lei4fang1xiang4`: String,
  `p_fen1lei4`: String,
  `p_ying2ye4shou1ru4`: String,
  `p_ying2ye4shou1ru4tong2bi3zeng1zhang3`: String,
  `p_ying2ye4shou1ru4zhan4zhu3ying2shou1ru4bi3`: String,
  `p_ying2ye4cheng2ben3`: String,
  `p_ying2ye4cheng2ben3tong2bi3zeng1zhang3`: String,
  `p_ying2ye4cheng2ben3zhan4zhu3ying2cheng2ben3bi3`: String,
  `p_mao2li4lu4`: String,
  `p_mao2li4lu4tong2bi3zeng1zhang3`: String
)

case class stock_zygc_ymResponse(
  `p_bao4gao4qi1`: String,
  `p_fen1lei4fang1xiang4`: String,
  `p_fen1lei4`: String,
  `p_ying2ye4shou1ru4`: String,
  `p_ying2ye4shou1ru4tong2bi3zeng1zhang3`: String,
  `p_ying2ye4shou1ru4zhan4zhu3ying2shou1ru4bi3`: String,
  `p_ying2ye4cheng2ben3`: String,
  `p_ying2ye4cheng2ben3tong2bi3zeng1zhang3`: String,
  `p_ying2ye4cheng2ben3zhan4zhu3ying2cheng2ben3bi3`: String,
  `p_mao2li4lu4`: String,
  `p_mao2li4lu4tong2bi3zeng1zhang3`: String
)

trait Json_stock_zygc_ymResponse {

  implicit val a_stock_zygc_ymResponse = new Decoder[stock_zygc_ymResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zygc_ymResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_bao4gao4qi1 <- c.downField("报告期").as[String]

        p_fen1lei4fang1xiang4 <- c.downField("分类方向").as[String]

        p_fen1lei4 <- c.downField("分类").as[String]

        p_ying2ye4shou1ru4 <- c.downField("营业收入").as[String]

        p_ying2ye4shou1ru4tong2bi3zeng1zhang3 <- c.downField("营业收入-同比增长").as[String]

        p_ying2ye4shou1ru4zhan4zhu3ying2shou1ru4bi3 <- c.downField("营业收入-占主营收入比").as[String]

        p_ying2ye4cheng2ben3 <- c.downField("营业成本").as[String]

        p_ying2ye4cheng2ben3tong2bi3zeng1zhang3 <- c.downField("营业成本-同比增长").as[String]

        p_ying2ye4cheng2ben3zhan4zhu3ying2cheng2ben3bi3 <- c.downField("营业成本-占主营成本比").as[String]

        p_mao2li4lu4 <- c.downField("毛利率").as[String]

        p_mao2li4lu4tong2bi3zeng1zhang3 <- c.downField("毛利率-同比增长").as[String]

      } yield {
        stock_zygc_ymResponse(
          p_bao4gao4qi1,
          p_fen1lei4fang1xiang4,
          p_fen1lei4,
          p_ying2ye4shou1ru4,
          p_ying2ye4shou1ru4tong2bi3zeng1zhang3,
          p_ying2ye4shou1ru4zhan4zhu3ying2shou1ru4bi3,
          p_ying2ye4cheng2ben3,
          p_ying2ye4cheng2ben3tong2bi3zeng1zhang3,
          p_ying2ye4cheng2ben3zhan4zhu3ying2cheng2ben3bi3,
          p_mao2li4lu4,
          p_mao2li4lu4tong2bi3zeng1zhang3
        )
      }
  }

}

object JsonItem_stock_zygc_ymResponse extends Json_stock_zygc_ymResponse
