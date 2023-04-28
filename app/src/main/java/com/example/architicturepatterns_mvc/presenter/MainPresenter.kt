package com.example.architicturepatterns_mvc.presenter

import com.example.architicturepatterns_mvc.model.FakeApiService
import com.example.architicturepatterns_mvc.model.FakeDatabase
import com.example.architicturepatterns_mvc.model.repository.MainRepository
import com.example.architicturepatterns_mvc.ui.IMainView

class MainPresenter (private val view: IMainView){

    private val repository =  MainRepository()
    fun getUserName() {
        val user = repository.getCurrentUser()
        view.setUserName(user)
    }

    fun getWisdom() {
        val wisdom = repository.getRandomWisdom()
        view.setWisdomData(wisdom)
    }
}