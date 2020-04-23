package com.example.apipractice_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValue()
    }

    override fun setValue() {

        loginBtn.setOnClickListener {
            val inputId = idEdt.text.toString() // cho881020 => 조경진
            val inputPw = pwEdt.text.toString() // asdf1234

//            로그인?

        }

    }

    override fun setupEvents() {

    }
}
