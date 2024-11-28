fun main(){

}

open class SmartDevicee(val name:String, val category:String){
var deviceStatus = "online"
}

fun turnOn(){
    println("Smart device is turned on")
}

fun turnOff(){
    println("Smart device is turned off.")
}

class SmartTviDevice(deviceName:String,deviceCategory:String):
SmartDevicee(name = deviceName, category = deviceCategory){

}