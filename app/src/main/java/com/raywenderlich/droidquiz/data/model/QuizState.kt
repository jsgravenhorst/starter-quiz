package com.raywenderlich.droidquiz.data.model
/*
    A sealed class in Kotlin is an abstract class, which can be extended
    by subclasses defined as nested classes within the sealed class itself.
 */
sealed class QuizState {
    /*
        Kotlin provides an easy way to create singletons using the object declaration feature.
        For that, object keyword is used
     */
    object LoadingState : QuizState()
    data class DataState(val data: QuestionAndAllAnswers) : QuizState()
    object EmptyState : QuizState()
    data class FinishState(val numberOfQuestions: Int, val score: Int) : QuizState()
}