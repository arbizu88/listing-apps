package com.caha.todolist.service;

import com.caha.todolist.model.TodoItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TodoService {

    TodoItem save(TodoItem todoItem);
    List<TodoItem> findAll();

    void delete(long index);

    Optional<TodoItem> findById(long index);
}
