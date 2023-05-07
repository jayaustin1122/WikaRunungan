package com.example.wika_runungan.Kabanata

import android.annotation.SuppressLint
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.AboutAppBinding
import com.example.wika_runungan.databinding.ActivityKabanata1Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata1 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.magarbong.setOnClickListener {
            showMagarbo()
        }
        binding.dumagsa.setOnClickListener {
            showDumagsa()
        }
        binding.iniistima.setOnClickListener {
            showIniistima()
        }
        binding.Indio.setOnClickListener {
            showIndio()
        }
        binding.monopolyo.setOnClickListener {
            showMonnopolyp()
        }
        binding.hinamak.setOnClickListener {
            showHinamak()
        }
        binding.kuraparoko.setOnClickListener {
            showKura()
        }
        binding.parokya.setOnClickListener {
            showParokya()
        }
        binding.marangal.setOnClickListener {
            showMaranagal()
        }
        binding.erehe.setOnClickListener {
            showErehe()
        }
        binding.umpukan.setOnClickListener {
            showUmpukan()
        }

    }

    private fun showUmpukan() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.umpukan))
        customDialog.show()
    }

    private fun showErehe() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.erehe))
        customDialog.show()
    }

    private fun showMaranagal() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.marangal))
        customDialog.show()
    }

    private fun showParokya() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.parokya))
        customDialog.show()
    }

    private fun showKura() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.kuraParoko))
        customDialog.show()
    }

    private fun showHinamak() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.hinamak))
        customDialog.show()
    }

    private fun showMonnopolyp() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.monopolyo))
        customDialog.show()
    }

    private fun showIndio() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.indio))
        customDialog.show()
    }

    private fun showIniistima() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.inistima))
        customDialog.show()
    }

    private fun showDumagsa() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.dumagsa))
        customDialog.show()
    }

    @SuppressLint("SetTextI18n")
    private fun showMagarbo() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.magarbo))
        customDialog.show()
    }
}