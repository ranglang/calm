package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_central_bank_balanceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_central_bank_balance 目标地址:
  * http://finance.sina.com.cn/mac/#fininfo-8-0-31-2 描述: 国家统计局-央行货币当局资产负债 限量: 单次返回所有历史数据
  */
case class Respmacro_china_central_bank_balanceResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_guo2wai4zi1chan3`: Double,
  `p_wai4hui4`: Double,
  `p_huo4bi4huang2jin1`: Double,
  `p_qi2ta1guo2wai4zi1chan3`: Double,
  `p_dui4zheng4fu3zhai4quan2`: Double,
  `p_qi2zhong1zhong1yang1zheng4fu3`: Double,
  `p_dui4qi2ta1cun2kuan3xing4gong1si1zhai4quan2`: Double,
  `p_dui4qi2ta1jin1rong2xing4gong1si1zhai4quan2`: Double,
  `p_dui4fei1huo4bi4jin1rong2ji1gou4zhai4quan2`: Double,
  `p_dui4fei1jin1rong2xing4gong1si1zhai4quan2`: Double,
  `p_qi2ta1zi1chan3`: Double,
  `p_zong3zi1chan3`: Double,
  `p_chu3bei4huo4bi4`: Double,
  `p_fa1xing2huo4bi4`: Double,
  `p_jin1rong2xing4gong1si1cun2kuan3`: Double,
  `p_qi2ta1cun2kuan3xing4gong1si1`: Double,
  `p_qi2ta1jin1rong2xing4gong1si1`: Double,
  `p_dui4jin1rong2ji1gou4fu4zhai4`: Double,
  `p_zhun3bei4jin1cun2kuan3`: Double,
  `p_fei1jin1rong2xing4gong1si1cun2kuan3`: Double,
  `p_huo2qi1cun2kuan3`: Double,
  `p_zhai4quan4`: Double,
  `p_guo2wai4fu4zhai4`: Double,
  `p_zheng4fu3cun2kuan3`: Double,
  `p_zi4you3zi1jin1`: Double,
  `p_qi2ta1fu4zhai4`: Double,
  `p_zong3fu4zhai4`: Double
)

case class macro_china_central_bank_balanceResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_guo2wai4zi1chan3`: Double,
  `p_wai4hui4`: Double,
  `p_huo4bi4huang2jin1`: Double,
  `p_qi2ta1guo2wai4zi1chan3`: Double,
  `p_dui4zheng4fu3zhai4quan2`: Double,
  `p_qi2zhong1zhong1yang1zheng4fu3`: Double,
  `p_dui4qi2ta1cun2kuan3xing4gong1si1zhai4quan2`: Double,
  `p_dui4qi2ta1jin1rong2xing4gong1si1zhai4quan2`: Double,
  `p_dui4fei1huo4bi4jin1rong2ji1gou4zhai4quan2`: Double,
  `p_dui4fei1jin1rong2xing4gong1si1zhai4quan2`: Double,
  `p_qi2ta1zi1chan3`: Double,
  `p_zong3zi1chan3`: Double,
  `p_chu3bei4huo4bi4`: Double,
  `p_fa1xing2huo4bi4`: Double,
  `p_jin1rong2xing4gong1si1cun2kuan3`: Double,
  `p_qi2ta1cun2kuan3xing4gong1si1`: Double,
  `p_qi2ta1jin1rong2xing4gong1si1`: Double,
  `p_dui4jin1rong2ji1gou4fu4zhai4`: Double,
  `p_zhun3bei4jin1cun2kuan3`: Double,
  `p_fei1jin1rong2xing4gong1si1cun2kuan3`: Double,
  `p_huo2qi1cun2kuan3`: Double,
  `p_zhai4quan4`: Double,
  `p_guo2wai4fu4zhai4`: Double,
  `p_zheng4fu3cun2kuan3`: Double,
  `p_zi4you3zi1jin1`: Double,
  `p_qi2ta1fu4zhai4`: Double,
  `p_zong3fu4zhai4`: Double
)

trait Json_macro_china_central_bank_balanceResponse {

