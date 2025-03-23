package com.conceptandcoding;

public class Todo {
    private String description;
    private boolean isCompleted;

    public Todo(String description){
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription(){
        return description;
    }
    public boolean isCompleted(){
        return isCompleted;
    }
    public void markAsCompleted() {
        this.isCompleted = true;
    }
    public void markAsPending() {
        this.isCompleted = false;
    }

}


