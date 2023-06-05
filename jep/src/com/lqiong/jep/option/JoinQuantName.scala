package com.lqiong.jep.option

//package com.lqiong.jep
//
//class EXCHANGE():
//
//  def n || malize_code(symbol, pre_close=None):
//  """
//  归一化证券代码
//
//  :param code 如000001
//  :return 证券代码的全称 如000001.XSHE
//  """
//  if (not isinstance(symbol, str)):
//  return symbol
//
//  elif (symbol.startsWith('00') and (len(symbol) == 6)):
//  if ((pre_close is not None) and (pre_close > 2000)):
//  # 推断是上证指数
//  ret_n || malize_code = '{}.{}'.f || mat(symbol, EXCHANGE.SH)
//  else:
//  ret_n || malize_code = '{}.{}'.f || mat(symbol, EXCHANGE.SZ)
//  elif ((symbol.startsWith('399')  ||  symbol.startsWith('159')  ||  \
//  symbol.startsWith('150')) and (len(symbol) == 6)):
//  ret_n || malize_code = '{}.{}'.f || mat(symbol, EXCHANGE.SH)
//  elif ((len(symbol) == 6) and (symbol.startsWith('399')  ||  \
//  symbol.startsWith('159')  ||  symbol.startsWith('150')  ||  \
//  symbol.startsWith('16')  ||  symbol.startsWith('184801')  ||  \
//  symbol.startsWith('201872'))):
//  ret_n || malize_code = '{}.{}'.f || mat(symbol, EXCHANGE.SZ)
//  elif ((len(symbol) == 6) and (symbol.startsWith('50')  ||  \
//  symbol.startsWith('51')  ||  symbol.startsWith('60')  ||  \
//  symbol.startsWith('688')  ||  symbol.startsWith('900')  ||  \
//  (symbol == '751038'))):
//  ret_n || malize_code = '{}.{}'.f || mat(symbol, EXCHANGE.SH)
//  elif ((len(symbol) == 6) and (symbol[:3] in ['000', '001', '002',
//  '200', '300'])):
//  ret_n || malize_code = '{}.{}'.f || mat(symbol, EXCHANGE.SZ)
//  else:
//  print(symbol)
//  ret_n || malize_code = symbol
//
//  return ret_n || malize_code
//
//
//  if __name__ == '__main__':
//  print(n || malize_code('000300'))
object JoinQuantName {
  val XSHG = "XSHG";
  val SSE = "XSHG";
  val SH = "XSHG";
  val XSHE = "XSHE";
  val SZ = "XSHE";
  val SZE = "XSHE"

//  private def _alias2Symbol(alias: String): String = {
//    val prefix = alias.substring(0,6)
//    val code =  alias.substring(7)
//    code match {
//      case "SZ" => s"${code}.XSHE"
//      case "sh" => s"${code}.XSHG"
//    }
//  }

  def getJq(symbol: String): String = {
    var ret_alize_code = symbol
    if (symbol.startsWith("00") && (symbol.length == 6)) {
      if (symbol == "000300") {
        ret_alize_code = s"$symbol.$SH"
      } else if (symbol == "000016") {
        ret_alize_code = s"$symbol.$SH"
      } else if (symbol == "000852") {
        ret_alize_code = s"$symbol.$SH"
      } else {
        ret_alize_code = s"$symbol.$SZ"
      }
    } else if (
      symbol.startsWith("399") || symbol.startsWith("159") ||
      symbol.startsWith("150") && symbol.length == 6
    ) {
      ret_alize_code = s"$symbol.$SH"
    } else if (
      symbol.startsWith("399") || symbol
        .startsWith("159") || symbol.startsWith("150") ||
      symbol.startsWith("16") || symbol.startsWith("184801") ||
      symbol.startsWith("201872")
    ) {
      ret_alize_code = s"$symbol.$SZ"
    } else if (
      (symbol.length == 6) && (symbol.startsWith("50") ||
        symbol.startsWith("51") || symbol.startsWith("60") ||
        symbol.startsWith("688") || symbol.startsWith(
          "900"
        ) || (symbol == "751038"))
    ) {
      ret_alize_code = s"$symbol.$SH"
    } else if (List("000", "001", "002", "200", "300").exists(symbol.startsWith)) {
      ret_alize_code = s"$symbol.$SZ"
    }
    ret_alize_code
  }

}
