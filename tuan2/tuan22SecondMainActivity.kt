package com.example.myapplication.Tuan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R

class tuan22SecondMainActivity : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? =null
    var btn1: Button? = null
    var tv1: TextView? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan11_main)
        txt1 = findViewById(R.id.tuan11edt1);
        txt2 = findViewById(R.id.tuan11edt2);
        btn1 =findViewById(R.id.tuan11btn1);
        tv1 = findViewById(R.id.tuan11tv1);
        btn1!!.setOnClickListener(View.OnClickListener {
            var i =Intent (this@tuan22SecondMainActivity,Tuan22Second2MainActivity :: class.java)
            i.putExtra("so1",txt1!!.text.toString())
            i.putExtra("so2",txt2!!.text.toString())
            startActivity(i);
        })
    }
}