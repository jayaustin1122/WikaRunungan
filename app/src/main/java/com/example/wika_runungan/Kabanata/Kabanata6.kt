package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata6Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata6 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lohika.setOnClickListener {
            showLohika()
        }
        binding.Dominikong.setOnClickListener {
            showDomi()
        }
        binding.tipikal.setOnClickListener {
            showTipikal()
        }
        binding.Indio.setOnClickListener {
            showIndio()
        }
        binding.prominenteng.setOnClickListener {
            showPromi()
        }
        binding.Sagrado.setOnClickListener {
            showSagrado()
        }
        binding.deboto.setOnClickListener {
            showDeboto()
        }
        binding.kabiyak.setOnClickListener {
            showKabiyak()
        }

    }

    private fun showKabiyak() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.Kabiyak))
        customDialog.show()


    }

    private fun showDeboto() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.Deboto))
        customDialog.show()


    }

    private fun showSagrado() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.Sagrado))
        customDialog.show()


    }

    private fun showPromi() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.Prominente))
        customDialog.show()


    }

    private fun showIndio() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.Indio))
        customDialog.show()


    }

    private fun showTipikal() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.Tipikal))
        customDialog.show()


    }

    private fun showDomi() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.Dominikano))
        customDialog.show()


    }

    private fun showLohika() {

            //binding the dialog xml
            val customDialog: Dialog = Dialog(this)
            var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
            customDialog.setContentView(dialogBinding.root)
            dialogBinding.dialog.setText(getString(R.string.Lohika))
            customDialog.show()


    }
}