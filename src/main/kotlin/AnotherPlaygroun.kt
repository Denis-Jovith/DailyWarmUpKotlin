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
    val treatFunction = trickOrTreat(false)
    val trickFunction = trickOrTreat(true)

    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick:Boolean): () -> Unit {
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