fun main(){
    val trafficLightColor = "Green"

    when(trafficLightColor){
        "Red" -> println("Stop")
        "Yellow" -> println("Get Ready")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}