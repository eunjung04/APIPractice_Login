package com.example.apipractice_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : BaseActivity() {


   private lateinit var userName : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setupEvents()
        setValue()
    }

    override fun setupEvents() {

    }

    override fun setValue() {

        userName=intent.getStringExtra("userName")

        nameTxt.text=userName

    }
}
