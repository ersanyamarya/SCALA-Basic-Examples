package com.sanyam.test.practice

object ArrSortRev {
  
  def main(args: Array[String]): Unit = {
    var arr = Array(1,8,9,25,14,36,100,2)
    arr= arr.distinct
    for (b <- (0 to arr.length - 1).reverse) {
      println( arr(b))
    }
  }
  
}