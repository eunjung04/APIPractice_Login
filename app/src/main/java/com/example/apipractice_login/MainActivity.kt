package com.example.apipractice_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValue()
        setupEvents()

    }

    override fun setValue() {
        val inputId=idTxt.text.toString()

    }

    override fun setupEvents() {

    }
}
