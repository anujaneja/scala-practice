package com.aaneja.scala


object StringDemo {
  val num1 = 75;
  val num2 = 100.25
  val str1 = "Hello World"
  val str2 = " Max"

  def main(args: Array[String]) {
    /*
    Similar to java.lang.String , immutable....
     */
    println(str1.length)
    println(str1.concat(str2))
    println("(%d -- %f -- %s)".format(num1, num2, str1))
  }
}
