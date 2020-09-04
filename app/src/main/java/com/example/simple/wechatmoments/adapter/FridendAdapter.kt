package com.example.simple.wechatmoments.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * Created by jiessie on 2020/9/5.
 */
class FridendAdapter()  : RecyclerView.Adapter<FridendViewHolder>() {

    override fun getItemCount(): Int {
    }

    override fun onBindViewHolder(holder: FridendViewHolder?, position: Int) {
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): FridendViewHolder{
    }
}

class FridendViewHolder(view: View, private val mListener: OnItemClickListener?) : RecyclerView.ViewHolder(view), View.OnClickListener {

    override fun onClick(p0: View?) {
    }
}