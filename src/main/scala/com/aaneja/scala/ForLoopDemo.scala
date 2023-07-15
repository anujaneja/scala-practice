package com.aaneja.scala

object ForLoopDemo {
  def main(args: Array[String]) {
    /*
      syntax
      for(x <- Range) {
        statements();
      }
      <- is called generator
      'to' is a method to generate range
      Another mthod is 'until'
     */

    for (i <- 1 to 5) {
      println("using to i = " + i)
    }

    for (i <- 1.to(5)) {
      println("Using to i = " + i)
    }

    for (i <- 1 until 5) {
      println("using util i = " + i)
    }

    for (i <- 1.until(5)) {
      println("Using until i = " + i)
    }

    //Nested loop...
    for (i <- 1.to(10); j <- 1 to 3) {
      println("i , j : " + i + " , " + j)
    }

    // for Loop on List...

    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (i <- list) {
      println("i using list: " + i)
    }

    //Filtering on lists
    for (i <- list; if i < 6) {
      println("i using list using filter: " + i)
    }

    //For loop as expression

    val result = for {
      i <- list
      if i < 6
    } yield {
      i * i
    }

    println("result =" + result)
  }
}
