package com.example.projectservices

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countries = arrayOf("Saudi Arabia", "India", "Pakistan", "China", "Afghanisthan")

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
            myBuilder.setCancelable(false)
            myBuilder.setIcon(R.drawable.images)

          myBuilder.setPositiveButton("OK",DialogInterface.OnClickListener { dialog, which ->

            Toast.makeText(this, "COOL", Toast.LENGTH_SHORT).show()
          })

            myBuilder.setNegativeButton("EXIT", DialogInterface.OnClickListener { dialog, which ->

                    finish()  // will finish the activity
            })

            var myalertDialog = myBuilder.create()
            myalertDialog.show()

        }

            var myArrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,countries)

       myArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerCountry.adapter = myArrayAdapter

        spinnerCountry.onItemSelectedListener = this


    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

      var data = parent?.getItemAtPosition(position)
        Toast.makeText(this,"you selected : $data which is at $position",Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }
}