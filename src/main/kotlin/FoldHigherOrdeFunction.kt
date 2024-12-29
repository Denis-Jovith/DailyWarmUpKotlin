class Cookieasae(
    val name:String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price:Double
)

val cookiesasae = listOf<Cookieasae>(
    Cookieasae(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookieasae(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookieasae(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookieasae(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookieasae(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookieasae(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookieasae(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)
fun main(){
    val totalPrice = cookiesasae.fold(0.0){
            total,cookiesasae -> total+cookiesasae.price
    }

    println("Total price: $${totalPrice}")
}