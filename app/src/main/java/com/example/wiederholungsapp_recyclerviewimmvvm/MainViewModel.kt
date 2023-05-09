package com.example.wiederholungsapp_recyclerviewimmvvm

import androidx.lifecycle.ViewModel
import com.example.wiederholungsapp_recyclerviewimmvvm.data.AppRepository

class MainViewModel : ViewModel() {

    //creates an objext of our repo
    val repository = AppRepository()

    //load our list from the repo
    val texts = repository.textList

}