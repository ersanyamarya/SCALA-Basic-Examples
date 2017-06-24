package com.sanyam.test
import scala.io.StdIn

object arrayOperations {

  def printArr(a: Array[Int], str: String) = {
    println("\n" + str + ":")
    for (b <- 0 to a.length - 1) {
      println("Element no " + b + " is: |" + a(b) + "|")
    }
  }
  def printArrRev(a: Array[Int], str: String) = {
    println("\n" + str + ":")
    for (b <- (0 to a.length - 1).reverse) {
      println("Element no " + (a.length - b + 1) + " is: |" + a(b) + "|")
    }
  }
  def sumarr(a: Array[Int], mode: Boolean) = {
    var sum = 0;
    if (mode == true) for (b <- 0 to a.length - 1) if (b % 2 == 0) sum = sum + a(b)
    if (mode == false) for (b <- 0 to a.length - 1) if (b % 2 != 0) sum = sum + a(b)
    sum
  }
  def numOfElements(a: Array[Int], number: Int) = {
    if (number <= 0 || number > a.length) {
      println("Invalid entry")
    } else {
      println("\nElements till " + number + ":")
      for (b <- 1 to number) {
        println("Element no " + b + " is: |" + b + "|")
      }
    }
  }

  val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 2, 3, 4, 5, 2, 6)

  def main(args: Array[String]) {
    println("We are trying to do some aarray operations")
    printArr(arr, "The array is")
    println("The sum of even elements is: |" + sumarr(arr, true) + "|")
    println("The sum of odd elements is: |" + sumarr(arr, false) + "|")
    printArrRev(arr, "The array in reverse")
    print("\nEnter a number of elements you want to see:  ")
    var number = scala.io.StdIn.readInt
    numOfElements(arr, number)
  }
}
