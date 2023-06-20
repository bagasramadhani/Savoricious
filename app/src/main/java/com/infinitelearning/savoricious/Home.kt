package com.infinitelearning.savoricious

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.infinitelearning.savoricious.adapter.BahanAdapter
import com.infinitelearning.savoricious.adapter.IsiNotifAdapter
import com.infinitelearning.savoricious.adapter.PopulerAdapter
import com.infinitelearning.savoricious.databinding.FragmentHomeBinding
import com.infinitelearning.savoricious.model.ModelBahan
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.card_item.view.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class Home : Fragment() {


    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        
    }

    lateinit var rvbahan :  RecyclerView
    private lateinit var recyclerView: RecyclerView
    private lateinit var populerList : ArrayList<Populer>
    private lateinit var populerAdapter: PopulerAdapter

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
        
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        binding = FragmentHomeBinding.inflate(layoutInflater)

        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.HORIZONTAL
        rvbahan = view.findViewById(R.id.recyclerView5)

        val adapterbahan = BahanAdapter(ArrayBahan,activity)
        rvbahan.setHasFixedSize(true)
        rvbahan.layoutManager = lm
        rvbahan.adapter = adapterbahan


        //
//
//        val ln = LinearLayoutManager(activity)
//        ln.orientation = LinearLayoutManager.HORIZONTAL
//        rvbahan = view.findViewById(R.id.rv_populer)
//
//        val adapterbahan1 = PopulerAdapter(ArrayPopuler,activity)
//        rvbahan.setHasFixedSize(true)
//        rvbahan.layoutManager = ln
//        rvbahan.adapter = adapterbahan1
        

        val home = this
        binding.rvPopuler.apply {
            layoutManager = GridLayoutManager(activity  , 2)

        }

        recyclerView = view.findViewById(R.id.rv_populer)
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = GridLayoutManager(activity, 2)

        populerList = ArrayList()

        populerList.add(Populer(R.drawable.bgnotiv1, "Uncle Muthu", R.drawable.suptulangkuah, "Sup Tulang Kuah", "(5.0)", "20 menit", "2.210"))
        populerList.add(Populer(R.drawable.bgnotiv2, "chef Bagas", R.drawable.tumisbayamjagung, "Tumis Bayam Jagung", "(5.0)", "10 menit", "1.410"))
        populerList.add(Populer(R.drawable.bgnotiv3, "Chef Andis", R.drawable.steakdaginglada, "Steak Daging Lada", "(4.0)", "15 menit", "1.000"))
        populerList.add(Populer(R.drawable.bgnotiv4, "Chef Nabila", R.drawable.ikanguramibakar, "Ikan Gurami Bakar", "(5.0)", "45 menit", "1.210"))

        populerAdapter = PopulerAdapter(populerList,activity)
        recyclerView.adapter = populerAdapter

        populerAdapter.onItemClick = {
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra("populer", it)
            startActivity(intent)

        }


        return view
    }
    val ArrayBahan : ArrayList<ModelBahan>get(){
        val arraybahan = ArrayList<ModelBahan>()
        val bahan1 = ModelBahan()
        bahan1.namabahan = "Bayam"
        bahan1.gambarbahan = R.drawable.bayam

        val bahan2 = ModelBahan()
        bahan2.namabahan = "Ayam"
        bahan2.gambarbahan = R.drawable.ayam

        val bahan3 = ModelBahan()
        bahan3.namabahan = "Wortel"
        bahan3.gambarbahan = R.drawable.wortel

        val bahan4 = ModelBahan()
        bahan4.namabahan = "Tempe"
        bahan4.gambarbahan = R.drawable.tempe

        val bahan5 = ModelBahan()
        bahan5.namabahan = "Telur"
        bahan5.gambarbahan = R.drawable.telur

        val bahan6 = ModelBahan()
        bahan6.namabahan = "Buncis"
        bahan6.gambarbahan = R.drawable.buncis

        val bahan7 = ModelBahan()
        bahan7.namabahan = "Santan"
        bahan7.gambarbahan = R.drawable.santan

        val bahan8 = ModelBahan()
        bahan8.namabahan = "Kentang"
        bahan8.gambarbahan = R.drawable.kentang


        arraybahan.add(bahan1)
        arraybahan.add(bahan2)
        arraybahan.add(bahan3)
        arraybahan.add(bahan4)
        arraybahan.add(bahan5)
        arraybahan.add(bahan6)
        arraybahan.add(bahan7)
        arraybahan.add(bahan8)

        return arraybahan

    }

//    val ArrayPopuler: ArrayList<Populer>get(){
//        val populerList = ArrayList<Populer>()
//
//
//        populerList.add(Populer(R.drawable.bgnotiv1, "Uncle Muthu", R.drawable.suptulangkuah, "Sup Tulang Kuah", "(5.0)", "20 menit", "2.210"))
//        populerList.add(Populer(R.drawable.bgnotiv2, "chef Bagas", R.drawable.tumisbayamjagung, "Tumis Bayam Jagung", "(5.0)", "10 menit", "1.410"))
//        populerList.add(Populer(R.drawable.bgnotiv3, "Chef Andis", R.drawable.steakdaginglada, "Steak Daging Lada", "(4.0)", "15 menit", "1.000"))
//        populerList.add(Populer(R.drawable.bgnotiv4, "Chef Nabila", R.drawable.ikanguramibakar, "Ikan Gurami Bakar", "(5.0)", "45 menit", "1.210"))
//
//
//        return populerList
//
//    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn_notif = view.findViewById<ImageView>(R.id.notiv_icon)
        btn_notif.setOnClickListener{
            startActivity(Intent(activity, Notifikasi::class.java))
        }



    }
}