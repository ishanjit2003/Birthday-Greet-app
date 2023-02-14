package com.example.birtthdaygreet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.birtthdaygreet.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

//    companion object{
//        const val NAME_EXTRA="name_extra"
//    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        binding.wishText.text="happy birthday\n$name !"
    }

    fun back(view: View) {
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }


}