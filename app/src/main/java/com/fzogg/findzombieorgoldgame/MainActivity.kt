package com.fzogg.findzombieorgoldgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fzogg.findzombieorgoldgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
   //val listOfZombie = listOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView2.setOnClickListener { binding.imageView2.setImageResource(R.drawable.zome_gold); binding.textView.text = "Gold!" }
        binding.imageView.setOnClickListener { binding.imageView.setImageResource(R.drawable.zome_zombie); binding.textView.text = "Loose!" }
        binding.imageView3.setOnClickListener { binding.imageView3.setImageResource(R.drawable.zome_gold); binding.textView.text = "Gold!" }

    }


}