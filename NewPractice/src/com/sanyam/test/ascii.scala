package com.sanyam.test
object ascii {
  def main(args: Array[String]) {
    println("We are trying to print ascii values from 1 to 128")

    for (a <- 1 to 128) {
      println("ASCII char for " + a + " is |" + a.toChar + "|")
    }
  }
}