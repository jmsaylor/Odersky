package org.saylor.odersky

import org.saylor.odersky.curry.{Counter, Logic, Sum}
import org.saylor.odersky.fixedpoint.{FixedPoint}

object main {
  def main(args: Array[String]): Unit = {
//    val logic: Logic = new Logic
//    val answer = logic.math((a, b) => a * b * b + a)(2, 3)
//    println(answer)
    val counter: Counter = new Counter
    counter.countBy2()
//      val sum: Sum = new Sum
//      println(sum.sum(x => x * 2)(1, 3))

//    val fixedPoint = new FixedPoint()
//    println(fixedPoint.sqrt(25))

  }
}
