package com.aaneja.scala

// Scala - Options (Some or None)
object OptionsDemo {
  val list = List(1, 2, 3, 4)
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")

  val opt: Option[Int] = Some(5)
  val opt1: Option[Int] = None

  def main(args: Array[String]): Unit = {
    println(list.find(_ > 2).getOrElse(0))
    println(map.get(5).getOrElse("No name found"))

    println(opt.isEmpty)
    println(opt1.isEmpty)
  }
}
