package com.example.goldstorage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This needs to return a boolean to signify if we handled the user's action
        findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnItemSelectedListener {
            item ->

            when (item.itemId) {

                R.id.action_home -> {
                    // TODO Navigate to the home screen
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                }

                R.id.action_history -> {
                    // TODO Navigate to the history screen
                    Toast.makeText(this, "History", Toast.LENGTH_SHORT).show()
                }

                R.id.action_settings -> {
                    // TODO Navigate to the edit screen
                    Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                }
            }
            // Return true to say that we've handled this user interaction on the item
            true
        }
    }
}