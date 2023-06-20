package com.infinitelearning.savoricious;

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity




// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"



/**
 * A simple [Fragment] subclass.
 * Use the [Menu.newInstance] factory method to
 * create an instance of this fragment.
 */
class Menu : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        super.onCreate(savedInstanceState);

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



        fun newInstance(param1: String, param2: String) =
            Menu().apply {
                var arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
