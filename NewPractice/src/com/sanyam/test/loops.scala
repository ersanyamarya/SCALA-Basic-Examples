package com.sanyam.test
object loops {
  def main(args: Array[String]) {
    var a = 5

    //while loop ...........................
    while (a > 0) {
      println("in the while loop: a is |" + a + "|")
      a -= 1
    }

    //Do while loop..........................
    do {
      println("--------------------------------------------------------")
      println("in the do while loop: a is |" + a + "|")
    } while (a > 0)

    //For loop ..............................
    //for(var <- Range) "<-" is called generator
    println("--------------------------------------------------------")
    var x = 0 // not needed
    for (x <- 5 to 10) {
      println("x is: |" + x + "|")
    }
    println("--------------------------------------------------------")
    // x is not altered, the x in the for loop is different
    println("now x is |" + x + "|")

    //another varient
    println("--------------------------------------------------------")
    for (a <- 1 until 5) { // prints till 4 - until 5 
      println("a is: |" + a + "|")
    }
    //For loop with range......................
    //Similar to nested for loop
    println("--------------------------------------------------------")
    for (a <- 1 to 3; b <- 1 until 3) {
      print("a is: |" + a + "|")
      println(" b is: |" + b + "|")
    }

    //For loop with collection................
    println("--------------------------------------------------------")
    var z = 0
    //List can contain different data types
    //List converts every element to the highest Data type
    val numberlist = List(100, "Sanyam", 30.04, 400)
    for (a <- numberlist) {
      println("a is |" + a + "|")
    }

    //For loop with multiple conditions.........
    println("--------------------------------------------------------")
    println("Values less than 8 and not 3")
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    for (a <- numList if a != 3; if a < 6) {
      println("a is: |" + a + "|")
    }

    //For loop with yield
    var retVal = for {
      a <- numList if a != 3; if a < 6
    } yield a
    println("--------------------------------------------------------")
    println("Ret val is: |" + retVal + "|")

    //Break in SCALA
    import scala.util.control._

    val loop = new Breaks;
    println("--------------------------------------------------------")
    loop.breakable {
      for (a <- 1 to 50) {
        println("a is: |" + a + "| I want to print till 50")
        if (a == 5) {
          println("----    Breaking here :(    ----")
          loop.break
        }
      }
    }
    println("This is writen after the loop")
    println("--------------------------------------------------------")

    val outer = new Breaks;
    val inner = new Breaks;
    outer.breakable {
      for (a <- 1 to 40) {
        print("a is: |" + a + "| I will go to 40\n\n")
        inner.breakable {
          for (b <- 1 to 50) {
            println("b is: |" + b + "| I will go to 50")
            if (b == 4) {
              println("\nInner loop is broken at " + a + " :( ......\n")
              inner.break
            }

          }
          println("--------------------------------------------------------")
        }
        if (a == 4) {
          println("\nOuter loop is broken at " + a + " :( ......\n")
          outer.break
        }
      }
      println("--------------------------------------------------------")
    }

  }
}