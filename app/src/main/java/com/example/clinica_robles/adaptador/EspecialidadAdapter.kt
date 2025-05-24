package com.example.clinica_robles.adaptador

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.clinica_robles.R
import com.example.clinica_robles.ReservaActivity
import com.example.clinica_robles.modelo.Especialidad

class EspecialidadAdapter(private val lista: List<Especialidad>) :
    RecyclerView.Adapter<EspecialidadAdapter.EspecialidadViewHolder>() {

    class EspecialidadViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imagen: ImageView = view.findViewById(R.id.imagen)
        val nombre: TextView = view.findViewById(R.id.nombre)
        val medico: TextView = view.findViewById(R.id.medico)
        val horario: TextView = view.findViewById(R.id.horario)
        val btnReserva: Button = view.findViewById(R.id.btnReserva)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EspecialidadViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_card, parent, false)
        return EspecialidadViewHolder(view)
    }

    override fun onBindViewHolder(holder: EspecialidadViewHolder, position: Int) {
        val item = lista[position]
        holder.imagen.setImageResource(item.imagen)
        holder.nombre.text = item.nombre
        holder.medico.text = "Recomendado: ${item.medico}"
        holder.horario.text = item.horario

        holder.btnReserva.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, ReservaActivity::class.java).apply {
                putExtra("especialidad", item.nombre)
                putExtra("medico", item.medico)
                putExtra("horario", item.horario)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = lista.size
}


