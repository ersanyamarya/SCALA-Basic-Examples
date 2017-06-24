package com.sanyam.test.pattern

object pattern {
  def main(args: Array[String]): Unit = {
    println("matchTest(3)\t" + matchTest(3))
    println("matchTest(2)\t" + matchTest(2))

    println("matchTest2(1)\t" + matchTest2(2))
    println("matchTest2(Sanyam)\t" + matchTest2("Sanyam")) // Sanyam has no case
  }
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "many"
  }

  def matchTest2(x: Any): Any = x match {
    case 1      => "one"
    case "two"  => 2
    case y: Int => "scala.Int"
    case _      => "many"
  }
}