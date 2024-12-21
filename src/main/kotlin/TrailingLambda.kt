fun main(){
    var unga = "ngano"

    pikaa(unga,{ println("Maandazi ya $it") })
    pikaa(unga){"chapati za $it"}
    pikaa(unga){
        println("Keki za $it")
    }
}

fun pikaa(unga:String,pishi:(String)->Unit){
    pishi(unga);
}