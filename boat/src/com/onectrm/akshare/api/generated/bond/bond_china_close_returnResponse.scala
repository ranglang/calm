package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_china_close_returnResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_china_close_return 目标地址:
  * http://www.chinamoney.com.cn/chinese/bkcurvclosedyhis/?bondType=CYCC000&amp;reference=1 描述:
  * 收盘收益率曲线历史数据, 该接口只能获取近 3 个月的数据，且每次获取的数据不超过 1 个月 限量: 返回所有交易日的数据
  */
case class Respbond_china_close_returnResponse(
  `p_ri4qi1`: String,
  `p_zhong1guo2guo2zhai4shou1yi4lu42nian2`: Double,
  `p_zhong1guo2guo2zhai4shou1yi4lu45nian2`: Double,
  `p_zhong1guo2guo2zhai4shou1yi4lu410nian2`: Double,
  `p_zhong1guo2guo2zhai4shou1yi4lu430nian2`: Double,
  `p_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2`: Double,
  `p_zhong1guo2GDPnian2zeng1lu4`: Double,
  `p_mei3guo2guo2zhai4shou1yi4lu42nian2`: Double,
  `p_mei3guo2guo2zhai4shou1yi4lu45nian2`: Double,
  `p_mei3guo2guo2zhai4shou1yi4lu410nian2`: Double,
  `p_mei3guo2guo2zhai4shou1yi4lu430nian2`: Double,
  `p_mei3guo2guo2zhai4shou1yi4lu410nian22nian2`: Double,
  `p_mei3guo2GDPnian2zeng1lu4`: Double
)

case class bond_china_close_returnResponse(
  `p_ri4qi1`: String,
  `p_zhong1guo2guo2zhai4shou1yi4lu42nian2`: Double,
  `p_zhong1guo2guo2zhai4shou1yi4lu45nian2`: Double,
  `p_zhong1guo2guo2zhai4shou1yi4lu410nian2`: Double,
  `p_zhong1guo2guo2zhai4shou1yi4lu430nian2`: Double,
  `p_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2`: Double,
  `p_zhong1guo2GDPnian2zeng1lu4`: Double,
  `p_mei3guo2guo2zhai4shou1yi4lu42nian2`: Double,
  `p_mei3guo2guo2zhai4shou1yi4lu45nian2`: Double,
  `p_mei3guo2guo2zhai4shou1yi4lu410nian2`: Double,
  `p_mei3guo2guo2zhai4shou1yi4lu430nian2`: Double,
  `p_mei3guo2guo2zhai4shou1yi4lu410nian22nian2`: Double,
  `p_mei3guo2GDPnian2zeng1lu4`: Double
)

trait Json_bond_china_close_returnResponse {

  implicit val a_bond_china_close_returnResponse = new Decoder[bond_china_close_returnResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_china_close_returnResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_zhong1guo2guo2zhai4shou1yi4lu42nian2 <- c.downField("中国国债收益率2年").as[Double]

        p_zhong1guo2guo2zhai4shou1yi4lu45nian2 <- c.downField("中国国债收益率5年").as[Double]

        p_zhong1guo2guo2zhai4shou1yi4lu410nian2 <- c.downField("中国国债收益率10年").as[Double]

        p_zhong1guo2guo2zhai4shou1yi4lu430nian2 <- c.downField("中国国债收益率30年").as[Double]

        p_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2 <- c.downField("中国国债收益率10年-2年").as[Double]

        p_zhong1guo2GDPnian2zeng1lu4 <- c.downField("中国GDP年增率").as[Double]

        p_mei3guo2guo2zhai4shou1yi4lu42nian2 <- c.downField("美国国债收益率2年").as[Double]

        p_mei3guo2guo2zhai4shou1yi4lu45nian2 <- c.downField("美国国债收益率5年").as[Double]

        p_mei3guo2guo2zhai4shou1yi4lu410nian2 <- c.downField("美国国债收益率10年").as[Double]

        p_mei3guo2guo2zhai4shou1yi4lu430nian2 <- c.downField("美国国债收益率30年").as[Double]

        p_mei3guo2guo2zhai4shou1yi4lu410nian22nian2 <- c.downField("美国国债收益率10年-2年").as[Double]

        p_mei3guo2GDPnian2zeng1lu4 <- c.downField("美国GDP年增率").as[Double]

      } yield {
        bond_china_close_returnResponse(
          p_ri4qi1,
          p_zhong1guo2guo2zhai4shou1yi4lu42nian2,
          p_zhong1guo2guo2zhai4shou1yi4lu45nian2,
          p_zhong1guo2guo2zhai4shou1yi4lu410nian2,
          p_zhong1guo2guo2zhai4shou1yi4lu430nian2,
          p_zhong1guo2guo2zhai4shou1yi4lu410nian22nian2,
          p_zhong1guo2GDPnian2zeng1lu4,
          p_mei3guo2guo2zhai4shou1yi4lu42nian2,
          p_mei3guo2guo2zhai4shou1yi4lu45nian2,
          p_mei3guo2guo2zhai4shou1yi4lu410nian2,
          p_mei3guo2guo2zhai4shou1yi4lu430nian2,
          p_mei3guo2guo2zhai4shou1yi4lu410nian22nian2,
          p_mei3guo2GDPnian2zeng1lu4
        )
      }
  }

}

object JsonItem_bond_china_close_returnResponse extends Json_bond_china_close_returnResponse
