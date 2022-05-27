package com.example.android_c1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class project_3 : AppCompatActivity() {

    lateinit var  btn_txt: String

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project3)

        var btn_web = findViewById<Button>(R.id.openweb)
        var btn_show = findViewById<Button>(R.id.p3_submit)
        var radio_grp = findViewById<RadioGroup>(R.id.radio_grp)



        btn_web.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.tops-int.com/"))
            startActivity(intent)
        }


        radio_grp.setOnCheckedChangeListener { radioGroup, i ->
            if (i == R.id.btn_adnroid) {
                btn_txt = "Android"
                btn_show.text = btn_txt.toString()

            } else if (i == R.id.btn_kotlin) {
                btn_txt = "Kotlin"
                btn_show.text = btn_txt.toString()
            } else
                btn_txt = "java"
            btn_show.text = btn_txt.toString()
        }


    }
}