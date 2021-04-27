package com.samit.mylibrary

import android.content.Context
import android.widget.Toast

class Utility {

    fun showToast(con : Context, msg : String) : Unit{

        Toast.makeText(con,msg,Toast.LENGTH_SHORT).show()

    }
}