package br.com.dias.francielly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dias.francielly.databinding.ActivityCaraOuCoroaBinding
import kotlin.random.Random

class CaraOuCoroaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCaraOuCoroaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cara_ou_coroa)

        binding = ActivityCaraOuCoroaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnJogar.setOnClickListener{
            val intent = Intent(applicationContext, CoroaActivity::class.java)

            // gerar numero randomico
            val numero = Random.nextInt(2)

            // enviar numero para a proxima activity
            intent.putExtra("numero", numero)

            startActivity(intent)
        }

    }
}