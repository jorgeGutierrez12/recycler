package gutierrez.jorge.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TareasAdapter(val tareas:List<Tarea>): RecyclerView.Adapter<TareaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TareaViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(
            R.layout.tarea_item,
            parent,
            false)
        return TareaViewHolder(vista)
    }

    override fun getItemCount(): Int = tareas.size

    override fun onBindViewHolder(holder: TareaViewHolder, position: Int) {
        holder.tvTitulo.text = tareas[position].titulo
        holder.tvDescripcion.text = tareas[position].descripcion

    }

}