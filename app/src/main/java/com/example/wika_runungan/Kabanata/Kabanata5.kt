package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata5Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata5 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kalesa.setOnClickListener {
            showKalesa()
        }
        binding.balisang.setOnClickListener {
            showBalisa()
        }
        binding.kalunosLunos.setOnClickListener {
            showKalunosLunos()
        }
        binding.kubyertos.setOnClickListener {
            showKubyertos()
        }
        binding.orkestra.setOnClickListener {
            showOrkestra()
        }
        binding.pastol.setOnClickListener {
            showPastol()
        }
        binding.pumukaw.setOnClickListener {
            showPumukaw()
        }
        binding.Nabighani.setOnClickListener {
            showNabighani()
        }
        binding.maiwaglit.setOnClickListener {
            showMaiwaglit()
        }
        binding.Pransiskano.setOnClickListener {
            showPransiskano()
        }
        binding.nahabag.setOnClickListener {
            showNahabag()
        }
    }

    private fun showNahabag() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.nahabag))
        customDialog.show()
    }

    private fun showPransiskano() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.pransiskano))
        customDialog.show()
    }

    private fun showMaiwaglit() {
//binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.maiwaglit))
        customDialog.show()
    }

    private fun showNabighani() {
//binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.nabighani))
        customDialog.show()
    }

    private fun showPumukaw() {
//binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.pumukaw))
        customDialog.show()
    }

    private fun showPastol() {
//binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.pastol))
        customDialog.show()
    }

    private fun showOrkestra() {
//binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.orkestra))
        customDialog.show()
    }

    private fun showKubyertos() {
//binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.kubyertos))
        customDialog.show()
    }

    private fun showKalunosLunos() {
//binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.kalunos))
        customDialog.show()
    }

    private fun showBalisa() {
//binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.balisa))
        customDialog.show()
    }

    private fun showKalesa() {
//binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.kalesa))
        customDialog.show()
    }
}