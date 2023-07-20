package com.aaneja.scala

/*
Sets two type : Immutable & Mutable
by default Immutable
 */
object SetsDemo {

  val myset1: Set[Int] = Set(1, 2, 2, 3, 4, 4, 5, 6, 4)
  val myset2: Set[Int] = Set(4, 5, 8, 10, 12, 15, 18, 20, 22)
  val names: Set[String] = Set("Tom", "John", "Harry")

  def main(args: Array[String]) {
    println(myset1 + 10)
    println(myset1.head)
    println(myset1.tail)
    println(myset1.isEmpty)

    // Adding two sets
    println(myset1 ++ myset2)
    println(myset1.++(myset2))

    //Intersection
    println(myset1.&(myset2))
    println(myset1.intersect(myset2))

    println(myset1.max)
    println((myset2))
  }
}
