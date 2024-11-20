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

class Bidhaa(var jina: String, var bei: Int) {
    // Function to display product information
    fun showProductInfo() {
        println("Jina: $jina, Bei: Tsh. $bei /=")
    }
}

fun main() {
    // Creating an instance of the Bidhaa class
    var b1 = Bidhaa(bei = 500, jina = "Sabuni")

    // Changing the 'jina' property
    b1.jina = "iphone X"

    // Displaying the product information
    b1.showProductInfo() // This will call the function within the class

    // Printing just the name
    println(b1.jina)
}
