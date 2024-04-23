package br.com.dias.francielly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dias.francielly.databinding.ActivityDadosBinding
import br.com.dias.francielly.databinding.ActivityPassarDadosBinding

class DadosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDadosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDadosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // recuperar os dados do putExtras
        val dados: Bundle? = intent.extras

        val nome = dados?.getString("nome")
        val idade = dados?.getInt("idade")

        binding.txtNome.text = nome
        binding.txtIdade.text = idade.toString()


    }
}