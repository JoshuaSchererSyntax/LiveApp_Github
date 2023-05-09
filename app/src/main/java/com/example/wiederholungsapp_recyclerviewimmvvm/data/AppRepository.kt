package com.example.wiederholungsapp_recyclerviewimmvvm.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.wiederholungsapp_recyclerviewimmvvm.data.datamodels.Text

class AppRepository {

    //livedata for our textlist
    private val _textList = MutableLiveData<List<Text>>()
    val textList: LiveData<List<Text>>
        get() = _textList

    //runs everytime we create an instance of our repository
    init {
        loadText()
    }

    fun loadText() {
        //creates the list for our texts
        val textList = listOf<Text>(
            Text(
                1,
                "Ich bin ein Text"
            ),
            Text(
                2,
                "Ich bin auch ein text"
            ),
            Text(
                3,
                "Hier könnte Ihre Werbung stehen"
            ),
            Text(
                4,
                "Man bekommt nicht genug von Texten"
            ),
            Text(
                5,
                "abc"
            ),
            Text(
                6,
                "def"
            )
        )
        //puts our textlist into the livedata
        _textList.value = textList
    }

}