package com.ayros.equation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener{
            val a = edit_a.text.toString().toDoubleOrNull() ?: 0.0
            val b = edit_b.text.toString().toDoubleOrNull() ?: 0.0
            val c = edit_c.text.toString().toDoubleOrNull() ?: 0.0

            roots.text = equation(a,b,c).toString()
        }
    }
}
