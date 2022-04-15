package com.sierra.lab03myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sierra.lab03myapplication.util.showToast

class ImageButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)
    }
    fun secondImageButton(view: android.view.View) {
        this.showToast("Marcianito")
    }
    fun firstImageButton(view: android.view.View) {
        this.showToast("Llamada")
    }
}