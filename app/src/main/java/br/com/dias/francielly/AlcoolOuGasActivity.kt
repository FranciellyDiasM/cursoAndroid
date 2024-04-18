package br.com.dias.francielly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_alcool_ou_gas.btnCalcular
import kotlinx.android.synthetic.main.activity_alcool_ou_gas.edtPrecoAlcool
import kotlinx.android.synthetic.main.activity_alcool_ou_gas.edtPrecoGas

class AlcoolOuGasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alcool_ou_gas)

        btnCalcular.setOnClickListener {
            btnCalcular()
        }

    }
    fun btnCalcular() {
        val edtPrecoAlcool = edtPrecoAlcool.text.toString()
        val edtPrecoGas = edtPrecoGas.text.toString()

        Log.i("Resultado", "texto recuperado: $edtPrecoAlcool")
        Log.i("Resultado2", "Texto2 recuperado: $edtPrecoGas")

    }
}