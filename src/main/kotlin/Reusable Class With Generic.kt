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

interface ProgressPrintable{
    val progressText :String
    fun  printProgressBar()
}

class Quiz : ProgressPrintable {

    override val progressText: String
        get() = "${answered} of ${jumla} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered){ print("▓") }
        repeat(Quiz.jumla - Quiz.answered){ print("▓") }
        println()
        println(progressText)
    }

    fun printQuizz(){
       question4.let{
           println(it.questionText)
           println(it.answer)
           println(it.difficulty)
       }
        println()
        question5.let{
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question6.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }


    val question4 = Question<String>("Quoth the raven ___","nevermore",Difficulty.MEDIUM)
    val question5 = Question<Boolean>("The sky is green. True or False",false,Difficulty.EASY)
    val question6 = Question<Int>("How many days are there between full moons?",28,Difficulty.HARD)


    companion object StudentProgressOg{
        var jumla : Int = 10
        var answered: Int = 3
    }



}

//val Quiz.StudentProgressOg.progressText:String
//    get() = "${answered} of ${jumla} answered "


//fun Quiz.StudentProgressOg.printProgressBar() {
//    repeat(Quiz.answered){ print("▓") }
//    repeat(Quiz.jumla - Quiz.answered){ print("▓") }
//    println()
////    println(Quiz.progressText)
//}



fun main(){
    val question1 = Question<String>("Quoth the raven ___","nevermore",Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or False",false,Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?",28,Difficulty.HARD)



        println("${Quiz.answered} of ${Quiz.jumla} answered.")

    println("${StudentProgress.answer} of ${StudentProgress.total} answered")

    println(question1.toString())

//    Quiz.printProgressBar()
    Quiz().printProgressBar()

    println()

//    val quiz = Quiz()
//
//    quiz.printQuizz()

    Quiz().apply {
        printQuizz()
    }


}