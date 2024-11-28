import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


open class SmartDevicee(open val name: String, val category: String) {

open var deviceType = "Smart Tv"
}
class RangeRegulata(
    initialValue:Int,
    private val minValue:Int,
    private val maxValue:Int
):ReadWriteProperty<Any? ,Int>{
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

class SmartTviDevice (devicName: String,deviceCategory:String):
    SmartDevicee(name = devicName, category = deviceCategory){
    override var name = "Smar Tv"

    private var speakerVolume by RangeRegulata(initialValue = 2, minValue = 0, maxValue = 100)
    private var channelNumber by RangeRegulata(initialValue = 1, minValue = 0, maxValue = 200)
}

fun main(){
    var smartDevici = SmartDevicee("Samsung Tv","Flat Screen")
    println("The name is: ${smartDevici.name} and\n The category is ${smartDevici.category}")
}