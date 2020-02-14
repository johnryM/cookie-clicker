package uk.co.bbc.cookieclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickCookie(view: View) {
        Toast.makeText(this,"You clicked a cookie",Toast.LENGTH_SHORT).show()
    }
}
