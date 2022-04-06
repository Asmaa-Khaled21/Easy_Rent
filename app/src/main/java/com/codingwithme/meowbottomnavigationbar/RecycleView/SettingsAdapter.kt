package com.codingwithme.meowbottomnavigationbar.RecycleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codingwithme.meowbottomnavigationbar.R

class SettingsAdapter (var items:List<SettingsItem>): RecyclerView.Adapter<SettingsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=items.get(position)
        val let = item.oneItem?.let { holder.oneItem.setText(it) }
        holder.twoItem.setText(item.twoItem!!)
        holder.threeItem.setText(item.threeItem!!)
        holder.fourItem.setText(item.fourItem!!)
        holder.fiveItem.setText(item.fiveItem!!)


       /* if (OnButtonClickListener!=null){
            holder.itemView.setOnClickListener{
                //  OnItemClickListener.OnItemClick(position,item)
            }
        }*/

    }

    override fun getItemCount(): Int {
        return items.size
    }


    /*var OnButtonClickListener :OnItemClickListener?=null

   interface OnItemClickListener{
        fun OnItemClick(pos:Int ,item:SettingsItem)
    }*/


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val oneItem : TextView =itemView.findViewById(R.id.House_NUMBER)
        val twoItem : TextView =itemView.findViewById(R.id.Day)
        val threeItem : TextView =itemView.findViewById(R.id.GBS)
        val fourItem : TextView =itemView.findViewById(R.id.clock)
        val fiveItem : TextView =itemView.findViewById(R.id.money)
        //val sixItem : Button = itemView.findViewById(R.id.Button_Bay)
    }
}