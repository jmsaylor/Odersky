package org.saylor.odersky

import org.saylor.odersky.curry.{Counter, Logic}

object main {
  def main(args: Array[String]): Unit = {
//    val logic: Logic = new Logic
//    val answer = logic.math((a, b) => a * b * b + a)(2, 3)
//    println(answer)

      val counter: Counter = new Counter
      counter.count(x => x + x)(1, 1000)
  }
}
