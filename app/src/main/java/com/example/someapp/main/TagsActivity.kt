package com.example.someapp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.someapp.R

class TagsActivity : BaseActivity(0) {

    private val TAG = "TagsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tags)

        setupBottomNavigation()

        Log.e(TAG,"onCreate")


    }
}
