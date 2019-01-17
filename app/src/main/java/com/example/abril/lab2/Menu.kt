package com.example.abril.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val menuop = arrayOf("Pizza", "chicle", "helado", "crepa", "pollo frito", "carne asada", "pollo asado", "arroz frito")
        val lista: ListView =findViewById(R.id.c)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,menuop)
        lista.setAdapter(adapter)

        val inicio = this.findViewById<Button>(R.id.button3)
        inicio.setOnClickListener { val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)}

        lista.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

        }
    }

}
