package com.sanyam.test.functions;
object functions {
  def greetings() = {println ("Hello")}
  def max(x:Int, y:Int)= {
    if(x>y)x
    else y
  }
  def min(x:Int, y:Int)= {
    if(x>y)y
    else x
  }
  
  def main(args: Array[String]){
    greetings()
    var a = 100
    var b = 200
    println("Maximum is "+max(a,b))
    println("Minimum is "+min(a,b))
  }
}