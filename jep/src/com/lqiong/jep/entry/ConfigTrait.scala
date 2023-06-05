package com.lqiong.jep.entry

import com.lqiong.jep.entry.Category.contracts
import com.lqiong.model.{LSymbol, OptionSymbol, StockSymbol}
import com.lqiong.model.order.{Contract, NoticeGroup, NoticeMe, OrderCommand, StockNote, StockOrder}
import com.lqiong.model.trade.TradeLogic
import org.joda.time.DateTime

import java.io.File
import scala.concurrent.{ExecutionContext, Future}

case class HoldOption(
  command: OrderCommand,
  option: OptionSymbol,
  buyTime: DateTime,
  amount: Int,
  leaveTime: Option[DateTime] = Option.empty[DateTime]
)
trait ConfigTrait {

  val tradeLogicConstant = "trade-logic"

  val tradeNotesConstant = "trade-notes"

  val optionFile: File;
  val panmingImage: File
  val normalizeCodeFile: File;
  val vixImageFile: File;
  val chaodieFile: File;
  val panMingFile: File;
  val imageChaodieFile: File;

  val initialNotes: List[StockNote]
  implicit val ex: ExecutionContext

  def options: Future[List[HoldOption]] =
    Future.successful(List.empty[HoldOption])

  def holds: Future[List[PortfolioGroup]] =
    Future.successful(List.empty[PortfolioGroup])

  def notices: Future[List[NoticeMe]];

  def rules: List[String];
  val clues: List[String] = List.empty[String]
//  def contracts: List[Contract];

//  def getCurrentSaleContract = contracts.head

  def logics: Future[List[TradeLogic]];

  def blackSymbolCodes: Map[StockSymbol, String] =
    Map.empty[StockSymbol, String]

  def clouds: Future[List[StockOrder]] = Future.successful(List.empty)

  def getEventsBySymbol(symbol: LSymbol): Future[List[Product]]

  def groups: List[NoticeGroup] = List.empty[NoticeGroup]

  def validateOrder(): Either[Error, String];
}
