package com.example.dzienniczekx3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class infoUzytkownik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_uzytkownik)

        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setIcon(R.drawable.trash)

        val bundle = intent.extras
        if(bundle!=null){
            val tytul = bundle.getString("name").toString() + " " + bundle.getString("pass").toString()
            supportActionBar!!.title = tytul
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mnu, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        val bundle = intent.extras
        if(id == R.id.firstItem && bundle!=null){
            val nowy = Intent(this,infoUzytkownik::class.java)
            nowy.putExtras(bundle)
            startActivity(nowy)
            finish()
        }
        else if (id == R.id.secondItem && bundle!=null){
            val nowy = Intent(this,activity_oceny::class.java)
            nowy.putExtras(bundle)
            startActivity(nowy)
            finish()
        }

        return super.onOptionsItemSelected(item)
    }
}