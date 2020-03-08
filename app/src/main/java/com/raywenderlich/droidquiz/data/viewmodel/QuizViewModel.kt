package com.raywenderlich.droidquiz.data.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers
import com.raywenderlich.droidquiz.data.model.QuizState
import com.raywenderlich.droidquiz.data.repository.QuizRepository

class QuizViewModel(repository: QuizRepository): ViewModel() {

    /*
        LiveData is an observable piece of data, which is aware of the Android lifecycle
        MutableLiveData: La clase LiveData<T> es un objeto abstracto que no podemos instanciar como tal. Para la creacion de estos objetos
        usaremos la clase MutableLiveData<T> la cual ya implementa todo lo necesario.
        MediatorLiveData: Puede obsevar otros objectos LiveData (fuentes) y reaccionar a sus enventos onChange, esto le dara control sobre cuando
        desea propagar el evento o hacer algo en particular
     */

    // The current QuestionAndAnswers that is going to be sent to QuestionActivity and displayed to the user
    private val questionAndAnswers = MediatorLiveData<QuestionAndAllAnswers>()
    // Is a helper property that helps you keep track of which question has to be displayed from the repository.
    private val currentQuestion    = MutableLiveData <Int>()
    // Contains the current QuizState that is going to be updated by your ViewModel and observed by your QuestionActivity
    private val currentState       = MediatorLiveData<QuizState>()
    // Contains a LiveData list of all the question in your database
    private val allQuestionAndAllAnswers = repository.getQuestionAndAllAnswers()
    //
    private var score: Int = 0

    init {
        currentState.postValue(QuizState.LoadingState)
        addStateSources()
        addQuestionSources()
        currentQuestion.postValue(0)
    }

    fun getCurrentState(): LiveData<QuizState> = currentState

    private fun changeCurrentQuestion() {
        currentQuestion.postValue(currentQuestion.value?.inc())
    }

    private fun addStateSources() {
        /*
          addSource(@NonNull LiveData<S> source, @NonNull Observer<? super S> onChanged) {
         */
        currentState.addSource(currentQuestion) { currentQuestionNumber ->
            if (currentQuestionNumber == allQuestionAndAllAnswers.value?.size) {
                currentState.postValue(QuizState.FinishState(currentQuestionNumber, score))
            }
        }
        currentState.addSource(allQuestionAndAllAnswers) { allQuestionAndAllAnswers ->
            if (allQuestionAndAllAnswers.isEmpty()){
                currentState.postValue(QuizState.EmptyState)
            }
        }
        currentState.addSource(questionAndAnswers) { questionAndAnswers ->
            currentState.postValue(QuizState.DataState(questionAndAnswers))
        }
    }

    private fun addQuestionSources() {
        questionAndAnswers.addSource(currentQuestion) { currentQuestionNumber ->
            val questions = allQuestionAndAllAnswers.value

            if (questions != null && currentQuestionNumber < questions.size) {
                questionAndAnswers.postValue(questions[currentQuestionNumber])
            }
        }

        questionAndAnswers.addSource(allQuestionAndAllAnswers){ questionsAndAnswers ->
            val currentQuestionNumber = currentQuestion.value

            if (currentQuestionNumber != null && questionsAndAnswers.isNotEmpty()) {
                questionAndAnswers.postValue(questionsAndAnswers[currentQuestionNumber])
            }
        }
    }

    fun nextQuestion(choice: Int) {
        verifyAnswer(choice)
        changeCurrentQuestion()
    }

    private fun verifyAnswer(choice: Int){
        val currentQuestion = questionAndAnswers.value
        
        if (currentQuestion != null && currentQuestion.answers[choice].isCorrect){
            score++
        }
    }


}