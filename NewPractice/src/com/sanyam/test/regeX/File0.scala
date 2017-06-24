package com.sanyam.test.regeX

import java.io._
object File0 {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("test.txt"))
    
    writer.write("Hello Scala")
    writer.close()
    
    println("Please give some input: ")
    val line = scala.io.StdIn.readLine()
    println("Thank you, your string is :"+line)
  }
}