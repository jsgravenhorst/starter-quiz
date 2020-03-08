package com.raywenderlich.droidquiz.data.repository

import androidx.lifecycle.LiveData
import com.raywenderlich.droidquiz.data.model.Answer
import com.raywenderlich.droidquiz.data.model.Question
import com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers

interface QuizRepository {
    fun getSavedQuestion() : LiveData<List<Question>>
    fun saveQuestion(question: Question)
    fun saveAnswer(answer: Answer)
    fun getQuestionAndAllAnswers(): LiveData<List<QuestionAndAllAnswers>>
    fun deleteQuestions()
}