package com.questdev.custompopupapp

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDialog(view: View) {
        val dialog = Dialog(this)

        dialog.setContentView(R.layout.custom_popup)
        dialog.setCanceledOnTouchOutside(false)
        dialog.setCancelable(false)

        dialog.window?.setBackgroundDrawable(object : ColorDrawable(Color.TRANSPARENT){})
        dialog.findViewById<TextView>(R.id.btn_close)?.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }

    fun navigateToProfileActivity(view: View) {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }

    fun searchPage(view: View) {
        val intent = Intent(this, FirebaseSearchActivity::class.java)
        startActivity(intent)
    }
}
