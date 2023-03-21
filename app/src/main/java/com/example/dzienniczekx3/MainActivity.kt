package com.example.dzienniczekx3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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
            switchActivities(login)
        }
    }

    fun switchActivities(x: String){
        val newIntent = Intent(this, infoUzytkownik::class.java)
        newIntent.putExtra("Username", x)
        startActivity(newIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mnu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(intent.getStringExtra("Username")!=null){
            val id = item.itemId
            if(id == R.id.firstItem){
                val nowy = Intent(this,infoUzytkownik::class.java)
                startActivity(nowy)
                finish()
            }
            else if (id == R.id.secondItem){
                val nowy = Intent(this,activity_oceny::class.java)
                startActivity(nowy)
                finish()
            }
        }

        return super.onOptionsItemSelected(item)
    }

}