package com.sanyam.test.exceptions

import java.io._

object exceptionTest {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println(">> Missing File exeption")
      }
      case ex: IOException => {
        println(">>IO Exception")
      }
    } finally {
      println(">> Exiting Finaly .. !")
    }
  }
}