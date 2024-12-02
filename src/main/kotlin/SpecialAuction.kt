fun main(){
    val winningBid = Bid(5000,"Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid)}")
    println("Item B is sold at ${auctionPrice(null)}")
}

class Bid(val amount:Int, val bidder:String)

fun auctionPrice(bid:Bid?,minimumPrice:Int=3000): Int {
    return bid?.amount ?: minimumPrice
}