package com.raywenderlich.droidquiz.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.raywenderlich.droidquiz.data.model.Answer
import com.raywenderlich.droidquiz.data.model.Question
import com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers

@Dao
interface QuizDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(question: Question)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(answer: Answer)

    @Query("SELECT * FROM questions ORDER BY question_id")
    fun getAllQuestions(): LiveData<List<Question>>

    @Transaction
    @Query("SELECT * FROM questions")
    fun getQuestionAndAllAnswers(): LiveData<List<QuestionAndAllAnswers>>

    @Query("DELETE FROM questions")
    fun clearQuestions()

    @Delete
    fun deleteQuestion(question: Question)

}