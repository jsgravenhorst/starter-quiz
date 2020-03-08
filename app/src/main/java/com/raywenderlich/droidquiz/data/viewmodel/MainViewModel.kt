package com.raywenderlich.droidquiz.data.viewmodel

import androidx.lifecycle.ViewModel
import com.raywenderlich.droidquiz.data.provider.QuestionInfoProvider
import com.raywenderlich.droidquiz.data.repository.QuizRepository
/*
        ViewModel for MainActivity
 */
class MainViewModel(private val repository: QuizRepository): ViewModel() {
    fun prepopulateQuestions(){
        for (question in QuestionInfoProvider.questionList) {
            repository.saveQuestion(question)
        }
        for (answer in QuestionInfoProvider.answerList) {
            repository.saveAnswer(answer)
        }
    }
    fun clearQuestions() = repository.deleteQuestions()
}