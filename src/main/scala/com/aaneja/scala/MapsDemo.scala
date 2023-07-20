package com.aaneja.scala

object MapsDemo {

  val mymap: Map[Int, String] = Map(801 -> "max", 804 -> "Tom", 804 -> "Tom1")
  val mymap2: Map[Int, String] = Map(805 -> "lua");

  def main(args: Array[String]) {
    println(mymap)
    println(mymap(801))
    println(mymap.keys)
    println(mymap.values)
    println(mymap.isEmpty)

    mymap.keys.foreach { key =>
      println("key=" + key)
      println("value= " + mymap(key))
    }

    println(mymap.contains(8010101))
    println(mymap ++ mymap2)
    println(mymap.size)
  }
}
