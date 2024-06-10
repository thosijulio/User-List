package com.thosijulio.userlist.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.thosijulio.userlist.R
import com.thosijulio.userlist.data.model.User
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView
import com.thosijulio.userlist.interfaces.UserItemListener

class UserAdapter(private val users: List<User>) : Adapter<UserAdapter.UserViewHolder>() {
    private var userListener: UserItemListener? = null

    fun setUserListener(listener: UserItemListener) {
        userListener = listener
    }
    class UserViewHolder(view: View, listener: UserItemListener?) : ViewHolder(view) {
        val image: ShapeableImageView = view.findViewById(R.id.item_user_image)
        val name: MaterialTextView = view.findViewById(R.id.item_user_name)
        val email: MaterialTextView = view.findViewById(R.id.item_user_email)

        init {
            view.setOnClickListener { listener?.onItemClick(view, adapterPosition) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view, userListener)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]

        holder.image.setImageResource(user.image)
        holder.name.text = user.name
        holder.email.text = user.email
    }
}