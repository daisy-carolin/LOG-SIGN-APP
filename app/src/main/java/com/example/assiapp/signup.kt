package com.example.assiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var spGender=findViewById<Spinner>(R.id.spGender)
        var btnBack=findViewById<Button>(R.id.btnback)


        btnBack.setOnClickListener{
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
        var Gender= arrayOf("Male","Female","Others")
        var adapter=ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,Gender)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=adapter
    }

}