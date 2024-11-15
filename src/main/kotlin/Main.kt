open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "0"

    constructor(name: String, category: String, statusCode: String) : this(name, category) {
        deviceStatus = when (statusCode) {
            "0" -> "Offline"
            "1" -> "online"
            else -> "unknown"
        }

    }

    var speakerVolume = 2
        get() = field
        set(value) {
            field = value
        }

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }

}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increasedSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber")
    }
}

class SmartLightDevice(deviceName:String,deviceCategory: String):
        SmartDevice(name = deviceName, category = deviceName){
            var brightnessLevel = 0
                set(value) {
                    if(value in 0..100){
                        field = value
                    }
                }
    fun increaseBrightness(){
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
        }

fun main() {
    val smartTvDevice = SmartDevice("Samsung Elite G", "Flat Screen", "1")
    println("Device name is: ${smartTvDevice.name}")
    println("Device status is: ${smartTvDevice.deviceStatus}")

    smartTvDevice.turnOn()
    smartTvDevice.turnOff()

    val smartTvDeviceOg = SmartTvDevice("FAFE", "FEFA")
    smartTvDeviceOg.increasedSpeakerVolume()
    smartTvDeviceOg.nextChannel()
}