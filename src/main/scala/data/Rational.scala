package org.saylor.odersky
package data

object Rational {
  def main(args: Array[String]): Unit =
    val hundred = new Rational(100, 1)
    val ten = new Rational(10, 1)
    val fifteen = new Rational(30, 2)
    val two = new Rational(4, 2)

    println(hundred.div(ten).sub(two))
//    println(hundred.mul(ten).mul(two))
//    println(fifteen.sub(ten))
//    println(two.sub(two))

}

class Rational(x: Int, y: Int) {
  def numerator: Int = x
  def denominator: Int = y

  def add(r: Rational): Rational =
    Rational(numerator * r.denominator + r.numerator * denominator, denominator * r.denominator)

  def sub(r: Rational): Rational =
    Rational(numerator * r.denominator - r.numerator * denominator, denominator * r.denominator)

  def mul(r: Rational): Rational =
    Rational(numerator * r.numerator, denominator * r.denominator)

  def div(r: Rational): Rational =
    Rational(numerator * r.denominator, denominator * r.numerator)

  override def toString: String = s"$numerator/$denominator"
}
