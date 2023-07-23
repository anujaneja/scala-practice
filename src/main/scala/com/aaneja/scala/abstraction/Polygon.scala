package com.aaneja.scala.abstraction

trait Shape {
  def color: String;
}

abstract class Polygon {
  def area: Double;
}

object Polygon {
  def main(args: Array[String]): Unit = {
    var rectangle = new Rectangle(55.2, 31.0);
    printArea(rectangle)
    println(rectangle.color)

    var tri = new Triangle(55.2, 20.0)
    printArea(tri)
    println(tri.color)
  }

  def printArea(p: Polygon): Unit = {
    println(p.area)
  }
}
