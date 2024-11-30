import java.util.Currency

////fun main(){
////    println("Hello,world")
////    val name = "HomeNyumbani"
////    val age = 62
////
////    var namee = "Somebody"
////    println(namee)
//////    name = "nyumba"
////    namee = "home"
////    println(namee)
////////    println(name)
//////    println(name)
//////    println(age)
//////    print(name)
////    println("The age is $age")
////
////}
//
//fun main(){
////    var apples = 10
////////    apples--
//////    apples = apples-1
//////    println("$apples")
//////    println(apples)
////    println(apples)
////    println(--apples)
////    apples--
////    println(apples)
//
////    val height = 1.474898778859f
////    val weight = 68.3444999000007478484849494f
////    println(height)
////    println(weight)
////
////    val name :String = "Computer"
////    val place = "Ikuti"
////
////    val age:Int
////    var namee :String
////    namee= "mimi"
////
////    println(namee)
//
////    var message = "Hello"
////    var name = "Buddy"
////    var message2= "how are you doing"
////
////    var totalMessage = "$message $name $message2"
//
////    println(totalMessage)
////    println(message+" " +name +" "+ message2)
////    println(message+"\t " +name +"\n\t\t\t "+ message2)
////    println("The teacher said \"Welcome to my class\"")
////    println("2"+","+"000")
//
//
//
//
//}


fun main(){
//    sumCalculator(4,6)
    println(sumCalculator(currency = "Tsh.", num2 = 5, num1 = 5))
    println(sumCalculator(4,9,"Tsh. "))
}

fun  sumCalculator( num1:Int, num2:Int,currency: String):String{
    var sum = num1 + num2
    var message = "The money we have is $sum it is in $currency"
//    return "The sum is $currency$sum"
    return message

//    println("This is a non parameterized fun \n The sum is : $sum")


}