data class Question<T>(
    val questionText:String,
    val answer : T,
    val difficulty:Difficulty
)

enum class Difficulty{
    EASY,MEDIUM,HARD
}

object StudentProgress{
    var total: Int = 10
    var answer : Int =3

}

class Quiz {
    val question4 = Question<String>("Quoth the raven ___","nevermore",Difficulty.MEDIUM)
    val question5 = Question<Boolean>("The sky is green. True or False",false,Difficulty.EASY)
    val question6 = Question<Int>("How many days are there between full moons?",28,Difficulty.HARD)


    companion object StudentProgressOg{
        var jumla : Int = 10
        var answered: Int = 3
    }

}

fun main(){
    val question1 = Question<String>("Quoth the raven ___","nevermore",Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or False",false,Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?",28,Difficulty.HARD)



    fun main() {
        println("${Quiz.answered} of ${Quiz.jumla} answered.")
    }
    println("${StudentProgress.answer} of ${StudentProgress.total} answered")

    println(question1.toString())
}