
fun main(){
    var unga = "ngano"

    pika(unga,maandazi)
    pika(unga,chapati)
    pika(unga,keki)
}

fun pika(unga:String,pishi:(String)->Unit){
    pishi(unga)
}

val maandazi:(String) -> Unit = {unga ->
    println("Tunapika keki ya $unga")
}

val chapati:(String) -> Unit ={
    unga -> println("Tunapika chapati za $unga")
}

val keki: (String)->Unit = {
    unga->
    println("Tunapika keki ya $unga")
}