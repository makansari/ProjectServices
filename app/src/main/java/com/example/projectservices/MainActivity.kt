package com.example.projectservices

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

        buttonAlert.setOnClickListener {

            var myBuilder = AlertDialog.Builder(this)
            myBuilder.setTitle("ALERT !!!")
            myBuilder.setMessage("Do you want to continue with Actvity ? ")

          myBuilder.setPositiveButton("OK",DialogInterface.OnClickListener { dialog, which ->

            Toast.makeText(this, "COOL", Toast.LENGTH_SHORT).show()
          })

            myBuilder.setNegativeButton("EXIT", DialogInterface.OnClickListener { dialog, which ->

                    finish()  // will finish the activity
            })

            var myalertDialog = myBuilder.create()
            myalertDialog.show()

        }
    }
}