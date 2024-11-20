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
    val cupcake:(Int) -> String = {
        quantity -> "Have a cupcakes"
    }
    val treatFunction = trickOrTreat(false,coins)
    val trickFunction = trickOrTreat(true,cupcake)

    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick:Boolean,extraTreat:(Int)-> String): () -> Unit {
    if(isTrick){
        return trick
    }
    else{
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}