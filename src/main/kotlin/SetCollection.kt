fun main(){
    val solaSystem = mutableSetOf<String>("Mercury","Venus","Earth","Mars","Jupiter","Earth")
    println(solaSystem.size)
    println(solaSystem.contains("Earth"))
    println(solaSystem.contains("Pluto"))

    for (planet in solaSystem){
        println(planet)
    }

    println(solaSystem.size)

    println()
    println()
    println()

    solaSystem.add("Jupiter")
    solaSystem.add("Dunia")
    solaSystem.remove("venus")

    for (planet in solaSystem){
        println(planet)
    }
    println(solaSystem.size)
}