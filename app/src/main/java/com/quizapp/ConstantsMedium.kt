package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object ConstantsMedium {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<QuestionMedium> {
        val questionsList = ArrayList<QuestionMedium>()

        // 1
        val que1 = QuestionMedium(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_bosnia_and_herzegovina,
            "Bosnia and herzegovina", "Serbia",
            "Grenada", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = QuestionMedium(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_cyprus,
            "Lebanon", "Cyprus",
            "Malta",  2
        )

        questionsList.add(que2)

        // 3
        val que3 = QuestionMedium(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Samoa", "Tonga",
            "Fiji",  3
        )

        questionsList.add(que3)

        // 4
        val que4 = QuestionMedium(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_estonia,
            "Iceland", "Estonia",
            "Latvia",  2
        )

        questionsList.add(que4)

        // 5
        val que5 = QuestionMedium(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_slovakia,
            "Slovakia", "Russia",
            "Slovenia",  1
        )

        questionsList.add(que5)

        // 6
        val que6 = QuestionMedium(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_latvia,
            "Estonia", "Austria",
            "Latvia", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = QuestionMedium(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_montenegro,
            "Chad", "Albania",
            "Montenegro",  3
        )

        questionsList.add(que7)

        // 8
        val que8 = QuestionMedium(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_lithuania,
            "Lithuania", "None of these",
            "Hungary",  1
        )

        questionsList.add(que8)

        // 9
        val que9 = QuestionMedium(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_macedonia,
            "Slovenia", "Macedonia",
            "Bulgaria", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = QuestionMedium(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_slovenia,
            "Slovakia", "Serbia",
            "Slovenia",  3
        )

        questionsList.add(que10)

        return questionsList
    }
}