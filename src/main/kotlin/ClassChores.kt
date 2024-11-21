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

class Rate(val p:Int,val r:Int,val y:Int){
    //p*r*t/100
    fun multiply():Int{
        return p*r*y
    }

    fun showRate(){
        println("The rate is ${multiply()/100}")
    }
}

fun main(){
//    val anakonda = Snakei("Anakonda")
//    anakonda.anotherMove()

    var r = Rate(5000,3,5)
    r.showRate()
}