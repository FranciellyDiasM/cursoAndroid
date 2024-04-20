package br.com.dias.francielly

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.dias.francielly.databinding.ActivityFraseDoDiaBinding
import java.util.Random

class FraseDoDiaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFraseDoDiaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFraseDoDiaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gerar.setOnClickListener {
            gerarFrase()
        }
    }

    val frases = arrayOf("frase ", "frase2", "frase3", "frase4")

    fun gerarFrase() {
        val totalItensArray = frases.size
        val numeroAleatorio = Random().nextInt(totalItensArray)

        binding.instrucao.setText((frases[numeroAleatorio]))
    }
}