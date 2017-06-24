package com.sanyam.test
object lists {
  def main(args: Array[String]) {
    val fruit: List[String] = List("apples", "oranges", "pears")
    val nums: List[Int] = List(1, 2, 3, 4)
    val empty: List[Nothing] = List()

    val fruit2 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))
    val empty2 = Nil

    val dim: List[List[Int]] = List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1))
    println("--------------------------------------------------------------------")
    val dim2 = (1 :: (0 :: (0 :: Nil))) :: (0 :: (1 :: (0 :: Nil))) :: (0 :: (0 :: (1 :: Nil))) :: Nil
    println(fruit.head) //returns the first element
    println(fruit.tail) //returns a list containing all elements but the head
    println(fruit.isEmpty) //returns if the list is empty
    println("--------------------------------------------------------------------")
    println(dim2.head.tail)
    println("--------------------------------------------------------------------")
    println("dim is\t\t\t|| " + dim + " ||")
    println("dim.head is\t\t|| " + dim.head + " ||")
    println("dim.tail is\t\t|| " + dim.tail + " ||")
    println("dim.head.head is\t|| " + dim.head.head + " ||")
    println("--------------------------------------------------------------------")
    println(empty.isEmpty)
    //----Concatination-------
    println("--------------------------------------------------------------------")
    val fruit0: List[String] = List("mango", "bananas", "watermellon")

    var fruitCon1 = fruit ::: fruit0
    println("fruit ::: fruit0 =\t\t" + fruitCon1)

    var fruitCon2 = fruit.:::(fruit0)
    println("fruit.:::(fruit0) =\t\t" + fruitCon2)

    var fruitCon3 = List.concat(fruit0, fruit)
    println("List.concat(fruit0,fruit) =\t" + fruitCon3)
    println("--------------------------------------------------------------------")
    //----Fill uniformly----
    val numfill = List.fill(10)(2) // fill 2,10 times
    var stringfill = List.fill(5)("Sanyam") //fill Sanyam, 5 times
    println("String:\t\t" + stringfill)
    println("Numbers:\t" + numfill)
    println("--------------------------------------------------------------------")
    //------Tabulating a FUnction------
    val squares = List.tabulate(6)(n => n * n)
    println("squares : " + squares)

    val mul = List.tabulate(4, 5)(_ * _)
    println("mul : " + mul)
    println("--------------------------------------------------------------------")
    //-------Reverse------------
    println("fruit0 befoure: \t" + fruit0)
    println("fruit0 reversed: \t" + fruit0.reverse)
    //---------------
    println("--------------------------------------------------------------------")
  }
}
