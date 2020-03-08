package com.raywenderlich.droidquiz.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001f"}, d2 = {"Lcom/raywenderlich/droidquiz/view/QuestionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "Lcom/raywenderlich/droidquiz/data/viewmodel/QuizViewModel;", "getViewModel", "()Lcom/raywenderlich/droidquiz/data/viewmodel/QuizViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "displayQuestionsView", "", "getQuestionAndAnswers", "goToResultActivity", "numberOfQuestions", "", "score", "nextQuestion", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "render", "state", "Lcom/raywenderlich/droidquiz/data/model/QuizState;", "renderDataState", "quizState", "Lcom/raywenderlich/droidquiz/data/model/QuizState$DataState;", "renderEmptyState", "renderLoadingState", "Companion", "app_debug"})
public final class QuestionActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCORE = "SCORE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMBER_OF_QUESTIONS = "NUMBER_OF_QUESTIONS";
    public static final com.raywenderlich.droidquiz.view.QuestionActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.raywenderlich.droidquiz.data.viewmodel.QuizViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void render(com.raywenderlich.droidquiz.data.model.QuizState state) {
    }
    
    private final void renderDataState(com.raywenderlich.droidquiz.data.model.QuizState.DataState quizState) {
    }
    
    private final void renderLoadingState() {
    }
    
    private final void renderEmptyState() {
    }
    
    public final void nextQuestion(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void displayQuestionsView() {
    }
    
    private final void goToResultActivity(int numberOfQuestions, int score) {
    }
    
    private final void getQuestionAndAnswers() {
    }
    
    public QuestionActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/raywenderlich/droidquiz/view/QuestionActivity$Companion;", "", "()V", "NUMBER_OF_QUESTIONS", "", "SCORE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}