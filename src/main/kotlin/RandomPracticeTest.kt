class Bidhaa{
    var jina = "iphone 14"
        set(value){
            field = value.uppercase()
        }
     var bei = "500000"
        get(){
            return "Tsh. $field /="
        }
}
fun showProductInfo(){

}

fun main(){
    var b1 = Bidhaa()
     b1.jina = "iphone X"
    println(b1.jina)
}