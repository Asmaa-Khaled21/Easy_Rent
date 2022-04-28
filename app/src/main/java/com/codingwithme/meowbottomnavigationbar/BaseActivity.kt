package com.codingwithme.meowbottomnavigationbar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codingwithme.meowbottomnavigationbar.ui.login.LoginViewModel

abstract class BaseActivity<DB:ViewDataBinding,VM:ViewModel>:AppCompatActivity() {

    lateinit var viewDataBinding: DB
    lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewDataBinding= DataBindingUtil.setContentView(this,getLayoutId() )
        viewModel=initializeViewModel()


    }

     abstract fun getLayoutId():Int
    abstract fun initializeViewModel():VM


    fun makeToast(massege:String){
        Toast.makeText(this,"Hello User",Toast.LENGTH_SHORT).show()

    }
    fun makeToast(massegeTd:Int){
        Toast.makeText(this,"massegeId",Toast.LENGTH_SHORT).show()

    }
//    fun showProgressDialoge(massege: String){
//        val dialog = showProgressDialoge(this)
//        dialog.setCancelable(false)
//        dialog.setMassage(message)
//        dialog.show()
//    }

}