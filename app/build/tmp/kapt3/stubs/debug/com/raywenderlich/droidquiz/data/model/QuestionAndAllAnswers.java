package com.raywenderlich.droidquiz.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/raywenderlich/droidquiz/data/model/QuestionAndAllAnswers;", "", "()V", "answers", "", "Lcom/raywenderlich/droidquiz/data/model/Answer;", "getAnswers", "()Ljava/util/List;", "setAnswers", "(Ljava/util/List;)V", "question", "Lcom/raywenderlich/droidquiz/data/model/Question;", "getQuestion", "()Lcom/raywenderlich/droidquiz/data/model/Question;", "setQuestion", "(Lcom/raywenderlich/droidquiz/data/model/Question;)V", "app_debug"})
public final class QuestionAndAllAnswers {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.raywenderlich.droidquiz.data.model.Question question;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "question_id", entityColumn = "question_id")
    private java.util.List<com.raywenderlich.droidquiz.data.model.Answer> answers;
    
    @org.jetbrains.annotations.Nullable()
    public final com.raywenderlich.droidquiz.data.model.Question getQuestion() {
        return null;
    }
    
    public final void setQuestion(@org.jetbrains.annotations.Nullable()
    com.raywenderlich.droidquiz.data.model.Question p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.raywenderlich.droidquiz.data.model.Answer> getAnswers() {
        return null;
    }
    
    public final void setAnswers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.droidquiz.data.model.Answer> p0) {
    }
    
    public QuestionAndAllAnswers() {
        super();
    }
}