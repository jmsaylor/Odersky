package org.saylor.odersky
package data

import scala.annotation.tailrec

object Rational {
  def main(args: Array[String]): Unit =
    val hundred = new Rational(100, 1)
    val ten = new Rational(10, 1)
    val fifteen = new Rational(30, 2)
    val two = new Rational(4, 2)

    println(ten.sub2(two).div(ten))
//    println(hundred.div(ten).sub(two))
//    println(hundred.mul(ten).mul(two))
//    println(fifteen.sub(ten))
//    println(two.sub(two))

}

class Rational(x: Int, y: Int) {
  @tailrec private def gcd(x: Int, y: Int): Int =
    if y == 0 then x else gcd(y, x % y)
  private val g: Int = gcd(x, y)

  def numerator: Int = x / g
  def denominator: Int = y / g

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

  private def less(r: Rational): Boolean = numerator * r.denominator < denominator * r.numerator

  def min(that: Rational): Rational =
    if this.less(that) then this else that

  def max(that: Rational): Rational =
    if this.less(that) then that else this

  override def toString: String = s"$numerator/$denominator"
}
