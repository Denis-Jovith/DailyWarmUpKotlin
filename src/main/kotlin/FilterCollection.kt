class Cookieas(
    val name:String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price:Double
)

val cookiesas = listOf<Cookieas>(
    Cookieas(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookieas(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookieas(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookieas(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookieas(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookieas(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookieas(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)
fun main(){
    val softBakedMenu = cookiesas.filter{
        it.softBaked
    }

    println("Soft Cookies")
    softBakedMenu.forEach(){
        println("${it.name} - $${it.price}")
    }
}