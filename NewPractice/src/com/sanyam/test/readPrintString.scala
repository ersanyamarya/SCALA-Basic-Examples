object readPrintString {
  def main(args: Array[String]) {
    println("We are trying to read a string and print it back")
    print("Enter a string:  ")
    var string = scala.io.StdIn.readLine()
    println("The string you entered is :\n\"" + string + "\"")
  }
}