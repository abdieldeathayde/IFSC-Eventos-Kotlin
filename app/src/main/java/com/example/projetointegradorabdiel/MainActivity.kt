package com.example.projetointegradorabdiel

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
//import android.widget.ImageView
//import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        val password = fun(pass1: String ?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val nomeUsuario = findViewById<EditText>(R.id.editTextText3)
            val senha = findViewById<EditText>(R.id.editTextText5)
            val botao = findViewById<Button>(R.id.button)
            val inscricaoAluno = findViewById<TextView>(R.id.textView4)
            val inscricaoProfessorOuTecnico = findViewById<TextView>(R.id.textView5)
            val resposta = findViewById<TextView>(R.id.textView3)
            //        val voltarLogin = findViewById<TextView>(R.id.textView8)
            botao.setOnClickListener {
                val nome = nomeUsuario.text.toString()
                val senha2 = senha.text.toString()

                if (nome == "Abdiel" && senha2 == pass1) {
                    resposta.text = "Bem vindo $nome"
                } else if (nome == " " || senha2 == " ") {
                    resposta.text = "Todos os campos devem ser preenchidos"
                } else {
                    resposta.text = "Usuario ou senha incorretos!"
                }
            }

            inscricaoAluno.setOnClickListener {

            }
            inscricaoProfessorOuTecnico.setOnClickListener {

            }
        }



            val senha = findViewById<EditText>(R.id.editTextText5)
            val resetaSenha = findViewById<TextView>(R.id.textView)
            resetaSenha.setOnClickListener {
                fun resetarSenha() {
                    setContentView(R.layout.reseta_senha)
                    val user = findViewById<EditText>(R.id.editTextText)
                    val senha1 = findViewById<EditText>(R.id.editTextTextPassword)
                    val senha2 = findViewById<EditText>(R.id.editTextTextPassword2)
                    val button = findViewById<Button>(R.id.button2)
                    val texto = findViewById<TextView>(R.id.textView7)

                    button.setOnClickListener {
                        val usuario = user.text.toString()
                        val pass1 = senha1.text.toString()
                        val pass2 = senha2.text.toString()

                        if (usuario == "Abdiel" && pass1 == pass2) {
                            texto.text = "Senha salva"
                        }

                        password(pass1)
                        setContentView(R.layout.activity_main)
                        senha.setText(pass2)
                    }
                }
                val voltarLogin = findViewById<TextView>(R.id.textView8)
                val senha2 = findViewById<EditText>(R.id.editTextTextPassword2)
                val pass2 = senha2.text.toString()
                voltarLogin.setOnClickListener {


                    setContentView(R.layout.activity_main)

                }
                resetarSenha()
        }





    }


}



