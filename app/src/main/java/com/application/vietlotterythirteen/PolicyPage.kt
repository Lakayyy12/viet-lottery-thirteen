package com.application.vietlotterythirteen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PolicyPage : AppCompatActivity() {

    private var pop : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_policy_page)

        pop = findViewById(R.id.pop)
        pop?.setOnClickListener{
            onBackPressed()
        }
    }
}