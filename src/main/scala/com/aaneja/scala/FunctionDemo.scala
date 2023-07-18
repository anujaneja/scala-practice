package com.aaneja.scala

object FunctionDemo {

  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y;
    }

    def square(x: Int) = x * x
  }


  def subtract(x: Int, y: Int): Int = {
    x - y; // Can avoid return statement last line is return value....
  }

  def multiply(x: Int, y: Int): Int = x * y; // you can void curly braces...

  def divide(x: Int, y: Int) = x / y; // You can avoid return data type as well

  def main(args: Array[String]) {
    println(Math.square(3))
    println(Math square 3) // for one argument method...e.g. for loop  'to' and 'until' synatical sugar...
    println(Math.add(45, 15))
    println(subtract(45, 15))
    println(multiply(45, 15))
    println(divide(45, 15))
  }

}
