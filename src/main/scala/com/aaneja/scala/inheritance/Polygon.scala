package com.aaneja.scala.inheritance

class Polygon {
  def area: Double = 0.0
}

object Polygon {
  def main(args: Array[String]): Unit = {
    var poly = new Polygon;
    var rectangle = new Rectangle(55.2, 31.0);
    printArea(poly)
    printArea(rectangle)

    var tri = new Triangle(55.2, 20.0)
    printArea(tri)
  }

  def printArea(p: Polygon): Unit = {
    println(p.area)
  }
}
