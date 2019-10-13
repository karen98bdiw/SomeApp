package com.example.someapp.main.activityes

import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.someapp.R
import kotlinx.android.synthetic.main.bottom_menu.*

open class BaseActivity(val navNumber:Int) : AppCompatActivity() {
    private val TAG = "BaseActivity"

    open fun setupBottomNavigation() {
        bottom_navigation_view.setIconSize(29f, 29f)
        bottom_navigation_view.setTextVisibility(false)
        bottom_navigation_view.enableItemShiftingMode(false)
        bottom_navigation_view.enableShiftingMode(false)
        bottom_navigation_view.enableAnimation(false)
        for (i in 0 until bottom_navigation_view.menu.size()) {
            bottom_navigation_view.setIconTintList(i, null)
        }
        bottom_navigation_view.setOnNavigationItemSelectedListener {
            val nextActivity =
                when (it.itemId) {
                    R.id.bottomTagItem -> TagsActivity::class.java
                    R.id.bottomCardItem -> CardsActivity::class.java
                    R.id.bottomSetingsItem -> SettingsActivity::class.java
                    else -> {
                        Log.e(TAG, "unknown nav item clicked $it")
                        null
                    }
                }
            if (nextActivity != null) {
                val intent = Intent(this, nextActivity)
                intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
                startActivity(intent)
                overridePendingTransition(0, 0)
                true
            } else {
                false
            }
        }
        bottom_navigation_view.menu.getItem(navNumber).isChecked = true
    }
}