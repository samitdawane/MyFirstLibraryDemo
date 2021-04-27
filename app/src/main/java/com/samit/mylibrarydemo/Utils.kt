package com.samit.mylibrarydemo

import android.content.Context
import android.widget.Toast

class Utils {

    fun showToastIN(con : Context, msg : String) : Unit{

        Toast.makeText(con,msg, Toast.LENGTH_SHORT).show()

    }
}