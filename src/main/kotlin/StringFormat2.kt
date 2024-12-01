fun formatHundreds(value:Double):String{
    val parts = String.format("%.2f",value).split(".")
    val wholePart = parts[0].reversed().chunked(3).joinToString(",").reversed()
    val fractionalPart = parts[1]
    return "$wholePart.$fractionalPart"
}

fun main(){
print(formatHundreds(5.6789037667876984E13))
}