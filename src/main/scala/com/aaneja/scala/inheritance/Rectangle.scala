package com.aaneja.scala.inheritance

class Rectangle(var width: Double, var height: Double) extends Polygon {
  override def area: Double = width * height;
}
