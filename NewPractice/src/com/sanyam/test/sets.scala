object sets {
  def main(args: Array[String]) {
    val fruit1 = Set("apples", "oranges", "pears")
    val fruit2 = Set("mango", "bananas", "watermellon", "apples") //it removes reapeted element
    var fruit = fruit1 ++ fruit2
    println("fruit1 ++ fruit2 :\t" + fruit)
    println("")
    var fruit0 = fruit2.++(fruit1)
    println("fruit2.++(fruit1) :\t" + fruit)
    println("")
    //--------------max min-------------
    val numbers = Set(5, 9, 52, 66, 15, 75, 13, 3, 48)
    println("numbers:\t" + numbers)
    println("MAX in numbers:\t|" + numbers.max + "|")
    println("MIN in numbers:\t|" + numbers.min + "|")
    println("")

    //-------Finding common elements------
    val numbers2 = Set(2, 3, 85, 46, 79, 48, 13, 6)
    println("numbers:\t|" + numbers + "|")
    println("numbers2:\t|" + numbers2 + "|")
    println("numbers.&(numbers2):\t\t|" + numbers.&(numbers2) + "|")
    println("numbers.intersect(numbers2):\t|" + numbers.intersect(numbers2) + "|")

    println("")
  }
}   