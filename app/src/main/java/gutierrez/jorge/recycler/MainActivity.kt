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
    lateinit var etNombre: EditText
    lateinit var listaTareas:RecyclerView
    lateinit var adapter:TareasAdapter
    lateinit var skBarra : SeekBar



    private val tareasViewModel:TareasViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNombre = findViewById(R.id.etNombre)
        skBarra = findViewById(R.id.skBarra)
        listaTareas = findViewById(R.id.rvTareas)

        adapter = TareasAdapter(tareasViewModel.elementos)

        listaTareas.adapter = adapter
        listaTareas.layoutManager = GridLayoutManager(this,
            1)



        skBarra.setOnSeekBarChangeListener(object :  SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val canti = etNombre.text.toString()
                tareasViewModel.elementos.clear()
                var pago = canti.toDouble()
                var mes = 0
                for (i in 0 until progress) {
                    mes = mes + 1
                    pago = pago + (pago * 0.11)
                    val nuv =pago.toString()
                    tareasViewModel.elementos.add(Tarea("Interes total: $nuv","Mes: $mes", false))
                    adapter.notifyDataSetChanged()

                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

            /*btnGuardar.setOnClickListener {

            val titulo = etTitulo.text.toString()
            tareasViewModel.elementos.add(Tarea(titulo,titulo,false))

            adapter.notifyDataSetChanged()
            Toast.makeText(this,"${tareasViewModel.elementos.size}",Toast.LENGTH_SHORT).show()
        }*/

        }
}