package com.infinitelearning.savoricious;

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.navigation.fragment.findNavController

class Menu : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_menu)

        val btnClick: Button = findViewById(R.id.tbminuman)
        btnClick.setOnClickListener(this)

        btnIntent = findViewById(R.id.buttonLihat1a)
        btnIntent = findViewById(R.id.buttonLihat21a)
        btnIntent = findViewById(R.id.buttonLihat31a)
        btnIntent.setOnClickListener(this)
    }



    override fun onClick(v: View?) {


        if (v != null){
            when (v.id){
                R.id.tbminuman ->{
                    val pindahIntent = Intent (this, menuminuman::class.java)
                    startActivity(pindahIntent)
                }
            }
            when (v.id){
                R.id.tbkhusus ->{
                    val pindahIntent = Intent (this, menukhusus::class.java)
                    startActivity(pindahIntent)
                }
            }
            when (v.id){
                R.id.tbkue ->{
                    val pindahIntent = Intent (this, menukue::class.java)
                    startActivity(pindahIntent)
                }
            }
    }
        when (v!!.id) {
            R.id.buttonLihat1a -> run {
                val IntentBiasa = Intent(this@Menu, nasigoreng::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.buttonLihat21a -> run {
                val IntentBiasa = Intent(this@Menu, telurbalado::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.buttonLihat31a -> run {
                val IntentBiasa = Intent(this@Menu, tulangsup::class.java)
                startActivity(IntentBiasa)
            }
        }


}
}

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"



/**
 * A simple [Fragment] subclass.
 * Use the [Menu.newInstance] factory method to
 * create an instance of this fragment.
 */
class Menu : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

<<<<<<< HEAD
=======
    public class Menu {
        protected fun onCreated() {
            
        }
        

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn_minuman = view.findViewById<Button>(R.id.tbminuman)
        btn_minuman.setOnClickListener{
            startActivity(Intent(activity, LandingPage1::class.java))
        }
>>>>>>> f34e35fc3da739ee1625423f0f4d6a9ef0b2f5e0

        val btn_khusus = view.findViewById<Button>(R.id.tbkhusus)
        btn_khusus.setOnClickListener{
            startActivity(Intent(activity, LandingPage2::class.java))
        }

        val btn_kue = view.findViewById<Button>(R.id.tbkue)
        btn_kue.setOnClickListener{
            startActivity(Intent(activity, LandingPage3::class.java))
        }

        val btn_makanan = view.findViewById<Button>(R.id.tbmakanan)
        btn_makanan.setOnClickListener{
            startActivity(Intent(activity, Menu::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }


    }


    public class Men

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }



<<<<<<< HEAD
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Menu.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
=======
>>>>>>> f34e35fc3da739ee1625423f0f4d6a9ef0b2f5e0
        fun newInstance(param1: String, param2: String) =
            Menu().apply {
                var arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }

    }
<<<<<<< HEAD

    override fun onClick(v: View?) {

    }


}




=======
>>>>>>> f34e35fc3da739ee1625423f0f4d6a9ef0b2f5e0
