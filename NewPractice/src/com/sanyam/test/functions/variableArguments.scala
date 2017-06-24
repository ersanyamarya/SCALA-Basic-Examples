package com.sanyam.test.functions;
object variableArguments {
  def main(args: Array[String]) {
    println("-------------------------------------------------")
    printStrings("Hello","Scala","Python","Sanyam")
    println("-------------------------------------------------")
  }
  def printStrings(args:String*) = {
    var i: Int = 0;
    for (arg <- args){
      println("Arg Value["+i+"] = " +arg)
      i+=1
    }
  }
}
  