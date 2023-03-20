package com.example.dzienniczekx3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class activity_oceny : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oceny)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mnu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
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

        return super.onOptionsItemSelected(item)
    }
}