package kr.ac.addactivitytest0530

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var btnSecond = findViewById<Button>(R.id.btnSecond)
        btnSecond.setOnClickListener {
            finish()

        }
    }
}