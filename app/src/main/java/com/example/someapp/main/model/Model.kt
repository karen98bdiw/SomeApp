package com.example.someapp.main.model

import com.example.someapp.main.model.entityes.Card
import com.example.someapp.main.model.entityes.Tag

class Model {

    fun addTag(t: Tag){
        SaveSystem.tagList.add(t)
    }

    fun readTags():List<Tag>{
        return SaveSystem.tagList
    }

    fun addCard(c: Card){
        SaveSystem.cardList.add(c)
    }

    fun readCards():List<Card>{
        return SaveSystem.cardList
    }
}