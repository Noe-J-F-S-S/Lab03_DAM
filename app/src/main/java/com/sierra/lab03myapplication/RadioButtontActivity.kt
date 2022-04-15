package com.sierra.lab03myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.sierra.lab03myapplication.util.showToast
import kotlinx.android.synthetic.main.activity_radio_buttont.*

class RadioButtontActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_buttont)
    }

    fun radioButtonClicked(view: android.view.View) {
        when (view.id) {
            R.id.radioButton1 -> { if (radioButton1.isChecked) this.showToast("Relative layout is checked") }
        }
        when (view.id) {
            R.id.radioButton2 -> { if (radioButton2.isChecked) this.showToast("Linear layout is checked") }
        }
        when (view.id) {
            R.id.radioButton3 -> { if (radioButton3.isChecked) this.showToast("Frame layout is checked") }
        }
        when (view.id) {
            R.id.radioButton4 -> { if (radioButton4.isChecked) this.showToast("Table layout is checked") }
        }
        when (view.id) {
            R.id.radioButton5 -> { if (radioButton5.isChecked) this.showToast("Grid layout is checked") }
        }

    }

    fun answer(view: android.view.View) {
        if (radioGroup.isSelected) {
            this.showToast("You have select one option")
        } else {
            when (radioGroup.checkedRadioButtonId) {
                R.id.radioButton1 -> this.showToast("You selected Relative layout")
                R.id.radioButton2 -> this.showToast("You selected Linear layout")
                R.id.radioButton3 -> this.showToast("You selected Frame layout")
                R.id.radioButton4 -> this.showToast("You selected Table layout")
                R.id.radioButton5 -> this.showToast("You selected Grid layout ")
            }
        }
    }
}