package com.example.travelpackinglist

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val additems = findViewById<Button>(R.id.additem) // add items button
        val inputbox = findViewById<EditText>(R.id.theinputBox) //input box
        val savebutton = findViewById<Button>(R.id.savbttn)//save button
        val viewlistBttn = findViewById<Button>(R.id.viewlst)//view items button on next screen

        //ARRAYS
        val items = arrayOf("")





        additems.setOnClickListener {
            if (additems.isEnabled == true)
                inputbox.visibility = View.VISIBLE


        }


        //Saving items in aray
        savebutton.setOnClickListener {
            if (savebutton.isEnabled == true)
                items

        }


        viewlistBttn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("itemslists", items)
            startActivity(intent)
        }
    }
}