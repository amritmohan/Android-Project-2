package com.example.myapplication3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    lateinit var showname1: TextView
    lateinit var showcity1:TextView
    lateinit var showage1:TextView
    lateinit var showuname1:TextView
    lateinit var showpass1:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        showname1 = findViewById(R.id.showname)
        showcity1=findViewById(R.id.showcity)
        showage1=findViewById(R.id.showage)
        showpass1=findViewById(R.id.showpass)
        showuname1=findViewById(R.id.showuname)

       



            showname1.text = intent.getStringExtra("MyName")
            showcity1.text=intent.getStringExtra("MyCity")
            showage1.text=intent.getStringExtra("MyAge")
            showuname1.text=intent.getStringExtra("MyUname")
            showpass1.text=intent.getStringExtra("MyPass")


    }
}