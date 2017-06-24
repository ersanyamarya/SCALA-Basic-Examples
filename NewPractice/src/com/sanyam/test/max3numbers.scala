object max3numbers {
  def max(x: Int, y: Int, z: Int) = {
    if (x > y) {
      if (x > z) x
      else z
    } else {
      if (z > y) z
      else y
    }
  }

  def main(args: Array[String]) {
    println("We are trying to find maximum of three numbers")
    print("Enter first number:  ")
    var one = scala.io.StdIn.readInt
    print("Enter second number: ")
    var two = scala.io.StdIn.readInt
    print("Enter third number:  ")
    var three = scala.io.StdIn.readInt
    println("The maximum of " + one + ", " + two + ", " + three + " is: " + max(one, two, three))
  }
}