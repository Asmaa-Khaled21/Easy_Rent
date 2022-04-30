package com.codingwithme.meowbottomnavigationbar.base

import androidx.lifecycle.ViewModel

open class BaseViewModel <N>:ViewModel(){
    var navigator:N?=null
}