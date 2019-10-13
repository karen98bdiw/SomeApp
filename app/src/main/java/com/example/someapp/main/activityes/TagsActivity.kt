package com.example.someapp.main.activityes

import android.os.Bundle
import android.util.Log
import android.view.Menu
import com.example.someapp.R
import com.example.someapp.main.views.BaseFragment
import com.example.someapp.main.views.adapters.PagesAdapter
import kotlinx.android.synthetic.main.activity_tags.*

class TagsActivity : BaseActivity(0) {

    private val TAG = "TagsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tags)

        setupBottomNavigation()
        setSupportActionBar(tagsToolBar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        Log.e(TAG,"onCreate")

        val adapter = PagesAdapter(supportFragmentManager)

        adapter.addFragment(BaseFragment(),"All Tags")
        adapter.addFragment(BaseFragment(),"Favorite Tags")

        tagsTabLayout.setupWithViewPager(tagsViewPager)
        tagsViewPager.adapter = adapter


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.tagstoolbar_menu,menu)
        return true
    }
}
