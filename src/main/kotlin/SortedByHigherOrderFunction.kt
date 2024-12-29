class Cookieasaei(
    val name:String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price:Double
)

val cookiesasaei = listOf<Cookieasaei>(
    Cookieasaei(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookieasaei(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookieasaei(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookieasaei(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookieasaei(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookieasaei(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookieasaei(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)
fun main(){
   val alphabeticalMenu = cookiesasaei.sortedBy {
       it.name
   }
    println("Alphabetical menu:")
    alphabeticalMenu.forEach(){
        println(it.name)
    }
}