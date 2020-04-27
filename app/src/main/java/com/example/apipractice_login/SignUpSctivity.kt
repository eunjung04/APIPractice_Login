package com.example.apipractice_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.apipractice_login.ServerUtil.ServerUtil
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_up_sctivity.*
import org.json.JSONObject

class SignUpSctivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)
        setupEvents()
        setValue()
    }

    override fun setupEvents() {

        signUpBtn.setOnClickListener {
            val id=loginIdEdt.text.toString()
            val pw=pwEdt.text.toString()
            val name=nameEdt.text.toString()
            val phoneNum=phoneNumEdt.text.toString()

            ServerUtil.putRequestSignUp(mContext,id,pw,name,phoneNum, object : json{
                override fun onResponse(jdon : JSONObject){
                    // Log.d("회원가입응답", json.toString())

                    val code=json.getInt("code")

                    if(code==200) {
                        Toast.makeText(mContext,"회원가입성공!", Toast)
                        finish()
                    }
                    else{

                        //서버에서 내려주는 메세지를 토스트로 출력

                    }
            })







    }

    override fun setValue() {

            }
        }
    }
}
