package com.example.mad_23012011105_p2

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessages("onCreate called")
        Log.d(tag, "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        showMessages("onStart called")
        Log.d(tag, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        showMessages("onResume called")
        Log.d(tag, "onResume called")
    }

    override fun onPause() {
        super.onPause()
        showMessages("onPause called")
        Log.d(tag, "onPause called")
    }

    override fun onStop() {
        super.onStop()
        showMessages("onStop called")
        Log.d(tag, "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessages("onDestroy called")
        Log.d(tag, "onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessages("onRestart called")
        Log.d(tag, "onRestart called")
    }

    private fun showMessages(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show()
    }
}
