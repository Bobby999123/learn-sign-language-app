package com.example.freemovers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_textgen.*

class Alphabet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)

        aback.setOnClickListener {
            startActivity(Intent(this,Map::class.java))
//            onBackPressed()
        }
    }
}