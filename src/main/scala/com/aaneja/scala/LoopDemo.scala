package com.aaneja.scala

object LoopDemo {
  def main(args: Array[String]) {

    var x = 0

    while (x < 10) {
      println("x = " + x)
      x += 1; // x=x+1
      //x++ or ++x or x-- or --x is not allowed in scala
    }

    //do while..this is executed even once if condition is false
    // same as java
    var y = 0
    do {
      println("y = " + y)
      y += 1
    } while (y < 10)
  }

}
