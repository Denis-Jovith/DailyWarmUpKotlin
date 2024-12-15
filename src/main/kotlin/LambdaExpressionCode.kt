import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class RangeRegurator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue:Int
):ReadWriteProperty<Any?,Int>{
    private var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    //Reviewing the code

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if(value in minValue..maxValue){
            fieldData = value
        }

        else {
            println("Warning:Value $value is out of range for ${property.name}.Allowed range $minValue..$maxValue")
        }
    }
}

class SmartiTvDevice(val name:String){
}
