object Four{
    def main(args: Array[String]): Unit = {
    
    val (bestPrice, highestProfit) = findBestPrice()
    println(s"Highest profit is: $$highestProfit at ticket price: $$bestPrice")
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

    def findBestPrice(): (Int, Int) = {
    val prices = 1 to 30  
    var maxProfit = Int.MinValue
    var bestPrice = 0

    for (price <- prices) {
      val currentProfit = profit(price)
      if (currentProfit > maxProfit) {
        maxProfit = currentProfit
        bestPrice = price
      }
    }

    (bestPrice, maxProfit)
  }
}
