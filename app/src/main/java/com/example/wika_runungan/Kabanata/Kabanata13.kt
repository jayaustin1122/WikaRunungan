package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata13Binding
import com.example.wika_runungan.databinding.ActivityKabanata9Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata13 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.labi.setOnClickListener {
            showLabi()
        }
        binding.nilapastangan.setOnClickListener {
            nilapastangan()
        }
        binding.kinompronta.setOnClickListener {
            showkino()
        }
    }

    private fun showkino() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.kinompronta))
        customDialog.show()
    }

    private fun nilapastangan() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.nilapastangan))
        customDialog.show()
    }

    private fun showLabi() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.labi))
        customDialog.show()
    }
}