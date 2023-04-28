package com.example.architicturepatterns_mvc.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.architicturepatterns_mvc.model.domain.User
import com.example.architicturepatterns_mvc.model.domain.Wisdom
import com.example.architicturepatterns_mvc.model.repository.MainRepository

class MainViewModel : ViewModel() {
    private val repository = MainRepository()

    private val _currentUser = MutableLiveData<User>()
    val currentUser : LiveData<User>
    get() = _currentUser

    private val _wisdom = MutableLiveData<Wisdom>()
    val wisdom:LiveData<Wisdom>
        get()=_wisdom


    fun getUserInfo() {
        _currentUser.postValue(repository.getCurrentUser())
    }

    fun getWisdom() {
        _wisdom.postValue(repository.getRandomWisdom())

    }
}