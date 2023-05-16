package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class Navigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        // Find the level cards in the layout
        val easyCard = findViewById<CardView>(R.id.easy_level_card)
        val intermediateCard = findViewById<CardView>(R.id.intermediate_level_card)
        val hardCard = findViewById<CardView>(R.id.hard_level_card)

        // Set click listeners for each level card
        easyCard.setOnClickListener {
            // Launch a new activity for the easy level questions
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            startActivity(intent)
        }

        intermediateCard.setOnClickListener {
            // Launch a new activity for the intermediate level questions
            val intent = Intent(this, MediumQuestionsActivity::class.java)
            startActivity(intent)
        }

        hardCard.setOnClickListener {
            // Launch a new activity for the hard level questions
            val intent = Intent(this, HardQuestionsActivity::class.java)
            startActivity(intent)
        }
    }
}