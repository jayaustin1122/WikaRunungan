package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata11Binding
import com.example.wika_runungan.databinding.ActivityKabanata9Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata11 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata11Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.awtoridad.setOnClickListener {
            awto()
        }
        binding.guwardiyasibil.setOnClickListener {
            guardia()
        }
        binding.hidwaan.setOnClickListener {
            hidwaan()
        }
    }

    private fun hidwaan() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.hidwaan))
        customDialog.show()
    }

    private fun guardia() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.guwardiyasibil))
        customDialog.show()
    }

    private fun awto() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.awtoridad))
        customDialog.show()
    }
}