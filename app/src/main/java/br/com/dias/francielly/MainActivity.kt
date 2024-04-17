package br.com.dias.francielly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.dias.francielly.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enviar.setOnClickListener {
            var texto = findViewById(R.id.textoSorteio) as TextView

            var numeroSorteado = Random().nextInt(11)
            texto.setText("O numero sorteado é: $numeroSorteado")

//            binding.textoSorteio.text = "O numero sorteado é: $numeroSorteado"


        }
    }
}