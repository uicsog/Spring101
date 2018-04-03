package com.in28min.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    static {
        todos.add(new Todo("Complete course 1", "Study"));
        todos.add(new Todo("Complete course 2", "Study"));
        todos.add(new Todo("Complete course 3", "Study"));
    }

    public static List<Todo> retrieveTodos () {
        return todos;
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public void deleteTodo(Todo todo) {
        todos.remove(todo);
    }
}
