class SmartDevice(val name:String,val category: String) {
    var deviceStatus = "0"

    constructor(name:String,category: String,statusCode:String) : this(name,category) {
         deviceStatus = when (statusCode) {
            "0" -> "Offline"
            "1" -> "online"
            else -> "unknown"
        }

    }
    var speakerVolume = 2
        get() = field
        set(value){
            field = value
        }

    fun turnOn(){
        println("Smart device is turned on.")
    }
    fun turnOff() {
        println("Smart device is turned off.")
    }

}

fun main(){
    val smartTvDevice = SmartDevice("Samsung Elite G","Flat Screen","1")
    println("Device name is: ${smartTvDevice.name}")
    println("Device status is: ${smartTvDevice.deviceStatus}")

    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}