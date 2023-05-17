package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata12Binding
import com.example.wika_runungan.databinding.ActivityKabanata13Binding
import com.example.wika_runungan.databinding.ActivityKabanata9Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata12 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata12Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sepultorero.setOnClickListener {
            sho1()
        }
        binding.nagampanan.setOnClickListener {
            sho2()
        }
    }

    private fun sho2() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.sepulturero))
        customDialog.show()
    }

    private fun sho1() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.nagampanan))
        customDialog.show()
    }
}