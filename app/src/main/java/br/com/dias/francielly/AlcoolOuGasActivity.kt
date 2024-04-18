package br.com.dias.francielly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AlcoolOuGasActivity : AppCompatActivity() {

    private lateinit var btnCalcular: Button
    private lateinit var edtPrecoAlcool: EditText
    private lateinit var edtPrecoGas: EditText
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alcool_ou_gas)

        btnCalcular = findViewById(R.id.btnCalcular)
        edtPrecoAlcool = findViewById(R.id.edtPrecoAlcool)
        edtPrecoGas = findViewById(R.id.edtPrecoGas)
        txtResultado = findViewById(R.id.txtResultado)

        btnCalcular.setOnClickListener {
            btnCalcular()
        }
    }

    fun btnCalcular() {
        val precoAlcool = edtPrecoAlcool.text.toString()
        val precoGas = edtPrecoGas.text.toString()

        val validaCampos = validarCampos(precoAlcool, precoGas)
        if (validaCampos) {
            calcularMelhorPreco(precoAlcool, precoGas)
        } else {
            txtResultado.setText("Preencha os valores!")
        }

        // Log.i("Resultado", "texto recuperado: $precoAlcool")
        //  Log.i("Resultado2", "Texto2 recuperado: $precoGas")
    }

    fun validarCampos(precoAlcool: String, precoGas: String): Boolean {
        var camposValidados: Boolean = true
        if (precoAlcool == null || precoAlcool.equals("")) {
            camposValidados = false
        } else if (precoGas == null || precoGas.equals("")) {
            camposValidados = false
        }
        return camposValidados
    }

    fun calcularMelhorPreco(precoAlcool: String, precoGas: String) {
        // converter valores para numeros
        val valorAlcool = precoAlcool.toDouble()
        val valorGas = precoGas.toDouble()

        val resultadoPreco = valorAlcool / valorGas
        if (resultadoPreco >= 0.7) {
            txtResultado.setText("Melhor usar gasolina")
        } else {
            txtResultado.setText("Melhor usar Alcool")
        }
    }


}