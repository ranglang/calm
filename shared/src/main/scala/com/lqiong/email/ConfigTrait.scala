package com.lqiong.email

trait TradeAble {

  def login()

}

trait AutoTrade {
  def run(): Unit = {}
}
