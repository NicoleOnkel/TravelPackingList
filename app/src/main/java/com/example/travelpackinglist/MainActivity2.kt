package com.example.travelpackinglist

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.File.separator

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val items = intent.getStringArrayListExtra("itemslists")
        val total = intent.getIntExtra("totalClothing", 0)

        val saveditems = findViewById<TextView>(R.id.displayitems)
        val totalclothing = findViewById<TextView>(R.id.totalit)


        //Display
        saveditems.text= items?.joinToString(separator = "\n")
        totalclothing.text = "total: $total"


    }
}