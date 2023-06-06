package com.infinitelearning.savoricious

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.infinitelearning.savoricious.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {

    private lateinit var binding : ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fl_navbar,fragment)
        fragmentTransaction.commit()

    }
}