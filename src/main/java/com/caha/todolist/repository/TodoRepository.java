package com.caha.todolist.repository;

import com.caha.todolist.model.TodoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<TodoItem, Long> {
}
