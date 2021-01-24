package com.example.projectservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var handler = Handler()
       /* var th = Thread(){
            kotlin.run {
                for(i in 0..5){
                    *//*handler.post {
                        textViewSplash.setText( "" + i)
                        //test
                    }*//*

                        runOnUiThread {
                            textViewSplash.setText( "" + i)
                        }
                    Thread.sleep(1000)

                }
            }
                var i = Intent(this,MainActivity::class.java)
                startActivity(i)


        }
        th.start()*/

            var arr = arrayOf("SELECT ONE", "test1","test2","test3")

        var myadappter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,arr)




        myadappter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
       spinnersplash.adapter = myadappter


    }


}