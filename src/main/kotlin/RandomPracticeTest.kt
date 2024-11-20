//class Bidhaa(val ){
//    var jina = "iphone 14"
//        set(value){
//            field = value.uppercase()
//        }
//     var bei = "500000"
//        get(){
//            return "Tsh. $field /="
//        }
//}

//class Bidhaa(var jina: String, var bei: Int) {
//    // Function to display product information
//    fun showProductInfo() {
//        println("Jina: $jina, Bei: Tsh. $bei /=")
//    }
//}

//class Student(
//    val jina:String,
//    val age:Int
//){
//    var isAlumnus = "NO"
//    constructor(
//        jina:String, age:Int,
//        hasGraduated: Boolean
//    ):this(jina,age){
//            if(hasGraduated){
//                isAlumnus = "YES"
//            }
//        }
//}
//
//open class Vehicle(
//    var plateNumber: String = "",
//    var year: Int = 0,
//    var fuel: String = "",
//    var color : String = ""
//){
//    fun vehicleInfo(){
//        println("$plateNumber $year $fuel $color $plateNumber")
//    }
//}
//
//class Car: Vehicle(){
//
//}

//class Mteja{
//    var jina = "Kelvin"
//    var address = Address()
//}
//
//class Address{
//    var houseNo = "IK/101"
//    var street = "Ikuti"
//    var city = "Mbeya"
//}

open class Animal {
    open var species = ""
    open fun move(){
        println("Animal is moving")
    }
}

class Person: Animal(){
    override var species = "Man"
    override fun move(){
        println("Person is moving using two legs")
    }

}
class Snake: Animal() {
    override fun move(){
        println("Snake is moving by crawing")
    }
}

class Dog: Animal(){
override fun move(){
    super.move()
    println("Dog is moving using four rims")
}
}
class Bird:Animal(){
override fun move(){
    println("Bird is moving using wings")
}
}

fun main() {
//    // Creating an instance of the Bidhaa class
//    var b1 = Bidhaa(bei = 500, jina = "Sabuni")
//
//    // Changing the 'jina' property
//    b1.jina = "iphone X"
//
//    // Displaying the product information
//    b1.showProductInfo() // This will call the function within the class
//
//    // Printing just the name
//    println(b1.jina)

//    var s1 = Student("Denis Jovitus Buberwa",21)
//    println(s1.isAlumnus)
//    var s2 = Student("David",27,true)
//    println(s2.isAlumnus)

//    val v1 = Vehicle()
//
//    v1.vehicleInfo()

//    var mteja = Mteja()
//    mteja.address.city = "Dar es Sallam"
//    println("City ${mteja.address.city}")

    val p =Person()
    val s = Snake()
    val bird = Bird()
    val d= Dog()

    p.move()
    d.move()
    s.move()
    bird.move()

    println("${p.species}")

}
