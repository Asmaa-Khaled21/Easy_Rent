package com.codingwithme.easyrent.ui.login

import androidx.databinding.ObservableField
import com.codingwithme.easyrent.base.BaseViewModel

class LoginViewModel:BaseViewModel<Navigator>() {

    val firstNameRegister = ObservableField<String>()
    val lastNameRegister = ObservableField<String>()

    val userName = ObservableField<String>()
    val email= ObservableField<String>()
    val password = ObservableField<String>()

    val emailError = ObservableField<Boolean>(false)
    val passwordError = ObservableField<Boolean>(false)
    val userNameError = ObservableField<Boolean>(false)

    fun register()
    {

    }

    fun login()
    {
        if(valid()) {

        }
    }

    fun valid(): Boolean {
        var valid=true

        if (userName.get().isNullOrBlank()) {
            userNameError.set(true)
            valid = false
        } else {
            userNameError.set(false)
        }

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