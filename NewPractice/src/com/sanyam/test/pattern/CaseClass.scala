package com.sanyam.test.pattern

object CaseClass {
  def main(args: Array[String]): Unit = {
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 28)
    val charlie = new Person("Charlie", 31)
    val sam = new Person("Sam", 32)

    for (person <- List(alice, bob, charlie, sam)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice")
        case Person("Bob", 32)   => println("Hi Bob")
        case Person(name, age)   => println("Age: " + age + " years, Name: " + name)
        //case Person(name, 32)    => println("This is awesome "+name)
        //just to give an idea
        case _ => println("no")
      }
    }
  }
}
case class Person(name: String, agr: Int)