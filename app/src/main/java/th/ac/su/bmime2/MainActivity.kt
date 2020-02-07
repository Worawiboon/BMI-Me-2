package th.ac.su.bmime2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtHeight = findViewById<EditText>(R.id.edtHeight)
        var edtWeight = findViewById<EditText>(R.id.edtWeight)
        var btnCalculate = findViewById<Button>(R.id.btnCalculate)

        btnCalculate.setOnClickListener{
            var intent = Intent(this@MainActivity,DetailActivity::class.java)
            intent.putExtra("height",edtHeight.text.toString().toDouble())
            intent.putExtra("weight",edtWeight.text.toString().toInt())


            var height = edtHeight.text.toString().toDouble()
            var weight = edtWeight.text.toString().toInt()



            fun Double.round(decimals: Int): Double {
                var multiplier = 1.0
                repeat(decimals) { multiplier *= 10 }
                return kotlin.math.round(this * multiplier) / multiplier
            }



            startActivity(intent)
        }


    }
}
