open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"
    open val deviceType = "unknown"

    constructor(name: String, category: String, statusCode: String) : this(name, category) {
        deviceStatus = when (statusCode) {
            "0" -> "Offline"
            "1" -> "online"
            else -> "unknown"
        }

    }

    var deviceStatusi="online"
        protected set(value) {
            field = value
        }

    var speakerVolume = 2
        get() = field
        set(value) {
            field = value
        }

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }

}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart TV"



    private var channelNumber = 1
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

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on.Speaker volume is set to $speakerVolume and channel is " + "set to $channelNumber"
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceName) {

    override val deviceType = "Smart Light"
    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned Off")
    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {
    var deviceTurnOnCOunt = 0
        private set(value) {
            field = value
        }

    fun turnOnTv() {
        deviceTurnOnCOunt++
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCOunt--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increasedSpeakerVolume()
    }

    fun changeTvChannelToNext() {
         smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCOunt++
        smartLightDevice.turnOn()
    }

    fun turnOff() {
        deviceTurnOnCOunt--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOff()
    }
}

fun main() {
    val smartTvDevice: SmartDevice = SmartTvDevice("Samsung Elite G", "Flat Screen")
    println("Device name is: ${smartTvDevice.name}")
    println("Device status is: ${smartTvDevice.deviceStatus}")

    smartTvDevice.turnOn()
    smartTvDevice.turnOff()

    val smartTvDeviceOg = SmartTvDevice("FAFE", "FEFA")
    smartTvDeviceOg.increasedSpeakerVolume()
    smartTvDeviceOg.nextChannel()

    var smartLightBulb = SmartLightDevice("Bulb", "Colored Bulb")
    smartLightBulb.brightnessLevel
    smartLightBulb.increaseBrightness()

    val smartHome = SmartHome(SmartTvDevice("Samsung Elite G", "Flat Screen"), SmartLightDevice("Bulb", "Colored Bulb"))

    smartHome.turnOffAllDevices()
    smartTvDevice.deviceType
    val result =smartHome.deviceTurnOnCOunt
    println(result)
    smartHome.changeTvChannelToNext()

}