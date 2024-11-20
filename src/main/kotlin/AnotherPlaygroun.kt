fun main() {
    val trickFunction = ::trick
    trickFunction()

    val treat: () -> Unit = {
        println("Have a treat!")
    }
    treat()


}

fun trick() {
    println("No treats!")
}

