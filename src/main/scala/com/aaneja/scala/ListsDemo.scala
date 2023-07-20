package com.aaneja.scala

/*
similar to Array
Array are Mutable, List are immutable

List represent LinkedList and Array are flat...

 */


object ListsDemo {
  val myList: List[Int] = List(1, 2, 3, 4, 5, 6, 4, 5, 3, 2)
  val names: List[String] = List("Max", "Tom", "John")

  def main(args: Array[String]) {
    println(myList)
    println(names)

    // nil and cons.. (::)
    println(0 :: myList) //prepending the value to the list without changing actual list...
    println(myList)

    println(1 :: 5 :: 9 :: Nil)

    // first value and last value of list
    println(myList.head)
    println(names.tail) // rest of the list other than head...
    println(myList.isEmpty)

    println(myList.reverse)

    println(List.fill(5)(2)) // list of 5 2's

    //Iteration of list...

    names.foreach(println)

    var sum: Int = 0

    myList.foreach(sum += _)

    println(sum)

    /*
    Another way of iterating over a list...
     */
    for (name <- names) {
      println(name)
    }
  }

}
