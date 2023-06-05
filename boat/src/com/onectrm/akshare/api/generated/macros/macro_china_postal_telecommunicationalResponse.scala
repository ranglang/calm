package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_postal_telecommunicationalResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_postal_telecommunicational 目标地址:
  * http://finance.sina.com.cn/mac/#industry-11-0-31-1 描述: 国家统计局-邮电业务基本情况-非累计 限量: 单次返回所有历史数据
  */
case class Respmacro_china_postal_telecommunicationalResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_you2dian4ye4wu4zong3liang4`: Double,
  `p_you2dian4ye4wu4zong3liang4tong2bi3zeng1zhang3`: Double,
  `p_you2zheng4ye4wu4zong3liang4`: Double,
  `p_you2zheng4ye4wu4zong3liang4tong2bi3zeng1zhang3`: Double,
  `p_dian4xin4ye4wu4zong3liang4`: Double,
  `p_dian4xin4ye4wu4zong3liang4tong2bi3zeng1zhang3`: Double,
  `p_han2jian4zong3shu4`: Double,
  `p_han2jian4zong3shu4tong2bi3zeng1zhang3`: Double,
  `p_bao1jian4`: Double,
  `p_bao1jian4tong2bi3zeng1zhang3`: Double,
  `p_te4kuai4zhuan1di4`: Double,
  `p_te4kuai4zhuan1di4tong2bi3zeng1zhang3`: Double,
  `p_hui4piao4`: Double,
  `p_hui4piao4tong2bi3zeng1zhang3`: Double,
  `p_ding4xiao1bao4zhi3lei3ji4shu4`: Double,
  `p_ding4xiao1bao4zhi3lei3ji4shu4tong2bi3zeng1zhang3`: Double,
  `p_ding4xiao1za2zhi4lei3ji4shu4`: Double,
  `p_ding4xiao1za2zhi4lei3ji4shu4tong2bi3zeng1zhang3`: Double,
  `p_ji2you2ye4wu4`: Double,
  `p_ji2you2ye4wu4tong2bi3zeng1zhang3`: Double,
  `p_you2zheng4chu3xu4qi1mo4yu2e2`: Double,
  `p_you2zheng4chu3xu4qi1mo4yu2e2tong2bi3zeng1zhang3`: Double,
  `p_zhang3tu2dian4hua4tong1hua4shi2zhang3`: Double,
  `p_zhong1zhang3tu2dian4hua4tong1hua4shi2zhang3tong2bi3zeng1zhang3`: Double,
  `p_ben3di4dian4hua4qi1mo4yong4hu4shu4`: Double,
  `p_ben3di4dian4hua4qi1mo4yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_cheng2shi4dian4hua4yong4hu4shu4`: Double,
  `p_cheng2shi4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_xiang1cun1dian4hua4yong4hu4shu4`: Double,
  `p_xiang1cun1dian4hua4yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_wu2xian4xun2hu1yong4hu4shu4`: Double,
  `p_wu2xian4xun2hu1yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_yi2dong4dian4hua4yong4hu4shu4`: Double,
  `p_yi2dong4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_gu4ding4dian4hua4yong4`: Double,
  `p_gu4ding4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_cheng2shi4zhu4zhai2dian4hua4yong4hu4`: Double,
  `p_cheng2shi4zhu4zhai2dian4hua4yong4hu4tong2bi3zeng1zhang3`: Double,
  `p_xiang1cun1zhu4zhai2dian4hua4yong4hu4`: Double,
  `p_xiang1cun1zhu4zhai2dian4hua4yong4hu4tong2bi3zeng1zhang3`: Double
)

case class macro_china_postal_telecommunicationalResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_you2dian4ye4wu4zong3liang4`: Double,
  `p_you2dian4ye4wu4zong3liang4tong2bi3zeng1zhang3`: Double,
  `p_you2zheng4ye4wu4zong3liang4`: Double,
  `p_you2zheng4ye4wu4zong3liang4tong2bi3zeng1zhang3`: Double,
  `p_dian4xin4ye4wu4zong3liang4`: Double,
  `p_dian4xin4ye4wu4zong3liang4tong2bi3zeng1zhang3`: Double,
  `p_han2jian4zong3shu4`: Double,
  `p_han2jian4zong3shu4tong2bi3zeng1zhang3`: Double,
  `p_bao1jian4`: Double,
  `p_bao1jian4tong2bi3zeng1zhang3`: Double,
  `p_te4kuai4zhuan1di4`: Double,
  `p_te4kuai4zhuan1di4tong2bi3zeng1zhang3`: Double,
  `p_hui4piao4`: Double,
  `p_hui4piao4tong2bi3zeng1zhang3`: Double,
  `p_ding4xiao1bao4zhi3lei3ji4shu4`: Double,
  `p_ding4xiao1bao4zhi3lei3ji4shu4tong2bi3zeng1zhang3`: Double,
  `p_ding4xiao1za2zhi4lei3ji4shu4`: Double,
  `p_ding4xiao1za2zhi4lei3ji4shu4tong2bi3zeng1zhang3`: Double,
  `p_ji2you2ye4wu4`: Double,
  `p_ji2you2ye4wu4tong2bi3zeng1zhang3`: Double,
  `p_you2zheng4chu3xu4qi1mo4yu2e2`: Double,
  `p_you2zheng4chu3xu4qi1mo4yu2e2tong2bi3zeng1zhang3`: Double,
  `p_zhang3tu2dian4hua4tong1hua4shi2zhang3`: Double,
  `p_zhong1zhang3tu2dian4hua4tong1hua4shi2zhang3tong2bi3zeng1zhang3`: Double,
  `p_ben3di4dian4hua4qi1mo4yong4hu4shu4`: Double,
  `p_ben3di4dian4hua4qi1mo4yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_cheng2shi4dian4hua4yong4hu4shu4`: Double,
  `p_cheng2shi4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_xiang1cun1dian4hua4yong4hu4shu4`: Double,
  `p_xiang1cun1dian4hua4yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_wu2xian4xun2hu1yong4hu4shu4`: Double,
  `p_wu2xian4xun2hu1yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_yi2dong4dian4hua4yong4hu4shu4`: Double,
  `p_yi2dong4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_gu4ding4dian4hua4yong4`: Double,
  `p_gu4ding4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3`: Double,
  `p_cheng2shi4zhu4zhai2dian4hua4yong4hu4`: Double,
  `p_cheng2shi4zhu4zhai2dian4hua4yong4hu4tong2bi3zeng1zhang3`: Double,
  `p_xiang1cun1zhu4zhai2dian4hua4yong4hu4`: Double,
  `p_xiang1cun1zhu4zhai2dian4hua4yong4hu4tong2bi3zeng1zhang3`: Double
)

