package com.sanyam.test.functions;
/* It dosen't add and any functionality
* it is just a facility
*/
object currying{
  def main(args: Array[String]) {
    println("-------------------------------------------------")
    println("strcat is defined as a curry function and output is |"
        +strcat("Sanyam")(" Arya")+"|")   
    println("-------------------------------------------------") 
  }
  def strcat(s1: String)(s2: String) = s1 + s2
}