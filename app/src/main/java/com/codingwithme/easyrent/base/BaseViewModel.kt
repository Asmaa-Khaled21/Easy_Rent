package com.codingwithme.easyrent.base

import androidx.lifecycle.ViewModel

open class BaseViewModel <N>:ViewModel(){
    var navigator:N?=null
}