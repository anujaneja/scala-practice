package com.aaneja.scala

//Scala - map and filter
object MapAndFilterDemo {
  val list = List(1, 2, 3, 5, 7, 10, 13, 14)
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")

  def main(args: Array[String]) {
    println(list.map(_ * 2))
    println(list.map(x => x * 2))
    println(list.map(x => "hi" * x))
    println(map.mapValues(x => "hi" + x))
    println("hello".map(_.toUpper))
    //flatten
    println(List(List(1, 2, 3), List(4, 5, 6)).flatten)
    println(list.flatMap(x => List(x, x + 1)))

    //filter...
    println(list.filter(x => x % 2 == 0))
  }
}
