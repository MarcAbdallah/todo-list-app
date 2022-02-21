package com.example.todo_list_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todo_list_app.Adapter.ItemAdapter
import com.example.todo_list_app.Data.DataSource
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // test comment

        val myDataset = DataSource().loadWeekdays()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
    }

    fun setText(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val input = " - " + editText.text.toString()
        val textView = findViewById<TextView>(R.id.textView)
        val current = textView.text.toString()
        textView.text = current + "\n" + input
        return
    }

}

