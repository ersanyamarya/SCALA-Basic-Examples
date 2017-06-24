package com.sanyam.test.regeX
import scala.io.Source
object File1 {
  def main(args: Array[String]): Unit = {
    println("Following is the content: ")
    Source.fromFile("test.txt").foreach {
      print
    }
  }
}