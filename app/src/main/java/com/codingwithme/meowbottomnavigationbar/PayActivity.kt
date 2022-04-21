package com.codingwithme.meowbottomnavigationbar

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.codingwithme.meowbottomnavigationbar.Fragments.CreditCardFragment
import com.codingwithme.meowbottomnavigationbar.Fragments.FawryFragment


class PayActivity : AppCompatActivity() {
    lateinit var fawryText:Button
    lateinit var creditcardText:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        fawryText = findViewById(R.id.FawrytText)
        creditcardText = findViewById(R.id.CreditText)
        startFragment()

        fawryText.setOnClickListener{
//            creditcardText.setBackgroundColor(resources.getColor(R.color.white))
//            creditcardText.setTextColor(resources.getColor(R.color.Dark_Blue))
//            fawryText.setBackgroundColor(resources.getColor(R.color.Dark_Blue))
//            fawryText.setTextColor(resources.getColor(R.color.white))
            supportFragmentManager.beginTransaction()
             .replace(R.id.frafment_container,FawryFragment())
             .addToBackStack("Fawry")
             .commit()
        }
        creditcardText.setOnClickListener {
//            creditcardText.setBackgroundColor(resources.getColor(R.color.Dark_Blue))
//            creditcardText.setTextColor(resources.getColor(R.color.white))
//            fawryText.setBackgroundColor(resources.getColor(R.color.white))
//            fawryText.setTextColor(resources.getColor(R.color.Dark_Blue))
            supportFragmentManager.beginTransaction()
                .replace(R.id.frafment_container,CreditCardFragment())
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