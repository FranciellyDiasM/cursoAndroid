package br.com.dias.francielly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dias.francielly.databinding.ActivityCoroaBinding

class CoroaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCoroaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroa)

        binding = ActivityCoroaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltarCoroa.setOnClickListener {//botao voltar mas finalizando a tela
            finish()
        }

        val dados: Bundle? = intent.extras
        val numero = dados?.getInt("numero")

        if (numero == 0) {
            binding.imgCoroa.setImageResource(R.drawable.moeda_coroa)
        } else {
            binding.imgCoroa.setImageResource(R.drawable.moeda_cara)
        }


    }
}