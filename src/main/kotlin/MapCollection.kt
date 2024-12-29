import java.time.chrono.MinguoEra

fun main(){
    val solarMap = mutableMapOf(
        "Mercury" to 1,
        "Venus" to 2,
        "Earth" to 3,
        "Mars" to 4
    )

    solarMap["Pluto"] = 5
    solarMap.remove("Mercury")
    solarMap.replace("Earth",1)

    println(solarMap.size)
    println(solarMap["Earth"])
    println(solarMap.containsKey("Venus"))
    println(solarMap.containsValue(5))

    println()
    println()

    for((planet,position) in solarMap){
        println("$planet -> $position")
    }
}