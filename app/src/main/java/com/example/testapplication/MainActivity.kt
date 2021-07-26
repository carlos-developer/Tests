package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Version_0.12", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Version_0.7", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Version_0.7", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Version_0.7", Toast.LENGTH_LONG).show()

        Toast.makeText(this, "Version_0.5", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Version main", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Version main", Toast.LENGTH_LONG).show()

        Toast.makeText(this, "Version_main", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Version_0.5", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Version_0.4", Toast.LENGTH_LONG).show()

        Toast.makeText(this, "Version_main", Toast.LENGTH_LONG).show()
    }

    fun nothing() {
        Toast.makeText(this, "Version_main_2", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Version_main_2", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Version_main", Toast.LENGTH_LONG).show()
    }

    fun nothing2() {
        Toast.makeText(this, "Version_main", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Version_main", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Version_main", Toast.LENGTH_LONG).show()
    }
}
