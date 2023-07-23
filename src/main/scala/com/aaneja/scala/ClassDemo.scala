package com.aaneja.scala

// val used for name/age will result in immutable values...
// No updates of values are allowed...
// type val/var is mandatory for member variable...
// access variable for member variable could be private as well...

// var getter & setter...
// val getter & settter
// default --  ---
class User(private var name: String, var age: Int) {
  def printName {
    println(name)
  }

  def setName(userName: String) {
    name = userName
  }
}

object ClassDemo {
  def main(args: Array[String]): Unit = {
    var user = new User("Max", 28);
    user.printName
    println(user.age)

    user.setName("Tom");
    user.age = 22
    user.printName
    println(user.age)


  }
}
