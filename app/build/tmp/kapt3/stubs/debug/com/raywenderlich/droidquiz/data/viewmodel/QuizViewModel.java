package com.raywenderlich.droidquiz.data.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000bJ\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000bH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/raywenderlich/droidquiz/data/viewmodel/QuizViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/droidquiz/data/repository/QuizRepository;", "(Lcom/raywenderlich/droidquiz/data/repository/QuizRepository;)V", "allQuestionAndAllAnswers", "Landroidx/lifecycle/LiveData;", "", "Lcom/raywenderlich/droidquiz/data/model/QuestionAndAllAnswers;", "currentQuestion", "Landroidx/lifecycle/MutableLiveData;", "", "currentState", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/raywenderlich/droidquiz/data/model/QuizState;", "questionAndAnswers", "score", "addQuestionSources", "", "addStateSources", "changeCurrentQuestion", "getCurrentState", "nextQuestion", "choice", "verifyAnswer", "app_debug"})
public final class QuizViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers> questionAndAnswers = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> currentQuestion = null;
    private final androidx.lifecycle.MediatorLiveData<com.raywenderlich.droidquiz.data.model.QuizState> currentState = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers>> allQuestionAndAllAnswers = null;
    private int score = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.raywenderlich.droidquiz.data.model.QuizState> getCurrentState() {
        return null;
    }
    
    private final void changeCurrentQuestion() {
    }
    
    private final void addStateSources() {
    }
    
    private final void addQuestionSources() {
    }
    
    public final void nextQuestion(int choice) {
    }
    
    private final void verifyAnswer(int choice) {
    }
    
    public QuizViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.droidquiz.data.repository.QuizRepository repository) {
        super();
    }
}