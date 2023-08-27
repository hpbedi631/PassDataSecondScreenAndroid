package com.example.passdatasecondscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //get intent object, and data from intent
        val intent = getIntent()
        val name = intent.getStringExtra("Name")
        val mark = intent.getIntExtra("Mark",0)
        val average = intent.getDoubleExtra("Average",0.00)
        val coop = intent.getBooleanExtra("Coop", false)

        // form one textview for final result
        resultTv.text = "Collected info: \n\nName: " + name + "\nMark: " + mark +"\nAverage: " + average+"\nCoop: " + coop

    }
}