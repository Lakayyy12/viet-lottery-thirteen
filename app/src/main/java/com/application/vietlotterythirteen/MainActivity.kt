package com.application.vietlotterythirteen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var btnM : TextView? = null
    private var exit = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnM = findViewById(R.id.btnM)
        btnM?.setOnClickListener{
            val intent = Intent(this, GuidesPage::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        if (exit == 0){
            exit = 1
            Toast.makeText(this, "NHẤP VÀO LẠI ĐỂ Thoát", Toast.LENGTH_SHORT).show()
        }else{
            super.finishAffinity()
        }
    }
}