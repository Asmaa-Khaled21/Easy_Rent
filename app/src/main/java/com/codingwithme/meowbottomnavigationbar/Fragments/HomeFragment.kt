package com.codingwithme.meowbottomnavigationbar.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codingwithme.meowbottomnavigationbar.R
import com.codingwithme.meowbottomnavigationbar.RecycleView.SettingsAdapter
import com.codingwithme.meowbottomnavigationbar.RecycleView.SettingsItem

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    lateinit var recycleView: RecyclerView
    lateinit var settingsAdapter: SettingsAdapter
    lateinit var itemList:MutableList<SettingsItem>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycleView = view.findViewById(R.id.RecycleView_Ajar)
        //createItemSetttingslist()
        loadDate()
        settingsAdapter=SettingsAdapter(itemList)
        recycleView.adapter=settingsAdapter
        // after starting app show first fragment
    }

    fun loadDate(){
        itemList= mutableListOf();  //create empty list
        for(i in 0..50 step 1)
        { itemList.add(
            SettingsItem(
            oneItem = R.id.House_NUMBER, twoItem =R.id.Day, threeItem = R.id.GBS,fourItem = R.id.clock,
                fiveItem = R.id.money

        ))

        }}

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {}
            }
    }}

