package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata14Binding
import com.example.wika_runungan.databinding.ActivityKabanata9Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata14 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata14Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.delubyo.setOnClickListener {
            showDelubyo()
        }
        binding.hinagpis.setOnClickListener {
            showHinagpis()
        }
        binding.purgatoryo.setOnClickListener {
            showPur()
        }
        binding.nagngingitngit.setOnClickListener {
            showNag()
        }
    }

    private fun showNag() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.nangngingitngit))
        customDialog.show()
    }

    private fun showPur() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.purgatoryo))
        customDialog.show()
    }

    private fun showHinagpis() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.hinagpis))
        customDialog.show()
    }

    private fun showDelubyo() {
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.delubyo))
        customDialog.show()
    }
}