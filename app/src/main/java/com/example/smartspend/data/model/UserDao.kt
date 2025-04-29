package com.example.smartspend.data.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
suspend fun insertUser(user : User)

@Query("SELECT * FROM User WHERE username = :username AND password= :password")
suspend fun authenticate(username: String, password: String): User?
}