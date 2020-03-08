package com.raywenderlich.droidquiz;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/raywenderlich/droidquiz/QuizApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class QuizApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private static com.raywenderlich.droidquiz.data.db.QuizDatabase database;
    public static final com.raywenderlich.droidquiz.QuizApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public QuizApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/droidquiz/QuizApplication$Companion;", "", "()V", "<set-?>", "Lcom/raywenderlich/droidquiz/data/db/QuizDatabase;", "database", "getDatabase", "()Lcom/raywenderlich/droidquiz/data/db/QuizDatabase;", "setDatabase", "(Lcom/raywenderlich/droidquiz/data/db/QuizDatabase;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.droidquiz.data.db.QuizDatabase getDatabase() {
            return null;
        }
        
        private final void setDatabase(com.raywenderlich.droidquiz.data.db.QuizDatabase p0) {
        }
        
        private Companion() {
            super();
        }
    }
}