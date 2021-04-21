package com.example.freemovers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_page.*
import kotlinx.android.synthetic.main.activity_login.*

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        val userId = intent.getStringExtra("user_id")
        val emailId = intent.getStringExtra("email_id")
//        val name = intent.getStringExtra("name")


        button.setOnClickListener {
            startActivity(Intent(this,Map::class.java))
//            onBackPressed()
        }
        button1.setOnClickListener {
            startActivity(Intent(this,Recognize::class.java))
//            onBackPressed()
        }

    }
}