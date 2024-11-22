//import kotlin.properties.ReadWriteProperty
//import kotlin.reflect.KProperty
//
//class VolumeRegulator (
//    initialValue:Int,
//    minValue:Int,
//    maxValue:Int
//
//):ReadWriteProperty<Any?, String> {
//    var fieldData = initialValue
//    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
//        if(value in 0..60)
//            fieldData = value
//    }
//     override fun getValue(thisRef: Any?,value: Int){
//        return fieldData
//    }
//}
//
//class Speaker{
//    var speakerVolume : Int by VolumeRegulator(7,0,0)
//
//    var centerVolume : Int = 0
//        set(value){
//            if(value in 0..60)
//                field = value
//        }
//        get(){
//            return field
//        }
//
//    var frontVolume : Int = 0
//        set(value){
//            if(value in 0..60)
//                field = value
//        }
//        get(){
//            return field
//        }
//
//    var sorroundVolume : Int
//
//}
//fun main(){
//    val seaPeano = Speaker()
//
//}