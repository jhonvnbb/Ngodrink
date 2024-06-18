package com.example.cafey

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {

    private lateinit var btnMenu: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.hide()

        btnMenu = findViewById(R.id.btn_menu)
        btnMenu.setOnClickListener {
            val intent = Intent(this@Home, Pesan::class.java)

            // Start activity
            startActivity(intent)
        }
    }
}

