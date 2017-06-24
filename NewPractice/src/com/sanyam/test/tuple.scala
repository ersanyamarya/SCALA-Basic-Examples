object tuple {
  def main(args: Array[String]) {
    val t = ("Sanyam", "Arya", 1, 2, 3, 4, 5, 6)
    println("Name is " + t._1 + " " + t._2)
    //one is string .. all the string
    println("Sum: " + t._3 + t._4 + t._5 + t._4)
    val t1 = (4, 3, 2, 1)
    println("")
    //----------Iterating through a tuple--------------------
    t1.productIterator.foreach { i => println("Value =\t" + i) }
    println("")
    //----------Convert to String-----------------------------
    val t2 = new Tuple3(1, "hello", Console)
    var t2string = t2.toString()
    println("Concatinated String:\t" + t2string)
    println("")
    //----------------Swap the Elements-----------------------
    val t3 = new Tuple2("Scala", "Hello")
    println("Normal Tuple:\t" + t3)
    println("Swap Tuple:\t" + t3.swap)
  }
}