package com.sierra.lab03myapplication

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sierra.lab03myapplication.util.showToast

class SimpleDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_dialog)
    }

    fun showDialog(view: android.view.View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Titulo del alertDialog")
        builder.setMessage("Message")
            .setNegativeButton("Negative Button",
                DialogInterface.OnClickListener { dialog, id ->
                    this.showToast("Click Negative Button")
                })
        // Create the AlertDialog object and return it
        builder.create()

        builder.show()

    }
}