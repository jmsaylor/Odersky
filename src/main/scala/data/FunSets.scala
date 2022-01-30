package org.saylor.odersky
package data

import scala.annotation.tailrec

object FunSets extends App {
  val funcSet = new FunSets

  println(funcSet.toString(funcSet.intersect(_ => true, _ % 133 == 0)))

}

class FunSets extends FunSetsInterface {
  def contains(f: FunSet, elem: Int): Boolean = f(elem)

  override def singletonSet(elem: Int): FunSet = _ == elem
//  override def singletonSet(elem: Int): FunSet = (x: Int) => x == elem

  override def union(s: FunSet, t: FunSet): FunSet = (x: Int) => s(x) || t(x)

  override def intersect(s: FunSet, t: Int => Boolean): FunSet = (x: Int) => s(x) && t(x)

  override def diff(s: FunSet, t: FunSet): FunSet = (x: Int) => s(x) && !t(x)

  override def filter(s: FunSet, p: Int => Boolean): FunSet = intersect(s, p)

  val bound = 1000

  override def forall(s: FunSet, p: Int => Boolean): Boolean =
    @tailrec def iter(a: Int): Boolean =
      if a > bound then
        true
      else if diff(s, p)(a) then
        false
      else
        iter(a + 1)
    iter(-bound)

  override def exists(s: FunSet, p: Int => Boolean): Boolean =
    @tailrec def iter(a: Int): Boolean =
      if a > bound then
        false
      else if intersect(s, p)(a) then
        true
      else
        iter(a + 1)
    iter(-bound)

  override def map(s: FunSet, f: Int => Int): FunSet = ???

  override def toString(s: FunSet): String =
    val xs = for i <- (-bound to bound) if contains(s, i) yield i
    xs.mkString("{", ",", "}")
}
