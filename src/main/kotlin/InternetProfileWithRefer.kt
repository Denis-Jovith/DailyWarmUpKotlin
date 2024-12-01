fun main(){
    val personi1 = Personi("Amand",33,"play tennis",null)
    val personi2 = Personi("Atiqah",28,"climb",personi1)

    personi1.showProfile()
    personi2.showProfile()
}

class Personi(
    val name:String,
    val age:Int,
    val hobby:String?,
    val referrer:Personi?
){
    fun showProfile(){
        val hobbyText = hobby ?: "do nothing"
        val referrerText = referrer?.let { "Has a referrer named ${it.name}, who likes to ${it.hobby}." }?: "Doesn't have a referrer"

        println("Name: $name")
        println("Age:$age")
        println("Likes to $hobbyText.$referrerText")
        println()
    }

}