package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
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



<<<<<<< HEAD
        binding.bottomNavigationView.setOnItemSelectedListener {
=======
    binding.bottomNavigationView.setOnItemSelectedListener {
>>>>>>> f34e35fc3da739ee1625423f0f4d6a9ef0b2f5e0

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