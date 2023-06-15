package com.infinitelearning.savoricious

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.infinitelearning.savoricious.adapter.BahanAdapter
import com.infinitelearning.savoricious.adapter.CardAdapter
import com.infinitelearning.savoricious.databinding.FragmentHomeBinding
import com.infinitelearning.savoricious.model.ModelBahan
import kotlinx.android.synthetic.main.card_item.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment(),MenuClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }




    }

    override fun onClick(menu: MenuDetail) {
        val intent = Intent(activity?.applicationContext, DetailActivity::class.java)
        intent.putExtra(MENU_ID_EXTRA, menu.id)
        startActivity(intent)
    }


    private fun populatemenuDetaillist() {
        val menu1 = MenuDetail(
            R.drawable.suptulangkuah,
            "Uncle Muthu",
            R.drawable.suptulangkuah,
            "Sup Tulang Kuah",
            "(5.0)",
            "20 menit",
            "2.000",
            "deskripsi"
        )
        menuDetaillist.add(menu1)

        val menu2 = MenuDetail(
            R.drawable.suptulangkuah,
            "chef Juna",
            R.drawable.tumisbayamjagung,
            "Tumis Ayam Jagung",
            "(5.0)",
            "10 menit",
            "1.410",
            "deskripsi"
        )
        menuDetaillist.add(menu2)

        val menu3 = MenuDetail(
            R.drawable.suptulangkuah,
            "Uncle Muthu",
            R.drawable.steakdaginglada,
            "Steak Daging Lada HItam",
            "(4.0)",
            "15 menit",
            "1.000",
            "deskripsi"
        )
        menuDetaillist.add(menu3)

        val menu4 = MenuDetail(
            R.drawable.suptulangkuah,
            "Uncle Muthu",
            R.drawable.ikanguramibakar,
            "Ikan Gurami Bakar",
            "(5.0)",
            "45 menit",
            "1.210",
            "deskripsi"
        )
        menuDetaillist.add(menu4)

//        menuDetaillist.add(menu1)
//        menuDetaillist.add(menu2)
//        menuDetaillist.add(menu3)
//        menuDetaillist.add(menu4)

    }

    // private var binding : FragmentHomeBinding? = null
    lateinit var rvbahan :  RecyclerView

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,


    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        binding = FragmentHomeBinding.inflate(layoutInflater)

        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.HORIZONTAL
        rvbahan = view.findViewById(R.id.recyclerView5)

        val adapterbahan = BahanAdapter(ArrayBahan,activity)
        rvbahan.setHasFixedSize(true)
        rvbahan.layoutManager = lm
        rvbahan.adapter = adapterbahan

        populatemenuDetaillist()

//        val home = this
//        binding.rvPopuler.apply {
//            layoutManager = GridLayoutManager(activity  , 2)
//            adapter = CardAdapter(menuDetaillist, home)
//        }

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

    override fun onDestroyView() {
        super.onDestroyView()
//         binding = null
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


}