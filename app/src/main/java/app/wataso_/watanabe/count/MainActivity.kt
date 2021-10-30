package app.wataso_.watanabe.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text :TextView = findViewById(R.id.text)
        val button : Button = findViewById(R.id.button)

        var count :Int = 0

        button.setOnClickListener {
            count =count +1
            text.text = count.toString()
        }
    }

}