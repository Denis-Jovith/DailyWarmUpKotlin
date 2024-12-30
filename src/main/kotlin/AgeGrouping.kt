//fun main(){
//    val age = 6
//    if(age > 0 && age <6){
//        println("You are an infant")
//    }
//    else if(age>=6 && age < 13){
//        println("You are Child")
//    }
//    else if(age>=13 && age < 19){
//        println("You are Adolscent")
//    }
//    else {
//        println("Lolote Likupate")
//    }
//}

fun main(){
    val ageGroup= 45

    when(ageGroup){
       in 0..5 -> println("Infant")
       in 6..13 -> println("Child")
        in 14 ..13 -> println("Adolescent")
        else-> println("Lolote liwapate")
    }
}