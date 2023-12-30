package com.example.myapplication.Tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.R

class Tuan23MainActivity : AppCompatActivity() {
    var lv: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main)
        lv = findViewById(R.id.tuan22ListView);
        val arr = arrayOf("item1","item2","item3","item4","item5","item6","item7","item8");
        // adapter
        var ad =ArrayAdapter (this,android.R.layout.simple_list_item_1,arr);
        // hien thi len listview
        lv!!.adapter= ad;
    }
}