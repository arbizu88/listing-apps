package com.caha.todolist.controller;

import com.caha.todolist.model.TodoItem;
import com.caha.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todo-list")
public class TodoListController {

    @Autowired
    TodoService todoService;

    @GetMapping
    public List<TodoItem> getTodoList(){
        return todoService.findAll();
    }

    @GetMapping("/{index}")
    public Optional<TodoItem> findByIndex(@PathVariable long index){
        return todoService.findById(index);
    }

    @PostMapping
    public int createTodoItem(@RequestBody TodoItem item){
        todoService.save(item);
        return 201;
    }

    @DeleteMapping("/{index}")
    public void deleteTodoItem(@PathVariable long index){
        todoService.delete(index);
    }

    @PutMapping
    public void updateTodoItem(@RequestBody TodoItem item){
        Optional<TodoItem> todoItem =  todoService.findById(item.getIndex());

        if(todoItem.isPresent()){
            todoService.save(item);
        }
    }
}
