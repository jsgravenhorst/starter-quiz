package com.raywenderlich.droidquiz

import android.app.Application
import androidx.room.Room
import com.raywenderlich.droidquiz.data.db.QuizDatabase

class QuizApplication: Application() {
    companion object {
        lateinit var database: QuizDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = Room
            .databaseBuilder(this, QuizDatabase::class.java,"quiz_database")
            .build()
    }
}