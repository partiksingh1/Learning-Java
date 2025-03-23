package com.conceptandcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    private TodoList todoList;

    @BeforeEach
    void setUp(){
        todoList = new TodoList();
    }

    @Test
    @DisplayName("test to add a todo")
    void addTodo() {
        todoList.addTodo("todo 1");
        assertEquals(1,todoList.getTodos().size());
        assertEquals("todo 1",todoList.getTodos().get(0).getDescription());
    }

    @Test
    @DisplayName("test to get completed todos")
    void completeTodo() {
        todoList.addTodo("todo 1");
        todoList.addTodo("todo 2");
        todoList.completeTodo(0);
        assertEquals(1,todoList.getAllCompletedTodos().size());
        assertEquals("todo 1",todoList.getAllCompletedTodos().get(0).getDescription());
    }
}