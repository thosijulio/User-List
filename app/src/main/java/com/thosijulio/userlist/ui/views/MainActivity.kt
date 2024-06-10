package com.thosijulio.userlist.ui.views

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thosijulio.userlist.R
import com.thosijulio.userlist.data.UserDB
import com.thosijulio.userlist.interfaces.UserItemListener
import com.thosijulio.userlist.ui.adapter.UserAdapter

class MainActivity : AppCompatActivity(), UserItemListener {
    private val recyclerView: RecyclerView by lazy { findViewById(R.id.main_recycler_view) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(baseContext)
    }

    override fun onStart() {
        super.onStart()

        val users = UserDB.getAllUsers()
        val userAdapter = UserAdapter(users)

        userAdapter.setUserListener(this)

        recyclerView.adapter = userAdapter
    }

    override fun onItemClick(view: View, position: Int) {
        Log.i("Listener", position.toString())
    }
}