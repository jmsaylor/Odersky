package org.saylor.odersky
package curry

class Logic {

  def math(f: (Int, Int) => Int)(a: Int, b: Int): Int = f(a, b)

  def mathV1(f: (Int, Int) => Int): (Int, Int) => Int =
    def mathF(a: Int, b: Int): Int =
      f(a, b)
    mathF
}
