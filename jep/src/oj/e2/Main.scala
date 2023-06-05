package oj.e2

object Main {
  def main(args: Array[String]): Unit = {
//      println("xxxx1x1ddd")
//      val a = scala.io.StdIn.readLine()
    val a = "1 1 -1"
//
    val txt = a.split(" ")
    val f = txt(0).toInt
    val second = txt(1).toInt
    val third = txt(2).toInt

    System.out.print(String.format("%1$8d", f));
    print(" ")
    System.out.print(String.format("%1$8d", second));
    print(" ")
    System.out.print(String.format("%1$8d", third));
  }
}

object T extends App {

  Main.main(Array[String]())
}
