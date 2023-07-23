package com.aaneja.scala

class Strict {
  val e = {
    println("strict");
    9
  }
}

class LazyEval {
  lazy val l = {
    println("lazy")
    9
  }
}

object LazyEvaluationDemo {

  def method1(n: Int): Unit = {
    println("Method 1")
    println(n)
  }

  def method2(n: => Int): Unit = {
    println("Method 2")
    println(n)
  }

  def main(args: Array[String]): Unit = {
    val x = new Strict;
    val y = new LazyEval;

    val add = (a: Int, b: Int) => {
      println("Add")
      a + b;
    }

    method1(add(5,6))

    method2(add(5,6))
  }
}
