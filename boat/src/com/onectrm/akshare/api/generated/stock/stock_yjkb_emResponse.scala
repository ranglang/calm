package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_yjkb_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_yjkb_em 目标地址: http://data.eastmoney.com/bbsj/202003/yjkb.html 描述:
  * 东方财富-数据中心-年报季报-业绩快报 限量: 单次获取指定 date 的业绩快报数据
  */
case class Respstock_yjkb_emResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_mei3gu3shou1yi4`: String,
  `p_ying2ye4shou1ru4ying2ye4shou1ru4`: String,
  `p_ying2ye4shou1ru4qu4nian2tong2qi1`: String,
  `p_ying2ye4shou1ru4tong2bi3zeng1zhang3`: String,
  `p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3`: String,
  `p_jing4li4run4jing4li4run4`: String,
  `p_jing4li4run4qu4nian2tong2qi1`: String,
  `p_jing4li4run4tong2bi3zeng1zhang3`: String,
  `p_jing4li4run4ji4du4huan2bi3zeng1zhang3`: String,
  `p_mei3gu3jing4zi1chan3`: String,
  `p_jing4zi1chan3shou1yi4lu4`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_shi4chang3ban3kuai4`: String,
  `p_zheng4quan4lei4xing2`: String
)

case class stock_yjkb_emResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_mei3gu3shou1yi4`: String,
  `p_ying2ye4shou1ru4ying2ye4shou1ru4`: String,
  `p_ying2ye4shou1ru4qu4nian2tong2qi1`: String,
  `p_ying2ye4shou1ru4tong2bi3zeng1zhang3`: String,
  `p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3`: String,
  `p_jing4li4run4jing4li4run4`: String,
  `p_jing4li4run4qu4nian2tong2qi1`: String,
  `p_jing4li4run4tong2bi3zeng1zhang3`: String,
  `p_jing4li4run4ji4du4huan2bi3zeng1zhang3`: String,
  `p_mei3gu3jing4zi1chan3`: String,
  `p_jing4zi1chan3shou1yi4lu4`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_shi4chang3ban3kuai4`: String,
  `p_zheng4quan4lei4xing2`: String
)

trait Json_stock_yjkb_emResponse {

  implicit val a_stock_yjkb_emResponse = new Decoder[stock_yjkb_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_yjkb_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_mei3gu3shou1yi4 <- c.downField("每股收益").as[String]

        p_ying2ye4shou1ru4ying2ye4shou1ru4 <- c.downField("营业收入-营业收入").as[String]

        p_ying2ye4shou1ru4qu4nian2tong2qi1 <- c.downField("营业收入-去年同期").as[String]

        p_ying2ye4shou1ru4tong2bi3zeng1zhang3 <- c.downField("营业收入-同比增长").as[String]

        p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3 <- c.downField("营业收入-季度环比增长").as[String]

        p_jing4li4run4jing4li4run4 <- c.downField("净利润-净利润").as[String]

        p_jing4li4run4qu4nian2tong2qi1 <- c.downField("净利润-去年同期").as[String]

        p_jing4li4run4tong2bi3zeng1zhang3 <- c.downField("净利润-同比增长").as[String]

        p_jing4li4run4ji4du4huan2bi3zeng1zhang3 <- c.downField("净利润-季度环比增长").as[String]

        p_mei3gu3jing4zi1chan3 <- c.downField("每股净资产").as[String]

        p_jing4zi1chan3shou1yi4lu4 <- c.downField("净资产收益率").as[String]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

        p_shi4chang3ban3kuai4 <- c.downField("市场板块").as[String]

        p_zheng4quan4lei4xing2 <- c.downField("证券类型").as[String]

      } yield {
        stock_yjkb_emResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_mei3gu3shou1yi4,
          p_ying2ye4shou1ru4ying2ye4shou1ru4,
          p_ying2ye4shou1ru4qu4nian2tong2qi1,
          p_ying2ye4shou1ru4tong2bi3zeng1zhang3,
          p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3,
          p_jing4li4run4jing4li4run4,
          p_jing4li4run4qu4nian2tong2qi1,
          p_jing4li4run4tong2bi3zeng1zhang3,
          p_jing4li4run4ji4du4huan2bi3zeng1zhang3,
          p_mei3gu3jing4zi1chan3,
          p_jing4zi1chan3shou1yi4lu4,
          p_gong1gao4ri4qi1,
          p_shi4chang3ban3kuai4,
          p_zheng4quan4lei4xing2
        )
      }
  }

}

object JsonItem_stock_yjkb_emResponse extends Json_stock_yjkb_emResponse
