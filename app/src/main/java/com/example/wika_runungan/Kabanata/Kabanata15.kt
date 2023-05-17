package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata15Binding
import com.example.wika_runungan.databinding.ActivityKabanata9Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata15 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata15Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.paratang.setOnClickListener {
            how1()
        }

        binding.palyadong.setOnClickListener {
                palyado()
        }
    }

    private fun palyado() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.palyado))
        customDialog.show()
    }

    private fun how1() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.paratang))
        customDialog.show()
    }
}