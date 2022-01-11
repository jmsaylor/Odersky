package org.saylor.odersky
package curry

class Counter {
  
  def count(counter: Int => Int)(start: Int, finish: Int): Int =
    print(start)
    print(" ")
    if start < finish then count(counter)(counter(start), finish) 
    else 0
}
