package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
//    lateinit var wish:List<Wish>;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val wishesRv=findViewById<RecyclerView>(R.id.wishesRv)

        val name = findViewById<EditText>(R.id.name)
        val store = findViewById<EditText>(R.id.store)
        val price = findViewById<EditText>(R.id.price)
        val button = findViewById<Button>(R.id.button)

        var wishes : MutableList<Wish> = ArrayList()




        button.setOnClickListener {
            val n=  name.text.toString()
            val s=  store.text.toString()
            val p=  price.text.toString()
            val wish=Wish( n,s,p)
            wishes.add(wish)
            Log.i("name", n.toString())
            Log.i("store", s.toString())
            Log.i("price", p.toString())
            name.text.clear()
            store.text.clear()
            price.text.clear()
        }



    val adapter=wishAdapter(wishes)
    wishesRv.adapter=adapter
    wishesRv.layoutManager= LinearLayoutManager(this)



    }


}

//Log.i("name", n.toString())
//Log.i("store", s.toString())
//Log.i("price", p.toString())