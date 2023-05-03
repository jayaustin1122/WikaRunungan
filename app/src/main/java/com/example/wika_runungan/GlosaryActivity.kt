package com.example.wika_runungan

import android.R
import android.os.Bundle
import android.text.Spannable
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.wika_runungan.databinding.ActivityGlosaryBinding


class GlosaryActivity : AppCompatActivity() {
    private lateinit var binding : ActivityGlosaryBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlosaryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val textView = binding.text12
        val spannable = textView.text as Spannable

        val clickableSpan: ClickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {

            }
        }

        spannable.setSpan(clickableSpan,spannable.toString().indexOf("clickable word"),spannable.toString().indexOf("clickable word") + "clickable word".length,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.movementMethod = LinkMovementMethod.getInstance()
    }


}