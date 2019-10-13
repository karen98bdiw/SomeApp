package com.example.someapp.main.settings

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.someapp.R
import kotlinx.android.synthetic.main.settings_recyclerview_item.view.*

class SettingsAdapter:RecyclerView.Adapter<SettingsAdapter.ViewHolder>(){

    val itemsList = ArrayList<SettingsItem>()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val inflater = LayoutInflater.from(p0.context)
        val view = inflater.inflate(R.layout.settings_recyclerview_item,p0,false)
        return ViewHolder(view)

    }

    init {
        initSettings()
        Log.e("initSettigs","${itemsList.size}")
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        val curentSettingsItem = itemsList.get(p1)

        p0.icon.setImageResource(curentSettingsItem.icon)
        p0.desc.text = curentSettingsItem.desc
        p0.itemView.setOnClickListener {
            Log.e("itemView","clicked")
            curentSettingsItem.function()
        }


    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon = itemView.settingsItemIcon
        val desc = itemView.settingsItemDesc
    }

    fun initSettings(){
        val changeSettingsOptionSettings = SettingsItem(R.drawable.ic_settings_security,"Change Security Option",::changeSecurityOption)
        itemsList.add(changeSettingsOptionSettings)

        val exportBackupFilesSettings = SettingsItem(R.drawable.ic_settings_export,"Export BackUp Files",::exportBackUpFiles)
        itemsList.add(exportBackupFilesSettings)

        val importBackUpFilesSettings = SettingsItem(R.drawable.ic_settings_import,"Import BackUp Files",::importBackUpFiles)
        itemsList.add(importBackUpFilesSettings)

        val upgradeSettings = SettingsItem(R.drawable.ic_settings_upgragetofree,"Upgrade to Add-Free Version",::upgradeToFreeVersion)
        itemsList.add(upgradeSettings)

        val buyRFIDSettings = SettingsItem(R.drawable.ic_settings_buytags,"But RFID Tags",::buyTags)
        itemsList.add(buyRFIDSettings)

        val readLicensesSettings = SettingsItem(R.drawable.ic_settings_license,"Licenses",::showLicenses)
        itemsList.add(readLicensesSettings)
    }

    fun changeSecurityOption(){
        Log.e("settings","ChangeOptions")
    }

    fun exportBackUpFiles(){
        Log.e("settings","exportBackUpFiles")
    }
    fun importBackUpFiles(){
        Log.e("settings","importBackUpFiles")
    }
    fun upgradeToFreeVersion(){
        Log.e("settings","upgradeToFreeVersion")
    }
    fun buyTags(){
        Log.e("settings","buy Tags")
    }
    fun showLicenses(){
        Log.e("settings","show License")
    }

}