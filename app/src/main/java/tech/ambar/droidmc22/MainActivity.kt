package tech.ambar.droidmc22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnAdd = findViewById<Button>(R.id.btnAdd)
        var etNum1 = findViewById<EditText>(R.id.etNum1)
        var etNum2 = findViewById<EditText>(R.id.etNum2)
        var tvResult = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener{
            try{
                var num1 = etNum1.text.toString().toInt()
                var num2 = etNum2.text.toString().toInt()
                var sum = num1 + num2
                tvResult.text = "RESULT: $sum"
            }catch (e : NumberFormatException) {
                AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Please enter a valid number")
                    .setPositiveButton("OK",null)
                    .show()
            }
        }
    }
}