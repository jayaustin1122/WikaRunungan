package com.example.wika_runungan.adapters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wika_runungan.DetailActivity
import com.example.wika_runungan.R
import com.example.wika_runungan.data.Glosary
import com.example.wika_runungan.databinding.ActivityGlosaryBinding
import java.util.*
import kotlin.collections.ArrayList

class GlosaryActivity : AppCompatActivity() {
    private lateinit var binding : ActivityGlosaryBinding
    lateinit var adapter : GlosaryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlosaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var lists = mutableListOf<Glosary>(
            Glosary("Magarbo",getString(R.string.magarbo)),
            Glosary("Dumagsa",getString(R.string.dumagsa)),
            Glosary("Inistima",getString(R.string.inistima)),
            Glosary("Indio",getString(R.string.Indio)),
            Glosary("Monopolyo",getString(R.string.monopolyo)),
              Glosary("Hinamak",getString(R.string.hinamak)),
            Glosary("Kura-paroko",getString(R.string.kuraParoko)),
            Glosary("Parokya",getString(R.string.parokya)),
            Glosary("Marangal",getString(R.string.marangal)),
            Glosary("Erehe",getString(R.string.erehe)),
            Glosary("Umpukan",getString(R.string.umpukan)),
            Glosary("Tinangka",getString(R.string.tinangka)),
            Glosary("Nagmamasid",getString(R.string.nagmamasid)),
            Glosary("Ikinagagalak",getString(R.string.ikinagagalak)),
            Glosary("Napawi",getString(R.string.napawi)),
            Glosary("Hinala",getString(R.string.hinala)),
            Glosary("Dinaluhan",getString(R.string.dinaluhan)),
            Glosary("Banas",getString(R.string.banas)),
            Glosary("Pagmamasid",getString(R.string.pagmamasid)),
            Glosary("Kabisera",getString(R.string.kabisera)),
            Glosary("Panauhin",getString(R.string.panauhin)),
            Glosary("Pakikipagsapalaran",getString(R.string.pakikipagsapalaran)),
            Glosary("Nabatid",getString(R.string.nabatid)),
            Glosary("Tiyak",getString(R.string.tiyak)),
            Glosary("Napadpad",getString(R.string.napadpad)),
            Glosary("Inilaan",getString(R.string.inilaan)),
            Glosary("Naisalaysay",getString(R.string.naisalaylay)),
            Glosary("sinapit",getString(R.string.sinapit)),
            Glosary("Pinaratang",getString(R.string.pinaratang)),
            Glosary("Kalesa",getString(R.string.kalesa)),
            Glosary("Balisa",getString(R.string.balisa)),
            Glosary("Kalunos-lunos",getString(R.string.kalunos)),
            Glosary("Kubyertos",getString(R.string.kubyertos)),
            Glosary("Orkestra",getString(R.string.orkestra)),
            Glosary("Pastol",getString(R.string.pastol)),
            Glosary("Pumukaw",getString(R.string.pumukaw)),
            Glosary("Nabighani",getString(R.string.nabighani)),
            Glosary("Maiwaglit",getString(R.string.maiwaglit)),
            Glosary("Pransiskano",getString(R.string.pransiskano)),
            Glosary("Nahabag",getString(R.string.nahabag)),
            Glosary("Lohika",getString(R.string.Lohika)),
            Glosary("Dominikano",getString(R.string.Dominikano)),
            Glosary("Tipikal",getString(R.string.Tipikal)),
            Glosary("Prominente",getString(R.string.Prominente)),
            Glosary("Sagrado",getString(R.string.Sagrado)),
            Glosary("Deboto",getString(R.string.Deboto)),
            Glosary("Kabiyak",getString(R.string.Kabiyak)),
            Glosary("Magsing-irog",getString(R.string.magsing)),
            Glosary("Ginugol",getString(R.string.ginugol)),
            Glosary("Musmos",getString(R.string.musmos)),

            Glosary("Isinumbat",getString(R.string.isinumbat)),
            Glosary("Diskriminasyon",getString(R.string.diskriminasyon)),
            Glosary("Pagkalugmok",getString(R.string.pagkalugmok)),
            Glosary("Lulan",getString(R.string.lulan)),
            Glosary("Binagtas",getString(R.string.binagtas)),
            Glosary("Nanlumo",getString(R.string.nanlumo)),
            Glosary("Naibsan",getString(R.string.naibsan)),
            Glosary("Gobernadorcillo",getString(R.string.gobernadorcillo)),
            Glosary("Nagpatiwakal",getString(R.string.nagpatiwakal)),
            Glosary("Haka-haka",getString(R.string.hakahaka)),
            Glosary("Umusbong",getString(R.string.umusbong)),
            Glosary("Awtoridad",getString(R.string.awtoridad)),
            Glosary("Guwardiya Sibil",getString(R.string.guwardiyasibil)),
            Glosary("Hidwaan",getString(R.string.hidwaan)),
            Glosary("Sepulturero",getString(R.string.sepulturero)),
            Glosary("Nagampanan",getString(R.string.nagampanan)),
            Glosary("Labi",getString(R.string.labi)),
            Glosary("Kinompronta",getString(R.string.kinompronta)),
            Glosary("Nilapastangan",getString(R.string.nilapastangan)),
            Glosary("Delubyo",getString(R.string.delubyo)),
            Glosary("Hinagpis",getString(R.string.hinagpis)),
            Glosary("Purgatoryo",getString(R.string.purgatoryo)),
            Glosary("Nangngingitngit",getString(R.string.nangngingitngit)),
            Glosary("Paratang",getString(R.string.paratang)),
            Glosary("Palyado",getString(R.string.palyado)),
            )

        binding.searchEt2.clearFocus()
        adapter = GlosaryAdapter(lists)
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(this)
        lists.sortBy{
            it.title
        }
        adapter.onItemClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("title",it.title)
            intent.putExtra("code",it.description)
            Toast.makeText(this, it.title, Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        binding.searchEt2.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                val searchList = ArrayList<Glosary>()

                if (newText!=null){
                    for (i in lists){
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
}