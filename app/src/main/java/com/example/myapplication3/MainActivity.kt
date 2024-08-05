package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var name1:EditText
    lateinit var age1:EditText
    lateinit var city1:EditText
    lateinit var uname:EditText
    lateinit var pass:EditText
    lateinit var submit:Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        name1=findViewById(R.id.name)
        age1=findViewById(R.id.age)
        city1=findViewById(R.id.city)
        uname=findViewById(R.id.username)
        pass=findViewById(R.id.password)
        submit=findViewById(R.id.mybtn)



        submit.setOnClickListener {
            val name:String=name1.text.toString().trim();
            val age: String = age1.text.toString().trim()
            val city: String = city1.text.toString().trim()
            val username: String = uname.text.toString().trim()
            val password: String = pass.text.toString().trim()





            val myintent= Intent(this@MainActivity,MainActivity2::class.java)

            myintent.putExtra("MyName",name)
            myintent.putExtra("MyAge",age)
            myintent.putExtra("MyCity",city)
            myintent.putExtra("MyUname",username)
            myintent.putExtra("MyPass",password)

            startActivity(myintent);
            finish()
        }
    }
}