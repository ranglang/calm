package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zt_pool_sub_new_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zt_pool_sub_new_em 目标地址: http://quote.eastmoney.com/ztb/detail#type=cxgc
  * 描述: 东方财富网-行情中心-涨停板行情-次新股池 限量: 单次返回所有次新股池数据
  */
case class Respstock_zt_pool_sub_new_emResponse(
  `p_xu4hao4`: Long,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zhang3die1fu2`: Double,
  `p_zui4xin1jia4`: Double,
  `p_zhang3ting2jia4`: Double,
  `p_cheng2jiao1e2`: Integer,
  `p_liu2tong1shi4zhi2`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_zhuan3shou3lu4`: Double,
  `p_kai1ban3ji3ri4`: Integer,
  `p_kai1ban3ri4qi1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_shi4fou3xin1gao1`: Integer,
  `p_zhang3ting2tong3ji4`: String,
  `p_suo3shu3xing2ye4`: String
)

case class stock_zt_pool_sub_new_emResponse(
  `p_xu4hao4`: Long,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zhang3die1fu2`: Double,
  `p_zui4xin1jia4`: Double,
  `p_zhang3ting2jia4`: Double,
  `p_cheng2jiao1e2`: Integer,
  `p_liu2tong1shi4zhi2`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_zhuan3shou3lu4`: Double,
  `p_kai1ban3ji3ri4`: Integer,
  `p_kai1ban3ri4qi1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_shi4fou3xin1gao1`: Integer,
  `p_zhang3ting2tong3ji4`: String,
  `p_suo3shu3xing2ye4`: String
)

trait Json_stock_zt_pool_sub_new_emResponse {

  implicit val a_stock_zt_pool_sub_new_emResponse = new Decoder[stock_zt_pool_sub_new_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zt_pool_sub_new_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3ting2jia4 <- c.downField("涨停价").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Integer]

        p_liu2tong1shi4zhi2 <- c.downField("流通市值").as[Double]

        p_zong3shi4zhi2 <- c.downField("总市值").as[Double]

        p_zhuan3shou3lu4 <- c.downField("转手率").as[Double]

        p_kai1ban3ji3ri4 <- c.downField("开板几日").as[Integer]

        p_kai1ban3ri4qi1 <- c.downField("开板日期").as[String]

        p_shang4shi4ri4qi1 <- c.downField("上市日期").as[String]

        p_shi4fou3xin1gao1 <- c.downField("是否新高").as[Integer]

        p_zhang3ting2tong3ji4 <- c.downField("涨停统计").as[String]

        p_suo3shu3xing2ye4 <- c.downField("所属行业").as[String]

      } yield {
        stock_zt_pool_sub_new_emResponse(
          p_xu4hao4,
          p_dai4ma3,
          p_ming2cheng1,
          p_zhang3die1fu2,
          p_zui4xin1jia4,
          p_zhang3ting2jia4,
          p_cheng2jiao1e2,
          p_liu2tong1shi4zhi2,
          p_zong3shi4zhi2,
          p_zhuan3shou3lu4,
          p_kai1ban3ji3ri4,
          p_kai1ban3ri4qi1,
          p_shang4shi4ri4qi1,
          p_shi4fou3xin1gao1,
          p_zhang3ting2tong3ji4,
          p_suo3shu3xing2ye4
        )
      }
  }

}

object JsonItem_stock_zt_pool_sub_new_emResponse extends Json_stock_zt_pool_sub_new_emResponse
