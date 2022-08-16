package com.application.vietlotterythirteen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TermsPage : AppCompatActivity() {

    private var tac : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_page)

        tac = findViewById(R.id.tac)
        tac?.setOnClickListener{
            onBackPressed()
        }
    }
}