package eu.tutorials.myquizapp

data class Question(
    val id:Int,
    val questions:String,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    val correctAnswer: Int
)
