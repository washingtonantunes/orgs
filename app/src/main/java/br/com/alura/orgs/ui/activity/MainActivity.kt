package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem Vindo ao Orgs!", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(nome = "teste", descricao = "teste desc", valor = BigDecimal("19.99")),
                Produto(nome = "teste 2", descricao = "teste desc 2", valor = BigDecimal("29.99")),
                Produto(nome = "teste 3", descricao = "teste desc 3", valor = BigDecimal("39.99"))
            )
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}