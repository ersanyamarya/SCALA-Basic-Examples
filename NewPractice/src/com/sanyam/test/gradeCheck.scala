package com.sanyam.test
object gradeCheck {
  def grade(x: Int, y: Int, z: Int) = {
    var percent = (x + y + z) / 3
    if (percent > 90) "A"
    else if (percent > 70) "B"
    else "C"
  }

  def main(args: Array[String]) {
    println("We are trying to find Grade based on marks")

    print("Enter marks for first subject (out of 100):  ")
    var one = scala.io.StdIn.readInt
    print("Enter marks for second subject(out of 100):  ")
    var two = scala.io.StdIn.readInt
    print("Enter marks for third subject(out of 100):   ")
    var three = scala.io.StdIn.readInt

    println("The grade is :|" + grade(one, two, three) + "|")
  }
}