package com.example.birtthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.birtthdaygreet.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    fun create(view: View) {
//        val namee= binding.nameInput.editableText.toString()
//        Toast.makeText( this,"Button clicked $namee", Toast.LENGTH_SHORT).show()

        val name=binding.nameInput.editableText.toString()


        val intent =Intent(this,MainActivity2::class.java)
        intent.putExtra("name",name)
        startActivity(intent)
   }
}