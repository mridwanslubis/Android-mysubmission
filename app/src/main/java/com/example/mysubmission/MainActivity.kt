package com.example.mysubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class   MainActivity : AppCompatActivity() {

    private lateinit var rvSmartphones: RecyclerView
    private var list: ArrayList<Smartphone> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSmartphones = findViewById(R.id.rv_smartphones)
        rvSmartphones.setHasFixedSize(true)

        list.addAll(SmartphonesData.listData)

        showRecyclerCardView()

    }

    private fun showRecyclerCardView(){
        rvSmartphones.layoutManager = LinearLayoutManager(this)
        val smartphoneAdapter = SmartphoneAdapter(list)
        rvSmartphones.adapter = smartphoneAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }


    private fun setMode(selectedMode: Int){
        when(selectedMode){
            R.id.about_me -> {
                val moveIntent = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(moveIntent)
            }
        }
    }

}