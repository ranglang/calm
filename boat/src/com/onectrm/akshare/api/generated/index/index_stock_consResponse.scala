package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.index_stock_consResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: index_stock_cons 目标地址:
  * http://vip.stock.finance.sina.com.cn/corp/view/vII_NewestComponent.php?page=1&amp;indexid=399639
  * 描述: 指定指数的最新成份股票信息, 注意该接口返回的数据有部分是重复会导致数据缺失, 可以调用 **ak.index_stock_cons_sina()** 获取主流指数数据,
  * 或调用**ak.index_stock_cons_csindex()**获取中证指数网提供的成分数据 限量: 单次返回某一个国家或地区的具体某一个指数, 每次最大返回 5000 条,
  * 想获取较长时间的历史数据请分时间段获取, 建议用 for 循环获取多个国家的多个指数, 注意不要大量获取, 以免给对方服务器造成压力!
  */
case class Respindex_stock_consResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_jiao1yi4liang4`: Double
)

case class index_stock_consResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_jiao1yi4liang4`: Double
)

trait Json_index_stock_consResponse {

  implicit val a_index_stock_consResponse = new Decoder[index_stock_consResponse] {
    final def apply(c: HCursor): Decoder.Result[index_stock_consResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_shou1pan2 <- c.downField("收盘").as[Double]

        p_kai1pan2 <- c.downField("开盘").as[Double]

        p_gao1 <- c.downField("高").as[Double]

        p_di1 <- c.downField("低").as[Double]

        p_jiao1yi4liang4 <- c.downField("交易量").as[Double]

      } yield {
        index_stock_consResponse(
          p_ri4qi1,
          p_shou1pan2,
          p_kai1pan2,
          p_gao1,
          p_di1,
          p_jiao1yi4liang4
        )
      }
  }

}

object JsonItem_index_stock_consResponse extends Json_index_stock_consResponse
