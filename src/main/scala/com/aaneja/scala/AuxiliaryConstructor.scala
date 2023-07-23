package com.aaneja.scala


class User2(var name: String, var age: Int) {
  // all constructor should have different signature
  // and it should call previously defined constructor
  def this() {
    this("Tom", 32)
  }

  def this(name: String) {
    this(name, 32)
  }
};

object AuxiliaryConstructor {
  def main(args: Array[String]): Unit = {
    var user1 = new User2("Max", 28)
    var user2 = new User2();
    var user3 = new User2("Max");
  }
}
