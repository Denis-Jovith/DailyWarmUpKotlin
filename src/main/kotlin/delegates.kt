class Speaker{
    var speakerVolume : Int = 0
        set(value){
            if(value in 0..60)
            field = value
        }
        get(){
            return field
        }
}
fun main(){
    val seaPeano = Speaker()
    seaPeano.speakerVolume = 20
    println("The volume level is : ${seaPeano.speakerVolume}")
    seaPeano.speakerVolume = 80
    println("The volume level is : ${seaPeano.speakerVolume}")
}