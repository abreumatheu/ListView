package co.matheusabreu.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import co.matheusabreu.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaNumeros = ArrayList<Int>()

        listaNumeros.add(1)
        listaNumeros.add(10)
        listaNumeros.add(5)
        listaNumeros.add(4)
        listaNumeros.add(8)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNumeros)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { _, _, i, _ ->
            Toast.makeText(this, "Clicado em ${listaNumeros[i]}", Toast.LENGTH_SHORT).show()
        }
    }
}
