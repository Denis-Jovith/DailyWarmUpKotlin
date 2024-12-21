
val salamuYaAsubuhi = {
    println("Habari za asubuhi")
}

val salamuYaMchana = {
    println("Habari za mchana")
}

val salamuYaJioni = {
    println("Habari za jioni")
}

fun salimia(majira:String): () -> Unit {
    if (majira == "asubuhi"){
        return salamuYaAsubuhi
    }else{
        return salamuYaMchana
    }
}

fun main(){

    val salamuKutokanaNaMajira = salimia("mchana")
    salamuKutokanaNaMajira()

}