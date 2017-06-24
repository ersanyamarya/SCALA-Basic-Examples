package com.sanyam.test
import Array._
object array2 {
  def main(args: Array[String]) {
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(3.9, 7.9, 0.4, 1.5)
    var myList4 = range(10, 40, 4) // upper limit is not included
    var myList5 = range(10, 20, 2)
    var myList3 = concat(myList1, myList2)

    for (x <- myList3) {
      print(" |" + x + "|")
    }
    println("\n\nNew Array 4")
    for (x <- myList4) {
      print(" |" + x + "|")
    }
    println("\nNew Array 5")
    for (x <- myList5) {
      print(" |" + x + "|")
    }
    println("")
  }
}