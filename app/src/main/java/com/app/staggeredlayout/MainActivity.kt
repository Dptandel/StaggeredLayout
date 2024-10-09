package com.app.staggeredlayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.app.staggeredlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var itemList: ArrayList<Int>
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        itemList = ArrayList()

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        addToList()

        itemAdapter = ItemAdapter(itemList)
        binding.recyclerView.adapter = itemAdapter
    }

    private fun addToList() {
        itemList.add(R.drawable.pic1)
        itemList.add(R.drawable.pic2)
        itemList.add(R.drawable.pic3)
        itemList.add(R.drawable.pic4)
        itemList.add(R.drawable.pic5)
        itemList.add(R.drawable.pic6)
        itemList.add(R.drawable.pic7)
        itemList.add(R.drawable.pic8)
        itemList.add(R.drawable.pic1)
        itemList.add(R.drawable.pic2)
        itemList.add(R.drawable.pic3)
        itemList.add(R.drawable.pic4)
        itemList.add(R.drawable.pic5)
        itemList.add(R.drawable.pic6)
        itemList.add(R.drawable.pic7)
        itemList.add(R.drawable.pic8)
    }


}