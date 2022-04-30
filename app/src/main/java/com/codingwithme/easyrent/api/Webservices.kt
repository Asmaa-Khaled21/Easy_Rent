package com.codingwithme.easyrent.api

import retrofit2.http.GET

interface Webservices {

    @GET("register/")
    fun getRegisterLogin()
    
}