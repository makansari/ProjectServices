package com.example.projectservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStart.setOnClickListener {
            var myIntent = Intent(this,MyService::class.java)
            startService(myIntent)
        }

        buttonStop.setOnClickListener {
            var myIntent = Intent(this,MyService::class.java)
            stopService(myIntent)
        }
    }
}