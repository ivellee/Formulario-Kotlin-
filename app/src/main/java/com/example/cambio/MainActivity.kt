package com.example.cambio

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        val imageViewProfile = findViewById<ImageView>(R.id.imageViewProfile)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

        /*Accion al presionar el boton*/
        buttonSubmit.setOnClickListener {
            /*extrayendo el valor de los edit text*/
            val name = editTextName.text.toString()
            val email = editTextEmail.text.toString()
            val phone = editTextPhone.text.toString()

            /*Validacion*/
            if (name.isEmpty() || email.isEmpty() || phone.isEmpty()) {

                Toast.makeText(this, "(puedes usar un Toast)", Toast.LENGTH_SHORT).show()
            } else {

                imageViewProfile.setImageResource(R.drawable.bienvenido) /*Cambio de imagen*/
                Toast.makeText(this, "Formulario enviado correctamente", Toast.LENGTH_SHORT).show()
            }
        }
    }
}