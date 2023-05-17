package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata7Binding
import com.example.wika_runungan.databinding.ActivityKabanata9Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata9 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata9Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.gobernadorcillo.setOnClickListener {
            showAS()
        }
    }

    private fun showAS() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.gobernadorcillo))
        customDialog.show()
    }
}