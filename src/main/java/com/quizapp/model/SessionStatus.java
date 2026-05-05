package com.quizapp.model;

public enum SessionStatus {
    ACTIVE("Active"),
    ENDED("Ended");
    
    private final String displayName;
    
    SessionStatus(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    }
}
