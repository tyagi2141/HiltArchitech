package com.example.hiltarchitech.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.hiltarchitech.R
import com.example.hiltarchitech.model.ResultItems
import com.example.hiltarchitech.ui.adapter.carviewholder.CarViewHolder

/**
 * Created by Rahul on 02/07/20.
 */
class CarRentAdapter : ListAdapter<ResultItems, CarViewHolder>(DiffUtilCarRentModel()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val itemview =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_carrent, parent, false)
        return CarViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}