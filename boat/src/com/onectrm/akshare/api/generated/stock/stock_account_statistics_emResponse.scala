package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_account_statistics_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_account_statistics_em 目标地址: http://data.eastmoney.com/cjsj/gpkhsj.html 描述:
  * 东方财富网-数据中心-特色数据-股票账户统计 限量: 单次获取从 201504 开始至今的所有历史数据
  */
case class Respstock_account_statistics_emResponse(
  `p_shu4ju4ri4qi1`: String,
  `p_xin1zeng1tou2zi1zhe3shu4liang4`: Double,
  `p_xin1zeng1tou2zi1zhe3huan2bi3`: Double,
  `p_xin1zeng1tou2zi1zhe3tong2bi3`: Double,
  `p_qi1mo4tou2zi1zhe3zong3liang4`: Double,
  `p_qi1mo4tou2zi1zhe3Agu3zhang4hu4`: Double,
  `p_qi1mo4tou2zi1zhe3Bgu3zhang4hu4`: Double,
  `p_hu4shen1zong3shi4zhi2`: Double,
  `p_hu4shen1hu4jun1shi4zhi2`: Double,
  `p_shang4zheng4zhi3shu4shou1pan2`: Double,
  `p_shang4zheng4zhi3shu4zhang3die1fu2`: Double
)

case class stock_account_statistics_emResponse(
  `p_shu4ju4ri4qi1`: String,
  `p_xin1zeng1tou2zi1zhe3shu4liang4`: Double,
  `p_xin1zeng1tou2zi1zhe3huan2bi3`: Double,
  `p_xin1zeng1tou2zi1zhe3tong2bi3`: Double,
  `p_qi1mo4tou2zi1zhe3zong3liang4`: Double,
  `p_qi1mo4tou2zi1zhe3Agu3zhang4hu4`: Double,
  `p_qi1mo4tou2zi1zhe3Bgu3zhang4hu4`: Double,
  `p_hu4shen1zong3shi4zhi2`: Double,
  `p_hu4shen1hu4jun1shi4zhi2`: Double,
  `p_shang4zheng4zhi3shu4shou1pan2`: Double,
  `p_shang4zheng4zhi3shu4zhang3die1fu2`: Double
)

trait Json_stock_account_statistics_emResponse {

  implicit val a_stock_account_statistics_emResponse =
    new Decoder[stock_account_statistics_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_account_statistics_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_shu4ju4ri4qi1 <- c.downField("数据日期").as[String]

          p_xin1zeng1tou2zi1zhe3shu4liang4 <- c.downField("新增投资者-数量").as[Double]

          p_xin1zeng1tou2zi1zhe3huan2bi3 <- c.downField("新增投资者-环比").as[Double]

          p_xin1zeng1tou2zi1zhe3tong2bi3 <- c.downField("新增投资者-同比").as[Double]

          p_qi1mo4tou2zi1zhe3zong3liang4 <- c.downField("期末投资者-总量").as[Double]

          p_qi1mo4tou2zi1zhe3Agu3zhang4hu4 <- c.downField("期末投资者-A股账户").as[Double]

          p_qi1mo4tou2zi1zhe3Bgu3zhang4hu4 <- c.downField("期末投资者-B股账户").as[Double]

          p_hu4shen1zong3shi4zhi2 <- c.downField("沪深总市值").as[Double]

          p_hu4shen1hu4jun1shi4zhi2 <- c.downField("沪深户均市值").as[Double]

          p_shang4zheng4zhi3shu4shou1pan2 <- c.downField("上证指数-收盘").as[Double]

          p_shang4zheng4zhi3shu4zhang3die1fu2 <- c.downField("上证指数-涨跌幅").as[Double]

        } yield {
          stock_account_statistics_emResponse(
            p_shu4ju4ri4qi1,
            p_xin1zeng1tou2zi1zhe3shu4liang4,
            p_xin1zeng1tou2zi1zhe3huan2bi3,
            p_xin1zeng1tou2zi1zhe3tong2bi3,
            p_qi1mo4tou2zi1zhe3zong3liang4,
            p_qi1mo4tou2zi1zhe3Agu3zhang4hu4,
            p_qi1mo4tou2zi1zhe3Bgu3zhang4hu4,
            p_hu4shen1zong3shi4zhi2,
            p_hu4shen1hu4jun1shi4zhi2,
            p_shang4zheng4zhi3shu4shou1pan2,
            p_shang4zheng4zhi3shu4zhang3die1fu2
          )
        }
    }

}

object JsonItem_stock_account_statistics_emResponse extends Json_stock_account_statistics_emResponse
