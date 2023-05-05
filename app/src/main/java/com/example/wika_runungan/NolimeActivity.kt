package com.example.wika_runungan

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wika_runungan.adapters.NoliAdapter
import com.example.wika_runungan.data.Noli
import com.example.wika_runungan.databinding.AboutAppBinding
import com.example.wika_runungan.databinding.ActivityHolderBinding
import com.example.wika_runungan.fragments.GlosaryoFragment
import com.example.wika_runungan.fragments.KabanataFragments
import com.google.android.material.tabs.TabLayout
import java.util.*
import kotlin.collections.ArrayList

class NolimeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHolderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHolderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragmentOne = KabanataFragments()
        val fragmentTwo = GlosaryoFragment()
        binding.about.setOnClickListener {
            openAbout()
        }
        // to call the initial fragment display in screen
        supportFragmentManager.beginTransaction().apply {
            replace(binding.fragmentMain.id,fragmentOne)
            commit()
        }
        // to bind the table layout in buttons navigations
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            //implement functions
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab?.position==0){
                    //accessing button 1 tab
                    supportFragmentManager.beginTransaction().apply {
                        replace(binding.fragmentMain.id,fragmentOne)
                        // creating a backstack
                        addToBackStack(null)
                        commit()
                    }
                }else if (tab?.position==1) {
                    //accessing button 2
                    supportFragmentManager.beginTransaction().apply {
                        replace(binding.fragmentMain.id, fragmentTwo)
                        // creating a backstack
                        addToBackStack(null)
                        commit()
                    }
                }
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }
    private fun openAbout() {
//binding the dialog xml
        val customDialog: Dialog = Dialog(this)
        var dialogBinding : AboutAppBinding = AboutAppBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        customDialog.show()
    }
}