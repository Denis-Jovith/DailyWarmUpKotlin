import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class RangeRegulatori(
    initialValue:Int,
    private val minValue:Int,
    private val maxValue:Int
):ReadWriteProperty<Any?,Int >{
    private var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if(value in minValue..maxValue){
            fieldData = value
        }
        else{
            println("Warning: Value $value is out of range for ${property.name}. Allowed range $minValue..$maxValue")
        }
    }
}

class SmartTevDevice(val name:String){
    var speakerVolume by RangeRegulatori(10,0,100)
    var channelNumber by RangeRegulatori(1,0,200)

    fun showChannel(){
        println("Currently on channel $channelNumber")
    }
    fun increaseVolume (){
        speakerVolume += 5
        println("Volume increased to $speakerVolume")
    }

    fun decreaseVolume(){
        speakerVolume -= 5
        println("Volume decreased to $speakerVolume")
    }
}

fun main(){
    val tv = SmartTevDevice(name="Living Room TV")

    println("Smart TV: ${tv.speakerVolume}")
    println("Initial Volume:${tv.speakerVolume}")
    println("Initial Channel: ${tv.channelNumber}")

    tv.channelNumber = 50
    tv.showChannel()

    tv.channelNumber = 300

    tv.increaseVolume()
    tv.decreaseVolume()

    tv.speakerVolume = -10

}