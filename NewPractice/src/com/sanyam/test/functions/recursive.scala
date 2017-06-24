package com.sanyam.test.functions;
object recursive {
  def main(args: Array[String]) {
    println("-------------------------------------------------")
    for (i <- 1 to 10){
        println("Factorial of "+ i + ": "+factorial(i))
    }
    println("------------------------------------------------")
  }
  def factorial (n: BigInt): BigInt = {
      if(n <= 1) {
          1
      }
      else{
        n*factorial(n-1)
      } 
  }
}