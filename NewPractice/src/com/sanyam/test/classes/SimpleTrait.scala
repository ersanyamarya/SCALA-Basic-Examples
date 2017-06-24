package com.sanyam.test.classes

//traits can be used if there is a need of some processing
//in different objects in the code
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}
class Point1(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x
}

object SimpleTrait {
  def main(args: Array[String]): Unit = {
    println("----------------------------------------------------")
    val p1 = new Point1(2, 3)
    val p2 = new Point1(2, 4)
    val p3 = new Point1(3, 3)

    println("p1.isEqual(p2)\t\t" + p1.isEqual(p2))
    println("p1.isNotEqual(p3)\t" + p1.isNotEqual(p3))
    println("p2.isNotEqual(p3)\t" + p2.isNotEqual(p3))
    println("----------------------------------------------------")
  }
}