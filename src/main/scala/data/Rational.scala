package org.saylor.odersky
package data

object Rational {
  def main(args: Array[String]): Unit =
    val hundred = new Rational(100, 1)
    val ten = new Rational(10, 1)
    val fifteen = new Rational(30, 2)
    val two = new Rational(2, 1)

    println(ten.sub2(two).div(ten))
//    println(hundred.div(ten).sub(two))
//    println(hundred.mul(ten).mul(two))
//    println(fifteen.sub(ten))
//    println(two.sub(two))

}

class Rational(x: Int, y: Int) {
  def numerator: Int = x
  def denominator: Int = y

  def neg: Rational = Rational(-numerator, denominator)

  def add(r: Rational): Rational =
    Rational(numerator * r.denominator + r.numerator * denominator, denominator * r.denominator)

  def sub(r: Rational): Rational =
    Rational(numerator * r.denominator - r.numerator * denominator, denominator * r.denominator)

  def sub2(r: Rational): Rational = this.add(r.neg)

  def mul(r: Rational): Rational =
    Rational(numerator * r.numerator, denominator * r.denominator)

  def div(r: Rational): Rational =
    Rational(numerator * r.denominator, denominator * r.numerator)

  override def toString: String = s"$numerator/$denominator"
}
