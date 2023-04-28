package com.example.architicturepatterns_mvc.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.architicturepatterns_mvc.databinding.ActivityMainBinding
import com.example.architicturepatterns_mvc.model.domain.User
import com.example.architicturepatterns_mvc.model.domain.Wisdom
import com.example.architicturepatterns_mvc.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setup()
        addCallBacks()
    }

    private fun setup() {
        viewModel.getUserInfo()
        viewModel.currentUser.observe(this, ::changeUserData)
        viewModel.wisdom.observe(this, ::changeWisdomInfo)
    }

    private fun changeWisdomInfo(wisdom: Wisdom) {
        binding.apply {
            tvDate.text = wisdom.date
            tvContent.text = wisdom.content
        }
    }

    private fun changeUserData(user: User) {
        binding.tvUserName.text = user.name
    }

    private fun addCallBacks() {
        binding.button.setOnClickListener {
            viewModel.getWisdom()
        }
    }


}