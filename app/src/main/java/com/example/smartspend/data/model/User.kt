package com.example.smartspend.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")

data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,

    val username: String,

    val password: String,
)