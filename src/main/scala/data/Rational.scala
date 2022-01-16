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
  def numer = x
  def denom = y

  def add(r: Rational): Rational =
    Rational(numer * r.denom + r.numer * denom, denom * r.denom)

  def sub(r: Rational): Rational =
    Rational(numer * r.denom - r.numer * denom, denom * r.denom)

  def mul(r: Rational): Rational =
    Rational(numer * r.numer, denom * r.denom)

  def div(r: Rational): Rational =
    Rational(numer * r.denom, denom * r.numer)

  override def toString: String = s"$numer/$denom"
}
