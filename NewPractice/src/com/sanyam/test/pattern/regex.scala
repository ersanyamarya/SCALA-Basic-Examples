package com.sanyam.test.pattern
import scala.util.matching.Regex
object regex {
  def main(args: Array[String]): Unit = {
    println("----------------------------------------------------")
    val pattern = "Scala".r //r is a method -- rich string and calls an instance of Regex
    val pattern2 = new Regex("(A|a)nd")
    val pattern3 = ("(S|s)cala").r
    val str = "Scala is scalable and cool Scala And and And"

    println(pattern findFirstIn str)

    println("----------------------------------------------------")
    var i = 1
    println("\"Scala\".r")
    for (e <- pattern findAllIn str) {
      println(i + " time " + e)
      i += 1
    }

    println("----------------------------------------------------")
    println("new Regex(\"(A|a)nd\")")
    println((pattern2 findAllIn str).mkString(","))
    println("----------------------------------------------------")
    println("new Regex(\"(A|a)nd\")")
    for (o <- pattern2 findAllIn str) {
      println("Pattern match2 " + o)
    }

    println("----------------------------------------------------")
    println("\"Scala\".r")
    println(pattern replaceFirstIn (str, "Java"))
    println("----------------------------------------------------")
    println("\"Scala\".r")
    println(pattern replaceAllIn (str, "Java"))
    println("----------------------------------------------------")
    println("\"(S|s)ala\"")
    println((pattern3 findAllIn str).mkString(","))
    println("----------------------------------------------------")
    
  }
}