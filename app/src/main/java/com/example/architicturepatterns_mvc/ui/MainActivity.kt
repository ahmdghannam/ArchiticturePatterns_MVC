package com.example.architicturepatterns_mvc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.architicturepatterns_mvc.databinding.ActivityMainBinding
import com.example.architicturepatterns_mvc.model.FakeApiService
import com.example.architicturepatterns_mvc.model.FakeDatabase

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val api = FakeApiService()
    private val database = FakeDatabase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }

    fun updateView(v:View){
        fetchAWisdom()
        fetchUserInfo()
    }

    private fun fetchAWisdom() {
        val result = api.getRandomWisdom()
        binding.apply {
            tvDate.text = result.date
            tvContent.text = result.content
        }
    }

    private fun fetchUserInfo() {
        val user = database.getCurrentUser()
        binding.tvUserName.text = user.name
    }

}