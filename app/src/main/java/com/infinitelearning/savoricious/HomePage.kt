package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
<<<<<<< HEAD
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.infinitelearning.savoricious.databinding.ActivityHomePageBinding

class HomePage(param1: String) : AppCompatActivity() {



=======
import androidx.recyclerview.widget.GridLayoutManager
import com.infinitelearning.savoricious.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {
>>>>>>> 0844d6e2c1ae4d6c43f9053f3062194f19025534
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
    private val menuItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId){
            R.id.nb_home ->{

                val fragment = Home.newInstance(param1 ;'test1', param2 'test2' )
                addFragme(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nb_menu->{
                val fragment = Home.newInstance(param1 :'test1', param2: 'test2'  )
                addFragme(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nb_add ->{
                val fragment = Home.newInstance(param1 :'test1', param2: 'test2')
                addFragme(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nb_profile ->{
                val fragment = Home.newInstance(param1 :'test1', param2: 'test2' )
                addFragme(fragment)
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }


    private fun addFragme ( fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(com.google.android.material.R.anim.design_bottom_sheet_slide_in, com.google.android.material.R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.frame_layout01, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
<<<<<<< HEAD
        fragmentTransaction.replace(R.id.frame_layout01,fragment)
=======
        fragmentTransaction.replace(R.id.frame_layout,fragment)
>>>>>>> 0844d6e2c1ae4d6c43f9053f3062194f19025534
        fragmentTransaction.commit()

    }
}