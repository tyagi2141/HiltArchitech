package com.example.hiltarchitech.ui.adapter.carviewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hiltarchitech.model.ResultItems
import kotlinx.android.synthetic.main.list_item_carrent.view.*

/**
 * Created by Rahul on 02/07/20.
 */
class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(item: ResultItems?) {
        itemView.carname.text = item?.drivername
        itemView.cartype.text = item?.vechileType
        itemView.location.text = item?.location

        Glide.with(itemView.getContext()).load(item?.imageurl).into(itemView.image);

    }


}