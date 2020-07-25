package com.thanhduc91tpk.a7minuteworkouts

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_history_row.view.*

class HistoryAdapter(val context : Context ,val items : ArrayList<String> ) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_history_row,parent,false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val date : String = items.get(position)

        holder.tvPosition.text = (position+1).toString()
        holder.tvItem.text = date

        if(position % 2 == 0){
            holder.llHistoryMainItem.setBackgroundColor(Color.rgb(235,235,235))
        }else{
            holder.llHistoryMainItem.setBackgroundColor(Color.rgb(255,255,255))
        }
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val llHistoryMainItem = view.ll_history_item_main
        val tvItem = view.tvItem
        val tvPosition = view.tvPosition
    }
}