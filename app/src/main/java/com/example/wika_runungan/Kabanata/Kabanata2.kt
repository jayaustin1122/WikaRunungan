package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata2Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata2 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tinangkang.setOnClickListener {
            showTinangka()
        }
        binding.nagmamasid.setOnClickListener {
            showNagmamasid()
        }
        binding.ikinagagalak.setOnClickListener {
            showIkinagagalak()
        }
        binding.napawi.setOnClickListener {
            showNapawi()
        }
        binding.hinala.setOnClickListener {
            showHinala()
        }
    }

    private fun showHinala() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.hinala))
        customDialog.show()
    }

    private fun showNapawi() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.napawi))
        customDialog.show()
    }

    private fun showIkinagagalak() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.ikinagagalak))
        customDialog.show()
    }

    private fun showNagmamasid() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.nagmamasid))
        customDialog.show()
    }

    private fun showTinangka() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.tinangka))
        customDialog.show()
    }
}