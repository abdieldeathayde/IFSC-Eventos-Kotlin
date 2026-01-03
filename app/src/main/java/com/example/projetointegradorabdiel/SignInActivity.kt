package com.example.projetointegradorabdiel

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
// CORREÇÃO: Importe a classe de binding correta
import com.example.projetointegradorabdiel.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth
import kotlin.jvm.java

class SignInActivity : FragmentActivity() {

    private lateinit var binding: ActivitySignInBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root) // Simplificado para maior clareza

        firebaseAuth = FirebaseAuth.getInstance()
        binding.textView.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.button.setOnClickListener {
            val email = binding.emailEt.text.toString()
            val pass = binding.passET.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()) {

                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                    if (it.isSuccessful) {
                        // Atenção: Após o login, você está redirecionando para a tela de cadastro (SignUpActivity).
                        // Talvez o ideal fosse ir para uma tela principal (ex: MainActivity).
                        val intent = Intent(this, MainActivity::class.java) // Sugestão
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Senha e email não podem estar vazios", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
