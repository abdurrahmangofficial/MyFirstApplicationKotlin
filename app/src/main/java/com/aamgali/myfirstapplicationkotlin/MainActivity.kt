package com.aamgali.myfirstapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            //Code
            Log.i ("MainActivity", "Button Was Clicked !")
            Toast.makeText(this, "Button Was Clicked !", Toast.LENGTH_LONG).show()
        }

    }
}
