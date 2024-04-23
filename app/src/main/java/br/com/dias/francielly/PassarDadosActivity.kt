package br.com.dias.francielly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dias.francielly.databinding.ActivityPassarDadosBinding

class PassarDadosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPassarDadosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passar_dados)

        binding = ActivityPassarDadosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.passarDados.setOnClickListener {
            val intent = Intent(applicationContext, DadosActivity::class.java)
            // passar os dados
            intent.putExtra("nome", "Francielly")
            intent.putExtra("idade", 36)


            startActivity(intent)
        }
    }
}