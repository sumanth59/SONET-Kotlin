package com.example.kotlindemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView

class OnlineClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_class)

        val list_view = findViewById<ListView>(R.id.list_view)

        val classes = resources.getStringArray(R.array.classes)
        list_view.setOnItemClickListener { parent, view, position, id ->
            var uri = Uri.parse("https://meet.google.com/ezd-kcub-vbu")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }


    }
}