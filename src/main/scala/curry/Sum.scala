package org.saylor.odersky
package curry

class Sum {
  def sum(f: Int => Int)(a: Int, b: Int): Int = 
    if a > b then 0
    else f(a) + sum(f)(a + 1, b)
}
