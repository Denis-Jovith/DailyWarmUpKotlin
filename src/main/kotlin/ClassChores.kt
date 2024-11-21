//open class Animali(val name:String){
//    protected fun move(){
//        println("Animal is moving")
//    }
//
//    fun anotherMove (){
//        move()
//    }
//
//
//
//}
//
//class Snakei(name: String):Animali(name){
//
//}
//

class RateCalculator(
    private val p: Int,
    private val r: Int,
    private val y: Int
) {
    //p*r*t/100
    fun multiply(): Int {
        return p * r * y
    }

    fun showRate() {
        println("The rate is ${multiply() / 100}")
    }
}

fun main() {
//    val anakonda = Snakei("Anakonda")
//    anakonda.anotherMove()

    var rateCalculator = RateCalculator(5000, 3, 5)
    rateCalculator.showRate()
}