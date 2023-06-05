package com.lqiong.model

import com.github.takezoe.retry.{retry, RetryPolicy}
import com.lqiong.claim.MovingAverage
import com.lqiong.jep.entry.SymbolEnum.{block, index, jijin, stock, usa}
import com.lqiong.jep.entry.{DateFormat, RetIndexItem, StockChaoDie, SymbolEnum}
import com.lqiong.jep.models.StockHotPrice1
import com.lqiong.jep.option.OptionDirection.CALL
import com.lqiong.jep.option.OptionProductName.HX50
import com.lqiong.jep.option.{LqHtml, OptionDirection, OptionProductName}
import com.lqiong.model.order.{FundDateList, ObjectConvert}
import io.circe.generic.{AutoDerivation, JsonCodec}
import org.joda.time.DateTime

import java.util.Date
import scala.concurrent.{Await, Future}
import scala.util.Try

case class SWIndexItem(
  index_code: String,
  index_name: String,
  date: Date,
  open: Double,
  high: Double,
  low: Double,
  close: Double,
  vol: Double,
  amount: Double,
  change_pct: Double
)

trait QueryTableInter {
  def getIndexItems(): Future[List[RetIndexItem]]
  def getFundDailyPrice(code: String): Future[List[FundDateList]]
}

trait StockTrait {

  def getPrice(code: String): StockHotPrice1

  def indexGetPrice(code: String): StockHotPrice1

  def getCodeName(code: String): String

  def getSwIndexName(code: String): String

  def getFundName(code: String): String

  def getUsaName(code: String): String

  def getDayChaodie(
    code: String,
    date: Option[DateTime] = Option.empty[DateTime]
  ): Double

  def getDayChaodieList(
    code: String,
    date: Option[DateTime] = Option.empty[DateTime]
  ): List[StockChaoDie]

  def getPriceSince(code: String, day: Int = 20): Double

  def getPanming(code: String): Double

  def getFundSince(code: JiJinSymbol): List[ItemPrice]

  def getStockPrices(code: StockSymbol): List[ItemPrice]

  def getConvertibleName(code: String): String

  def getOptionCode(l: String): String

  def getHkItemName(code: String): String
}

sealed trait LSymbol {
  val symbolType: SymbolEnum
  val code: String = ""

//  def getJqCode(implicit stockTrait: StockTrait): String
  def getPrices()(implicit
    stockTrait: StockTrait
  ): List[ItemPrice] = {
    List.empty[ItemPrice]
  }

  def getCurrentPrice()(implicit
    stockTrait: StockTrait
  ): Double = {
    0.0
  }

  def getSimpleName(): String

  def getTableName: String

  def setCode(s: String): LSymbol

  def getPriceSince(day: Int)(implicit stockTrait: StockTrait): Double = {
    0.0
  }

  def getChangeSince(day: Int)(implicit stockTrait: StockTrait): Double = {
    0.0
  }

  def getCodeName(implicit
    stockTrait: StockTrait,
    queryTable: QueryTableInter,
    retryPolicy: RetryPolicy
  ): String
  def getChaodieDayList(date: Option[DateTime] = Option.empty[DateTime])(implicit
    stockTrait: StockTrait
  ): List[StockChaoDie]

  def getName = {
    symbolType match {
      case SymbolEnum.`index` => s"fund$code"
      case SymbolEnum.stock   => s"stock$code"
      case SymbolEnum.jijin   => s"jijin$code"
      case SymbolEnum.usa     => s"usa$code"
      case _                  => s"unknown_$code"
    }
  }
}

import cats.syntax.functor._
import io.circe.generic.auto._
import io.circe.syntax._
import io.circe.{Decoder, Encoder}

trait GenericDerivation {
  implicit val encodeEvent: Encoder[LSymbol] = Encoder.instance {
    case foo: IndexSymbol     => foo.asJson
    case bar: StockSymbol     => bar.asJson
    case a: ConvertibleSymbol => a.asJson
    case bar: UsSymbol        => bar.asJson
    case bar: HkSymbol        => bar.asJson
    case jijin: JiJinSymbol   => jijin.asJson
//    case option: OptionSymbol => option.asJson
    // TODO add symbol
  }

  implicit val decodeEvent: Decoder[LSymbol] =
    List[Decoder[LSymbol]](
      Decoder[ConvertibleSymbol].widen,
      Decoder[IndexSymbol].widen,
      Decoder[HkSymbol].widen,
      Decoder[StockSymbol].widen,
      Decoder[UsSymbol].widen,
      Decoder[JiJinSymbol].widen
//        Decoder[OptionSymbol].widen
      // TODO symbol
    ).reduceLeft(_ or _)
}

object GenericDerivation extends GenericDerivation

