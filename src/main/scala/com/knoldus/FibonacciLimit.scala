package com.knoldus

class FibonacciLimit {
  def FibonacciSeries(n: Int): List[Int] = {

    def compute(a: Int, b: Int, c: List[Int], n: Int, i: Int): List[Int] = {
      if (i > n - 2)
        {
          c
        }

      else {
        compute(b, a + b, c ::: List(a + b), n, i + 1)

      }
    }

    if(n == 0) {
      List(0)
    }
    else
      {
        compute(0,1,List(0,1),n,1)
      }
  }


}
