package com.lqiong.model.order

object ObjectConvert {

  def getIndexSimple(code: String) = {
    code match {
      case st if st == "000300" => {
        s"sh$code"
      }
      case st if st == "000016" => {
        s"sh$code"
      }
      case st if st.startsWith("00") && st.length == 6 =>
        s"sz$code" // TODO check shangzhengshizhu
      case st
          if (st.startsWith("399") || st
            .startsWith("159") || st.startsWith("150")) && st.length == 6 =>
        s"sz$code"
      case st
          if st.startsWith("50") || st.startsWith("51") || st.startsWith(
            "60"
          ) || st.startsWith("688") || st.startsWith("900") ||
            st == "751038" =>
        s"sh$code"
      case st
          if List("000", "001", "002", "200", "301", "300")
            .contains(st.take(3)) =>
        s"sz$code"
      case _ =>
        code
    }

  }

  /** deprecated wrong you must wrong
    * @param code
    * @return
    */
  def getSimple(code: String) = {
    code match {
      case st if st == "000300" => {
        s"sh$code"
      }
      case st if st == "000016" => {
        s"sh$code"
      }
      case st if st.startsWith("00") && st.length == 6 =>
        s"sz$code" // TODO check shangzhengshizhu
      case st
          if (st.startsWith("399") || st
            .startsWith("159") || st.startsWith("150")) && st.length == 6 =>
        s"sz$code"
      case st
          if st.startsWith("50") || st.startsWith("51") || st.startsWith(
            "60"
          ) || st.startsWith("688") || st.startsWith("900") ||
            st == "751038" =>
        s"sh$code"
      case st
          if List("000", "001", "002", "200", "301", "300")
            .contains(st.take(3)) =>
        s"sz$code"
      case _ =>
        code
    }

  }

}
