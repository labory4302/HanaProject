package com.example.fcmservice

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pref = this.getSharedPreferences("token", Context.MODE_PRIVATE)
        val token = pref.getString("token", "--")
        Log.d("token : ", token.toString())
    }
}