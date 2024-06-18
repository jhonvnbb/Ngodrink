package com.example.cafey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Akhir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akhir)

        supportActionBar?.hide()

        val btnMenu : Button = findViewById(R.id.btn_menu)
        btnMenu.setOnClickListener {
            val intent = Intent(this, Pesan::class.java)
            startActivity(intent)
        }
    }
}

