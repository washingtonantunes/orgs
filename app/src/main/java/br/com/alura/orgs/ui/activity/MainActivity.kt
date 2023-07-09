package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem Vindo ao Orgs!", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e maçã"
//        var valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(listOf())
    }
}