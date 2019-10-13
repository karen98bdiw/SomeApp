package com.example.someapp.main.model.entityes

class Card (
    val cardNumber:Long,
    val ownerName:String,
    val ownerSurname:String
){
    override fun toString(): String {
        return "$cardNumber:$ownerName:$ownerSurname"
    }

    override fun equals(other: Any?): Boolean {
        if(this.cardNumber == (other as Card).cardNumber){
            return true
        }

        return false
    }
}