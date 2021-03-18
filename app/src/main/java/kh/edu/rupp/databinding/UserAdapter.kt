package kh.edu.rupp.databinding

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


/**
 * Copyright (c) PRASAC MFI, Ltd. All rights reserved. (https://www.prasac.com.kh/)
 * Author	: Chhai Chivon (chivon.chhai@prasac.com.kh) on 3/18/2021 2:02 PM.
 * Position : Senior Application Development Officer
 */
class UserAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.UserHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return users.size
    }

    class UserHolder(v: View) : RecyclerView.ViewHolder(v)

}