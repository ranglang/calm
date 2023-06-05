package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_futures_deliverable_couponsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_futures_deliverable_coupons 目标地址:
  * http://www.csindex.com.cn/zh-CN/bond-valuation/bond-futures-deliverable-coupons-related-indicators
  * 描述: 国债期货可交割券相关指标 限量: 只能返回近一年的数据
  */
case class Respbond_futures_deliverable_couponsResponse(
  `p_ri4qi1`: String,
  `p_yin2xing2jian1dai4ma3`: String,
  `p_shang4jiao1suo3dai4ma3`: String,
  `p_shen1jiao1suo3dai4ma3`: String,
  `p_he2yue1dai4ma3`: String,
  `p_zhong1zheng4gu1zhi2`: Double,
  `p_ji1cha1`: Double,
  `p_fa1piao4jia4ge2`: Double,
  `p_yin3han2hui2gou4li4lu4`: Double
)

case class bond_futures_deliverable_couponsResponse(
  `p_ri4qi1`: String,
  `p_yin2xing2jian1dai4ma3`: String,
  `p_shang4jiao1suo3dai4ma3`: String,
  `p_shen1jiao1suo3dai4ma3`: String,
  `p_he2yue1dai4ma3`: String,
  `p_zhong1zheng4gu1zhi2`: Double,
  `p_ji1cha1`: Double,
  `p_fa1piao4jia4ge2`: Double,
  `p_yin3han2hui2gou4li4lu4`: Double
)

trait Json_bond_futures_deliverable_couponsResponse {

  implicit val a_bond_futures_deliverable_couponsResponse =
    new Decoder[bond_futures_deliverable_couponsResponse] {
      final def apply(c: HCursor): Decoder.Result[bond_futures_deliverable_couponsResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_yin2xing2jian1dai4ma3 <- c.downField("银行间代码").as[String]

          p_shang4jiao1suo3dai4ma3 <- c.downField("上交所代码").as[String]

          p_shen1jiao1suo3dai4ma3 <- c.downField("深交所代码").as[String]

          p_he2yue1dai4ma3 <- c.downField("合约代码").as[String]

          p_zhong1zheng4gu1zhi2 <- c.downField("中证估值").as[Double]

          p_ji1cha1 <- c.downField("基差").as[Double]

          p_fa1piao4jia4ge2 <- c.downField("发票价格").as[Double]

          p_yin3han2hui2gou4li4lu4 <- c.downField("隐含回购利率").as[Double]

        } yield {
          bond_futures_deliverable_couponsResponse(
            p_ri4qi1,
            p_yin2xing2jian1dai4ma3,
            p_shang4jiao1suo3dai4ma3,
            p_shen1jiao1suo3dai4ma3,
            p_he2yue1dai4ma3,
            p_zhong1zheng4gu1zhi2,
            p_ji1cha1,
            p_fa1piao4jia4ge2,
            p_yin3han2hui2gou4li4lu4
          )
        }
    }

}

object JsonItem_bond_futures_deliverable_couponsResponse
    extends Json_bond_futures_deliverable_couponsResponse