case class ConvertibleSymbol(
  override val code: String = "",
  symbolType: SymbolEnum = SymbolEnum.convertible
) extends LSymbol {

//  override def getJqCode(implicit stockTrait: StockTrait): String = {
//    "djqCode"
//  }

  override def getSimpleName(): String = {
    s"KZZ$code"
  }

  override def getTableName: String = s"convertible_$code"

  override def setCode(s: String): ConvertibleSymbol = this.copy(code = s)

  override def getCodeName(implicit
    stockTrait: StockTrait,
    queryTable: QueryTableInter,
    retry1: RetryPolicy
  ): String = {
    stockTrait.getConvertibleName(code)
  }

  override def getChaodieDayList(
    date: Option[DateTime]
  )(implicit stockTrait: StockTrait): List[StockChaoDie] = {
    // TODO get ChaodieList
    List.empty[StockChaoDie]
  }
}

case class HkSymbol(
  override val code: String = "",
  symbolType: SymbolEnum = SymbolEnum.uk
) extends LSymbol {
//  override def getJqCode(implicit stockTrait: StockTrait): String = {
//    ""
//  }

  override def getSimpleName(): String = {
    s"hK_symbol_${code}"
  }

  override def getTableName: String = {
    ""
  }

  override def setCode(s: String): HkSymbol = this.copy(code = s)

  override def getCodeName(implicit
    stockTrait: StockTrait,
    queryTable: QueryTableInter,
    retry1: RetryPolicy
  ): String = {
    stockTrait.getHkItemName(code)
  }

  override def getChaodieDayList(
    date: Option[DateTime]
  )(implicit stockTrait: StockTrait): List[StockChaoDie] = {
    // TODO get chaodie day list
    List.empty[StockChaoDie]
  }
}

case class BlockSymbol(
  override val code: String = "",
  symbolType: SymbolEnum = SymbolEnum.bk
) extends LSymbol {
  override def getSimpleName(): String = {
    s"block_symbol_${code}"
  }

  override def getTableName: String = {
    ""
  }

  override def setCode(s: String): LSymbol = this.copy(code = s)

  override def getCodeName(implicit
    stockTrait: StockTrait,
    queryTable: QueryTableInter,
    retry1: RetryPolicy
  ): String = {
    code
  }

  override def getChaodieDayList(
    date: Option[DateTime]
  )(implicit stockTrait: StockTrait): List[StockChaoDie] = {
    List.empty[StockChaoDie]
  }
}

case class UsSymbol(
  override val code: String = "",
  symbolType: SymbolEnum = usa
) extends LSymbol {
//  override def getJqCode(implicit stockTrait: StockTrait): String = {
//    ""
//  }

  override def getSimpleName(): String = {
    s"us_symbol_${code}"
  }

  override def getTableName: String = {
    ""
  }

  override def setCode(s: String): UsSymbol = this.copy(code = s)

  override def getCodeName(implicit
    stockTrait: StockTrait,
    queryTable: QueryTableInter,
    retry1: RetryPolicy
  ): String = {
    stockTrait.getUsaName(code)
  }

  override def getChaodieDayList(
    date: Option[DateTime]
  )(implicit stockTrait: StockTrait): List[StockChaoDie] = {
    List.empty
  }
}

case class JiJinSymbol(
  override val code: String = "",
  symbolType: SymbolEnum = jijin
) extends LSymbol {

  override def hashCode: Int = {
    s"jijin_$code".hashCode
  }

//  override def getJqCode(implicit stockTrait: StockTrait): String = {
//    // TODO get code for joinquant
//    ""
//  }

  def getJijinDialyPrice()(implicit
    stockTrait: StockTrait,
    queryTable: QueryTableInter,
    retry1: RetryPolicy
  ): Double = {
    retry {
      // TODO get code for joinquant
      import scala.concurrent.duration._
      val list = Await.result(queryTable.getFundDailyPrice(code), 2.minutes)
      val f: Double =
        list.toList.takeRight(1).map(r => r.change_pct).headOption.getOrElse(0)
      f
    }
  }

  override def getPriceSince(
    day: Int
  )(implicit stockTrait: StockTrait): Double = {

    val f = stockTrait.getFundSince(JiJinSymbol(code))
    val f1 = Try {
      val f1 = f.last.price
      val f2 = f.takeRight(day).head.price
      (f1 - f2) / f2
    }.toOption
    f1.getOrElse(0.0)
  }

  override def getSimpleName(): String = {
    s"jijin_$code"
  }

  override def getTableName: String = s"j_$code"

  def getPriceTableName: String = s"j_price_$code"

  override def setCode(s: String): JiJinSymbol = this.copy(code = s)

  override def getCodeName(implicit
    stockTrait: StockTrait,
    queryTable: QueryTableInter,
    retry: RetryPolicy
  ): String = {
    ""
//    stockTrait.getFundName(code)
  }

  def getFundDetail = {
    LqHtml.link(s"http://fund.eastmoney.com/$code.html", "详情")
  }

  def getDocument = {
    LqHtml.link(s"http://fundf10.eastmoney.com/ccmx_$code.html", "档案")
  }

  override def getChaodieDayList(
    date: Option[DateTime]
  )(implicit stockTrait: StockTrait): List[StockChaoDie] = {
    // TODO
    List.empty
  }
}

