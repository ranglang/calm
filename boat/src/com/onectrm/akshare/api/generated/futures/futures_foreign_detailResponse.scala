package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_foreign_detailResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_foreign_detail 目标地址: https://finance.sina.com.cn/futuremarket/ 描述:
  * 新浪财经-期货外盘期货合约详情 限量: 单次返回指定品种的合约详情数据
  */
case class Respfutures_foreign_detailResponse(
  `p_jiao1yi4pin3zhong3`: String,
  `p_zui4xiao3bian4dong4jia4wei4`: String,
  `p_jiao1yi4shi2jian1`: String,
  `p_jiao1yi4dai4ma3`: String,
  `p_jiao1yi4dan1wei4`: String,
  `p_zhang3die1ting2ban3fu2du4`: String,
  `p_jiao1ge1pin3ji2`: String,
  `p_shang4shi4jiao1yi4suo3`: String,
  `p_bao4jia4dan1wei4`: String,
  `p_he2yue1jiao1ge1yue4fen4`: String,
  `p_jiao1ge1di4dian3`: String,
  `p_fu4jia1xin4xi1`: String
)

case class futures_foreign_detailResponse(
  `p_jiao1yi4pin3zhong3`: String,
  `p_zui4xiao3bian4dong4jia4wei4`: String,
  `p_jiao1yi4shi2jian1`: String,
  `p_jiao1yi4dai4ma3`: String,
  `p_jiao1yi4dan1wei4`: String,
  `p_zhang3die1ting2ban3fu2du4`: String,
  `p_jiao1ge1pin3ji2`: String,
  `p_shang4shi4jiao1yi4suo3`: String,
  `p_bao4jia4dan1wei4`: String,
  `p_he2yue1jiao1ge1yue4fen4`: String,
  `p_jiao1ge1di4dian3`: String,
  `p_fu4jia1xin4xi1`: String
)

trait Json_futures_foreign_detailResponse {

  implicit val a_futures_foreign_detailResponse = new Decoder[futures_foreign_detailResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_foreign_detailResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jiao1yi4pin3zhong3 <- c.downField("交易品种").as[String]

        p_zui4xiao3bian4dong4jia4wei4 <- c.downField("最小变动价位").as[String]

        p_jiao1yi4shi2jian1 <- c.downField("交易时间").as[String]

        p_jiao1yi4dai4ma3 <- c.downField("交易代码").as[String]

        p_jiao1yi4dan1wei4 <- c.downField("交易单位").as[String]

        p_zhang3die1ting2ban3fu2du4 <- c.downField("涨跌停板幅度").as[String]

        p_jiao1ge1pin3ji2 <- c.downField("交割品级").as[String]

        p_shang4shi4jiao1yi4suo3 <- c.downField("上市交易所").as[String]

        p_bao4jia4dan1wei4 <- c.downField("报价单位").as[String]

        p_he2yue1jiao1ge1yue4fen4 <- c.downField("合约交割月份").as[String]

        p_jiao1ge1di4dian3 <- c.downField("交割地点").as[String]

        p_fu4jia1xin4xi1 <- c.downField("附加信息").as[String]

      } yield {
        futures_foreign_detailResponse(
          p_jiao1yi4pin3zhong3,
          p_zui4xiao3bian4dong4jia4wei4,
          p_jiao1yi4shi2jian1,
          p_jiao1yi4dai4ma3,
          p_jiao1yi4dan1wei4,
          p_zhang3die1ting2ban3fu2du4,
          p_jiao1ge1pin3ji2,
          p_shang4shi4jiao1yi4suo3,
          p_bao4jia4dan1wei4,
          p_he2yue1jiao1ge1yue4fen4,
          p_jiao1ge1di4dian3,
          p_fu4jia1xin4xi1
        )
      }
  }

}

object JsonItem_futures_foreign_detailResponse extends Json_futures_foreign_detailResponse
