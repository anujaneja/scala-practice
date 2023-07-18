package com.aaneja.scala

object HigherOrderFunctionDemo {

  /*
    Which function able to take function as argument and
    able to return function
   */

  def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)

  def math1(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z)

  def main(args: Array[String]) {
    val result1 = math(50, 20, (x, y) => x + y)
    println("result1 : " + result1)

    val result2 = math(50, 20, (x, y) => x * y)
    println("result2 : " + result2)

    val result3 = math(50, 20, (x, y) => x min y)
    println("result3 : " + result3)

    val result4 = math1(50, 20, 10, (x, y) => x min y)
    println("result4 : " + result4)

    /*
    Wildcard way of writing method....
     */
    val result5 = math1(50, 20, 10, _ max _)
    println("result5 : " + result5)


  }
}
