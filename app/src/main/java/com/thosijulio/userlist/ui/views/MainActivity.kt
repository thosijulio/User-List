package com.thosijulio.userlist.ui.views

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thosijulio.userlist.R
import com.thosijulio.userlist.data.UserDB
import com.thosijulio.userlist.ui.adapter.UserAdapter

class MainActivity : AppCompatActivity() {
    private val recyclerView: RecyclerView by lazy { findViewById(R.id.main_recycler_view) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val users = UserDB.getAllUsers()
        val userAdapter = UserAdapter(users)

        recyclerView.layoutManager = LinearLayoutManager(baseContext)
        recyclerView.adapter = userAdapter
    }
}