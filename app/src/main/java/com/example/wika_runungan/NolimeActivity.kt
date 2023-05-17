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
import com.example.wika_runungan.Kabanata.*
import com.example.wika_runungan.adapters.NoliAdapter
import com.example.wika_runungan.data.Noli
import com.example.wika_runungan.databinding.AboutAppBinding
import com.example.wika_runungan.databinding.ActivityHolderBinding

import java.util.*
import kotlin.collections.ArrayList

class NolimeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHolderBinding
    lateinit var adapter : NoliAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHolderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var kabanataLists = mutableListOf<Noli>(
            Noli("KABANATA 1: ISANG PAGTITIPON",R.drawable.chapter_one),
            Noli("KABANATA 2: SI CRISOSTOMO IBARRA",R.drawable.chapter_two),
            Noli("KABANATA 3: ANG HAPUNAN",R.drawable.hapunan),
            Noli("KABANATA 4: EREHE AT PILIBUSTERO",R.drawable.erehe),
            Noli("KABANATA 5: PANGARAP SA GABING MADILIM",R.drawable.pangarap),
            Noli("KABANATA 6: SI KAPITAN TIYAGO",R.drawable.kapitan),
            Noli("KABANATA 7: SUYUAN SA ISANG ASOTEA",R.drawable.seven),
            Noli("KABANATA 8: MGA ALAALA",R.drawable.alaala),
            Noli("KABANATA 9: MGA BAGAY-BAGAY SA PALIGID",R.drawable.nine),
            Noli("KABANATA 10: ANG BAYAN NG SAN DIEGO",R.drawable.ten),
            Noli("KABANATA 11: MGA HARI-HARIAN",R.drawable.eleven),
            Noli("KABANATA 12: TODOS LOS SANTOS (ARAW NG MGA PATAY)",R.drawable.patay),
            Noli("KABANATA 13: MGA BABALA NG BAGYO",R.drawable.terteen),
            Noli("KABANATA 14: SI TASYO: PILOSOPO O BALIW?",R.drawable.loloko2),
            Noli("KABANATA 15: ANG MGA SAKRISTAN",R.drawable.sakristan)

        )
        binding.about.setOnClickListener {
            openAbout()
        }
        adapter = NoliAdapter(this,kabanataLists){ position ->
            if (position == 0){
                val intent = Intent(this, Kabanata1::class.java)
                startActivity(intent)
            }
            else if (position == 1){
                val intent = Intent(this, Kabanata2::class.java)
                startActivity(intent)
            }
            else if (position == 2){
                val intent = Intent(this, Kabanata3
                ::class.java)
                startActivity(intent)
            }
            else if (position == 3){
                val intent = Intent(this, Kabanata4
                ::class.java)
                startActivity(intent)
            }
            else if (position == 4){
                val intent = Intent(this, Kabanata5
                ::class.java)
                startActivity(intent)
            }
            else if (position == 5){
                val intent = Intent(this, Kabanata6
                ::class.java)
                startActivity(intent)
            }
            else if (position == 6){
                val intent = Intent(this, Kabanata7
                ::class.java)
                startActivity(intent)
            }
            else if (position == 7){
                val intent = Intent(this, Kabanata8
                ::class.java)
                startActivity(intent)
            }
            else if (position == 8){
                val intent = Intent(this, Kabanata9
                ::class.java)
                startActivity(intent)
            }
            else if (position == 9){
                val intent = Intent(this, Kabanata10
                ::class.java)
                startActivity(intent)
            }
            else if (position == 10){
                val intent = Intent(this, Kabanata11
                ::class.java)
                startActivity(intent)
            }
            else if (position == 11){
                val intent = Intent(this, Kabanata12
                ::class.java)
                startActivity(intent)
            }
            else if (position == 12){
                val intent = Intent(this, Kabanata13
                ::class.java)
                startActivity(intent)
            }
            else if (position == 13){
                val intent = Intent(this, Kabanata14
                ::class.java)
                startActivity(intent)
            }
            else if (position == 14){
                val intent = Intent(this, Kabanata15
                ::class.java)
                startActivity(intent)
            }
        }
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.searchEt2.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                val searchList = ArrayList<Noli>()

                if (newText!=null){
                    for (i in kabanataLists){
                        if (i.title.lowercase(Locale.ROOT).contains(newText)){
                            searchList.add(i)
                        }
                        else if (i.title.capitalize(Locale.ROOT).contains(newText)){
                            searchList.add(i)
                        }
                    }
                    if (searchList.isEmpty()){
                    }
                    else{
                        adapter.onApplySearch(searchList)
                    }
                }
                return true
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