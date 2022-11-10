package com.example.projectm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectm.fragments.AccountFragment
import com.example.projectm.fragments.HomeFragment
import com.example.projectm.fragments.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigationBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_bar)
        supportActionBar?.hide()

        val homeFragment = HomeFragment()
        val accountFragment = AccountFragment()
        val settingsFragment = SettingsFragment()

        makeCurrentFragment(homeFragment)

        findViewById<BottomNavigationView>(R.id.bottom_navigation)
            .setOnNavigationItemSelectedListener{
                when(it.itemId){
                    R.id.ic_home -> makeCurrentFragment(homeFragment)
                    R.id.ic_account -> makeCurrentFragment(accountFragment)
                    R.id.ic_settings -> makeCurrentFragment(settingsFragment)
                }
                true
            }

    }
    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
    }
