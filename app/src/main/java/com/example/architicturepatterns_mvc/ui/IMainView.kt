package com.example.architicturepatterns_mvc.ui

import com.example.architicturepatterns_mvc.model.domain.User
import com.example.architicturepatterns_mvc.model.domain.Wisdom

interface IMainView {
    fun setUserName(user: User)
    fun setWisdomData(wisdom: Wisdom)
}