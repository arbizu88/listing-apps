package com.caha.todolist.service.impl;

import com.caha.todolist.model.TodoItem;
import com.caha.todolist.repository.TodoRepository;
import com.caha.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    TodoRepository repository;

    /**
     * @param todoItem
     * @return
     */
    @Override
    public TodoItem save(TodoItem todoItem) {
        return repository.save(todoItem);
    }

    /**
     * @return
     */
    @Override
    public List<TodoItem> getTodoList() {
        return (List<TodoItem>) repository.findAll();
    }
}
