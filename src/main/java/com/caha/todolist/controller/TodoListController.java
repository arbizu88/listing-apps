package com.caha.todolist.controller;

import com.caha.todolist.model.TodoItem;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/todo-list")
public class TodoListController {

    private static final List<TodoItem> todoList = new ArrayList<>();

    static {
        TodoItem item1 = new TodoItem("1234", "Cocinar almuerzo", "Preparar el almuerzo");
        todoList.add(item1);
        TodoItem item2 = new TodoItem("12345", "Cocinar almuerzo", "Preparar el almuerzo");
        todoList.add(item2);
        TodoItem item3 = new TodoItem("123456", "Cocinar cena", "Preparar la cena");
        todoList.add(item3);
    }
    @GetMapping
    public List<TodoItem> getTodoList(){
        return todoList;
    }

    @PostMapping
    public int createTodoItem(@RequestBody TodoItem item){
        todoList.add(item);
        return 201;
    }
}
