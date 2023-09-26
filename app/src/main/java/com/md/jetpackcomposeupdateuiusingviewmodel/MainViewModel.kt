package com.md.jetpackcomposeupdateuiusingviewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


class MainViewModel : ViewModel(){
    //Create  a flow for counter
    private val _counter = MutableStateFlow(0)

    //Expose immutable flow using asStateFlow()
    val counter = _counter.asStateFlow()

    init {
        changeCounterValue(0)
    }

    private fun changeCounterValue(cnt : Int){
        _counter.value = cnt
    }

    fun incrementCounter (){
        _counter.value = _counter.value + 1
    }

    fun decrementCounter(){
        _counter.value = _counter.value - 1
    }
}