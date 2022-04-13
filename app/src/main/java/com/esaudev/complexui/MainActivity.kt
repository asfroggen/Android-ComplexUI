package com.esaudev.complexui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import com.esaudev.complexui.ui.component.CanvasView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myCanvasView = CanvasView(this)
        myCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(myCanvasView)
    }
}