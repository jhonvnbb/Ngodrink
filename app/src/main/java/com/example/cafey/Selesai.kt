package com.example.cafey

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.text.DateFormat
import java.util.*

class Selesai : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selesai)

        supportActionBar?.hide()

        val btnLanjut : Button = findViewById(R.id.btn_lanjut)
        btnLanjut.setOnClickListener {
            val intent = Intent(this, Akhir::class.java)
            startActivity(intent)
        }

        val calendar: Calendar = Calendar.getInstance()
        val currentDate: String = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.time)
        val currentTime: String = DateFormat.getTimeInstance().format(calendar.time)

        val textViewDate: TextView = findViewById(R.id.text_view_date)
        val textViewTime: TextView = findViewById(R.id.text_view_time)

        textViewDate.text = currentDate
        textViewTime.text = currentTime

        val nama: TextView = findViewById(R.id.tv_nama)
        val nomor: TextView = findViewById(R.id.tv_nomor)

        val t_nama = intent.getStringExtra("keynama")
        val t_nomor = intent.getStringExtra("keynomor")

        nama.text = "Nama Pemesan : $t_nama"
        nomor.text = "Nomor Meja : $t_nomor"

        val menu1: String = intent.getStringExtra("MENU_1") ?: ""
        val mCount1: Int = intent.getIntExtra("COUNT_1", 0)
        val menu2: String = intent.getStringExtra("MENU_2") ?: ""
        val mCount2: Int = intent.getIntExtra("COUNT_2", 0)
        val menu3: String = intent.getStringExtra("MENU_3") ?: ""
        val mCount3: Int = intent.getIntExtra("COUNT_3", 0)
        val menu4: String = intent.getStringExtra("MENU_4") ?: ""
        val mCount4: Int = intent.getIntExtra("COUNT_4", 0)
        val menu5: String = intent.getStringExtra("MENU_5") ?: ""
        val mCount5: Int = intent.getIntExtra("COUNT_5", 0)

        val totalTextView: TextView = findViewById(R.id.total)
        var totalOutput = ""

        if (mCount1 > 0) {
            totalOutput += "$menu1                              $mCount1         Rp35000       Rp${mCount1 * 35000}\n"
        }

        if (mCount2 > 0) {
            totalOutput += "$menu2                       $mCount2         Rp30000       Rp${mCount2 * 30000}\n"
        }

        if (mCount3 > 0) {
            totalOutput += "$menu3                        $mCount3         Rp25000       Rp${mCount3 * 25000}\n"
        }

        if (mCount4 > 0) {
            totalOutput += "$menu4         $mCount4         Rp20000       Rp${mCount4 * 20000}\n"
        }

        if (mCount5 > 0) {
            totalOutput += "$menu5        $mCount5         Rp18000       Rp${mCount5 * 18000}\n"
        }

        totalTextView.text = totalOutput.trim()

        val totalSemuaMenu = (mCount1 * 35000) + (mCount2 * 30000) + (mCount3 * 25000) + (mCount4 * 20000) + (mCount5 * 18000)
        val totalSemuaMenuTextView: TextView = findViewById(R.id.totalakhir)
        totalSemuaMenuTextView.text = "Total Harga : Rp$totalSemuaMenu"

    }
}

