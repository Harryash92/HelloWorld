package com.harry.helloworld.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView
import com.harry.helloworld.R

class MainActivity : AppCompatActivity() {

    var isMorning : Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateDayOfTime()
    }

    private fun updateDayOfTime() {
     val tvTitle = findViewById<MaterialTextView>(R.id.tv_title)
     val btnUpdate = findViewById<MaterialButton>(R.id.btn_update)
    tvTitle.text = getDaysGreeting()
        btnUpdate.setOnClickListener{
            isMorning = !isMorning
            tvTitle.text = getDaysGreeting()
        }
    }

    private fun getDaysGreeting() : String {
        val greeting = if (isMorning) this.getString(R.string.good_morning) else
            this.getString(R.string.good_evening)
    return greeting
    }
}