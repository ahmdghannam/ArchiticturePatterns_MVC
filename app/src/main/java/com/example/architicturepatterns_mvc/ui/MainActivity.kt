package com.example.architicturepatterns_mvc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.architicturepatterns_mvc.databinding.ActivityMainBinding
import com.example.architicturepatterns_mvc.model.FakeApiService
import com.example.architicturepatterns_mvc.model.FakeDatabase
import com.example.architicturepatterns_mvc.model.domain.User
import com.example.architicturepatterns_mvc.model.domain.Wisdom
import com.example.architicturepatterns_mvc.presenter.MainPresenter

class MainActivity : AppCompatActivity(), IMainView {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val presenter by lazy { MainPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUp()
        addCallBacks()
    }

    private fun addCallBacks() {
        binding.button.setOnClickListener {
            presenter.getWisdom()
        }
    }

    private fun setUp() {
        presenter.view = this
        presenter.getUserName()
    }

    override fun onUserInfoSuccess(user: User) {
        binding.tvUserName.text = user.name
    }

    override fun onWisdomSuccess(wisdom: Wisdom) {
        binding.tvDate.text = wisdom.date
        binding.tvContent.text = wisdom.content
    }


}