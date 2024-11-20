//fun main() {
//    val trickFunction = ::trick
//    trickFunction()
//
//    val treat: () -> Unit = {
//        println("Have a treat!")
//    }
//    treat()
//
//
//}
//
//fun trick() {
//    println("No treats!")
//}
//
//

fun main(){



    val coins:(Int) -> String = {
        quantiy -> "$quantiy quarters"
    }

    val treatFunction = trickOrTreat(false,coins)
    val trickFunction = trickOrTreat(true,null)

    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick:Boolean, extraTreat: ((Int) -> String?)?): () -> Unit {
    if(isTrick){
        return trick
    }
    else{
        if(extraTreat != null){
            println(extraTreat(5))
        }
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}