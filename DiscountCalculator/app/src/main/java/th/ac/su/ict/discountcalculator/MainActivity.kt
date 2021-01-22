package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val priceInput = findViewById<EditText>(R.id.edtPrice)
        val percentInput = findViewById<EditText>(R.id.edtPercent)
        val btnCalprice = findViewById<Button>(R.id.btnCal)
        val btnCaltax = findViewById<CheckBox>(R.id.checkTax)
        val totalView = findViewById<TextView>(R.id.tvTotal)

        var price:Double = 0.0
        var cost:Double = 0.0
        var discount:Double = 0.0
        var vated:Double = 0.0

        btnCalprice.setOnClickListener() {

            var priceIP:Double = priceInput.text.toString().toDouble()
            var percentIP:Double = percentInput.text.toString().toDouble()

            if(btnCaltax.isChecked){
                discount = priceIP*percentIP/100;
                price = priceIP-discount;
                vated = price*7/100;
                cost = price+vated;
                totalView.text=cost.toString()
            } else {

                discount = priceIP*percentIP/100;
                price = priceIP-discount;
                totalView.text=price.toString()
            }

        }
    }



}



