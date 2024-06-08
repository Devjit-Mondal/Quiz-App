package eu.tutorials.myquizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS:String  = "total_questions"
    const val CORRECT_ANSWERS :String = "correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
            val que1 = Question(
            1,"What is the chemical symbol for Gold?" , " Gd",
                        "Au",
                        "Go",
                        "Ag", 2,

            )
        questionsList.add(que1)

        val que2 = Question(
            2, "Capital of India", "Mumbai" , "Kolkata", "New Delhi",
            "Surat", 3
        )
        questionsList.add(que2)
        return questionsList

    }
}