class Song(
    val title:String,
    val artist:String,
    val yearPublished:Int,
    val playCount:Int
){
    var isPopular :Boolean = true
        get() = playCount >= 1000

    fun songDescription():String{
        return "[$title], performed by [$artist], was released in [$yearPublished]."
    }
}

fun main(){
    val song1 = Song("Owayo","Omukama",2024,1500)
    val song2 = Song("Peaceful Melody","Harmony Band",2018,950)

    println(song1.songDescription())
    println("Is popula: ${song1.isPopular}")
    println("Is popula: ${song2.isPopular}")

}