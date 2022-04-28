package com.codingwithme.meowbottomnavigationbar.Api

import retrofit2.http.GET

interface Webservices {

    @GET("register/")
    fun getRegisterLogin()
    
}