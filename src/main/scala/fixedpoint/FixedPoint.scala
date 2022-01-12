package org.saylor.odersky
package fixedpoint

class FixedPoint {

  val tolerance = 0.001

  def abs(x: Double): Double =
    if x > 0 then x else -x

  def isCloseEnough(x: Double, y: Double) =
    abs((x - y) / x) < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double): Double =
    def iterate(guess: Double): Double =
      val next = f(guess)
      println(next)
      if isCloseEnough(guess, next) then next
      else iterate(next)
    iterate(firstGuess)
    
  def averageDamp(f: Double => Double)(x: Double): Double =
    (x + f(x)) / 2
  
  def sqrt(x: Double) = fixedPoint(averageDamp(y => x / y))(1.0)
}