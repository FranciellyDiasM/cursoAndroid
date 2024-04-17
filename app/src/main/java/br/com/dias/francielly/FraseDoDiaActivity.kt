package br.com.dias.francielly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class FraseDoDiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frase_do_dia)

        texto = findViewById(R.id.instrucao)
        botao = findViewById(R.id.gerar)

        botao.setOnClickListener {
            gerarFrase()

        }
    }

    lateinit var texto: TextView
    lateinit var botao: Button

    val frases = arrayOf("frase ", "frase2", "frase3", "frase4")

    fun gerarFrase() {
        val totalItensArray = frases.size
        val numeroAleatorio = Random().nextInt(totalItensArray)

        texto.setText((frases[numeroAleatorio]))

    }


}