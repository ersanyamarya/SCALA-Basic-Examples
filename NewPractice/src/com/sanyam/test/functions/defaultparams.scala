package com.sanyam.test.functions;
object defaultparams {
  def main(args: Array[String]) {
    println("-------------------------------------------------")
    println("Returned Value :\t"+addInt())
    println("-------------------------------------------------")
  }
  def addInt(a:Int=15, b:Int=17): Int ={
      var sum:Int =0
      sum = a+b

      return sum
  }

}