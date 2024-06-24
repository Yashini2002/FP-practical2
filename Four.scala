object Four{
    def main(args: Array[String]): Unit = {
    
    println(s"Highest profit is: ${profit(24)}")
  }
 
    def attendees(price:Int):Int=
    {
       120+(15-price)/5*20
    }
 
     def revenue(price:Int):Int=
     {
       attendees(price)*price
     }
    
    def cost(price:Int):Int=
    {
      500+attendees(price)*3
    }
 
    def profit(price:Int):Int=
    {
       revenue(price)-cost(price)
    }
}