package com.sierra.lab03myapplication

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar


class SnackbarActivity : AppCompatActivity() {
    private var rootLayout: CoordinatorLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.CoordinatorLayout)
        rootLayout = findViewById<View>(R.id.coordinatorLayout) as CoordinatorLayout
    }

    fun showSnackbar(view: View?) {
        val snackbar = Snackbar.make(
            rootLayout!!,
            "Hello, I am Android Snackbar!",
            Snackbar.LENGTH_LONG
        ) // Snackbar message
        snackbar.setAction("Undo", object : OnClickListener() {
            //Snackbar action text
            fun onClick(v: View?) {
                Toast.makeText(applicationContext, "Undo proccess!", Toast.LENGTH_SHORT).show()
            }
        })
        snackbar.show()
    }
}
