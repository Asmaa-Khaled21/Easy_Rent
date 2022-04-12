package com.codingwithme.meowbottomnavigationbar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.codingwithme.meowbottomnavigationbar.Fragments.CreditCardFragment
import com.codingwithme.meowbottomnavigationbar.Fragments.FawryFragment

class PayActivity : AppCompatActivity() {

    lateinit var fawryText:TextView
    lateinit var creditcardText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        fawryText = findViewById(R.id.FawrytText)
        creditcardText = findViewById(R.id.CreditText)
        startFragment()
        fawryText.setOnClickListener{
         supportFragmentManager.beginTransaction()
             .replace(R.id.frafment_container,CreditCardFragment())
             .addToBackStack("Fawry")
             .commit()
        }

        creditcardText.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frafment_container,FawryFragment())
                .addToBackStack("CreditCard")
                .commit()
        }
    }

    private fun startFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.frafment_container,CreditCardFragment())
            .addToBackStack("Fawry")
            .commit()
    }

}