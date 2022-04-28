package com.codingwithme.meowbottomnavigationbar.ui.login

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import java.util.*

class LoginViewModel:ViewModel() {
    val email = ObservableField<String>()
    val password = ObservableField<String>()
    val emailError = ObservableField<Boolean>(false)
    val passwordError = ObservableField<Boolean>(false)

    fun login()
    {
        if(valid()) {

        }
    }

    fun valid(): Boolean {
        var valid=true
        if (email.get().isNullOrBlank()) {
            emailError.set(true)
            valid = false
        } else {
            emailError.set(false)
        }
        if (password.get().isNullOrBlank() || password.get()?.length?:0 <6) {
            passwordError.set(true)
            valid = false
        } else {
            passwordError.set(false)
        }
        return valid
    }

}