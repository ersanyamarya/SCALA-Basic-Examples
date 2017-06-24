package com.sanyam.test.classes

class Point(val xc: Int, val yc: Int) { // Simple Class
  var x: Int = xc
  var y: Int = yc
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("Point x location:\t" + x);
    println("Point y location:\t" + y);
  }
}

//overriding
class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point (xc,yc)
{
 var z: Int = zc
 def move (dx: Int, dy:Int, dz: Int){
   x=x+dx
   y=y+dy
   z=z+dz
 println("Point x location:\t" + x);
    println("Point y location:\t" + y);
    println("Point z location:\t" + z);
 }
}
 
//scala object

object SimpleClass {
  def main(args: Array[String]): Unit = {
    println("----------------------------------------------------")
    val pt = new Point(10, 20);
    pt.move(10, 10);
    println("----------------------------------------------------")
    val locate = new Location(10,20,30)
    locate.move(5, 6, 7)
    println("----------------------------------------------------")
  }
}