package com.codingwithme.meowbottomnavigationbar.ui.login

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.codingwithme.meowbottomnavigationbar.ui.main.MainActivity
import com.codingwithme.meowbottomnavigationbar.R
import com.codingwithme.meowbottomnavigationbar.databinding.ActivityLoginBinding

import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*



class LoginActivity : AppCompatActivity() {
      @RequiresApi(Build.VERSION_CODES.M)

      lateinit var viewModel: LoginViewModel
      lateinit var viewBinding:ActivityLoginBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            viewBinding=DataBindingUtil.setContentView(this, R.layout.activity_login)
            viewModel=ViewModelProvider(this).get(LoginViewModel::class.java)
            viewBinding.viewModel = viewModel

            singUp.setOnClickListener {
                singUp.background = resources.getDrawable(R.drawable.switch_trcks,null)
                singUp.setTextColor(resources.getColor(R.color.textColor,null))
                logIn.background = null
                singUpLayout.visibility = View.VISIBLE
                logInLayout.visibility = View.GONE
                logIn.setTextColor(resources.getColor(R.color.Dark_Blue,null))
            }
            logIn.setOnClickListener {
                singUp.background = null
                singUp.setTextColor(resources.getColor(R.color.Dark_Blue,null))
                logIn.background = resources.getDrawable(R.drawable.switch_trcks,null)
                singUpLayout.visibility = View.GONE
                logInLayout.visibility = View.VISIBLE
                logIn.setTextColor(resources.getColor(R.color.textColor,null))
            }
            singIn.setOnClickListener {
                startActivity(Intent(this@LoginActivity, MainActivity::class.java))
            }
        }
    }