package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object ConstantsHard {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<QuestionHard> {
        val questionsList = ArrayList<QuestionHard>()

        // 1
        val que1 = QuestionHard(
            1, "What country does this flag belong to?",
            R.drawable.flag_of_bhutan,
            "Ljubljana", "Bhutan", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = QuestionHard(
            2, "What country does this flag belong to?",
            R.drawable.flag_of_comoros,
            "Comoros", "Rwanda", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = QuestionHard(
            3, "What country does this flag belong to?",
            R.drawable.flag_of_vanuatu,
            "Vanuatu", "Vanuata", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = QuestionHard(
            4, "What country does this flag belong to?",
            R.drawable.flag_of_kiribati,
            "Kiribati", "Mauritius", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = QuestionHard(
            5, "What country does this flag belong to?",
            R.drawable.flag_of_tuvalu,
            "the Cook Islands", "Tuvalu", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = QuestionHard(
            6, "What country does this flag belong to?",
            R.drawable.flag_of_sao_tome_and_principe,
            "Liberia", "Sao Tome and Principe", 2
        )

        questionsList.add(que6)

        // 7
        val que7 = QuestionHard(
            7, "What country does this flag belong to?",
            R.drawable.flag_of_solomon_islands,
            "Solomon Islands", "New Guinea",1
        )

        questionsList.add(que7)

        // 8
        val que8 = QuestionHard(
            8, "What country does this flag belong to?",
            R.drawable.flag_of_nauru,
            "Nauru", "Butania", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = QuestionHard(
            9, "What country does this flag belong to?",
            R.drawable.flag_of_tonga,
            "olivia", "Tonga", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = QuestionHard(
            10, "What country does this flag belong to?",
            R.drawable.flag_of_palau,
            "Micronesia", "Palau", 2
        )

        questionsList.add(que10)

        return questionsList
    }
}