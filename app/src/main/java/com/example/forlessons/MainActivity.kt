package com.example.forlessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    fun log(mes: String){
        Toast.makeText(this, mes, Toast.LENGTH_LONG).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("Работает???")
        setContentView(R.layout.activity_main)
    }
}