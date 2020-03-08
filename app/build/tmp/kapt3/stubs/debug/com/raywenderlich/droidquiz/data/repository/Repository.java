package com.raywenderlich.droidquiz.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\fH\u0016R\'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/raywenderlich/droidquiz/data/repository/Repository;", "Lcom/raywenderlich/droidquiz/data/repository/QuizRepository;", "()V", "allQuestionAndAllAnswers", "Landroidx/lifecycle/LiveData;", "", "Lcom/raywenderlich/droidquiz/data/model/QuestionAndAllAnswers;", "getAllQuestionAndAllAnswers", "()Landroidx/lifecycle/LiveData;", "allQuestionAndAllAnswers$delegate", "Lkotlin/Lazy;", "allQuestions", "Lcom/raywenderlich/droidquiz/data/model/Question;", "getAllQuestions", "allQuestions$delegate", "quizDAO", "Lcom/raywenderlich/droidquiz/data/db/QuizDAO;", "getQuizDAO", "()Lcom/raywenderlich/droidquiz/data/db/QuizDAO;", "quizDAO$delegate", "deleteQuestions", "", "getQuestionAndAllAnswers", "getSavedQuestion", "saveAnswer", "answer", "Lcom/raywenderlich/droidquiz/data/model/Answer;", "saveQuestion", "question", "app_debug"})
public final class Repository implements com.raywenderlich.droidquiz.data.repository.QuizRepository {
    private final kotlin.Lazy quizDAO$delegate = null;
    private final kotlin.Lazy allQuestions$delegate = null;
    private final kotlin.Lazy allQuestionAndAllAnswers$delegate = null;
    
    private final com.raywenderlich.droidquiz.data.db.QuizDAO getQuizDAO() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.droidquiz.data.model.Question>> getAllQuestions() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers>> getAllQuestionAndAllAnswers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.droidquiz.data.model.Question>> getSavedQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers>> getQuestionAndAllAnswers() {
        return null;
    }
    
    @java.lang.Override()
    public void saveQuestion(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.droidquiz.data.model.Question question) {
    }
    
    @java.lang.Override()
    public void saveAnswer(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.droidquiz.data.model.Answer answer) {
    }
    
    @java.lang.Override()
    public void deleteQuestions() {
    }
    
    public Repository() {
        super();
    }
}