case class IndexSymbol(
  override val code: String = "",
  symbolType: SymbolEnum = index
) extends LSymbol {
  override def setCode(s: String): IndexSymbol = this.copy(code = s)

  def getChaodieDay(
    date: Option[DateTime] = Option.empty[DateTime]
  )(implicit stockTrait: StockTrait): Double = {
    stockTrait.getDayChaodie(code, date)
  }

  override def hashCode: Int = {
    s"index$code".hashCode
  }

  // TODO check contain
  def getContainLink() = {
    LqHtml.link(
      s"http://www.csindex.com.cn/zh-CN/indices/index-detail/$code",
      "contain"
    )
  }

//  def getPanMing(implicit stockTrait: StockTrait): List[Double] = {
//    stockTrait.getPanMing(s"pm_${code}")
//  }

  override def getCodeName(implicit
    stockTrait: StockTrait,
    queryTable: QueryTableInter,
    retryPolicy: RetryPolicy
  ): String = {
    import scala.concurrent.duration._
    retry {
      val list = retry(Await.result(queryTable.getIndexItems(), 200.seconds))
      list.find(r => r.code.contains(code)).map(r => r.name).getOrElse("")
    }
  }

  override def getChaodieDayList(
    date: Option[DateTime] = Option.empty[DateTime]
  )(implicit stockTrait: StockTrait): List[StockChaoDie] = {
    stockTrait.getDayChaodieList(code, date)
  }

  override def getCurrentPrice()(implicit stockTrait: StockTrait): Double = {
    stockTrait.indexGetPrice(code).price
  }

  def getPanming()(implicit stockTrait: StockTrait): Double = {
    println("get panming")
    stockTrait.getPanming(code)
  }

//  override def getJqCode(implicit stockTrait: StockTrait): String = {
//    // TODO add code
//    stockTrait.getJqCode(code)
////    ObjectConvert.getSimple(code)
//  }

  def getPanmingTabeName = {
    s"pm_$code"
  }

  override def getSimpleName(): String = {
    ObjectConvert.getSimple(code)
//    code match {
//      case st if st.startsWith("399") && st.length == 6 =>
//        s"sz$code" // TODO check shangzhengshizhu
//      case st if st.startsWith("00") && st.length == 6 =>
//        if (st == "000001") s"sh000001"
//        else {
//          s"sz$code" // TODO check shangzhengshizhu
//        }
//      case st
//          if (st.startsWith("399") || st
//            .startsWith("159") || st.startsWith("150")) && st.length == 6 =>
//        s"sz$code"
//      case st
//          if (st.startsWith("50") || st.startsWith("51") || st.startsWith(
//            "60"
//          ) || st.startsWith("688") || st.startsWith("900") ||
//            st == "751038") =>
//        s"sh$code"
//      case st
//          if (List("000", "001", "002", "200", "300").contains(st.take(3))) =>
//        st.lastIndexOf()
//        s"sz$code"
//      case _ =>
//        code
//    }
  }

  override def getTableName: String = {
    s"i_$code"
  }

}

@JsonCodec
case class SwIndexSymbol(
  override val code: String = "",
  symbolType: SymbolEnum = block
) extends LSymbol {
  // TODO get name
//  override def getJqCode(implicit stockTrait: StockTrait): String = ""

  override def getSimpleName(): String = s"swsymbol_${code}"

  override def getTableName: String = s"sw_$code"

  override def setCode(s: String): SwIndexSymbol = this.copy(code = s)

  override def getCodeName(implicit
    stockTrait: StockTrait,
    queryTable: QueryTableInter,
    retry1: RetryPolicy
  ): String = {
    stockTrait.getSwIndexName(code)
  }

  override def getChaodieDayList(
    date: Option[DateTime]
  )(implicit stockTrait: StockTrait): List[StockChaoDie] = {
    List.empty
  }
}

