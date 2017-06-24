object maps {
  def main(args: Array[String]) {
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val nums: Map[Int, Int] = Map()
    println("Keys in colosrs:\t" + colors.keys)
    println("Values in colosrs:\t" + colors.values)
    println("\nCheck in colosrs is empty:\t" + colors.isEmpty)
    println("Check in nums is empty:\t\t" + nums.isEmpty)

    println("\nValue to red is: " + colors("red"))
    println("Value to azure is: " + colors("azure"))

    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "FF0000")

    //----------------Concatination---------------------------------
    var colorsCon = colors ++ colors2
    println("colors ++ colors2 = " + colorsCon)

    colorsCon = colors2.++(colors)
    println("colors2.++(colors) = " + colorsCon)
    println("")
    //-------------Iterating through the map-----------------------
    colorsCon.keys.foreach { i =>
      print("Key = " + i)
      println("\tValue = " + colorsCon(i))
    }
    println("")
    //-----------CHeck for a key-----------------------------------
    if (colorsCon.contains("red")) {
      println("red key exists with the value:\t" + colorsCon("red"))
    } else {
      println("red key dosen't exist'")
    }
    if (colorsCon.contains("purple")) {
      println("red key exists with the value:\t" + colorsCon("purple"))
    } else {
      println("purple key dosen't exist'")
    }
  }
}