package com.sanyam.test
object iterators {
  def main(args: Array[String]) {
    println("-------------------------------------------------")
//----------------hasNext() & next()--------------------------
    val it = Iterator("a","number","of","words")
    while (it.hasNext){
        println(" => "+it.next())
    }
    println("-------------------------------------------------")
//---------------Max and Min------------------------------------ 
    // To many Iterators .. cs.. after every operation the 
    // pointer of the Iterator is at the end of the Iterator
    val ita = Iterator(20,40,2,50,69,90)
    val itb = Iterator(20,40,2,50,69,90,250,88,11,65)
    val itc = Iterator(20,40,2,50,69,90)
    val itd = Iterator(20,40,2,50,69,90,250,88,11,65)
    val ite = Iterator(20,40,2,50,69,90)
    val itf = Iterator(20,40,2,50,69,90,250,88,11,65)
    println("ita: "+ita+"\titb: "+itb)
    // Iterator is empty after every operation
    println("Maximum Value Element:\t"+ita.min) 
    println("ita: "+ita+"\titb: "+itb)
    // Iterator is empty after every operation
    println("Minimum Value Element:\t"+itb.max)
    println("ita: "+ita+"\titb: "+itb)
    println("-------------------------------------------------")
//----------------Number of Elements----------------------------
    println("The size of itc is\t"+itc.size)
    println("The size of itd is\t"+itd.size)
    println("-------------------------------------------------")
    println("The length of itc is\t"+ite.length)
    println("The length of itd is\t"+itf.length)
    println("-------------------------------------------------")
  }
}