trait Json_macro_china_postal_telecommunicationalResponse {

  implicit val a_macro_china_postal_telecommunicationalResponse =
    new Decoder[macro_china_postal_telecommunicationalResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_postal_telecommunicationalResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_tong3ji4shi2jian1 <- c.downField("统计时间").as[String]

          p_you2dian4ye4wu4zong3liang4 <- c.downField("邮电业务总量").as[Double]

          p_you2dian4ye4wu4zong3liang4tong2bi3zeng1zhang3 <- c.downField("邮电业务总量同比增长").as[Double]

          p_you2zheng4ye4wu4zong3liang4 <- c.downField("邮政业务总量").as[Double]

          p_you2zheng4ye4wu4zong3liang4tong2bi3zeng1zhang3 <- c.downField("邮政业务总量同比增长").as[Double]

          p_dian4xin4ye4wu4zong3liang4 <- c.downField("电信业务总量").as[Double]

          p_dian4xin4ye4wu4zong3liang4tong2bi3zeng1zhang3 <- c.downField("电信业务总量同比增长").as[Double]

          p_han2jian4zong3shu4 <- c.downField("函件总数").as[Double]

          p_han2jian4zong3shu4tong2bi3zeng1zhang3 <- c.downField("函件总数同比增长").as[Double]

          p_bao1jian4 <- c.downField("包件").as[Double]

          p_bao1jian4tong2bi3zeng1zhang3 <- c.downField("包件同比增长").as[Double]

          p_te4kuai4zhuan1di4 <- c.downField("特快专递").as[Double]

          p_te4kuai4zhuan1di4tong2bi3zeng1zhang3 <- c.downField("特快专递同比增长").as[Double]

          p_hui4piao4 <- c.downField("汇票").as[Double]

          p_hui4piao4tong2bi3zeng1zhang3 <- c.downField("汇票同比增长").as[Double]

          p_ding4xiao1bao4zhi3lei3ji4shu4 <- c.downField("订销报纸累计数").as[Double]

          p_ding4xiao1bao4zhi3lei3ji4shu4tong2bi3zeng1zhang3 <- c
            .downField("订销报纸累计数同比增长")
            .as[Double]

          p_ding4xiao1za2zhi4lei3ji4shu4 <- c.downField("订销杂志累计数").as[Double]

          p_ding4xiao1za2zhi4lei3ji4shu4tong2bi3zeng1zhang3 <- c.downField("订销杂志累计数同比增长").as[Double]

          p_ji2you2ye4wu4 <- c.downField("集邮业务").as[Double]

          p_ji2you2ye4wu4tong2bi3zeng1zhang3 <- c.downField("集邮业务同比增长").as[Double]

          p_you2zheng4chu3xu4qi1mo4yu2e2 <- c.downField("邮政储蓄期末余额").as[Double]

          p_you2zheng4chu3xu4qi1mo4yu2e2tong2bi3zeng1zhang3 <- c
            .downField("邮政储蓄期末余额同比增长")
            .as[Double]

          p_zhang3tu2dian4hua4tong1hua4shi2zhang3 <- c.downField("长途电话通话时长").as[Double]

          p_zhong1zhang3tu2dian4hua4tong1hua4shi2zhang3tong2bi3zeng1zhang3 <- c
            .downField("钟长途电话通话时长同比增长")
            .as[Double]

          p_ben3di4dian4hua4qi1mo4yong4hu4shu4 <- c.downField("本地电话期末用户数").as[Double]

          p_ben3di4dian4hua4qi1mo4yong4hu4shu4tong2bi3zeng1zhang3 <- c
            .downField("本地电话期末用户数同比增长")
            .as[Double]

          p_cheng2shi4dian4hua4yong4hu4shu4 <- c.downField("城市电话用户数").as[Double]

          p_cheng2shi4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3 <- c
            .downField("城市电话用户数同比增长")
            .as[Double]

          p_xiang1cun1dian4hua4yong4hu4shu4 <- c.downField("乡村电话用户数").as[Double]

          p_xiang1cun1dian4hua4yong4hu4shu4tong2bi3zeng1zhang3 <- c
            .downField("乡村电话用户数同比增长")
            .as[Double]

          p_wu2xian4xun2hu1yong4hu4shu4 <- c.downField("无线寻呼用户数").as[Double]

          p_wu2xian4xun2hu1yong4hu4shu4tong2bi3zeng1zhang3 <- c.downField("无线寻呼用户数同比增长").as[Double]

          p_yi2dong4dian4hua4yong4hu4shu4 <- c.downField("移动电话用户数").as[Double]

          p_yi2dong4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3 <- c
            .downField("移动电话用户数同比增长")
            .as[Double]

          p_gu4ding4dian4hua4yong4 <- c.downField("固定电话用").as[Double]

          p_gu4ding4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3 <- c
            .downField("固定电话用户数同比增长")
            .as[Double]

          p_cheng2shi4zhu4zhai2dian4hua4yong4hu4 <- c.downField("城市住宅电话用户").as[Double]

          p_cheng2shi4zhu4zhai2dian4hua4yong4hu4tong2bi3zeng1zhang3 <- c
            .downField("城市住宅电话用户同比增长")
            .as[Double]

          p_xiang1cun1zhu4zhai2dian4hua4yong4hu4 <- c.downField("乡村住宅电话用户").as[Double]

          p_xiang1cun1zhu4zhai2dian4hua4yong4hu4tong2bi3zeng1zhang3 <- c
            .downField("乡村住宅电话用户同比增长")
            .as[Double]

        } yield {
          macro_china_postal_telecommunicationalResponse(
            p_tong3ji4shi2jian1,
            p_you2dian4ye4wu4zong3liang4,
            p_you2dian4ye4wu4zong3liang4tong2bi3zeng1zhang3,
            p_you2zheng4ye4wu4zong3liang4,
            p_you2zheng4ye4wu4zong3liang4tong2bi3zeng1zhang3,
            p_dian4xin4ye4wu4zong3liang4,
            p_dian4xin4ye4wu4zong3liang4tong2bi3zeng1zhang3,
            p_han2jian4zong3shu4,
            p_han2jian4zong3shu4tong2bi3zeng1zhang3,
            p_bao1jian4,
            p_bao1jian4tong2bi3zeng1zhang3,
            p_te4kuai4zhuan1di4,
            p_te4kuai4zhuan1di4tong2bi3zeng1zhang3,
            p_hui4piao4,
            p_hui4piao4tong2bi3zeng1zhang3,
            p_ding4xiao1bao4zhi3lei3ji4shu4,
            p_ding4xiao1bao4zhi3lei3ji4shu4tong2bi3zeng1zhang3,
            p_ding4xiao1za2zhi4lei3ji4shu4,
            p_ding4xiao1za2zhi4lei3ji4shu4tong2bi3zeng1zhang3,
            p_ji2you2ye4wu4,
            p_ji2you2ye4wu4tong2bi3zeng1zhang3,
            p_you2zheng4chu3xu4qi1mo4yu2e2,
            p_you2zheng4chu3xu4qi1mo4yu2e2tong2bi3zeng1zhang3,
            p_zhang3tu2dian4hua4tong1hua4shi2zhang3,
            p_zhong1zhang3tu2dian4hua4tong1hua4shi2zhang3tong2bi3zeng1zhang3,
            p_ben3di4dian4hua4qi1mo4yong4hu4shu4,
            p_ben3di4dian4hua4qi1mo4yong4hu4shu4tong2bi3zeng1zhang3,
            p_cheng2shi4dian4hua4yong4hu4shu4,
            p_cheng2shi4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3,
            p_xiang1cun1dian4hua4yong4hu4shu4,
            p_xiang1cun1dian4hua4yong4hu4shu4tong2bi3zeng1zhang3,
            p_wu2xian4xun2hu1yong4hu4shu4,
            p_wu2xian4xun2hu1yong4hu4shu4tong2bi3zeng1zhang3,
            p_yi2dong4dian4hua4yong4hu4shu4,
            p_yi2dong4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3,
            p_gu4ding4dian4hua4yong4,
            p_gu4ding4dian4hua4yong4hu4shu4tong2bi3zeng1zhang3,
            p_cheng2shi4zhu4zhai2dian4hua4yong4hu4,
            p_cheng2shi4zhu4zhai2dian4hua4yong4hu4tong2bi3zeng1zhang3,
            p_xiang1cun1zhu4zhai2dian4hua4yong4hu4,
            p_xiang1cun1zhu4zhai2dian4hua4yong4hu4tong2bi3zeng1zhang3
          )
        }
    }

}

object JsonItem_macro_china_postal_telecommunicationalResponse
    extends Json_macro_china_postal_telecommunicationalResponse
