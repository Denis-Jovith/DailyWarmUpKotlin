class SmartTvDevicee(var name:String,val category :String){
    var deviceStatus = "online"

    constructor(name:String,category: String,statusCode:Int) :
    this (name,category)
    {
        deviceStatus = when(statusCode){
            0->"offline"
            1->"online"
            else -> {
                "unknown"
            }
        }
    }

}

fun main(){
    val smartTv = SmartDevice("Sony","Flat Screen")
    println("The name is : ${smartTv.name}  and \nThe categry is ${smartTv.category}")
}
