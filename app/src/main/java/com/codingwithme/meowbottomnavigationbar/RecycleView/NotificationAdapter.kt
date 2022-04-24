package com.codingwithme.meowbottomnavigationbar.RecycleView

import android.provider.ContactsContract
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codingwithme.meowbottomnavigationbar.R

class NotificationAdapter :RecyclerView.Adapter<NotificationAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val ImageNotification :ImageView = itemView.findViewById(R.id.Image_Notification)
        val TextNotificationTop  :TextView = itemView.findViewById(R.id.Notification_Text_top)
        val TextNotificationBottom  :TextView = itemView.findViewById(R.id.Notification_Text_Bottom)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}