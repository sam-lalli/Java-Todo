package com.samlalli.javatodo.repositories;

import com.samlalli.javatodo.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepo extends JpaRepository<TodoItem, Long> {

}
