package com.caha.todolist.service;

import com.caha.todolist.model.TodoItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

    TodoItem save(TodoItem todoItem);
    List<TodoItem> getTodoList();


}
