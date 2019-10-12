package com.example.someapp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.someapp.R

class CardsActivity : BaseActivity(1) {

    private val TAG = "CardsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        setupBottomNavigation()

        Log.e(TAG,"onCreate")
    }

}
