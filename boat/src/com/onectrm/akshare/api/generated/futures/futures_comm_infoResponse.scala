package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_comm_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_comm_info 目标地址: http://www.9qihuo.com/qihuoshouxufei 描述: 九期网-期货手续费数据
  * 限量: 单次返回指定 symbol 的所有数据
  */
case class Respfutures_comm_infoResponse(
  `p_jiao1yi4suo3ming2cheng1`: String,
  `p_he2yue1ming2cheng1`: String,
  `p_he2yue1dai4ma3`: String,
  `p_xian4jia4`: Double,
  `p_zhang3ting2ban3`: Double,
  `p_die1ting2ban3`: Double,
  `p_bao3zheng4jin1mai3kai1`: Double,
  `p_bao3zheng4jin1mai4kai1`: Double,
  `p_bao3zheng4jin1mei3shou3`: Double,
  `p_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1`: Double,
  `p_shou3xu4fei4biao1zhun3kai1cang1yuan2`: String,
  `p_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1`: Double,
  `p_shou3xu4fei4biao1zhun3ping2zuo2yuan2`: String,
  `p_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1`: Double,
  `p_shou3xu4fei4biao1zhun3ping2jin1yuan2`: String,
  `p_mei3tiao4mao2li4`: Integer,
  `p_shou3xu4fei4`: Double,
  `p_mei3tiao4jing4li4`: Double,
  `p_bei4zhu4`: String,
  `p_shou3xu4fei4geng4xin1shi2jian1`: String,
  `p_jia4ge2geng4xin1shi2jian1`: String
)

case class futures_comm_infoResponse(
  `p_jiao1yi4suo3ming2cheng1`: String,
  `p_he2yue1ming2cheng1`: String,
  `p_he2yue1dai4ma3`: String,
  `p_xian4jia4`: Double,
  `p_zhang3ting2ban3`: Double,
  `p_die1ting2ban3`: Double,
  `p_bao3zheng4jin1mai3kai1`: Double,
  `p_bao3zheng4jin1mai4kai1`: Double,
  `p_bao3zheng4jin1mei3shou3`: Double,
  `p_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1`: Double,
  `p_shou3xu4fei4biao1zhun3kai1cang1yuan2`: String,
  `p_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1`: Double,
  `p_shou3xu4fei4biao1zhun3ping2zuo2yuan2`: String,
  `p_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1`: Double,
  `p_shou3xu4fei4biao1zhun3ping2jin1yuan2`: String,
  `p_mei3tiao4mao2li4`: Integer,
  `p_shou3xu4fei4`: Double,
  `p_mei3tiao4jing4li4`: Double,
  `p_bei4zhu4`: String,
  `p_shou3xu4fei4geng4xin1shi2jian1`: String,
  `p_jia4ge2geng4xin1shi2jian1`: String
)

trait Json_futures_comm_infoResponse {

  implicit val a_futures_comm_infoResponse = new Decoder[futures_comm_infoResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_comm_infoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jiao1yi4suo3ming2cheng1 <- c.downField("交易所名称").as[String]

        p_he2yue1ming2cheng1 <- c.downField("合约名称").as[String]

        p_he2yue1dai4ma3 <- c.downField("合约代码").as[String]

        p_xian4jia4 <- c.downField("现价").as[Double]

        p_zhang3ting2ban3 <- c.downField("涨停板").as[Double]

        p_die1ting2ban3 <- c.downField("跌停板").as[Double]

        p_bao3zheng4jin1mai3kai1 <- c.downField("保证金-买开").as[Double]

        p_bao3zheng4jin1mai4kai1 <- c.downField("保证金-卖开").as[Double]

        p_bao3zheng4jin1mei3shou3 <- c.downField("保证金-每手").as[Double]

        p_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1 <- c.downField("手续费标准-开仓-万分之").as[Double]

        p_shou3xu4fei4biao1zhun3kai1cang1yuan2 <- c.downField("手续费标准-开仓-元").as[String]

        p_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1 <- c.downField("手续费标准-平昨-万分之").as[Double]

        p_shou3xu4fei4biao1zhun3ping2zuo2yuan2 <- c.downField("手续费标准-平昨-元").as[String]

        p_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1 <- c.downField("手续费标准-平今-万分之").as[Double]

        p_shou3xu4fei4biao1zhun3ping2jin1yuan2 <- c.downField("手续费标准-平今-元").as[String]

        p_mei3tiao4mao2li4 <- c.downField("每跳毛利").as[Integer]

        p_shou3xu4fei4 <- c.downField("手续费").as[Double]

        p_mei3tiao4jing4li4 <- c.downField("每跳净利").as[Double]

        p_bei4zhu4 <- c.downField("备注").as[String]

        p_shou3xu4fei4geng4xin1shi2jian1 <- c.downField("手续费更新时间").as[String]

        p_jia4ge2geng4xin1shi2jian1 <- c.downField("价格更新时间").as[String]

      } yield {
        futures_comm_infoResponse(
          p_jiao1yi4suo3ming2cheng1,
          p_he2yue1ming2cheng1,
          p_he2yue1dai4ma3,
          p_xian4jia4,
          p_zhang3ting2ban3,
          p_die1ting2ban3,
          p_bao3zheng4jin1mai3kai1,
          p_bao3zheng4jin1mai4kai1,
          p_bao3zheng4jin1mei3shou3,
          p_shou3xu4fei4biao1zhun3kai1cang1wan4fen1zhi1,
          p_shou3xu4fei4biao1zhun3kai1cang1yuan2,
          p_shou3xu4fei4biao1zhun3ping2zuo2wan4fen1zhi1,
          p_shou3xu4fei4biao1zhun3ping2zuo2yuan2,
          p_shou3xu4fei4biao1zhun3ping2jin1wan4fen1zhi1,
          p_shou3xu4fei4biao1zhun3ping2jin1yuan2,
          p_mei3tiao4mao2li4,
          p_shou3xu4fei4,
          p_mei3tiao4jing4li4,
          p_bei4zhu4,
          p_shou3xu4fei4geng4xin1shi2jian1,
          p_jia4ge2geng4xin1shi2jian1
        )
      }
  }

}

object JsonItem_futures_comm_infoResponse extends Json_futures_comm_infoResponse
