package com.example.aa2_ahorcado

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<ConstraintLayout>(R.id.main)

        // Configurar listener para detectar cualquier toque en la pantalla
        mainLayout.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                goToLevelSelector()
                true
            } else {
                false
            }
        }
    }

    private fun goToLevelSelector() {
        val intent = Intent(this, LevelSelectorActivity::class.java)
        startActivity(intent)
        finish()
    }
}