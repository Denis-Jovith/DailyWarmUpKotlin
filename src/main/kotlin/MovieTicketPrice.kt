fun main(){
    println(ticketPrice(5,true))
    println(ticketPrice(28,true))
    println(ticketPrice(87,true))


}

fun ticketPrice(age:Int,isMonday:Boolean) {
    val priceChild = 15
    val priceGrownUpStandard = 30
    val priceGrownUpMonday = 25
    val priceSenior = 20
     return when(isMonday == false){
         true -> if (age>=1 && age<=12){
        println("The movie ticket price for a person aged $age is $priceChild ")
     }
         else if (age>=13 && age <= 60){
             println("The movie ticket price for a person aged  $age is $priceGrownUpStandard")
         }
         else if (age>= 61 && age <=100){
             println("The movie ticket price for a person aged $age is $priceSenior")
         }
         else {
             if (age>=1 && age<=12){
                 println("The movie ticket price for a person aged $age is $priceChild ")
             }
             else if (age>=13 && age <= 60){
                 println("The movie ticket price for a person aged  $age is $priceGrownUpMonday")
             }
             else if (age>= 61 && age <=100){
                 println("The movie ticket price for a person aged $age is $priceSenior")
             }
             else {
                 println("Check the age it should not be a negative number or above 100")
             }
         }

         else -> {
             println("Check the age it should not be a negative number or above 100")

         }
     }
}