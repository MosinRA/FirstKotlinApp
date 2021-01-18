package com.mosin.firstkotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn)
        val helloTextView = findViewById<TextView>(R.id.hello_text)
        var score: Int = 1

        button.setOnClickListener { viewButton ->
            if (score <= 3) {
                helloTextView.text = (getString(R.string.pressed_qual) + " " + score)
                (viewButton as Button).text = getString(R.string.pressed_first)
                score += 1
            } else {
                helloTextView.text = getString(R.string.its_all)
                button.visibility = View.INVISIBLE
            }
        }
    }
}