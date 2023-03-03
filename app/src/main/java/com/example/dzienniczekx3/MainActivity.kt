package com.example.dzienniczekx3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pass = findViewById<EditText>(R.id.passTxt).text.toString()
        var login = findViewById<EditText>(R.id.loginTxt).text.toString()

        var loginButon = findViewById<Button>(R.id.loginButton)
        loginButon.setOnClickListener {
            switchActivities()
        }
    }

    fun switchActivities(){
        val newIntent = Intent(this, infoUzytkownik::class.java)
        startActivity(newIntent)
    }

}