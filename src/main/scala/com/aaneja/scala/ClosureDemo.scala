package com.aaneja.scala

/*
 A closure is a function which uses one or more variables
 declared outside this function.
 pure and impure closure
*/
object ClosureDemo {

  /*
    if variable number is var... then closure is impure
    - if variable number is val(constant) then closure is pure...
   */
  private var number = 10; // free variable...if number changes then output will change...
  // Closure take the most recent state of the variable.
  val add = (x: Int) => {
    number = x + number
    number;
  };

  def main(args: Array[String]) {
    number = 100
    println(add(20))
    println(number)
  }
}
