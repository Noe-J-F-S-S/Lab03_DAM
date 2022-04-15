package com.sierra.lab03myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class TimePickerActivity : AppCompatActivity() {
    private var timePicker: TimePicker? = null
    private var displayTime: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)
        displayTime = findViewById<View>(R.id.textView) as TextView
        timePicker = findViewById<View>(R.id.timePicker) as TimePicker
        timePicker!!.setIs24HourView(true)
        timePicker!!.setOnTimeChangedListener { view, hourOfDay, minute ->
            displayTime!!.text = "Time: $hourOfDay:$minute"
        }

        // Optional: Set current time (Android time)
        val now = Calendar.getInstance()
        val hour = now[Calendar.HOUR_OF_DAY]
        val minute = now[Calendar.MINUTE]
        // This method was deprecated in API level 23. Use setHour() and setMinute()
        timePicker!!.currentHour = hour
        timePicker!!.currentMinute = minute
    }

    fun pick(view: View?) {
        // This method was deprecated in API level 23. Use getHour() and getMinute()
        displayTime!!.text =
            "Picked: " + timePicker!!.currentHour + ":" + timePicker!!.currentMinute
    }
}
