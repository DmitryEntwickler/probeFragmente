package com.example.probefragmente.startFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StartFragmentViewModel : ViewModel() {
    val mCity = MutableLiveData("Leipzig")
    val mX = MutableLiveData(0)

    fun changeCity(){
        mCity.value = "Dresden"
        mX.value = mX.value?.plus(1)
        println("-> ${mX.value}, ${mCity.value}")
    }
}