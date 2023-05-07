package com.example.wika_runungan.Kabanata

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.R
import com.example.wika_runungan.databinding.ActivityKabanata3Binding
import com.example.wika_runungan.databinding.DialogBinding

class Kabanata3 : AppCompatActivity() {
    private lateinit var binding : ActivityKabanata3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKabanata3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dinaluhan.setOnClickListener {
            showDinaluhan()
        }
        binding.banas.setOnClickListener {
            showBanas()
        }
        binding.pagmamasid.setOnClickListener {
            showPagmamasid()
        }
        binding.kabisera.setOnClickListener {
            showKabisera()
        }
        binding.panauhin.setOnClickListener {
            showPanauhin()
        }
        binding.pakikipagsapalaran.setOnClickListener {
            showPakikipagsapalaran()
        }
    }

    private fun showPakikipagsapalaran() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.pakikipagsapalaran))
        customDialog.show()
    }

    private fun showPanauhin() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.panauhin))
        customDialog.show()
    }

    private fun showKabisera() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.kabisera))
        customDialog.show()
    }

    private fun showPagmamasid() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.pagmamasid))
        customDialog.show()
    }

    private fun showBanas() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.banas))
        customDialog.show()
    }

    private fun showDinaluhan() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.dinaluhan))
        customDialog.show()
    }
}