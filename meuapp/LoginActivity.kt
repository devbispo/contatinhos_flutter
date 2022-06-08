package com.example.meuapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        val botao = findViewById<Button>(R.id.btnEntrar)
        botao.setOnClickListener{
            val intent = Intent(applicationContext, ListaActivity::class.java)
            startActivity(intent)
        }
    }
}