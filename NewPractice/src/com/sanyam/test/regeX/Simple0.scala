package com.sanyam.test.regeX
import scala.util.matching.Regex
object Simple0 {
  def main(args: Array[String]): Unit = {
    val p = new Regex("al+")
    val st = "Scala is a Functional programming language"
    
    println((p findAllIn st).mkString(","))
  }
}