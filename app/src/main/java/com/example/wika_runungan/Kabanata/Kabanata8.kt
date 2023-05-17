package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata7Binding
import com.example.wika_runungan.databinding.ActivityKabanata8Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata8 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.diskriminasyon.setOnClickListener {
            showDis()
        }
        binding.binagtas.setOnClickListener {
            showBinagtas()
        }
        binding.nanlumo.setOnClickListener {
            showNanlumo()
        }
        binding.pagkalugmok.setOnClickListener {
            showPagkalugmok()
        }
        binding.lulan.setOnClickListener {
            showLulan()
        }
        binding.naibsan.setOnClickListener {
            showNaibsan()
        }
    }

    private fun showNaibsan() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.naibsan))
        customDialog.show()

    }

    private fun showLulan() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.lulan))
        customDialog.show()

    }

    private fun showPagkalugmok() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.pagkalugmok))
        customDialog.show()

    }

    private fun showNanlumo() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.nanlumo))
        customDialog.show()

    }

    private fun showBinagtas() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.binagtas))
        customDialog.show()

    }

    private fun showDis() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.diskriminasyon))
        customDialog.show()

    }
}