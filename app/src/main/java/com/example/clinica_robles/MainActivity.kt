package com.example.clinica_robles

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clinica_robles.adaptador.EspecialidadAdapter
import com.example.clinica_robles.modelo.Especialidad

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val especialidades = listOf(
            Especialidad("TRAUMATOLOGÍA", "DR. ALBERTO GARCIA CERNA", "Lun-Vie 8am-4pm", R.drawable.doctor1),
            Especialidad("CARDIOLOGÍA", "DR. ROBERTO CHAVESTA BERNAL", "Lun-Sab 9am-5pm", R.drawable.doctor1),
            Especialidad("CIRUGÍA CARDIOVASCULAR", "DR. ROMEL ZAMUDIO SILVA", "Mar-Jue 10am-2pm", R.drawable.doctor1),
            Especialidad("CIRUGÍA GENERAL", "DR. POOL JARA PESANTES", "Lun-Vie 8am-3pm", R.drawable.doctor1),
            Especialidad("DERMATOLOGÍA", "DR. JAIME VEGA CHAVEZ", "Lun-Vie 9am-1pm", R.drawable.doctor1),
            Especialidad("ENDOCRINOLOGÍA", "DR. JUAN PINTO SANCHEZ", "Mar-Vie 10am-4pm", R.drawable.doctor1),
            Especialidad("GASTROENTEROLOGÍA", "DRA. KELLY CASANOVA LAU", "Lun-Jue 8am-2pm", R.drawable.doctor1),
            Especialidad("GINECOLOGÍA", "DRA. LESLIE SOSA DE LA CRUZ", "Lun-Vie 9am-5pm", R.drawable.doctor1),
            Especialidad("MEDICINA FÍSICA", "DR. LUIS VASQUEZ", "Mar-Sab 8am-4pm", R.drawable.doctor1),
            Especialidad("MEDICINA GENERAL", "DRA. MARIA CRISTINA SAAVEDRA", "Lun-Vie 7am-3pm", R.drawable.doctor1),
            Especialidad("MEDICINA INTERNA", "DRA. YURIKO ZUNIGA LAVADO", "Lun-Vie 8am-4pm", R.drawable.doctor1),
            Especialidad("NEUMOLOGÍA", "DRA. YESSICA MONTOYA CALDAS", "Mar-Vie 9am-3pm", R.drawable.doctor1),
            Especialidad("NEUROCIRUGÍA", "DR. WILLY CABALLERO CRADOS", "Lun-Jue 10am-2pm", R.drawable.doctor1),
            Especialidad("NEUROLOGÍA", "DR. ROSNEL VALDIVIESO VELARDE", "Lun-Vie 9am-5pm", R.drawable.doctor1),
            Especialidad("NUTRICIÓN", "LIC. CARMELA CARBAJAL", "Lun-Vie 8am-3pm", R.drawable.doctor1),
            Especialidad("ODONTOLOGÍA", "DRA. CAROLINA ACUÑA CALDERON", "Mar-Sab 9am-1pm", R.drawable.doctor1),
            Especialidad("CIRUGÍA MAXILOFACIAL", "DR. JULIO ROBLES ZANELLI", "Lun-Vie 8am-2pm", R.drawable.doctor1),
            Especialidad("OTORRINOLARINGOLOGÍA", "DR. JORGE BONILLA VARGAS", "Lun-Vie 9am-4pm", R.drawable.doctor1),
            Especialidad("OFTALMOLOGÍA", "DRA. ANITA VIGO ARROYO", "Mar-Jue 10am-3pm", R.drawable.doctor1),
            Especialidad("PEDIATRÍA", "DRA. ROSA ANGELDONIS HURTADO", "Lun-Vie 8am-5pm", R.drawable.doctor1),
            Especialidad("PSICOLOGÍA", "LIC. ASTRID MANRIQUE MARRON", "Lun-Vie 9am-4pm", R.drawable.doctor1),
            Especialidad("PSIQUIATRÍA", "DRA. CELMIRA LAZARO LOYOLA", "Lun-Vie 8am-3pm", R.drawable.doctor1),
            Especialidad("REUMATOLOGÍA", "DR. FRANK OCAÑA VASQUEZ", "Mar-Vie 9am-2pm", R.drawable.doctor1),
            Especialidad("UROLOGÍA", "DR. CARLOS MORALES FLORES", "Lun-Jue 8am-4pm", R.drawable.doctor1),
        )

        recyclerView.adapter = EspecialidadAdapter(especialidades)
    }
}



