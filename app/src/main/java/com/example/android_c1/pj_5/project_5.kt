package com.example.android_c1.pj_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.Toast
import com.example.android_c1.R
import com.example.android_c1.pj_1.MainActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class project_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project5)

        var chk_android = findViewById<CheckBox>(R.id.chk_android)
        var chk_kotlin = findViewById<CheckBox>(R.id.kotlin)
        var chk_java = findViewById<CheckBox>(R.id.java)
        var flt_btn = findViewById<FloatingActionButton>(R.id.flt_btn)

        var check_array = arrayListOf<String>()

        update_array(check_array)

        flt_btn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        chk_android.setOnCheckedChangeListener { componentName, b ->
            if (b) {
                check_array.add(chk_android.text.toString())
                Toast.makeText(this, chk_android.text.toString(), Toast.LENGTH_SHORT).show()
                update_array(check_array)

            } else
                check_array.remove(chk_android.text.toString())
            update_array(check_array)
        }

        chk_kotlin.setOnCheckedChangeListener { componentName, b ->
            if (b) {
                check_array.add(chk_kotlin.text.toString())
                Toast.makeText(this, chk_kotlin.text.toString(), Toast.LENGTH_SHORT).show()
                update_array(check_array)
            } else
                check_array.remove(chk_android.text.toString())
            update_array(check_array)
        }

        chk_java.setOnCheckedChangeListener { componentName, b ->
            if (b) {
                check_array.add(chk_java.text.toString())
                Toast.makeText(this, chk_java.text.toString(), Toast.LENGTH_SHORT).show()
                update_array(check_array)

            } else
                check_array.remove(chk_android.text.toString())
            update_array(check_array)
        }
    }

    private fun update_array(checkArray: ArrayList<String>) {
        for (i in 0..checkArray.size) {
            Log.d("array_data", checkArray.toString())
        }
    }

}