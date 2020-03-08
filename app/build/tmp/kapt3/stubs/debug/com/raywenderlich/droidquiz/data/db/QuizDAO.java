package com.raywenderlich.droidquiz.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/raywenderlich/droidquiz/data/db/QuizDAO;", "", "clearQuestions", "", "deleteQuestion", "question", "Lcom/raywenderlich/droidquiz/data/model/Question;", "getAllQuestions", "Landroidx/lifecycle/LiveData;", "", "getQuestionAndAllAnswers", "Lcom/raywenderlich/droidquiz/data/model/QuestionAndAllAnswers;", "insert", "answer", "Lcom/raywenderlich/droidquiz/data/model/Answer;", "app_debug"})
public abstract interface QuizDAO {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.droidquiz.data.model.Question question);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.droidquiz.data.model.Answer answer);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM questions ORDER BY question_id")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.droidquiz.data.model.Question>> getAllQuestions();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM questions")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers>> getQuestionAndAllAnswers();
    
    @androidx.room.Query(value = "DELETE FROM questions")
    public abstract void clearQuestions();
    
    @androidx.room.Delete()
    public abstract void deleteQuestion(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.droidquiz.data.model.Question question);
}