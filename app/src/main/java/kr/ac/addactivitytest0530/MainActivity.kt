package kr.ac.addactivitytest0530

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var rg : RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rg = findViewById<RadioGroup>(R.id.rg)
        rg.check(R.id.radiosecond)

        var btnMain = findViewById<Button>(R.id.btnMain)
        var intent = null
        rg.setOnClickListener {
            var intent = Intent(applicationContext, SecondActivity::class.java)
            when(rg.checkedRadioButtonId){
                R.id.radiosecond -> intent = Intent(applicationContext, SecondActivity::class.java)
                R.id.radiothird -> intent = Intent(applicationContext, ThirdActivity::class.java)
            }
            startActivity(intent)


        }
    }
}