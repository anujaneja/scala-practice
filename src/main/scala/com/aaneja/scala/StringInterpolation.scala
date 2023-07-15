package com.aaneja.scala

object StringInterpolation {
  def main(args: Array[String]) {
    val name = "mark"
    val age = 18.5
    println(name + " is " + age + " years old")
    println(s"$name is $age years old") // s string interpolation
    println(f"$name%s is $age%f years old") // f string interpolation (type safe)
    println("Hello \nworld")
    println(raw"Hello \nworld") // raw string interpolation
  }
}