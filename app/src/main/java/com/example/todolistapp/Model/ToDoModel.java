package com.example.todolistapp.Model;

public class ToDoModel extends TaskId {

    private String task, due, priority;
    private int status;

    public String getTask() {
        return task;
    }

    public String getDue() {
        return due;
    }

    public String getPriority() {
        return priority;
    }

    public int getStatus() {
        return status;
    }
}
