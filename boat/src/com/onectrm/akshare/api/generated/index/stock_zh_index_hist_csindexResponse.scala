package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.stock_zh_index_hist_csindexResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: stock_zh_index_hist_csindex 目标地址:
  * https://www.csindex.com.cn/zh-CN/indices/index-detail/H30374#/indices/family/detail?indexCode=H30374
  * 描述: 中证指数日频率的数据 限量: 该接口返回指定 symbol 的 start_date 和 end_date 的指数日频率数据, 该接口只能返回最近 60 个交易日的数据
  */
case class Respstock_zh_index_hist_csindexResponse(
  `p_ri4qi1`: String,
  `p_zhi3shu4dai4ma3`: String,
  `p_zhi3shu4zhong1wen2quan2cheng1`: String,
  `p_zhi3shu4zhong1wen2jian3cheng1`: String,
  `p_zhi3shu4ying1wen2quan2cheng1`: String,
  `p_zhi3shu4ying1wen2jian3cheng1`: String,
  `p_kai1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_shou1pan2`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3die1fu2`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1jin1e2`: Double,
  `p_yang4ben3shu4liang4`: Double
)

case class stock_zh_index_hist_csindexResponse(
  `p_ri4qi1`: String,
  `p_zhi3shu4dai4ma3`: String,
  `p_zhi3shu4zhong1wen2quan2cheng1`: String,
  `p_zhi3shu4zhong1wen2jian3cheng1`: String,
  `p_zhi3shu4ying1wen2quan2cheng1`: String,
  `p_zhi3shu4ying1wen2jian3cheng1`: String,
  `p_kai1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_shou1pan2`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3die1fu2`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1jin1e2`: Double,
  `p_yang4ben3shu4liang4`: Double
)

trait Json_stock_zh_index_hist_csindexResponse {

  implicit val a_stock_zh_index_hist_csindexResponse =
    new Decoder[stock_zh_index_hist_csindexResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_zh_index_hist_csindexResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_zhi3shu4dai4ma3 <- c.downField("指数代码").as[String]

          p_zhi3shu4zhong1wen2quan2cheng1 <- c.downField("指数中文全称").as[String]

          p_zhi3shu4zhong1wen2jian3cheng1 <- c.downField("指数中文简称").as[String]

          p_zhi3shu4ying1wen2quan2cheng1 <- c.downField("指数英文全称").as[String]

          p_zhi3shu4ying1wen2jian3cheng1 <- c.downField("指数英文简称").as[String]

          p_kai1pan2 <- c.downField("开盘").as[Double]

          p_zui4gao1 <- c.downField("最高").as[Double]

          p_zui4di1 <- c.downField("最低").as[Double]

          p_shou1pan2 <- c.downField("收盘").as[Double]

          p_zhang3die1 <- c.downField("涨跌").as[Double]

          p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

          p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

          p_cheng2jiao1jin1e2 <- c.downField("成交金额").as[Double]

          p_yang4ben3shu4liang4 <- c.downField("样本数量").as[Double]

        } yield {
          stock_zh_index_hist_csindexResponse(
            p_ri4qi1,
            p_zhi3shu4dai4ma3,
            p_zhi3shu4zhong1wen2quan2cheng1,
            p_zhi3shu4zhong1wen2jian3cheng1,
            p_zhi3shu4ying1wen2quan2cheng1,
            p_zhi3shu4ying1wen2jian3cheng1,
            p_kai1pan2,
            p_zui4gao1,
            p_zui4di1,
            p_shou1pan2,
            p_zhang3die1,
            p_zhang3die1fu2,
            p_cheng2jiao1liang4,
            p_cheng2jiao1jin1e2,
            p_yang4ben3shu4liang4
          )
        }
    }

}

object JsonItem_stock_zh_index_hist_csindexResponse extends Json_stock_zh_index_hist_csindexResponse
