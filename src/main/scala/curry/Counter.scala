package org.saylor.odersky
package curry

class Counter {

  def countBy2(): Unit =
    count(x => x + 2)(0, 100)

  def count(counter: Int => Int)(start: Int, finish: Int): Int =
    print(start)
    print(" ")
    if start < finish then count(counter)(counter(start), finish)
    else 0
}
