package com.example.medicineview

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.PopupWindow
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (Build.VERSION.SDK_INT >= Build.VERSIOMeetingN_CODES.LOLLIPOP) {
//            window.statusBarColor = ContextCompat.getColor(this, R.color.black)
//        }

//        val intent = Intent(this@MainActivity , HomePage::class.java)
//        startActivity(intent)

        val button: Button = findViewById(R.id.bash)
        val inflater: LayoutInflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView = inflater.inflate(R.layout.next_popup, null)

        val popupWindow = PopupWindow(
            popupView,
            500,
            150
        )

        popupWindow.isOutsideTouchable = true

        button.setOnClickListener {
            popupWindow.showAtLocation(button, Gravity.CENTER, 300, -100)
        }

    }
}