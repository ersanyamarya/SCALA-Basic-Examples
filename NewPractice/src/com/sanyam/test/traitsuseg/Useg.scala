package com.sanyam.test.traitsuseg

class Human(val name: String) {
  def listen() = println("I am " + name + " and I am Listening..!")
}
object Useg {
  def main(args: Array[String]): Unit = {
    val sameer = new Human("Sameer")
    sameer.listen()
  }

}