package com.example.radiobuttonkot4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val radio = findViewById<RadioGroup>(R.id.rg)
        val background = findViewById<ConstraintLayout>(R.id.back)
        radio.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radioButton -> {
                    background.setBackgroundColor(Color.parseColor("#FF0000"))
                }
                R.id.radioButton2 -> {
                    background.setBackgroundColor(Color.parseColor("#00FF00"))
                }
                R.id.radioButton3 -> {
                    background.setBackgroundColor(Color.parseColor("#0000FF"))
                }
            }
        }
    }
}