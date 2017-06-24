package com.sanyam.test.functions;
object ExtHigherOrderFunction {
  def main(args: Array[String]) {
    println("--------------------------------------------------")
    println("@Sum of all numbers@ totalOverResultRange(10,i=>i) is :"+totalOverResultRange(10,i=>i)) 
    println("@Sum of even numbers@ totalOverResultRange(10,i => if(i % 2 == 0)i else 0) is :"+totalOverResultRange(10,i => if(i % 2 == 0)i else 0)) 
    println("@Sum of odd numbers@ totalOverResultRange(10,i => if(i % 2 != 0)i else 0) is :"+totalOverResultRange(10,i => if(i % 2 != 0)i else 0))
    println("@Number of cycles@ totalOverResultRange(10,i => if(i % 2 != 0)i else 0) is :"+totalOverResultRange(10,i => 1)) 
    println("--------------------------------------------------")
    println("--------------------------------------------------")
  }
  def totalOverResultRange(number: Int, codeBlock:Int =>Int) = {
    var result = 0
    for (i <- 1 to number){
      result += codeBlock(i)
    }
    result
  }
}