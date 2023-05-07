package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata4Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata4 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nabatid.setOnClickListener {
            showNabatid()
        }
        binding.tiyak.setOnClickListener {
            showTiyak()
        }
        binding.napadpad.setOnClickListener {
            showNapadpad()
        }
        binding.inilaan.setOnClickListener {
            showInilaan()
        }
        binding.Naisalaysay.setOnClickListener {
            showNaisalaysay()
        }
        binding.sinapit.setOnClickListener {
            showSinapit()
        }
        binding.pinaratang.setOnClickListener {
            showPinaratang()
        }
    }

    private fun showPinaratang() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.pinaratang))
        customDialog.show()
    }

    private fun showSinapit() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.sinapit))
        customDialog.show()
    }

    private fun showNaisalaysay() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.naisalaylay))
        customDialog.show()
    }

    private fun showInilaan() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.inilaan))
        customDialog.show()
    }

    private fun showNapadpad() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.napadpad))
        customDialog.show()
    }

    private fun showTiyak() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.tiyak))
        customDialog.show()
    }

    private fun showNabatid() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.nabatid))
        customDialog.show()
    }
}