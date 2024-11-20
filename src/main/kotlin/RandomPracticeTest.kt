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

open class Vehicle(
    var plateNumber: String = "",
    var year: Int = 0,
    var fuel: String = "",
    var color : String = ""
){
    fun vehicleInfo(){
        println("$plateNumber $year $fuel $color $plateNumber")
    }
}

class Car: Vehicle(){

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

    val v1 = Vehicle()

    v1.vehicleInfo()
}
