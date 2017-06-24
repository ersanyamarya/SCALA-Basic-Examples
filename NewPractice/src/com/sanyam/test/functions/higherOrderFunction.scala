package com.sanyam.test.functions;
object higherOrderFunction {
  def main(args: Array[String]) {
    println("-------------------------------------------------")
    println(apply(layout,10))
    // call layout and and pass 10 into it
    println(layout(10))
    println("-------------------------------------------------")
  }
  def apply(f:Int => String, v:Int) = f(v)
  def layout[A](x:A) = "[" + x.toString() +"]"
}