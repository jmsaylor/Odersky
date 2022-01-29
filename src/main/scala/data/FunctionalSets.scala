package org.saylor.odersky
package data

object FunctionalSets extends App {
  val funcSet = new FunctionalSets
//  println(funcSet.contains(x => x < 0, -1))

//  def oneSet = funcSet.singletonSet(1);
//  println(funcSet.contains(oneSet, 1))

}

class FunctionalSets extends FunSetsInterface {
  type FuncSet = Int => Boolean

  def contains(f: FuncSet, elem: Int): Boolean = f(elem)

  override def singletonSet(elem: Int): FunSet = _ == elem
//  override def singletonSet(elem: Int): FunSet = (x: Int) => x == elem

  override def union(s: FunSet, t: FunSet): FunSet = (x: Int) => s(x) || t(x)

  override def intersect(s: FunSet, t: Int => Boolean): FunSet = ???

  override def diff(s: FunSet, t: FunSet): FunSet = ???

  override def filter(s: FunSet, p: Int => Boolean): FunSet = ???

  override def forall(s: FunSet, p: Int => Boolean): Boolean = ???

  override def exists(s: FunSet, p: Int => Boolean): Boolean = ???

  override def map(s: FunSet, f: Int => Int): FunSet = ???

  override def toString(s: FunSet): String = ???
}
