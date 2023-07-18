package com.aaneja.scala

import java.util.Date

object PartialAppliedFunctionDemo {

  def log(date: Date, message: String) {
    println(date + "  " + message)
  }

  def main(args: Array[String]) {
    val sum = (x: Int, y: Int, z: Int) => x + y + z;
    //Partial Applied function...
    val f = sum(20, 10, _: Int)
    println(f(30))

    val date = new Date;
    val newLog = log(date, _: String)
    newLog("Partial Message 1")
    newLog("Partial Message 2")
    newLog("Partial Message 3")
    newLog("Partial Message 4")
    newLog("Partial Message 5")
  }
}
