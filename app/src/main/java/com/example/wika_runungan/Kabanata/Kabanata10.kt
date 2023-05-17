package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata10Binding
import com.example.wika_runungan.databinding.ActivityKabanata7Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata10 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata10Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.nagpatiwakal.setOnClickListener {
            nagpatiwakal()
        }
        binding.hakahaka.setOnClickListener {
            haka()
        }
        binding.umusbong.setOnClickListener {
            umusbong()
        }
    }

    private fun umusbong() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.umusbong))
        customDialog.show()
    }

    private fun haka() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.hakahaka))
        customDialog.show()
    }

    private fun nagpatiwakal() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.nagpatiwakal))
        customDialog.show()
    }
}