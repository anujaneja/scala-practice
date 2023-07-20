package com.aaneja.scala

import Array._

object ArrayDemo {

  val myArray: Array[Int] = new Array[Int](4)
  val myArray2 = new Array[Int](5)
  val myArray3 = Array(1, 2, 3, 4, 5, 6, 7, 8)

  def main(args: Array[String]) {
    myArray(0) = 20
    myArray(1) = 50
    myArray(2) = 60
    myArray(3) = 70
    //    println(myArray) // Not convenient...

    for (x <- myArray) {
      println(x)
    }

    for (i <- 0 to (myArray.length - 1)) {
      println(myArray(i))
    }

    /*
    Without assigning it prints 0....default value....
     */
    for (x <- myArray2) {
      println(x)
    }

    println(myArray3.length)

    val result = concat(myArray, myArray3)

    for (x <- result) {
      println(x)
    }
  }
}
