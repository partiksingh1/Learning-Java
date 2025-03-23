package com.conceptandcoding;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todo> todos;

    public TodoList(){
        this.todos = new ArrayList<>();
    }
    public void addTodo(String todo){
        todos.add(new Todo(todo));
    }
    public List<Todo> getTodos(){
        return todos;
    }
    public void completeTodo(int index){
        if(index > 0 && index < todos.size()){
            todos.get(index).markAsCompleted();
        }
    }
    public void uncompleteTodo(int index){
        if(index > 0 && index < todos.size()){
            todos.get(index).markAsPending();
        }
    }

    public void removeTodo(int index){
        if(index>0 && index<todos.size()){
            todos.remove(index);
        }
    }

    public List<Todo> getAllCompletedTodos(){
        List<Todo>completedTodos = new ArrayList<>();
        for(Todo todo : todos){
            if(todo.isCompleted()){
                completedTodos.add(todo);
            }
        }
        return completedTodos;
    }


}
