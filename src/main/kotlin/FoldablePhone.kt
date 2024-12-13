//JUST REVIEWING MY COCDE
fun main(){
    val foldablePhone = FoldablePhone()
    foldablePhone.checkPhoneScreenLight()

    foldablePhone.unfoldPhone()
    foldablePhone.switchOn()

    foldablePhone.foldPhone()
    foldablePhone.switchOn()

    foldablePhone.checkPhoneScreenLight()
}

open class Phone(var isScreenLightOn:Boolean = false){
    open fun switchOn(){
        isScreenLightOn = true
    }

    fun switchOff(){
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight(){
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false,var isFolded:Boolean=false):Phone(isScreenLightOn){
    override fun switchOn(){
        if(isFolded){
            println("The phone is folded.The screen cannot be turned on.")
        }else{
            super.switchOn()
            println("The phone screen is now on.")
        }
    }

    fun foldPhone(){
        isFolded = true
        println("The phone is now folded.")
    }

    fun unfoldPhone(){
        isFolded = false
        println("The phone is now unfolded.")
    }
}
