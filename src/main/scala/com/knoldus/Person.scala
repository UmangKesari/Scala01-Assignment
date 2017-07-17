package com.knoldus


class Person(val name: String, val age: Int) extends Ordered[Person]{

    override def compare(that: Person): Int = {
      if(this.name.equals(that.name))
      {
        this.age - that.age
      }
      else
      {
          this.name.length - that.name.length
      }
    }

}
