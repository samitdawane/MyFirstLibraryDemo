package com.samit.mylibrarydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.samit.mylibrary.Utility
import com.samit.mylibrary.ui.login.LoginActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val abc = Utility()
       // abc.showToast(this,"Samit dawane")

        //intent = Intent(this, LoginActivity::class.java)
        //startActivity(intent)

    }
}