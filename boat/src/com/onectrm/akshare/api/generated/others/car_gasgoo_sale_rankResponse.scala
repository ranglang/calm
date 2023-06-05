package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.car_gasgoo_sale_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: car_gasgoo_sale_rank 目标地址: http://i.gasgoo.com/data/ranking 描述:
  * 获取盖世汽车资讯的汽车销量排行榜数据 限量: 单次返回指定 symbol 和 date 的汽车销量排行榜数据
  */
case class Respcar_gasgoo_sale_rankResponse(
  `p_pin3pai2`: String,
  `p_dang1qian2nian2fen4dang1qian2yue4fen4`: Integer,
  `p_dang1qian2yue4fen4yue4tong2bi3`: String,
  `p_dang1qian2yue4fen4yue4huan2bi3`: String,
  `p_nian2fen41dao4dang1qian2nian2fen4`: Integer,
  `p_qian2yi1nian2nian2fen41dao4dang1qian2nian2fen4`: Double,
  `p_qian2er4nian2nian2fen41dao4dang1qian2nian2fen4`: Double
)

case class car_gasgoo_sale_rankResponse(
  `p_pin3pai2`: String,
  `p_dang1qian2nian2fen4dang1qian2yue4fen4`: Integer,
  `p_dang1qian2yue4fen4yue4tong2bi3`: String,
  `p_dang1qian2yue4fen4yue4huan2bi3`: String,
  `p_nian2fen41dao4dang1qian2nian2fen4`: Integer,
  `p_qian2yi1nian2nian2fen41dao4dang1qian2nian2fen4`: Double,
  `p_qian2er4nian2nian2fen41dao4dang1qian2nian2fen4`: Double
)

trait Json_car_gasgoo_sale_rankResponse {

  implicit val a_car_gasgoo_sale_rankResponse = new Decoder[car_gasgoo_sale_rankResponse] {
    final def apply(c: HCursor): Decoder.Result[car_gasgoo_sale_rankResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pin3pai2 <- c.downField("品牌").as[String]

        p_dang1qian2nian2fen4dang1qian2yue4fen4 <- c.downField("{当前年份}-{当前月份}").as[Integer]

        p_dang1qian2yue4fen4yue4tong2bi3 <- c.downField("{当前月份}月同比").as[String]

        p_dang1qian2yue4fen4yue4huan2bi3 <- c.downField("{当前月份}月环比").as[String]

        p_nian2fen41dao4dang1qian2nian2fen4 <- c.downField("{年份}-1到{当前年份}").as[Integer]

        p_qian2yi1nian2nian2fen41dao4dang1qian2nian2fen4 <- c
          .downField("{前一年年份}-1到{当前年份}")
          .as[Double]

        p_qian2er4nian2nian2fen41dao4dang1qian2nian2fen4 <- c
          .downField("{前二年年份}-1到{当前年份}")
          .as[Double]

      } yield {
        car_gasgoo_sale_rankResponse(
          p_pin3pai2,
          p_dang1qian2nian2fen4dang1qian2yue4fen4,
          p_dang1qian2yue4fen4yue4tong2bi3,
          p_dang1qian2yue4fen4yue4huan2bi3,
          p_nian2fen41dao4dang1qian2nian2fen4,
          p_qian2yi1nian2nian2fen41dao4dang1qian2nian2fen4,
          p_qian2er4nian2nian2fen41dao4dang1qian2nian2fen4
        )
      }
  }

}

object JsonItem_car_gasgoo_sale_rankResponse extends Json_car_gasgoo_sale_rankResponse