  implicit val a_macro_china_central_bank_balanceResponse =
    new Decoder[macro_china_central_bank_balanceResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_central_bank_balanceResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_tong3ji4shi2jian1 <- c.downField("统计时间").as[String]

          p_guo2wai4zi1chan3 <- c.downField("国外资产").as[Double]

          p_wai4hui4 <- c.downField("外汇").as[Double]

          p_huo4bi4huang2jin1 <- c.downField("货币黄金").as[Double]

          p_qi2ta1guo2wai4zi1chan3 <- c.downField("其他国外资产").as[Double]

          p_dui4zheng4fu3zhai4quan2 <- c.downField("对政府债权").as[Double]

          p_qi2zhong1zhong1yang1zheng4fu3 <- c.downField("其中:中央政府").as[Double]

          p_dui4qi2ta1cun2kuan3xing4gong1si1zhai4quan2 <- c.downField("对其他存款性公司债权").as[Double]

          p_dui4qi2ta1jin1rong2xing4gong1si1zhai4quan2 <- c.downField("对其他金融性公司债权").as[Double]

          p_dui4fei1huo4bi4jin1rong2ji1gou4zhai4quan2 <- c.downField("对非货币金融机构债权").as[Double]

          p_dui4fei1jin1rong2xing4gong1si1zhai4quan2 <- c.downField("对非金融性公司债权").as[Double]

          p_qi2ta1zi1chan3 <- c.downField("其他资产").as[Double]

          p_zong3zi1chan3 <- c.downField("总资产").as[Double]

          p_chu3bei4huo4bi4 <- c.downField("储备货币").as[Double]

          p_fa1xing2huo4bi4 <- c.downField("发行货币").as[Double]

          p_jin1rong2xing4gong1si1cun2kuan3 <- c.downField("金融性公司存款").as[Double]

          p_qi2ta1cun2kuan3xing4gong1si1 <- c.downField("其他存款性公司").as[Double]

          p_qi2ta1jin1rong2xing4gong1si1 <- c.downField("其他金融性公司").as[Double]

          p_dui4jin1rong2ji1gou4fu4zhai4 <- c.downField("对金融机构负债").as[Double]

          p_zhun3bei4jin1cun2kuan3 <- c.downField("准备金存款").as[Double]

          p_fei1jin1rong2xing4gong1si1cun2kuan3 <- c.downField("非金融性公司存款").as[Double]

          p_huo2qi1cun2kuan3 <- c.downField("活期存款").as[Double]

          p_zhai4quan4 <- c.downField("债券").as[Double]

          p_guo2wai4fu4zhai4 <- c.downField("国外负债").as[Double]

          p_zheng4fu3cun2kuan3 <- c.downField("政府存款").as[Double]

          p_zi4you3zi1jin1 <- c.downField("自有资金").as[Double]

          p_qi2ta1fu4zhai4 <- c.downField("其他负债").as[Double]

          p_zong3fu4zhai4 <- c.downField("总负债").as[Double]

        } yield {
          macro_china_central_bank_balanceResponse(
            p_tong3ji4shi2jian1,
            p_guo2wai4zi1chan3,
            p_wai4hui4,
            p_huo4bi4huang2jin1,
            p_qi2ta1guo2wai4zi1chan3,
            p_dui4zheng4fu3zhai4quan2,
            p_qi2zhong1zhong1yang1zheng4fu3,
            p_dui4qi2ta1cun2kuan3xing4gong1si1zhai4quan2,
            p_dui4qi2ta1jin1rong2xing4gong1si1zhai4quan2,
            p_dui4fei1huo4bi4jin1rong2ji1gou4zhai4quan2,
            p_dui4fei1jin1rong2xing4gong1si1zhai4quan2,
            p_qi2ta1zi1chan3,
            p_zong3zi1chan3,
            p_chu3bei4huo4bi4,
            p_fa1xing2huo4bi4,
            p_jin1rong2xing4gong1si1cun2kuan3,
            p_qi2ta1cun2kuan3xing4gong1si1,
            p_qi2ta1jin1rong2xing4gong1si1,
            p_dui4jin1rong2ji1gou4fu4zhai4,
            p_zhun3bei4jin1cun2kuan3,
            p_fei1jin1rong2xing4gong1si1cun2kuan3,
            p_huo2qi1cun2kuan3,
            p_zhai4quan4,
            p_guo2wai4fu4zhai4,
            p_zheng4fu3cun2kuan3,
            p_zi4you3zi1jin1,
            p_qi2ta1fu4zhai4,
            p_zong3fu4zhai4
          )
        }
    }

}

object JsonItem_macro_china_central_bank_balanceResponse
    extends Json_macro_china_central_bank_balanceResponse
