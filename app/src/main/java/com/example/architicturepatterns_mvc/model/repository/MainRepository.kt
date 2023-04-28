package com.example.architicturepatterns_mvc.model.repository

import com.example.architicturepatterns_mvc.model.FakeApiService
import com.example.architicturepatterns_mvc.model.FakeDatabase
import com.example.architicturepatterns_mvc.model.domain.User
import com.example.architicturepatterns_mvc.model.domain.Wisdom

class MainRepository {
    private val api by lazy { FakeApiService() }
    private val database by lazy { FakeDatabase() }

    fun getCurrentUser(): User {
        return database.getCurrentUser()
    }

    fun getRandomWisdom(): Wisdom {
        return api.getRandomWisdom()
    }

}