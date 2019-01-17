package com.example.abril.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.os.PersistableBundle
import android.view.ContextMenu
import android.view.View
import android.widget.Button

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menu = this.findViewById<Button>(R.id.button)
        menu.setOnClickListener { val intent = Intent (this,Menu::class.java)
        startActivity(intent)}

        val pedidos = this.findViewById<Button>(R.id.button2)
        pedidos.setOnClickListener { val intent = Intent (this,Pedido::class.java)
            startActivity(intent)}
    }

}
