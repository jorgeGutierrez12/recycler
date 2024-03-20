package gutierrez.jorge.recycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TareaViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
    val tvTitulo = itemView.findViewById<TextView>(R.id.linear)
    val tvDescripcion = itemView.findViewById<TextView>(R.id.tvDescripcion)
}