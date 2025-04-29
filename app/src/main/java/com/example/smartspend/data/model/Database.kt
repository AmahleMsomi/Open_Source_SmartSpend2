package com.example.smartspend.data.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database (
    entities = [User::class] ,
    version = 1,
    exportSchema = false
)

abstract class AppDatabase : RoomDatabase() {

    // Abstract methods that provide access to DAOs (Data Access Objects).
    // DAOs provide methods for performing CRUD (Create, Read, Update, Delete) operations on the corresponding tables.

    abstract fun userDao(): UserDao  // Returns the DAO for the User table. Operations related to users (e.g., registration) are performed here.


    // Companion object to ensure that the database instance is a singleton.
    companion object {
        // The INSTANCE variable holds a reference to the database instance. It is private and initialized as null.
        // This ensures that there is only one instance of the database in the application.
        @Volatile
        private var INSTANCE: AppDatabase? = null

        // This function returns the singleton database instance.
        // It ensures that only one instance of the database is created throughout the app.
        @OptIn(InternalCoroutinesApi::class)
        fun getDatabase(context: Context): AppDatabase {
            // If the INSTANCE is already initialized (not null), return it.
            return INSTANCE ?: synchronized(this) {
                // If INSTANCE is null, create the database instance.
                val instance = databaseBuilder(
                    context.applicationContext,  // Application context is used to prevent memory leaks.
                    AppDatabase::class.java,     // The class of the database being created.
                    "expense_tracker_db"         // The name of the database file.
                ).build()  // The database is built using Room's database builder.

                // Save the instance for future use (so that the database instance is not recreated).
                INSTANCE = instance
                instance  // Return the database instance.
            }
        }
    }
}

