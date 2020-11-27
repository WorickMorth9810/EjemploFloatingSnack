package com.example.ejemplofloatingsnack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var miCoordinator: CoordinatorLayout
    lateinit var txtVentana:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtVentana=findViewById(R.id.txt_letrero)
        var buttonFab: FloatingActionButton=findViewById(R.id.fab_op1)

        miCoordinator=findViewById(R.id.Zawardo)

        buttonFab.setOnClickListener {
            txtVentana.text="Se Presiono"
            sendSnackbar()
        }
    }

    fun sendSnackbar(){
        Snackbar.make(miCoordinator,"Se Presiono", Snackbar.LENGTH_SHORT)
            .setAction("toki yo tomare", View.OnClickListener {
                txtVentana.text="toki wa ugokidasu"
            })
            .show()
    }
}