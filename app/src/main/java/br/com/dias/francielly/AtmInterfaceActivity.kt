package br.com.dias.francielly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import br.com.dias.francielly.databinding.ActivityAtmInterfaceBinding
import br.com.dias.francielly.databinding.ActivityDetalheContatosBinding

class AtmInterfaceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAtmInterfaceBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAtmInterfaceBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnContato.setOnClickListener {
            Toast.makeText(applicationContext, "Contato foi clicado", Toast.LENGTH_LONG).show()

            val intent = Intent(this, DetalheContatosActivity::class.java)
            startActivity(intent)
        }

        binding.btnCliente.setOnClickListener {
            Toast.makeText(applicationContext, "Cliente foi clicado", Toast.LENGTH_LONG).show()


            val intent = Intent(this, DetalheClienteActivity::class.java)
            startActivity(intent)
        }

        binding.btnEmpresa.setOnClickListener {
            Toast.makeText(applicationContext, "Empresa foi clicado", Toast.LENGTH_LONG).show()

            val intent = Intent(this, DetalheEmpresaActivity::class.java)
            startActivity(intent)
        }

        binding.btnServico.setOnClickListener {
            Toast.makeText(applicationContext, "Serviços foi clicado", Toast.LENGTH_LONG).show()

            val intent = Intent(this, DetalheServicosActivity::class.java)
            startActivity(intent)
        }

    }




}





