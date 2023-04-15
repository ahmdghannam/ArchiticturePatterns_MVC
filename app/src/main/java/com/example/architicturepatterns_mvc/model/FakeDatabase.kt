package com.example.architicturepatterns_mvc.model

import com.example.architicturepatterns_mvc.model.domain.User

class FakeDatabase {
    fun getCurrentUser(): User {
        return User("Ahmed Ali",2001)
    }
}