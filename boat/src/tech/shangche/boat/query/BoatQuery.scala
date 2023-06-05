package tech.shangche.boat.query

//import akka.actor.typed.ActorSystem
import akka.actor.ActorSystem
import akka.actor.typed.scaladsl.adapter.ClassicActorSystemOps
import tech.shangche.boat.service.{BoatService, StockDataService}
import tech.shangche.boat.traits.StockDataServiceInter
import tech.shangche.boat.{IndexStock, StockStock, StockStock1}

import scala.concurrent.ExecutionContext.Implicits.global

object BoatQuery {

  final val boatService = new BoatService()(global)
  final val stockData: StockDataServiceInter = new StockDataService()(global)
  lazy final val stock = {
    new StockStock1(boatService, stockData)
  }

  def index: IndexStock = {
    IndexStock
  }
}
