package com.example.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            val edtNome: EditText = findViewById(R.id.edtNome)
        val edtEndereco: EditText = findViewById(R.id.edtEndereco)
        val edtBairro: EditText = findViewById(R.id.edtBairro)
        val edtCidade: EditText = findViewById(R.id.edtCidade)
        val edtCEP: EditText = findViewById(R.id.edtCEP)


        val btnCadastrar: Button = findViewById(R.id.btnCadastrar)
            btnCadastrar.setOnClickListener{
                val toast = Toast.makeText(this, edtNome.text.toString()
                    +"\n"+ edtEndereco.text.toString()
                        +"\n"+ edtBairro.text.toString()
                        +"\n"+ edtCidade.text.toString()
                        +"\n"+ edtCEP.text.toString(), Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
