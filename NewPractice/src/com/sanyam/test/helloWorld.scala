package com.sanyam.test
object helloWorld {
  def main(args: Array[String]) {
    println("Hello World");
    println("Welcome");
    println("Scala is awesome")

    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    var total = 0;
    for (e <- numbers) {
      total += e;
    }
    println(total);
  }
}