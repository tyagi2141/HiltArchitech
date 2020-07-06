package com.example.hiltarchitech.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.hiltarchitech.model.ResultItems

/**
 * Created by Rahul on 02/07/20.
 */
class DiffUtilCarRentModel : DiffUtil.ItemCallback<ResultItems>() {
    override fun areItemsTheSame(oldItem: ResultItems, newItem: ResultItems): Boolean {
        return newItem.id == oldItem.id
    }

    override fun areContentsTheSame(oldItem: ResultItems, newItem: ResultItems): Boolean {
        return newItem == oldItem
    }


}