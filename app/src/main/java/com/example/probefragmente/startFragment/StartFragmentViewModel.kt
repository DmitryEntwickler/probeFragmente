package com.example.probefragmente.startFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.probefragmente.R

class StartFragmentViewModel : ViewModel() {

    lateinit var mNavController: NavController

    val mCity = MutableLiveData("Leipzig")
    val mX = MutableLiveData(0)

    fun changeCity(){
        mCity.value = "Dresden"
        mX.value = mX.value?.plus(1)
        println("-> ${mX.value}, ${mCity.value}")
    }
    fun navigate() {
       // mNavController.navigate(R.id.action_startFragment_to_secondFragment)
    }
}