package com.lqiong.a

import jep.SharedInterpreter

object C extends App {
  val interp = new SharedInterpreter()
  interp.exec("import os;");
  interp.exec("import sys;");
  interp.exec("import os;");
  val pwd = interp.getValue("os.getcwd()", classOf[String]);
  println("pwd {}", pwd)
}
