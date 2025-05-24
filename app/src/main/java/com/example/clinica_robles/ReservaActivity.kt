package com.example.clinica_robles

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.imageview.ShapeableImageView

class ReservaActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserva)

        val especialidad = intent.getStringExtra("especialidad")
        val medico = intent.getStringExtra("medico")
        intent.getStringExtra("horario")

        findViewById<TextView>(R.id.textViewEspecialidadReserva).text = "Especialidad: $especialidad"
        findViewById<TextView>(R.id.textViewDoctorReserva).text = " $medico"

        val imageView = findViewById<ShapeableImageView>(R.id.imageView4)
        imageView.shapeAppearanceModel = imageView.shapeAppearanceModel
            .toBuilder()
            .setAllCornerSizes(300f) // cuanto más grande, más redondo (usa dp en px)
            .build()


// Dentro del onCreate
        val btnSalir = findViewById<Button>(R.id.Salir)
        btnSalir.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish() // Esto cierra la actividad actual para que no se quede en el stack
        }



    }
}
