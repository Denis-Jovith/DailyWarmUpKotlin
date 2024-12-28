fun main(){
    val rockPlanets = arrayOf<String>("Mercury","Venus","Earth","Mars")
    val gasPlanets = arrayOf("Jupiter","Saturn","Uranus","Neptune")
    val solarSystem = rockPlanets + gasPlanets
    solarSystem[3] = "Little Earth"
    val newSolarSystem = arrayOf("Mercury","Venus","Earth","Mars","Jupiter","Saturn","Neptune","Pluto")

    println(solarSystem[0])
    println(solarSystem[3])
    println(solarSystem[7])
    println(newSolarSystem[7])
}