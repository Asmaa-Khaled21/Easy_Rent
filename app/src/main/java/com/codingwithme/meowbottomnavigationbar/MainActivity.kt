package com.codingwithme.meowbottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.codingwithme.meowbottomnavigationbar.Fragments.HomeFragment
import com.codingwithme.meowbottomnavigationbar.Fragments.NotificationFragment
import com.codingwithme.meowbottomnavigationbar.Fragments.ReceiptsFragment
import com.codingwithme.meowbottomnavigationbar.Fragments.SettingsFragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        addFragment(HomeFragment.newInstance())
        bottomNavigation.show(0)
        bottomNavigation.add(MeowBottomNavigation.Model(0,R.drawable.ic_home))
        bottomNavigation.add(MeowBottomNavigation.Model(1,R.drawable.ic_receipts))
        bottomNavigation.add(MeowBottomNavigation.Model(2,R.drawable.ic_notificationbar))
        bottomNavigation.add(MeowBottomNavigation.Model(3,R.drawable.ic_setting))

        bottomNavigation.setOnClickMenuListener {
            when(it.id){
                0 -> {
                    replaceFragment(HomeFragment.newInstance())
                }
                1 -> {
                    replaceFragment(ReceiptsFragment.newInstance())
                }
                2 -> {
                    replaceFragment(NotificationFragment.newInstance())
                }
                3 -> {
                    replaceFragment(SettingsFragment.newInstance())
                }

                else -> {
                    replaceFragment(HomeFragment.newInstance())
                }
            }
        }
    }

    private fun replaceFragment(fragment:Fragment){
        val fragmentTransition = supportFragmentManager.beginTransaction()
            fragmentTransition.replace(R.id.fragmentContainer,fragment).addToBackStack(Fragment::class.java.simpleName).commit()
    }

    private fun addFragment(fragment:Fragment){
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.add(R.id.fragmentContainer,fragment).addToBackStack(Fragment::class.java.simpleName).commit()
    }
}