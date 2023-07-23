package com.aaneja.scala

//Scala - Reduce, fold & scan
//reduceLeft, reduceRight, foldLeft, foldRight, scanLeft, scanRight
object ReduceFoldScanDemo {
  val list = List(1, 2, 3, 4, 5, 7, 10, 13, 14)
  val list2 = List("A", "B", "C")

  def main(args: Array[String]) {
    println(list.reduceLeft(_ + _))
    println(list2.reduceLeft(_ + _))
    println(list.reduceLeft((x, y) => {
      println(x + " , " + y);
      x + y;
    }))

    println(list.reduceLeft(_ - _)) // reduce left.....
    println(list.reduceRight(_ - _)) // reduce right.... different results...
    println(list.reduceLeft((x, y) => {
      println(x + " , " + y);
      x - y;
    }))

    println(list.foldLeft(100)(_ + _))
    println(list2.foldLeft("z")(_ + _))

    println(list.scanLeft(100)(_ + _))
    println(list2.scanLeft("z")(_ + _))
  }
}
