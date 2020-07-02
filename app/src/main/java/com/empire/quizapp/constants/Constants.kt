package com.empire.quizapp.constants

import com.empire.quizapp.R
import com.empire.quizapp.model.Question

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(1, "First Question?", R.drawable.ic_bg, "A", "B", "C", "D", 1)
        val que2 = Question(1, "First Question?", R.drawable.ic_bg, "A", "B", "C", "D", 1)
        val que3 = Question(1, "First Question?", R.drawable.ic_bg, "A", "B", "C", "D", 1)
        val que4 = Question(1, "First Question?", R.drawable.ic_bg, "A", "B", "C", "D", 1)
        val que5 = Question(1, "First Question?", R.drawable.ic_bg, "A", "B", "C", "D", 1)
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        return questionsList
    }
}