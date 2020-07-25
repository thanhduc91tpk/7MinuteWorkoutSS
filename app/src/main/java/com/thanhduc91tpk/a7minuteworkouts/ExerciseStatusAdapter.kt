package com.thanhduc91tpk.a7minuteworkouts

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_exercise_status.view.*

class ExerciseStatusAdapter(val items: ArrayList<ExerciseModel>,val context : Context) : RecyclerView.Adapter<ExerciseStatusAdapter.viewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(LayoutInflater.from(context).inflate(R.layout.item_exercise_status,parent,false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val model : ExerciseModel = items[position]
        holder.tvItem.text = model.getId().toString()

        if(model.getIsSelected()){
            holder.tvItem.background = ContextCompat.getDrawable(context,R.drawable.item_circular_thin_color_accent_border)
            holder.tvItem.setTextColor(Color.rgb(3,3,3))
        }else if(model.getIsCompleted()){
            holder.tvItem.background = ContextCompat.getDrawable(context,R.drawable.item_circular_color_accent_background)
            holder.tvItem.setTextColor(Color.rgb(255,255,255))
        }else{
            holder.tvItem.background = ContextCompat.getDrawable(context,R.drawable.item_circular_color_gray_background)
            holder.tvItem.setTextColor(Color.rgb(3,3,3))
        }
    }


    class viewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val tvItem = view.tvItem

    }

}