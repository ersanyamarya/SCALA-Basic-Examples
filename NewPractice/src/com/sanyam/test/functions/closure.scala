package com.sanyam.test.functions;
object closure {
  def main(args: Array[String]) {
    println("-------------------------------------------------")
    println("multiplier(1)\tValue =" + multiplier(1))
    println("multiplier(2)\tValue =" + multiplier(2))
    println("-------------------------------------------------")
  }
  var factor = 3
  def multiplier = (i:Int) => i * factor
}