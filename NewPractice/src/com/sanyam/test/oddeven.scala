object oddeven {
  def oddeven(x: Int): String = {
    if (x % 2 == 0) "even"
    else "odd"
  }
  def main(args: Array[String]) {
    println("We are trying to find if the entered number is odd or even")
    print("Enter a number:  ")
    var number = scala.io.StdIn.readInt
    println("The number is " + oddeven(number))
  }
}