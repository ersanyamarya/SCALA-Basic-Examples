package com.sanyam.test.functions;
import java.util.Date;
object boundparams {
  def main(args: Array[String]) {
    println("-------------------------------------------------")
    val logWithDateBound = log(new Date, _ : String)
    logWithDateBound("message1")
    logWithDateBound("message2")
    logWithDateBound("message3")
    println("-------------------------------------------------")
  }
  def log(date: Date, message: String) = {
      println(date + "\t"+message)
  }
}