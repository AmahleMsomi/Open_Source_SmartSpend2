package com.example.smartspend.data.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : AndroidViewModel(application){

    private val userDao = AppDatabase.getDatabase(application).userDao()

    fun insertUser(user: User) = viewModelScope.launch {
        userDao.insertUser(user)
    }

    suspend fun authenticate(username: String, password: String): User?{
        return userDao.authenticate(username, password)

    }

}