

object stringprintf {
  def main(args: Array[String]): Unit = {
    var floatvar = 12.456
    var intvar = 2000
    var stringvar = "Scala is awesome"
    var fs = printf("The value of floatvar = %f,\nthe value of intvar = %d\nThat is why %s", floatvar, intvar, stringvar)

    println(fs)
  }
}