package com.codingwithme.meowbottomnavigationbar.api

import retrofit2.http.GET

interface Webservices {

    @GET("register/")
    fun getRegisterLogin()
    
}