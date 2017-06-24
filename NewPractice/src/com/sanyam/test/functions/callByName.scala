package com.sanyam.test.functions;
object callByName {
  def main(args: Array[String]) {
    println("-------------------------------------------------")
    delayed(time())
    println("-------------------------------------------------")
  }
  def time () = {
      println("Getting time in nano seconds")
      System.nanoTime
  }
  def delayed (t: => Long) = {
      println("In Delayed Method")
      println("Parameter ", t)
      t
  }
}