package com.example.wika_runungan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wika_runungan.adapters.NoliAdapter
import com.example.wika_runungan.data.Noli
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
            Noli("KABANATA 3: ANG HAPUNAN",R.drawable.kabanataone),
            Noli("KABANATA 4: EREHE AT PILIBUSTERO",R.drawable.kabanataone),
            Noli("KABANATA 5: PANGARAP SA GABING MADILIM",R.drawable.kabanataone),
            Noli("KABANATA 6: SI KAPITAN TIYAGO",R.drawable.kabanataone),
            Noli("KABANATA 7: SUYUAN SA ISANG ASOTEA",R.drawable.kabanataone),
            Noli("KABANATA 8: MGA ALAALA",R.drawable.kabanataone),
            Noli("KABANATA 9: MGA BAGAY-BAGAY SA PALIGID",R.drawable.kabanataone),
            Noli("KABANATA 10: ANG BAYAN NG SAN DIEGO",R.drawable.kabanataone),
            Noli("KABANATA 11: MGA HARI-HARIAN",R.drawable.kabanataone),
            Noli("KABANATA 12: TODOS LOS SANTOS (ARAW NG MGA PATAY)",R.drawable.kabanataone),
            Noli("KABANATA 13: MGA BABALA NG BAGYO",R.drawable.kabanataone),
            Noli("KABANATA 14: SI TASYO: PILOSOPO O BALIW?",R.drawable.kabanataone),
            Noli("KABANATA 15: ANG MGA SAKRISTAN",R.drawable.kabanataone),
            Noli("KABANATA 16: SI SISA",R.drawable.kabanataone),
            Noli("KABANATA 17: SI BASILIO",R.drawable.kabanataone),
            Noli("KABANATA 18: MGA KALULUWANG NAGHIHIRAP",R.drawable.kabanataone),
            Noli("KABANATA 19: MGA KAPALARAN NG ISANG GURO",R.drawable.kabanataone),
            Noli("KABANATA 20: ANG PULONG SA TRIBUNAL",R.drawable.kabanataone),
            Noli("KABANATA 21: KWENTO NG ISANG INA",R.drawable.kabanataone),
            Noli("KABANATA 22: MGA LIWANAG AT MGA ANINO",R.drawable.kabanataone),
            Noli("KABANATA 23: ANG PANGINGISDA",R.drawable.kabanataone),
            Noli("KABANATA 24: SA GUBAT",R.drawable.kabanataone),
            Noli("KNK: ELIAS AT SALOME",R.drawable.kabanataone),
            Noli("KABANATA 25: SA BAHAY NG PILOSOPO",R.drawable.kabanataone),
            Noli("KABANATA 26: BISPERAS NG PISTA",R.drawable.kabanataone),
            Noli("KABANATA 27: SA TAKIPSILIM",R.drawable.kabanataone),
            Noli("KABANATA 28: MGA LIHAM",R.drawable.kabanataone),
            Noli("KABANATA 29: KINAUMAGAHAN",R.drawable.kabanataone),
            Noli("KABANATA 30: SA LOOB NG SIMBAHAN",R.drawable.kabanataone),
            Noli("KABANATA 31: ANG SERMON",R.drawable.kabanataone),
            Noli("KABANATA 32: ANG KABRIYA",R.drawable.kabanataone),
            Noli("KABANATA 33: MALAYANG PAG-IISIP",R.drawable.kabanataone),
            Noli("KABANATA 34: ANG TANGHALIAN",R.drawable.kabanataone),
            Noli("KABANATA 35: USAP-USAPAN",R.drawable.kabanataone),
            Noli("KABANATA 36: UNANG ULAP",R.drawable.kabanataone),
            Noli("KABANATA 37: ANG KANIYANG KATAAS-TAASAN",R.drawable.kabanataone),
            Noli("KABANATA 38: ANG PRUSISYON",R.drawable.kabanataone),
            Noli("KABANATA 39: SI DONYA CONSOLACION",R.drawable.kabanataone),
            Noli("KABANATA 40: KARAPATAN AT KAPANGYARIHAN",R.drawable.kabanataone),
            Noli("KABANATA 41: DALAWANG PANAUHIN",R.drawable.kabanataone),
            Noli("KABANATA 42: ANG MAG-ASAWANG DE ESPADAÑA",R.drawable.kabanataone),
            Noli("KABANATA 43: MGA BALAK",R.drawable.kabanataone),
            Noli("KABANATA 44: PAGSUSURI NG BUDHI",R.drawable.kabanataone),
            Noli("KABANATA 45: MGA INUUSIG",R.drawable.kabanataone),
            Noli("KABANATA 46: ANG SABUNGAN SA SAN DIEGO",R.drawable.kabanataone),
            Noli("KABANATA 47: ANG DALAWANG SENYORA",R.drawable.kabanataone),
            Noli("KABANATA 48: HIWAGA",R.drawable.kabanataone),
            Noli("KABANATA 49: TINIG NG MGA INUUSIG",R.drawable.kabanataone),
            Noli("KABANATA 50: UGAT NI ELIAS",R.drawable.kabanataone),
            Noli("KABANATA 51: MGA PALITAN AT PAGBABAGO",R.drawable.kabanataone),
            Noli("KABANATA 52: BARAHA NG MGA PATAY AT ANG MGA ANINO",R.drawable.kabanataone),
            Noli("KABANATA 53: ANG MABUTING ARAW AY NAKIKILALA SA UMAGA",R.drawable.kabanataone),
            Noli("KABANATA 54: (PAGBUBUNYAG)",R.drawable.kabanataone),
            Noli("KABANATA 55: MALAKING SAKUNA",R.drawable.kabanataone),
            Noli("KABANATA 56: SABI-SABI AT KURO-KURO",R.drawable.kabanataone),
            Noli("KABANATA 57: VAE VICTIS! (AY, ANG MGA NATALO!)",R.drawable.kabanataone),
            Noli("KABANATA 58: ISINUMPA",R.drawable.kabanataone),
            Noli("KABANATA 59: PAMBAYAN AT MGA PANSARILING KAPAKANAN",R.drawable.kabanataone),
            Noli("KABANATA 60: IKAKASAL SI MARIA CLARA",R.drawable.kabanataone),
            Noli("KABANATA 61: PAGTAKAS HANGGANG LAWA",R.drawable.kabanataone),
            Noli("KABANATA 62: NAGPALIWANAG SI PADRE DAMASO",R.drawable.kabanataone),
            Noli("KABANATA 63: NOCHE BUENA",R.drawable.kabanataone),
            Noli("KABANATA 64: EPILOGO",R.drawable.kabanataone),
            )
        adapter = NoliAdapter(kabanataLists)
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

}