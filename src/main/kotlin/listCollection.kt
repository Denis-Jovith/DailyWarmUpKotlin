fun main(){
    val solarSystem = mutableListOf<String>("Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune")
    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))

    solarSystem.add("Pluto")
    solarSystem.add(3,"Theia")
    solarSystem[3] = "Future"

    for (planet in solarSystem){
        println(planet)
    }

    solarSystem.removeAt(1)
    println()
    println()

    for (planet in solarSystem){

        println(planet)
    }

    println("Earth" in solarSystem)
    println(solarSystem.contains("mimi"))


}