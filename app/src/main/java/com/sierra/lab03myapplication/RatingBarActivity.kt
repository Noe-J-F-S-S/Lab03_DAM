package com.sierra.lab03myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sierra.lab03myapplication.util.showToast
import kotlinx.android.synthetic.main.activity_rating_bar.*

class RatingBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)
    }

    fun rateSubmit(view: android.view.View) {
        ratingDisplay.text = "Rate ${ratingBar.rating}"
        this.showToast("Rate ${ratingBar.rating}")
    }
}