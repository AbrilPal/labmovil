package com.example.abril.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Pedido : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)
        val aceptar = this.findViewById<Button>(R.id.button5)
        val iniciom = this.findViewById<Button>(R.id.button6)
        iniciom.setOnClickListener { val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)}

        val text = "¡Pedido Exitoso!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        aceptar.setOnClickListener { toast.show() }
    }
}
