package com.aaneja.scala

object FunctionDemo_1 {

  object Math {
    def add(x: Int = 45, y: Int = 15): Int = {
      return x + y;
    }

    def square(x: Int) = x * x;

    // + as function. NOTE: this is not operating overloading.
    def +(x: Int, y: Int): Int = x + y
  }

  def print(x: Int, y: Int): Unit = { //void <-> Unit
    println(x + y)
  }

  def main(args: Array[String]) {
    println(Math.add(60, 20))
    println(Math.square(3))
    print(100, 200)
    println(Math.+(10, 20))

    var addAnnoymousFunction = (x: Int, y: Int) => x + y;

    println(addAnnoymousFunction(20, 30))
  }
}
