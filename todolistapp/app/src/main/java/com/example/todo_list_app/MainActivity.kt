package com.example.todo_list_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // test comment
    }

    fun setText(view: View){
        val editText = findViewById<EditText>(R.id.editText)
        val input = editText.text.toString()
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = input
        }
    }
}