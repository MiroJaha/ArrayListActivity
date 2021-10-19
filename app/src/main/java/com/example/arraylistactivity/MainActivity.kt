package com.example.arraylistactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var nameEntry: EditText
    private lateinit var indexEntry: EditText
    private lateinit var nameTV: TextView
    private lateinit var nameList: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEntry= findViewById(R.id.nameEntry)
        indexEntry= findViewById(R.id.indexEntry)
        nameTV= findViewById(R.id.nameTV)
        nameList= arrayListOf()
    }

    fun saveName(view: View) {
        if (nameEntry.text.isNotBlank()){
            nameList.add(nameEntry.text.toString())
            Toast.makeText(this,"Name Was Add Successfully",Toast.LENGTH_SHORT).show()
        }
        else
            Toast.makeText(this,"Please Enter Name",Toast.LENGTH_SHORT).show()
        nameEntry.text.clear()
    }
    fun displayName(view: View) {
        if (indexEntry.text.isNotBlank() && indexEntry.text.toString().toInt() <= nameList.size && indexEntry.text.toString().toInt() > 0)
            nameTV.text= nameList[indexEntry.text.toString().toInt()-1]
        else
            Toast.makeText(this,"No Name was Found",Toast.LENGTH_SHORT).show()
        indexEntry.text.clear()
    }
}