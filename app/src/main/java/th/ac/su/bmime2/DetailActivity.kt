package th.ac.su.bmime2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val height = intent.getDoubleExtra("height",-1.0)
        val weight = intent.getIntExtra("weight",-1)
        var tvDetail = findViewById<TextView>(R.id.tvDetail)
        var tvHw = findViewById<TextView>(R.id.tvHw)

        var w = weight
        var h = height
        h = h/100

        var bmi:Double = w/(h*h)

        var result = "fat"

        if(bmi>30) {
            tvDetail.setText(bmi.toString())
            tvDetail.setText("Obese")
        }
        else if (bmi> 25) {
            tvDetail.setText(bmi.toString())
            tvDetail.setText("Overweight")
        }
        else if (bmi> 18) {
            tvDetail.setText(bmi.toString())
            tvDetail.setText("Healthy")
        }
        else {
            tvDetail.setText(bmi.toString())
            tvDetail.setText("Underweight")
        }

        tvBmi.setText(bmi.toString())

        tvHw.setText("height: "+height.toString()+"weight: "+weight.toString())





    }
}
