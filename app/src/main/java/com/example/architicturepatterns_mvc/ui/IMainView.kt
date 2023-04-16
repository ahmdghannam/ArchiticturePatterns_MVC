package com.example.architicturepatterns_mvc.ui

import com.example.architicturepatterns_mvc.model.domain.User
import com.example.architicturepatterns_mvc.model.domain.Wisdom

interface IMainView {
    fun onUserInfoSuccess(user: User)
    fun onWisdomSuccess(wisdom: Wisdom)
}