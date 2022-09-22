package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class wishAdapter (private val wishes: List<Wish>)
    : RecyclerView.Adapter<wishAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

//        input
        val ItemName: TextView
        val storeName:TextView
        val priceAmount:TextView
        init {

            ItemName=itemView.findViewById(R.id.ItemName)
            storeName=itemView.findViewById(R.id.storeName)
            priceAmount=itemView.findViewById(R.id.priceAmount)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val wishView = inflater.inflate(R.layout.wish_main, parent, false)
        // Return a new holder instance
        return ViewHolder(wishView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val wish=wishes.get(position)
        holder.priceAmount.text=wish.name
        holder.storeName.text=wish.store
        holder.ItemName.text=wish.price
    }

    override fun getItemCount(): Int {
        return wishes.size
    }
}