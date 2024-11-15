class SmartDevice(val name:String,val category: String) {

    val deviceStatus = "online"
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
    val smartTvDevice = SmartDevice("Samsung Elite G","Flat Screen")
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}