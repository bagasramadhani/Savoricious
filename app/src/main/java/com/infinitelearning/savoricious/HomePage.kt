package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.infinitelearning.savoricious.databinding.ActivityHomePageBinding

//class HomePage(param1: String) : AppCompatActivity() {

class HomePage : AppCompatActivity() {
    private lateinit var binding : ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())



    binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.nb_home -> replaceFragment(Home())
                R.id.nb_menu -> replaceFragment(Menu())
                R.id.nb_add -> replaceFragment(Add())
                R.id.nb_comunity -> replaceFragment(Comunity())
                R.id.nb_profile -> replaceFragment(Profile())

                else ->{


                }

            }
            true

        }


    }
//    private val menuItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
//        when (item.itemId){
//            R.id.nb_home ->{
//
//                val fragment = Home.newInstance (param1 :'test1', param2 'test2' )
//                addFragme(fragment)
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.nb_menu->{
//                val fragment = Home.newInstance(param1 :'test1', param2: 'test2'  )
//                addFragme(fragment)
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.nb_add ->{
//                val fragment = Home.newInstance(param1 :'test1', param2: 'test2')
//                addFragme(fragment)
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.nb_profile ->{
//                val fragment = Home.newInstance(param1 :'test1', param2: 'test2' )
//                addFragme(fragment)
//                return@OnNavigationItemSelectedListener true
//            }
//
//        }
//        false
//    }


    private fun addFragment ( fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(com.google.android.material.R.anim.design_bottom_sheet_slide_in, com.google.android.material.R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.frame_layout, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()

    }
}