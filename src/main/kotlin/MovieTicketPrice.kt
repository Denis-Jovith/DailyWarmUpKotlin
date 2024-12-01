fun main(){
    println(ticketPrice(5,true))
    println(ticketPrice(28,true))
    println(ticketPrice(87,true))


}

fun ticketPrice(age:Int,isMonday:Boolean) : String {
    val priceChild = 15
    val priceGrownUpStandard = 30
    val priceGrownUpMonday = 25
    val priceSenior = 20
     return if(age<1 || age >100){
         "Check the age,it should not be a negatice number or above 100"
     }
     else if (age in 1..12){
         "The movie ticket price for a person aged $age is $priceChild"
     }
     else if (age in 13..60) {
         if (isMonday){
             "The movie ticket for a person aged $age is $priceGrownUpMonday"
         } else {
             "The movie ticket for a person aged $age is $priceGrownUpStandard"
         }
     }
     else{
         "The movie ticket price for a person aged $age is $priceSenior"
     }

}