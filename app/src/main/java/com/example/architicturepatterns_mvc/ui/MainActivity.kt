package com.example.architicturepatterns_mvc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.architicturepatterns_mvc.databinding.ActivityMainBinding
import com.example.architicturepatterns_mvc.model.domain.User
import com.example.architicturepatterns_mvc.model.domain.Wisdom
import com.example.architicturepatterns_mvc.presenter.MainPresenter

class MainActivity : AppCompatActivity(), IMainView {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val presenter by lazy { MainPresenter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        addCallBacks()
    }

    private fun addCallBacks() {
        binding.button.setOnClickListener {
            presenter.getWisdom()
            presenter.getUserName()
        }
    }

    override fun setUserName(user: User) {
        binding.tvUserName.text = user.name
    }

    override fun setWisdomData(wisdom: Wisdom) {
        binding.tvDate.text = wisdom.date
        binding.tvContent.text = wisdom.content
    }


}