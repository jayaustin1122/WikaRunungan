package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata7Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata7 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.aligaga.setOnClickListener {
            showAligaga()
        }

        binding.magsing.setOnClickListener {
            showMag()
        }

        binding.ginugol.setOnClickListener {
            showGin()
        }

        binding.musmos.setOnClickListener {
            showMus()
        }

        binding.pakikipagsapalaran.setOnClickListener {
            showPakikipag()
        }

        binding.Isinumbat.setOnClickListener {
            showIsinumbat()
        }
    }

    private fun showIsinumbat() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.isinumbat))
        customDialog.show()
    }

    private fun showPakikipag() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.sapalaran))
        customDialog.show()    }

    private fun showMus() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.musmos))
        customDialog.show()    }

    private fun showGin() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.ginugol))
        customDialog.show()    }

    private fun showMag() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.magsing))
        customDialog.show()    }

    private fun showAligaga() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.aligaga))
        customDialog.show()    }
}