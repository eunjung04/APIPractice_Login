package com.example.apipractice_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.apipractice_login.ServerUtil.ServerUtil
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValue()
    }

    override fun setupEvents() {

        loginBtn.setOnClickListener {
            val inputId = idEdt.text.toString() // cho881020 => 조경진
            val inputPw = pwEdt.text.toString() // asdf1234

//            서버로 로그인 요청=>ServerUtil클래스 기능 활용
            ServerUtil.postRequestLogin(
                mContext,
                inputId,
                inputPw,
                object : ServerUtil.JsonResponseHandler {
                    override fun onResponse(json: JSONObject) {

                        //실제로 응답을 받은걸 분서석해서=>대응


                        //임시로 서버 응답 확인 하기 위한 코드
                     //   Log.d("서버응답JSON", json.toString())

                        val code=json.getInt("code")

                        if(code==200) {
                            //로그인 성공
                        }
                        else{
                            val message=json.getString("message")

                            runOnUiThread {
                                Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show()
                            }

                        }

                    }

                })


        }

    }

    override fun setValue() {

    }

}

