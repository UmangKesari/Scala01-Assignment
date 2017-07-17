package com.knoldus

case class Bank(val id : Int ,val name : String,val balance : Double ) {

    require(id>0 && !name.isEmpty)

    def credit(amount :Double ) : Bank= {
      println("credited Succesfully")
      new Bank(this.id, this.name, balance + amount)
    }

    def debit(amount: Double) : Bank = {
      if (amount <= balance) {
        println("Debited Succesfully")
        new Bank(this.id, this.name, balance - amount)
      }
      throw new Exception("Insufficient amount")
    }
    //def this(n: String , refid : Int) = this(name,id, mainBalance)nl
    def checkBalance() : Double = {
      this.balance
    }
    override def toString : String = s"Name : $name   AccountId : $id    Amount : $balance"
}

