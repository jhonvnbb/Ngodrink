package com.example.cafey

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class Pesan : AppCompatActivity() {

    private lateinit var btnPesan: Button
    private var mCount1 = 0
    private var mCount2 = 0
    private var mCount3 = 0
    private var mCount4 = 0
    private var mCount5 = 0
    private lateinit var mShowCount1: TextView
    private lateinit var mShowCount2: TextView
    private lateinit var mShowCount3: TextView
    private lateinit var mShowCount4: TextView
    private lateinit var mShowCount5: TextView
    private val menu1 = "Onion Rings"
    private val menu2 = "Waffle Ice Berry"
    private val menu3 = "Potato Wedges"
    private val menu4 = "Cinnamon French Toast"
    private val menu5 = "Toasted Coconut Mocha"
    private var isBtnTambah1Clicked = false
    private var isBtnAdd1Clicked = false
    private var isBtnTambah2Clicked = false
    private var isBtnAdd2Clicked = false
    private var isBtnTambah3Clicked = false
    private var isBtnAdd3Clicked = false
    private var isBtnTambah4Clicked = false
    private var isBtnAdd4Clicked = false
    private var isBtnTambah5Clicked = false
    private var isBtnAdd5Clicked = false
    private var shouldStartActivity = true
    private var isValid = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan)

        supportActionBar?.hide()

        val nama: TextView = findViewById(R.id.et_nama)
        val nomor: TextView = findViewById(R.id.et_nomor)
        mShowCount1 = findViewById(R.id.show_count_1)
        val btnTambah1: ImageButton = findViewById(R.id.btn_tambah1)
        val btnKurang1: ImageButton = findViewById(R.id.btn_kurang1)
        val btnAdd1: Button = findViewById(R.id.btn_add1)
        mShowCount2 = findViewById(R.id.show_count_2)
        val btnTambah2: ImageButton = findViewById(R.id.btn_tambah2)
        val btnKurang2: ImageButton = findViewById(R.id.btn_kurang2)
        val btnAdd2: Button = findViewById(R.id.btn_add2)
        mShowCount3 = findViewById(R.id.show_count_3)
        val btnTambah3: ImageButton = findViewById(R.id.btn_tambah3)
        val btnKurang3: ImageButton = findViewById(R.id.btn_kurang3)
        val btnAdd3: Button = findViewById(R.id.btn_add3)
        mShowCount4 = findViewById(R.id.show_count_4)
        val btnTambah4: ImageButton = findViewById(R.id.btn_tambah4)
        val btnKurang4: ImageButton = findViewById(R.id.btn_kurang4)
        val btnAdd4: Button = findViewById(R.id.btn_add4)
        mShowCount5 = findViewById(R.id.show_count_5)
        val btnTambah5: ImageButton = findViewById(R.id.btn_tambah5)
        val btnKurang5: ImageButton = findViewById(R.id.btn_kurang5)
        val btnAdd5: Button = findViewById(R.id.btn_add5)
        btnPesan = findViewById(R.id.btn_pesan)

        btnTambah1.setOnClickListener {
            mCount1++
            mShowCount1.text = mCount1.toString()
            isBtnTambah1Clicked = true
        }
        btnKurang1.setOnClickListener {
            if (mCount1 > 0) {
                mCount1--
                mShowCount1.text = mCount1.toString()
            } else {
                val toast = Toast.makeText(this, "Tidak bisa mengurangi menu pesanan", Toast.LENGTH_LONG)
                toast.show()
            }
        }
        btnAdd1.setOnClickListener {
            // Create a toast and show it.
            val toast = Toast.makeText(this, "$mCount1 Pesanan Berhasil ditambahkan", Toast.LENGTH_LONG)
            toast.show()
            isBtnAdd1Clicked = true
        }

        btnTambah2.setOnClickListener {
            mCount2++
            mShowCount2.text = mCount2.toString()
            isBtnTambah2Clicked = true
        }
        btnKurang2.setOnClickListener {
            if (mCount2 > 0) {
                mCount2--
                mShowCount2.text = mCount2.toString()
            } else {
                val toast = Toast.makeText(this, "Tidak bisa mengurangi menu pesanan", Toast.LENGTH_LONG)
                toast.show()
            }
        }
        btnAdd2.setOnClickListener {
            // Create a toast and show it.
            val toast = Toast.makeText(this, "$mCount2 Pesanan Berhasil ditambahkan", Toast.LENGTH_LONG)
            toast.show()
            isBtnAdd2Clicked = true
        }

        btnTambah3.setOnClickListener {
            mCount3++
            mShowCount3.text = mCount3.toString()
            isBtnTambah3Clicked = true
        }
        btnKurang3.setOnClickListener {
            if (mCount3 > 0) {
                mCount3--
                mShowCount3.text = mCount3.toString()
            } else {
                val toast = Toast.makeText(this, "Tidak bisa mengurangi menu pesanan", Toast.LENGTH_LONG)
                toast.show()
            }
        }
        btnAdd3.setOnClickListener {
            // Create a toast and show it.
            val toast = Toast.makeText(this, "$mCount3 Pesanan Berhasil ditambahkan", Toast.LENGTH_LONG)
            toast.show()
            isBtnAdd3Clicked = true
        }

        btnTambah4.setOnClickListener {
            mCount4++
            mShowCount4.text = mCount4.toString()
            isBtnTambah4Clicked = true
        }
        btnKurang4.setOnClickListener {
            if (mCount4 > 0) {
                mCount4--
                mShowCount4.text = mCount4.toString()
            } else {
                val toast = Toast.makeText(this, "Tidak bisa mengurangi menu pesanan", Toast.LENGTH_LONG)
                toast.show()
            }
        }
        btnAdd4.setOnClickListener {
            // Create a toast and show it.
            val toast = Toast.makeText(this, "$mCount4 Pesanan Berhasil ditambahkan", Toast.LENGTH_LONG)
            toast.show()
            isBtnAdd4Clicked = true
        }

        btnTambah5.setOnClickListener {
            mCount5++
            mShowCount5.text = mCount5.toString()
            isBtnTambah5Clicked = true
        }
        btnKurang5.setOnClickListener {
            if (mCount5 > 0) {
                mCount5--
                mShowCount5.text = mCount5.toString()
            } else {
                val toast = Toast.makeText(this, "Tidak bisa mengurangi menu pesanan", Toast.LENGTH_LONG)
                toast.show()
            }
        }
        btnAdd5.setOnClickListener {
            // Create a toast and show it.
            val toast = Toast.makeText(this, "$mCount5 Pesanan Berhasil ditambahkan", Toast.LENGTH_LONG)
            toast.show()
            isBtnAdd5Clicked = true
        }

        btnPesan.setOnClickListener {
            isValid = true
            checkAndShowToast(isBtnTambah1Clicked, isBtnAdd1Clicked)
            checkAndShowToast(isBtnTambah2Clicked, isBtnAdd2Clicked)
            checkAndShowToast(isBtnTambah3Clicked, isBtnAdd3Clicked)
            checkAndShowToast(isBtnTambah4Clicked, isBtnAdd4Clicked)
            checkAndShowToast(isBtnTambah5Clicked, isBtnAdd5Clicked)

            if (isValid){
                val t_nama = nama.text.toString()
                val t_nomor = nomor.text.toString()
                val totalValue = hitungTotal()
                val intent = Intent(this, Selesai::class.java)
                intent.putExtra("keynama", t_nama)
                intent.putExtra("keynomor", t_nomor)
                intent.putExtra("TOTAL_VALUE", totalValue)
                intent.putExtra("MENU_1", menu1)
                intent.putExtra("COUNT_1", mCount1)
                intent.putExtra("MENU_2", menu2)
                intent.putExtra("COUNT_2", mCount2)
                intent.putExtra("MENU_3", menu3)
                intent.putExtra("COUNT_3", mCount3)
                intent.putExtra("MENU_4", menu4)
                intent.putExtra("COUNT_4", mCount4)
                intent.putExtra("MENU_5", menu5)
                intent.putExtra("COUNT_5", mCount5)
                startActivity(intent)
            }
        }
    }

    private fun checkAndShowToast(isBtnTambahClicked: Boolean, isBtnAddClicked: Boolean) {
        if (isBtnTambahClicked && !isBtnAddClicked) {
            val toast = Toast.makeText(this, "Pilih tombol add terlebih dahulu", Toast.LENGTH_LONG)
            toast.show()
            shouldStartActivity = false
            isValid = false
        }
    }

    private fun hitungTotal(): Int {
        val showCount1Value = mShowCount1.text.toString().toInt()
        return showCount1Value * 35000
        val showCount2Value = mShowCount2.text.toString().toInt()
        return showCount2Value * 30000
        val showCount3Value = mShowCount3.text.toString().toInt()
        return showCount3Value * 25000
        val showCount4Value = mShowCount4.text.toString().toInt()
        return showCount4Value * 20000
        val showCount5Value = mShowCount5.text.toString().toInt()
        return showCount5Value * 18000

    }
}