case class OptionSymbol(
  override val code: String = "",
  symbolType: SymbolEnum = SymbolEnum.option,
  val direction: OptionDirection = CALL,
  val date: DateTime = DateTime.now,
  productName: OptionProductName = HX50,
  val price: Option[Long] = Option.empty[Long]
) extends LSymbol {

  def getContractNum()(implicit stockTrait: StockTrait) = {
    stockTrait.getOptionCode(getRealCode())
  }

  def getRealCode() = {

//    510300P2107M05750
    // TODO FIXME
    val a = if (productName == HX50) "510050" else "510300"
    val b = if (direction == CALL) "C" else "P"
    s"$a$b${DateFormat.formatYYMM(date)}M0${price.get}"
  }

//  override def getJqCode(implicit stockTrait: StockTrait): String = {
//    // TODO
//    ""
//  }

  override def getSimpleName(): String = {
    s"Option_name_${getRealCode()}"
  }

  override def getTableName: String = {
    s"opt_$code"
  }

  override def setCode(s: String): OptionSymbol = this.copy(code = s)

  override def getCodeName(implicit
    stockTrait: StockTrait,
    queryTable: QueryTableInter,
    retry1: RetryPolicy
  ): String = {
    // TODO
    ""
  }

  override def getChaodieDayList(
    date: Option[DateTime]
  )(implicit stockTrait: StockTrait): List[StockChaoDie] = {
    List.empty[StockChaoDie]
  }
}
//object OptionSymbol extends DateF

@JsonCodec
case class StockSymbol(
  override val code: String = "",
  symbolType: SymbolEnum = stock
) extends LSymbol {

  /** Replace the scheme. Does not validate the new scheme value. */
  override def setCode(s: String): StockSymbol = this.copy(code = s)

  override def hashCode: Int = {
    s"stock$code".hashCode
  }

  def getSimpleName(code: String) = {
    ObjectConvert.getSimple(code)
  }

  def getCaiwuPage = {
    LqHtml.link(
      s"https://robo.datayes.com/v2/stock/$code/overview#KEY_FINANCE_INDICATORS",
      "key-finaicail"
    )
//    LqHtml.link(s"https://www.jianweidata.com/CompanyDetail?module=%E4%B8%BB%E8%90%A5%E4%B8%9A%E5%8A%A1&secCode=$code&sector=1", "财务")
  }

  def keyCaiwu = {
    LqHtml.link(
      s"https://robo.datayes.com/v2/stock/$code/overview#KEY_FINANCE_INDICATORS",
      "key-finaicail"
    )
  }

  def getEvents = {
    LqHtml.link(s"http://oneone.fun/live/events?code=$code", "events")
  }

  override def getTableName: String = {
    s"s_$code"
  }

  def getGuZhi = {
    LqHtml.link(s"http://data.eastmoney.com/gzfx/detail/$code.html", "value")
  }

  def getYanbao = {
    s"""<a href="http://data.eastmoney.com/report/$code.html">研报</a>"""
  }

  def getPrice()(implicit stockTrait: StockTrait): StockHotPrice1 = {
    val p = stockTrait.getPrice(code)
    println(s"p ${}", p)
    p
  }

  override def getCurrentPrice()(implicit stockTrait: StockTrait): Double = {
    getPrice().price
  }

//  override def getJqCode(implicit stockTrait: StockTrait): String = {
//    stockTrait.getJqCode(code)
//  }

  def getChaodieDay(
    date: Option[DateTime] = Option.empty[DateTime]
  )(implicit stockTrait: StockTrait): Double = {
//    logger.info("chaodie {}", code)
//    logger.info("chaodie result {}", r)
    val r = stockTrait.getDayChaodie(code, date)
    r
//    0.0
  }

  override def getChaodieDayList(
    date: Option[DateTime] = Option.empty[DateTime]
  )(implicit stockTrait: StockTrait): List[StockChaoDie] = {
    stockTrait.getDayChaodieList(code, date)
  }

  override def getPriceSince(
    day: Int
  )(implicit stockTrait: StockTrait): Double = {
    stockTrait.getPriceSince(code, day)
  }

  override def getChangeSince(
    day: Int
  )(implicit stockTrait: StockTrait): Double = {
    val start = stockTrait.getPriceSince(code, day)
//    logger.info("start {} end {}", start, stockTrait.getPriceSince(code, 0))
    (stockTrait.getPriceSince(code, 0) - start) / start
  }

  override def getSimpleName(): String = {
    ObjectConvert.getSimple(code)
  }

  override def getCodeName(implicit
    stockTrait: StockTrait,
    queryTable: QueryTableInter,
    retry1: RetryPolicy
  ): String = {
    stockTrait.getCodeName(code)
  }

  override def getPrices()(implicit stockTrait: StockTrait): List[ItemPrice] = {
    stockTrait.getStockPrices(StockSymbol(code))
  }

  def getPricesMALatest(day: Int)(implicit stockTrait: StockTrait): Double = {
    val a2 =
      MovingAverage.calculateLastMA(getPrices().map(_.price).toArray, day)
    a2
  }

}

object StockSymbol extends AutoDerivation
