import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class RangRegulator(
    initialValue : Int,
    private val minValue : Int,
    private val maxValue : Int, ):ReadWriteProperty<Any?,Int>{

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue){
            fieldData = value
        }
    }

}

class SmartTvDevicei(deviceName:String,deviceCategory:String){

    private var speakerVolume by RangeRegulatori(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulatori(initialValue = 1, minValue = 0, maxValue = 200)
}

class SmartLightDevicee(deviceName:String,deviceCategory: String){
    private var brightnessLevel by RangeRegulatori(initialValue = 0, minValue = 0, maxValue = 100)
    fun increaseBrightnesso() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

}
fun main(){
    var smartTv1 =  SmartTvDevicei("Smart Tv","Smart Tv")
    var smartLightDevicee1 = SmartLightDevicee("Colored Bulb","Philips")
    smartLightDevicee1.increaseBrightnesso()
    smartLightDevicee1.increaseBrightnesso()
    smartLightDevicee1.increaseBrightnesso()
}