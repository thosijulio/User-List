package com.thosijulio.userlist.interfaces

import android.view.View

interface UserItemListener {
    fun onItemClick(view: View, position: Int)
}