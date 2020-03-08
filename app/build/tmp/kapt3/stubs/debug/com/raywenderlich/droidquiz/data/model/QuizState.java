package com.raywenderlich.droidquiz.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/droidquiz/data/model/QuizState;", "", "()V", "DataState", "EmptyState", "FinishState", "LoadingState", "Lcom/raywenderlich/droidquiz/data/model/QuizState$LoadingState;", "Lcom/raywenderlich/droidquiz/data/model/QuizState$DataState;", "Lcom/raywenderlich/droidquiz/data/model/QuizState$EmptyState;", "Lcom/raywenderlich/droidquiz/data/model/QuizState$FinishState;", "app_debug"})
public abstract class QuizState {
    
    private QuizState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/raywenderlich/droidquiz/data/model/QuizState$LoadingState;", "Lcom/raywenderlich/droidquiz/data/model/QuizState;", "()V", "app_debug"})
    public static final class LoadingState extends com.raywenderlich.droidquiz.data.model.QuizState {
        public static final com.raywenderlich.droidquiz.data.model.QuizState.LoadingState INSTANCE = null;
        
        private LoadingState() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/raywenderlich/droidquiz/data/model/QuizState$DataState;", "Lcom/raywenderlich/droidquiz/data/model/QuizState;", "data", "Lcom/raywenderlich/droidquiz/data/model/QuestionAndAllAnswers;", "(Lcom/raywenderlich/droidquiz/data/model/QuestionAndAllAnswers;)V", "getData", "()Lcom/raywenderlich/droidquiz/data/model/QuestionAndAllAnswers;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class DataState extends com.raywenderlich.droidquiz.data.model.QuizState {
        @org.jetbrains.annotations.NotNull()
        private final com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers getData() {
            return null;
        }
        
        public DataState(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.droidquiz.data.model.QuizState.DataState copy(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.droidquiz.data.model.QuestionAndAllAnswers data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/raywenderlich/droidquiz/data/model/QuizState$EmptyState;", "Lcom/raywenderlich/droidquiz/data/model/QuizState;", "()V", "app_debug"})
    public static final class EmptyState extends com.raywenderlich.droidquiz.data.model.QuizState {
        public static final com.raywenderlich.droidquiz.data.model.QuizState.EmptyState INSTANCE = null;
        
        private EmptyState() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/raywenderlich/droidquiz/data/model/QuizState$FinishState;", "Lcom/raywenderlich/droidquiz/data/model/QuizState;", "numberOfQuestions", "", "score", "(II)V", "getNumberOfQuestions", "()I", "getScore", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class FinishState extends com.raywenderlich.droidquiz.data.model.QuizState {
        private final int numberOfQuestions = 0;
        private final int score = 0;
        
        public final int getNumberOfQuestions() {
            return 0;
        }
        
        public final int getScore() {
            return 0;
        }
        
        public FinishState(int numberOfQuestions, int score) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.droidquiz.data.model.QuizState.FinishState copy(int numberOfQuestions, int score) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}