package com.example.someapp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.someapp.R
import com.example.someapp.main.settings.SettingsAdapter
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : BaseActivity(2) {

    private val TAG = "SettingsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        setupBottomNavigation()

        Log.e(TAG,"onCreate")

        settingsRecyclerView.adapter = SettingsAdapter()
        settingsRecyclerView.layoutManager = LinearLayoutManager(this@SettingsActivity,RecyclerView.VERTICAL,false)
    }
}
