package com.knoldus

class MultipleQuestion_01 {

    //Finding element from Pascal's tree
    def elePascalTriangle(c : Int, r: Int) : Int={
      if(c==0 || r==c ) {
        1
      }
      else if(c>r) {
        println("Wrong Input.!!!")
        0
      }
      else {

        elePascalTriangle(c - 1, r - 1) + elePascalTriangle(c, r - 1)
      }
    }

  //Using higher order function for finding sum of squares, sum of cubes, sum of Ints
    def sum(f: (Int, Int) => Int,a: Int, b:Int): Int = {
      f(a,b)
    }

    def square(a: Int, b: Int) = a*a + b*b

    def cubes(a: Int, b: Int) = a*a*a + b*b*b

    def ints(a: Int, b: Int) = a + b

  // Calculating the sum of the elements of the list
  def listSum(list : List[Int]) : Int = {

  list.fold (0) ((acc, elem) => elem + acc)
}

  //Calculating GCD of two numbers
  def gcd(first :Int, second : Int): Int={
    if(second!=0) {
      gcd(second, first % second)
    }
    else {
      first
    }
  }

  // Calculating Sum of the elements of two different List
  def sumOfTwoList( list1 : List[Int],  list2 : List[Int]) : List[Int] ={
    if(list1.isEmpty || list2.isEmpty)
    {
      Nil
    }
    else
    {
      (list1.head + list2.head):: sumOfTwoList(list1.tail , list2.tail)
    }
  }

}
