object Third {
  def main(args: Array[String]) = {
    val normalHours = 40
    val OTHours = 30
    
    val takeHomeSalary = TakeHomeSalary(normalHours, OTHours)
    println(f"Take-home salary is: Rs.$takeHomeSalary%.2f")

  }

  def TakeHomeSalary(normalHours: Double, OTHours: Double): Double = {
    
    val normalHourlyRate = 250.0
    val OTHourlyRate = 85.0
    val taxRate = 0.12


    val grossSalary = (normalHours * normalHourlyRate) + (OTHours * OTHourlyRate)

   
    val taxAmount = grossSalary * taxRate


    val takeHomeSalary = grossSalary - taxAmount

    return takeHomeSalary
  }

  
}
