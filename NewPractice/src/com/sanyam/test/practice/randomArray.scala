package com.sanyam.test.practice
import scala.util.Random
object randomArray {
  def main(args: Array[String]): Unit = {
    
    println("Enter Range")
    var number = scala.io.StdIn.readInt
    //var number = 10
    
    val a = new Array[Int](number)
    for (i <- 0 until number)
      a(i) = Random.nextInt(number)
    println(a.mkString(", "))
  }
}