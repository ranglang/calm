package com.lqiong.jep.option

import jep.SharedInterpreter
import org.apache.spark.sql.SparkSession

object RunTest extends App {
  implicit val interp: SharedInterpreter = new SharedInterpreter()

  implicit val spark: SparkSession = SparkSession
    .builder()
    .appName("Spark SQL basic example")
    .config("spark.master", "local")
    .config("spark.some.config.option", "some-value")
    .getOrCreate()

  val a = interp.getValue("1+1")

  println(s"a#${a}")
}

//
//None -> null
//PyJClass (wrapped class) -> java.lang.Class
//PyJObject (wrapped object) -> java.lang.Object
//Python 2 Str -> java.lang.String
//Python 3 Str -> java.lang.String
//Python 3 Unicode -> java.lang.String
//True -> java.lang.Boolean
//False -> java.lang.Boolean
//Python 2 Int -> java.lang.Integer
//Python 2 Long -> java.lang.Long
//Python 3 Int -> java.lang.Long
//Float -> java.lang.Double
//List -> java.util.ArrayList
//Tuple -> Collections.unmodifiableList(ArrayList)
//Dict -> java.util.HashMap
//Callable -> jep.python.PyCallable
//numpy.ndarray -> jep.NDArray
//object -> java.lang.String (This is a last resort where Interpreter.getValue(String) returns str(pyobject). Do not depend on this behavior, it will change in the future).
