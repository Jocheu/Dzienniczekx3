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


        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setIcon(R.drawable.trash)


        var loginButon = findViewById<Button>(R.id.loginButton)
        loginButon.setOnClickListener {
            var pass = findViewById<EditText>(R.id.passTxt).text.toString()
            var login = findViewById<EditText>(R.id.loginTxt).text.toString()
            switchActivities(login, pass)
        }
    }

    fun switchActivities(imie: String, haslo:String){
        val bundle = Bundle()
        bundle.putString("name", imie)
        bundle.putString("pass", haslo)
        val intent = Intent(this, activity_oceny::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mnu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val bundle = intent.extras
        if(bundle!=null){
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