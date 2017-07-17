package com.knoldus


class SumOfDigitOfProduct {
  def fact(num :Int) : Int={
    var factorial=1
    if(num == 0 || num == 1) {
      1
    }
    else{
      for(a <- 2 to num){
        factorial = factorial * a
      }
      factorial
    }
  }

  def sum(num : Int) : Int={
    var rem,temp=num
    var digitSum=0
    while(temp != 0)
    {
      rem = temp %10
      digitSum += rem
      temp =temp/ 10
    }
    digitSum
  }

}
