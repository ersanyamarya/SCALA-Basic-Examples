package com.sanyam.test
object ifelse {
  def main(args: Array[String]) { // main function with arguments
    var a = 20
    // if else-if else .................
    if (a > 20) {
      println("A is greater than 20")
    } else if (a < 20) {
      println("A is smaller than 20")
    } else if (a == 30) {
      println("A is equal to 30")
    } else {
      println("A is equal to 20")
    }
    //.................................
    // Nested if ......................
    var x = 10
    var y = 20
    if (x == 10) { // Enters the loop if condition is true
      if (y == 20) { // ----Same----
        println("x is 10 and y is 20")
      }
    }
    //.................................  
  }
}