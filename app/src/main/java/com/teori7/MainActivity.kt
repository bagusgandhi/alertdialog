package com.teori7

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun alertOnclick(view: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Keluar")
        builder.setMessage("Yakin Ingin Keluar dari Anggota?")
        builder.setPositiveButton("Ya", { dialogInterface: DialogInterface, i: Int -> finish()
        })
        builder.setNegativeButton("Tidak", { dialogInterface: DialogInterface, i: Int -> })
        builder.show()
    }
}