package com.example.architicturepatterns_mvc.presenter

import com.example.architicturepatterns_mvc.model.FakeApiService
import com.example.architicturepatterns_mvc.model.FakeDatabase
import com.example.architicturepatterns_mvc.ui.IMainView

class MainPresenter {
    private val api by lazy { FakeApiService() }
    private val database by lazy { FakeDatabase() }
    lateinit var view: IMainView

    fun getUserName() {
        val result = database.getCurrentUser()
        view.onUserInfoSuccess(result)
    }

    fun getWisdom() {
        val result = api.getRandomWisdom()
        view.onWisdomSuccess(result)
    }
}