package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_stock_market_capResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_stock_market_cap 目标地址: http://data.eastmoney.com/cjsj/gpjytj.html 描述:
  * 全国股票交易统计表, 数据区间从 200801 至今, 月度数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_stock_market_capResponse(
  `p_shu4ju4ri4qi1`: String,
  `p_fa1xing2zong3gu3ben3shang4hai3`: Double,
  `p_fa1xing2zong3gu3ben3shen1zhen4`: Double,
  `p_shi4jia4zong3zhi2shang4hai3`: Double,
  `p_shi4jia4zong3zhi2shen1zhen4`: Double,
  `p_cheng2jiao1jin1e2shang4hai3`: Double,
  `p_cheng2jiao1jin1e2shen1zhen4`: Double,
  `p_cheng2jiao1liang4shang4hai3`: Double,
  `p_cheng2jiao1liang4shen1zhen4`: Double,
  `p_Agu3zui4gao1zong1he2gu3jia4zhi3shu4shang4hai3`: Double,
  `p_Agu3zui4gao1zong1he2gu3jia4zhi3shu4shen1zhen4`: Double,
  `p_Agu3zui4di1zong1he2gu3jia4zhi3shu4shang4hai3`: Double,
  `p_Agu3zui4di1zong1he2gu3jia4zhi3shu4shen1zhen4`: Double
)

case class macro_china_stock_market_capResponse(
  `p_shu4ju4ri4qi1`: String,
  `p_fa1xing2zong3gu3ben3shang4hai3`: Double,
  `p_fa1xing2zong3gu3ben3shen1zhen4`: Double,
  `p_shi4jia4zong3zhi2shang4hai3`: Double,
  `p_shi4jia4zong3zhi2shen1zhen4`: Double,
  `p_cheng2jiao1jin1e2shang4hai3`: Double,
  `p_cheng2jiao1jin1e2shen1zhen4`: Double,
  `p_cheng2jiao1liang4shang4hai3`: Double,
  `p_cheng2jiao1liang4shen1zhen4`: Double,
  `p_Agu3zui4gao1zong1he2gu3jia4zhi3shu4shang4hai3`: Double,
  `p_Agu3zui4gao1zong1he2gu3jia4zhi3shu4shen1zhen4`: Double,
  `p_Agu3zui4di1zong1he2gu3jia4zhi3shu4shang4hai3`: Double,
  `p_Agu3zui4di1zong1he2gu3jia4zhi3shu4shen1zhen4`: Double
)

trait Json_macro_china_stock_market_capResponse {

  implicit val a_macro_china_stock_market_capResponse =
    new Decoder[macro_china_stock_market_capResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_stock_market_capResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_shu4ju4ri4qi1 <- c.downField("数据日期").as[String]

          p_fa1xing2zong3gu3ben3shang4hai3 <- c.downField("发行总股本-上海").as[Double]

          p_fa1xing2zong3gu3ben3shen1zhen4 <- c.downField("发行总股本-深圳").as[Double]

          p_shi4jia4zong3zhi2shang4hai3 <- c.downField("市价总值-上海").as[Double]

          p_shi4jia4zong3zhi2shen1zhen4 <- c.downField("市价总值-深圳").as[Double]

          p_cheng2jiao1jin1e2shang4hai3 <- c.downField("成交金额-上海").as[Double]

          p_cheng2jiao1jin1e2shen1zhen4 <- c.downField("成交金额-深圳").as[Double]

          p_cheng2jiao1liang4shang4hai3 <- c.downField("成交量-上海").as[Double]

          p_cheng2jiao1liang4shen1zhen4 <- c.downField("成交量-深圳").as[Double]

          p_Agu3zui4gao1zong1he2gu3jia4zhi3shu4shang4hai3 <- c.downField("A股最高综合股价指数-上海").as[Double]

          p_Agu3zui4gao1zong1he2gu3jia4zhi3shu4shen1zhen4 <- c.downField("A股最高综合股价指数-深圳").as[Double]

          p_Agu3zui4di1zong1he2gu3jia4zhi3shu4shang4hai3 <- c.downField("A股最低综合股价指数-上海").as[Double]

          p_Agu3zui4di1zong1he2gu3jia4zhi3shu4shen1zhen4 <- c.downField("A股最低综合股价指数-深圳").as[Double]

        } yield {
          macro_china_stock_market_capResponse(
            p_shu4ju4ri4qi1,
            p_fa1xing2zong3gu3ben3shang4hai3,
            p_fa1xing2zong3gu3ben3shen1zhen4,
            p_shi4jia4zong3zhi2shang4hai3,
            p_shi4jia4zong3zhi2shen1zhen4,
            p_cheng2jiao1jin1e2shang4hai3,
            p_cheng2jiao1jin1e2shen1zhen4,
            p_cheng2jiao1liang4shang4hai3,
            p_cheng2jiao1liang4shen1zhen4,
            p_Agu3zui4gao1zong1he2gu3jia4zhi3shu4shang4hai3,
            p_Agu3zui4gao1zong1he2gu3jia4zhi3shu4shen1zhen4,
            p_Agu3zui4di1zong1he2gu3jia4zhi3shu4shang4hai3,
            p_Agu3zui4di1zong1he2gu3jia4zhi3shu4shen1zhen4
          )
        }
    }

}

object JsonItem_macro_china_stock_market_capResponse
    extends Json_macro_china_stock_market_capResponse
