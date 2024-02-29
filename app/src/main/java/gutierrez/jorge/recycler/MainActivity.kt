package gutierrez.jorge.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.SeekBar
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var etTitulo: EditText
    lateinit var listaTareas:RecyclerView
    lateinit var adapter:TareasAdapter
    lateinit var skBarra : SeekBar

    private val tareasViewModel:TareasViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTitulo = findViewById(R.id.etNombre)
        skBarra = findViewById(R.id.skBarra)

        listaTareas = findViewById(R.id.rvTareas)

        /*tareasViewModel.elementos.add(
            Tarea("",
                "",
                false)
        */)

        adapter = TareasAdapter(tareasViewModel.elementos)

        listaTareas.adapter = adapter
        listaTareas.layoutManager = GridLayoutManager(this,
            1)

        val i = 0
        skBarra.progress


        /*btnGuardar.setOnClickListener {

            val titulo = etTitulo.text.toString()
            tareasViewModel.elementos.add(Tarea(titulo,titulo,false))

            adapter.notifyDataSetChanged()
            Toast.makeText(this,"${tareasViewModel.elementos.size}",Toast.LENGTH_SHORT).show()
       */ }

    }
}