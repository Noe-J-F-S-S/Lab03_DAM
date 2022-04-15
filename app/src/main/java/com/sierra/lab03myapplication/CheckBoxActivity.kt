package com.sierra.lab03myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_check_box.*

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        checkBox.isChecked = true

        if (checkBox.isChecked) Toast.makeText(this, "First checkbox is checked!", Toast.LENGTH_SHORT).show()
    }

    fun androidCheckBoxClicked(view: android.view.View) {
        // action for checkbox click
        when (view.id) {
            R.id.checkBox -> { Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show() }
        }
    }
    fun javaCheckBoxClicked(view: android.view.View) {
        // action for checkbox click
        when (view.id) {
            R.id.checkBox2 -> { Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show()}
        }
        when (view.id) {
            R.id.checkBox7 -> { Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show()}
        }
    }
    fun xmlCheckBoxClicked(view: android.view.View) {
        // action for checkbox click
        when (view.id) {
            R.id.checkBox3 -> { Toast.makeText(this, "XML", Toast.LENGTH_SHORT).show() }
        }
    }
    fun htmlCheckBoxClicked(view: android.view.View) {
        // action for checkbox click
        when (view.id) {
            R.id.checkBox4 -> { Toast.makeText(this, "HTML", Toast.LENGTH_SHORT).show() }
        }
    }
    fun cssCheckBoxClicked(view: android.view.View) {
        // action for checkbox click
        when (view.id) {
            R.id.checkBox5 -> { Toast.makeText(this, "CSS", Toast.LENGTH_SHORT).show() }
        }
    }
    fun jqueryCheckBoxClicked(view: android.view.View) {
        // action for checkbox click
        when (view.id) {
            R.id.checkBox6 -> { Toast.makeText(this, "JQuery", Toast.LENGTH_SHORT).show() }
        }
    }
    fun phpCheckBoxClicked(view: android.view.View) {
        // action for checkbox click
        when (view.id) {
            R.id.checkBox8 -> { Toast.makeText(this, "PHP", Toast.LENGTH_SHORT).show() }
        }
    }
    fun aspCheckBoxClicked(view: android.view.View) {
        // action for checkbox click
        when (view.id) {
            R.id.checkBox9 -> { Toast.makeText(this, "ASP", Toast.LENGTH_SHORT).show() }
        }
    }

}