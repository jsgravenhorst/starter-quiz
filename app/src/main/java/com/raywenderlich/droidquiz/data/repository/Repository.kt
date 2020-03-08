package com.raywenderlich.droidquiz.data.repository

import android.os.AsyncTask
import com.raywenderlich.droidquiz.QuizApplication
import com.raywenderlich.droidquiz.data.db.QuizDAO
import com.raywenderlich.droidquiz.data.model.Answer
import com.raywenderlich.droidquiz.data.model.Question

class Repository : QuizRepository {

    private val quizDAO: QuizDAO by lazy { QuizApplication.database.quizDAO() }
    private val allQuestions by lazy { quizDAO.getAllQuestions() }
    private val allQuestionAndAllAnswers by lazy { quizDAO.getQuestionAndAllAnswers() }

    override fun getSavedQuestion() = allQuestions

    override fun getQuestionAndAllAnswers() = allQuestionAndAllAnswers

    override fun saveQuestion(question: Question) {
        AsyncTask.execute { quizDAO.insert(question) }
    }

    override fun saveAnswer(answer: Answer) {
        AsyncTask.execute { quizDAO.insert(answer) }
    }

    override fun deleteQuestions() {
        AsyncTask.execute { quizDAO.clearQuestions() }
    }
}