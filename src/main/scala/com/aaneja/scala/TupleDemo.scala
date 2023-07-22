package com.aaneja.scala

// Scala - Tuples
// Immutable Tuples...
// Tuple can contain upto 22
object TupleDemo {
  val mytuple = (1, 2, "hello", true)

  val mytuple2 = new Tuple3(1, 2, "hello")
  val mytuple3 = new Tuple3(1, 2,(3,4))

  def main(args: Array[String]) {
    println(mytuple)
    println(mytuple3)

    println(mytuple._1)
    println(mytuple._2)
    println(mytuple._3)
    println(mytuple._4)

    //Another way to iterate over each elements of tuple...
    mytuple.productIterator.foreach { i =>
      println(i)
    }

    //Tuple
    println(1->"Tom")

    //Tuple of tuple
    println(1->"Tom"->true)

    println(mytuple3)

    println(mytuple3._3._2)
  }
}
