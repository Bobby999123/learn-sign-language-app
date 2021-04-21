package com.example.freemovers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_first_page.*
import kotlinx.android.synthetic.main.activity_recognize.*
import kotlin.collections.Map

class Recognize : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recognize)

        camera.setOnClickListener {
            startActivity(Intent(this, Photo::class.java))
//            onBackPressed()
        }
        gal.setOnClickListener {
            startActivity(Intent(this, Photo::class.java))
//            onBackPressed()
        }
    }

}