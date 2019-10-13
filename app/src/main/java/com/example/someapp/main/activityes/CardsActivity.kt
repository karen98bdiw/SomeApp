package com.example.someapp.main.activityes

import android.os.Bundle
import android.util.Log
import android.view.Menu
import com.example.someapp.R
import com.example.someapp.main.views.BaseFragment
import com.example.someapp.main.views.adapters.PagesAdapter
import kotlinx.android.synthetic.main.activity_cards.*

class CardsActivity : BaseActivity(1) {

    private val TAG = "CardsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        setupBottomNavigation()
        setSupportActionBar(cardsToolBar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        Log.e(TAG,"onCreate")

        val adapter = PagesAdapter(supportFragmentManager)

        adapter.addFragment(BaseFragment(),"All Cards")
        adapter.addFragment(BaseFragment(),"Favorite Cards")

        cardsTabLayout.setupWithViewPager(cardsViewPager)
        cardsViewPager.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.cardtoolbar_menu,menu)
        return true
    }
}
