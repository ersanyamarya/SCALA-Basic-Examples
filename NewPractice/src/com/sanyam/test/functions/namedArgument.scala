package com.sanyam.test.functions;
object namedArguments {
  def main(args: Array[String]) {
    println("-------------------------------------------------")
    printInt(b=5,a=7,str="Sanyam")
    println("-------------------------------------------------")
  }
  def printInt(str:String,a:Int,b:Int) = {
    println("Value of str:\t"+str)
    println("Value of a:\t"+a)
    println("Value of b:\t"+b)
  }
}