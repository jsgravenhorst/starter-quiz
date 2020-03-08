package com.raywenderlich.droidquiz.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH&\u00a8\u0006\u000f"}, d2 = {"Lcom/raywenderlich/droidquiz/data/repository/QuizRepository;", "", "deleteQuestions", "", "getQuestionAndAllAnswers", "Landroidx/lifecycle/LiveData;", "", "Lcom/raywenderlich/droidquiz/data/model/QuestionAndAllAnswers;", "getSavedQuestion", "Lcom/raywenderlich/droidquiz/data/model/Question;", "saveAnswer", "answer", "Lcom/raywenderlich/droidquiz/data/model/Answer;", "saveQuestion", "question", "app_debug"})
public abstract interface QuizRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.droidquiz.data.model.Question>> getSavedQuestion();
    
    public abstract void saveQuestion(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.droidquiz.data.model.Question question);
    
    public abstract void saveAnswer(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.droidquiz.data.model.Answer answer);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers>> getQuestionAndAllAnswers();
    
    public abstract void deleteQuestions();
}