package com.example.mm.firebaseui_firestorerecyclerview.models;

public class NoteObject {

    private String title;
    private String description;
    private int priority;

    public NoteObject() {
        // Empty Constructor
    }

    public NoteObject(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
