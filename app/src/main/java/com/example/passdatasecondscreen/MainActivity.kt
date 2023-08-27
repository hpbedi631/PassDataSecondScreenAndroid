package com.example.passdatasecondscreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var checkboxresult = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        checkBox.setOnCheckedChangeListener { compoundButton, b ->
            checkboxresult = checkBox.isChecked
        }
    }
    fun onSaveButtonClick(view: View) {
        // collect data from edit texts
        val name = nameEt.text.toString()
        val mark = markEt.text.toString().toInt()
        val average = averageEt.text.toString().toDouble()
        // start intent for new Activity and pass data

        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("Name", name)
        intent.putExtra("Mark", mark)
        intent.putExtra("Average", average)
        intent.putExtra("Coop", checkboxresult)

        startActivity(intent)
    }
}