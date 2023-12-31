package com.aaneja.scala.abstraction

class Triangle(var width: Double, var height: Double) extends Polygon with Shape {
  override def area: Double = width * height / 2;

  def color: String = "Green"
}
